package ru.north32.mireajava.lesson10.exercise6;

public class Main {

    static boolean isPrime(int n, int i) {
        if (n <= 2)
            return n == 2;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1023, 2) ? "YES" : "NO");
    }

}
