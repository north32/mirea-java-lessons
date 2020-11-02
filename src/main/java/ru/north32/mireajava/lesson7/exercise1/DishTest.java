package ru.north32.mireajava.lesson7.exercise1;

public class DishTest {

    public static void main(String[] args) {
        Dish[] dishes = {new DessertPlate(), new DinnerPlate(), new SaladBowl()};

        for (Dish dish : dishes) {
            System.out.println(dish);
        }
    }

}
