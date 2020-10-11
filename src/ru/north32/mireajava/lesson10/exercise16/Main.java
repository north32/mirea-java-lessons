package ru.north32.mireajava.lesson10.exercise16;

public class Main {
    public static void main(String[] args) {
        recursion(0, 0);
    }

    public static void recursion(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                recursion(n, 1);
            } else if (n == max) {
                recursion(max, ++count);
            } else {
                recursion(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
}
