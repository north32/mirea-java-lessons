package ru.north32.mireajava.lesson15.exercise2;

import ru.north32.mireajava.lesson13.exercise1.Student;
import ru.north32.mireajava.lesson15.exercise1.ListTest;

import java.util.LinkedList;

public class LinkedListTest extends ListTest<LinkedList<Student>> {

    public LinkedListTest() {
        super(LinkedList::new);
    }

    public static void main(String[] args) {
        new LinkedListTest().run();
    }
}
