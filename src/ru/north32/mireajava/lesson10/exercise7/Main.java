package ru.north32.mireajava.lesson10.exercise7;

public class Main {

    private static void printDividers(int i, int n) {
        if (n <= i) {
            if (i % n == 0) {
                System.out.println(n);
                printDividers(i / n, n);
            } else {
                printDividers(i, n + 1);
            }
        }
    }

    public static void main(String[] args) {
        printDividers(1000, 2);
    }

}
