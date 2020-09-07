package ru.north32.mireajava.exercise4;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = random.ints(10).toArray();
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        array = Stream.generate(Math::random)
                .map((e) -> e * 100)
                .mapToInt(Double::intValue)
                .limit(10)
                .toArray();

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
