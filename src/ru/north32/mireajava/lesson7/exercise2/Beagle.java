package ru.north32.mireajava.lesson7.exercise2;

public class Beagle extends Dog {

    public Beagle(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public Size getSize() {
        return Size.SMALL;
    }

    @Override
    public Coat getCoat() {
        return Coat.SHORT;
    }
}
