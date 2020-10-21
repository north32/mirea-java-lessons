package ru.north32.mireajava.lesson14.exercise1;

import java.util.Optional;
import java.util.function.BiFunction;

public class LinearSearch<T> implements BiFunction<T[], T, Optional<Integer>> {

    @Override
    public Optional<Integer> apply(T[] ts, T t) {
        Integer index = null;
        for (int i = 0; i < ts.length; i++) {
            if (ts[i].equals(t)) {
                index = i;
                break;
            }
        }
        return Optional.ofNullable(index);
    }
}
