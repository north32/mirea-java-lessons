package ru.north32.mireajava.lesson14.exercise1;

import java.util.Optional;
import java.util.function.BiFunction;

public class BinarySearch<T extends Comparable<T>> implements BiFunction<T[], T, Optional<Integer>> {

    @Override
    public Optional<Integer> apply(T[] ts, T t) {
        Integer index = null;
        int low = 0, high = ts.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (ts[mid].compareTo(t) < 0) {
                low = mid + 1;
            } else if (ts[mid].compareTo(t) > 0) {
                high = mid - 1;
            } else if (ts[mid].equals(t)) {
                index = mid;
                break;
            }
        }
        return Optional.ofNullable(index);
    }
}
