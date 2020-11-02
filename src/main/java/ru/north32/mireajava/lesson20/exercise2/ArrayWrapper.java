package ru.north32.mireajava.lesson20.exercise2;

public class ArrayWrapper<T> {

    private T[] array;

    public ArrayWrapper(T[] array) {
        this.array = array;
    }

    public T get(int index) {
        return array[index];
    }

    public void set(int index, T value) {
        array[index] = value;
    }
}
