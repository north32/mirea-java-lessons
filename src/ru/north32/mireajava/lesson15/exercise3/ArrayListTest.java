package ru.north32.mireajava.lesson15.exercise3;

import ru.north32.mireajava.lesson13.exercise1.Student;
import ru.north32.mireajava.lesson15.exercise1.ListTest;

public class ArrayListTest extends ListTest<ArrayList<Student>> {

    public ArrayListTest() {
        super(ArrayList::new);
    }

    public static void main(String[] args) {
        new ArrayListTest().run();
    }
}
