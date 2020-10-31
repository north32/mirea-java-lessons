package ru.north32.mireajava.lesson7.exercise3;

public class Chair extends Furniture {

    private final Material material;

    private Chair(double width, double height, double weight, Material material) {
        super(width, height, weight);
        this.material = material;
    }

    @Override
    public Material getMaterial() {
        return material;
    }

    public static Chair getIronChair() {
        return new Chair(30, 40, 10, Material.IRON);
    }

    public static Chair getPlasticChair() {
        return new Chair(50, 35, 3, Material.PLASTIC);
    }

    public static Chair getWoodChair() {
        return new Chair(20, 30, 5, Material.WOOD);
    }

    @Override
    public String toString() {
        return "Chair{" +
                "super=" + super.toString() +
                ", material=" + material +
                '}';
    }
}
