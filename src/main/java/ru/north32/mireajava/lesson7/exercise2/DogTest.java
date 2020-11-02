package ru.north32.mireajava.lesson7.exercise2;

public class DogTest {

    public static void main(String[] args) {
        Dog[] dogs = {
                new Akita("Aaron", 1, 1),
                new Beagle("Bob", 2, 2),
                new FinnishSpitz("Charlie", 3, 3)
        };

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }

}
