package ru.north32.mireajava.lesson7.exercise2;

public class Akita extends Dog {

    public Akita(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public Size getSize() {
        return Size.LARGE;
    }

    @Override
    public Coat getCoat() {
        return Coat.LONG;
    }
}
