package ru.north32.mireajava.lesson7.exercise3;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FurnitureShop {

    private final List<Furniture> content;

    public FurnitureShop() {
        this.content = List.of(
                Chair.getIronChair(),
                Chair.getPlasticChair(),
                Chair.getWoodChair(),
                new Table(Furniture.Material.PLASTIC),
                new Table(Furniture.Material.WOOD)
        );
    }

    public List<Furniture> getContent() {
        return content;
    }

    public List<Furniture> sortByWeight() {
        return content.stream()
                .sorted(Comparator.comparingDouble(Furniture::getWeight))
                .collect(Collectors.toList());
    }

    public List<Furniture> sortByHeight() {
        return content.stream()
                .sorted(Comparator.comparingDouble(Furniture::getHeight))
                .collect(Collectors.toList());
    }

    public List<Furniture> filterFireApproved() {
        return content.stream()
                .filter(Furniture::isFireApproved)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Добро пожаловать в бесконечный магазин:\n" +
                    "1) вывести содержимое\n" +
                    "2) отсортировать по весу\n" +
                    "3) отсортировать по высоте\n" +
                    "4) огнеупорная мебель");
            int n = scanner.nextInt();
            List<Furniture> list = null;

            if (n == 1) list = shop.getContent();
            else if (n == 2) list = shop.sortByWeight();
            else if (n == 3) list = shop.sortByHeight();
            else if (n == 4) list = shop.filterFireApproved();

            if (Objects.nonNull(list))
                list.forEach(System.out::println);
        }
    }

}

