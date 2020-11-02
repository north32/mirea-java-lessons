package ru.north32.mireajava.lesson10.exercise13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        recursion();
    }

    public static void recursion() {
        java.util.Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursion();
            }
        }
    }
}
