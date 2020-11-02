package ru.north32.mireajava.lesson7.exercise1;

public abstract class Dish {

    public abstract String getName();

    public abstract String getSound();

    public void makeSound() {
        System.out.println(getSound());
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name=" + getName() +
                ", sound=" + getSound() +
                "}";
    }
}
