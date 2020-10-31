package ru.north32.mireajava.lesson10.exercise2;

public class Main {

    public static String recursion(int a, int b) {
        if (a > b) {
            return a + " " + recursion(a - 1, b);
        } else {
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion(a + 1, b);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion(20, 15));
    }
}
