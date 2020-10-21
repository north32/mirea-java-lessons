package ru.north32.mireajava.lesson13.exercise3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeLists<T> {

    public List<T> apply(List<T> ts1, List<T> ts2, Comparator<T> comparator) {
        List<T> result = new ArrayList<>();
        result.addAll(ts1);
        result.addAll(ts2);
        result.sort(comparator);
        return result;
    }
}
