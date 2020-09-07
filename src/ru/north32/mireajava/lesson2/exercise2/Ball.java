package ru.north32.mireajava.lesson2.exercise2;

public class Ball {

    private double size;
    private String color;

    public Ball(double size, String color) {
        this.size = size;
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
