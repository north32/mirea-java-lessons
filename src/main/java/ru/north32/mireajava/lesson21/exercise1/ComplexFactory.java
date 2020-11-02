package ru.north32.mireajava.lesson21.exercise1;

public class ComplexFactory implements ComplexAbstractFactory {

    @Override
    public Complex create(double real, double img) {
        return new Complex(real, img);
    }

}
