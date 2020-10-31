package ru.north32.mireajava.lesson13.exercise2;

import java.util.Comparator;
import java.util.function.BiConsumer;

public interface SortConsumer<T> extends BiConsumer<T[], Comparator<T>> {
}
