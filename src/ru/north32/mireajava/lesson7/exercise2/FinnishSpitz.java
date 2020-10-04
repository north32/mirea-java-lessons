package ru.north32.mireajava.lesson7.exercise2;

public class FinnishSpitz extends Dog {

    public FinnishSpitz(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public Size getSize() {
        return Size.MEDIUM;
    }

    @Override
    public Coat getCoat() {
        return Coat.MEDIUM;
    }
}
