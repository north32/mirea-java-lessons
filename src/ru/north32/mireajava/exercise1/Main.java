package ru.north32.mireajava.exercise1;

public class Main {

    public static void main(String[] args) {
        int[] elements = {1, 2, 3};

        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }
        System.out.println(sum);

        sum = 0;
        int i = 0;
        while (i != elements.length) {
            sum += elements[i];
            i++;
        }

        System.out.println(sum);

        sum = 0;
        i = 0;
        if (elements.length == 0) {
            return;
        }
        do {
            sum += elements[i];
            i++;
        } while (i != elements.length);

        System.out.println(sum);
   }

}
