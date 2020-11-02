package ru.north32.mireajava.lesson10.exercise5;

public class Main {

    private static int digitSum(int i) {
        return i > 0 ? digitSum(i / 10) + i % 10 : 0;
    }

    public static void main(String[] args) {
        System.out.println(digitSum(1248));
    }

}
