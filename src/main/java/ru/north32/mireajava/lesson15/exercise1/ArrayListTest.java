package ru.north32.mireajava.lesson15.exercise1;

import ru.north32.mireajava.lesson13.exercise1.Student;

import java.util.ArrayList;

public class ArrayListTest extends ListTest<ArrayList<Student>> {

    public ArrayListTest() {
        super(ArrayList::new);
    }

    public static void main(String[] args) {
        new ArrayListTest().run();
    }

}
