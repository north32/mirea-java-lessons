package ru.north32.mireajava.lesson7.exercise3;

public abstract class Furniture {

    enum Material {

        IRON(1538, 1315, true),
        PLASTIC(170, 91, false),
        WOOD(0, 371, false);

        int meltingTemperature;
        int ignitionTemperature;
        boolean isFireApproved;

        Material(int meltingTemperature, int ignitionTemperature, boolean isFireApproved) {
            this.meltingTemperature = meltingTemperature;
            this.ignitionTemperature = ignitionTemperature;
            this.isFireApproved = isFireApproved;
        }

    }

    private final double width;
    private final double height;
    private final double weight;

    public Furniture(double width, double height, double weight) {
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public abstract Material getMaterial();

    public boolean isFireApproved() {
        return getMaterial().isFireApproved;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
