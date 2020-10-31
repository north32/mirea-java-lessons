package ru.north32.mireajava.lesson24.exercise1;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Person("Ivanov", "Ivan", "Jovanovich"));
        System.out.println(new Person("Ivanov","Ivan", null));
        System.out.println(new Person("Ivanov", null, null));
    }

}
