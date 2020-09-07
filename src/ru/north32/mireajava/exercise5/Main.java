package ru.north32.mireajava.exercise5;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(0) == 1);
        System.out.println(factorial(1) == 1);
        System.out.println(factorial(5) == 120);
        System.out.println(factorial(-5) == -1);
    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
          fact *= i;
        }
        return fact;
    }

}
