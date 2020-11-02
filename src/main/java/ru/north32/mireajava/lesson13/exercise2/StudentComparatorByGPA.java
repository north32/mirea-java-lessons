package ru.north32.mireajava.lesson13.exercise2;

import ru.north32.mireajava.lesson13.exercise1.Student;

import java.util.Comparator;

public class StudentComparatorByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }

}
