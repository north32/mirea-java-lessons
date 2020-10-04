package ru.north32.mireajava.lesson7.exercise2;

public abstract class Dog {

    enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }

    enum Coat {
        SHORT,
        MEDIUM,
        LONG
    }

    private String name;
    private int age;
    private double weight;

    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract Size getSize();

    public abstract Coat getCoat();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", size=" + getSize() +
                ", coat=" + getCoat() +
                '}';
    }
}
