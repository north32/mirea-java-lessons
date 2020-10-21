package ru.north32.mireajava.lesson14.exercise2;

import java.util.Optional;
import java.util.function.BiFunction;

public class RecursiveLinearSearch<T> implements BiFunction<T[], T, Optional<Integer>> {

    @Override
    public Optional<Integer> apply(T[] ts, T t) {
        return search(ts, t, 0);
    }

    private Optional<Integer> search(T[] ts, T t, int index) {
        if (index == ts.length) {
            return Optional.empty();
        }
        if (ts[index] == t) {
            return Optional.of(index);
        }
        return search(ts, t, index + 1);
    }
}
