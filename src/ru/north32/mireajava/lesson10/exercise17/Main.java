package ru.north32.mireajava.lesson10.exercise17;

public class Main {

    public static void main(String[] args) {
        System.out.println(recursion());
    }

    public static int recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            return 0;
        } else {
            return Math.max(n, recursion());
        }
    }

}
