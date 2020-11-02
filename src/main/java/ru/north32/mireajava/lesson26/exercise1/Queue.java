package ru.north32.mireajava.lesson26.exercise1;

public interface Queue<E> {

    void enqueue(E element);

    E element();

    E dequeue();

    int size();

    boolean isEmpty();

    void clear();

}
