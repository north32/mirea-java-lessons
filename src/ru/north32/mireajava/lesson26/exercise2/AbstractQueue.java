package ru.north32.mireajava.lesson26.exercise2;

public interface AbstractQueue<E> {

    void add(E element);

    E poll();

    boolean isEmpty();

}
