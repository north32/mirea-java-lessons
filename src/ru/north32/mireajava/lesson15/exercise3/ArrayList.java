package ru.north32.mireajava.lesson15.exercise3;

import java.util.AbstractList;
import java.util.Arrays;

public class ArrayList<E> extends AbstractList<E> {

    private int size;
    private Object[] array;

    public ArrayList() {
        this(16);
    }

    public ArrayList(int capacity) {
        this.array = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public boolean add(E e) {
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 3 / 2);
        }
        array[size++] = e;
        return true;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }
        return (E) array[index];
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }

        int newSize;
        if ((newSize = size - 1) > index) {
            System.arraycopy(array, index + 1, array, index, newSize - index);
        }
        E e = get(newSize);
        array[size = newSize] = null;
        return e;
    }
}
