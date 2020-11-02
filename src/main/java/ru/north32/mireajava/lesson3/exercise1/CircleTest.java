package ru.north32.mireajava.lesson3.exercise1;

class CircleTest {

    public static void main(String[] args) {
        Circle circle = new Circle(5, "red", true);

        System.out.println(circle.getRadius() == 5);
        System.out.println(circle.getColor().equals("red"));
        System.out.println(circle.isFilled());

        circle.setRadius(10);
        circle.setColor("green");
        circle.setFilled(false);

        System.out.println(circle.getRadius() == 10);
        System.out.println(circle.getColor().equals("green"));
        System.out.println(!circle.isFilled());
    }

}