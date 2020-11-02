package ru.north32.mireajava.lesson12.exercise1;

import static java.lang.Math.pow;

public enum Planet {

    MERCURY(3.3, 2440),
    VENUS(48.7, 6052),
    EARTH(59.7, 6357),
    MARS(6.42, 6786),
    JUPITER(19000, 71398),
    SATURN(5690, 60300),
    URANIUM(869, 23800),
    NEPTUNE(1040, 22200);

    private double radius;
    private double mass;

    Planet(double mass, int radius) {
        this.radius = radius;
        this.mass = mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getGravity() {
        return 6.67 * (mass * (pow(10, 6))) / (pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Planet{" +
                "radius=" + radius +
                ", mass=" + mass +
                '}';
    }

    public String info() {
        return "name: " + name() +
                ", radius: " + radius +
                ", mass: " + mass +
                ", gravity: " + String.format("%.3f", getGravity());
    }
}