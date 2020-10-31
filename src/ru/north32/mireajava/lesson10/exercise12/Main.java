package ru.north32.mireajava.lesson10.exercise12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        recursion();
    }

    public static void recursion() {
        java.util.Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                recursion();
            } else {
                recursion();
            }
        }
    }

}
