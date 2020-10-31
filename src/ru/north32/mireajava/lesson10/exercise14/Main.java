package ru.north32.mireajava.lesson10.exercise14;

public class Main {

    public static void main(String[] args) {
        System.out.println(recursion(253));
    }

    public static String recursion(int n) {
        if (n < 10) {
            return Integer.toString(n);
        } else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
}
