package ru.north32.mireajava.lesson14.exercise2;

import java.util.Optional;
import java.util.function.BiFunction;

public class RecursiveBinarySearch<T extends Comparable<T>> implements BiFunction<T[], T, Optional<Integer>> {

    @Override
    public Optional<Integer> apply(T[] ts, T t) {
        return search(ts, t, 0, ts.length - 1);
    }

    private Optional<Integer> search(T[] ts, T t, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return Optional.empty();
        }

        if (ts[middle].equals(t)) {
            return Optional.of(middle);
        } else if (ts[middle].compareTo(t) > 0) {
            return search(ts, t, low, middle - 1);
        } else {
            return search(ts, t, middle + 1, high);
        }
    }
}
