package ru.north32.mireajava.lesson15.exercise1;

import ru.north32.mireajava.lesson13.exercise1.Student;

import java.util.List;
import java.util.function.Supplier;

public class ListTest<T extends List<Student>> implements Runnable {

    private Supplier<T> supplier;

    public ListTest(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    @Override
    public void run() {
        test1();
        test2();
        test3();
    }

    public void test1() {
        List<Student> list = supplier.get();
        for (int i = 0; i < 100; i++) {
            list.add(new Student(i, "name", i));
        }
        assert list.size() == 100;
    }

    public void test2() {
        List<Student> list = supplier.get();
        for (int i = 0; i < 100; i++) {
            list.add(new Student(i, "name", i));
        }
        for (int i = 0; i < 100; i++) {
            list.remove(0);
        }
        assert list.size() == 0;
    }

    public void test3() {
        List<Student> list = supplier.get();
        for (int i = 0; i < 100; i++) {
            list.add(new Student(i, "name", i));
        }
        for (int i = 0; i < 100; i++) {
            assert list.get(i).getIDNumber() == i;
        }
    }
}
