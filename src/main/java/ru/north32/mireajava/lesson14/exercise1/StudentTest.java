package ru.north32.mireajava.lesson14.exercise1;

import ru.north32.mireajava.lesson13.exercise1.Student;

public class StudentTest {

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Aaron", 20, new double[] {1, 1, 1}),
                new Student(2, "Bob", 19, new double[] {2, 2, 2}),
                new Student(3, "Clark", 19, new double[] {3, 3, 3}),
                new Student(4, "David", 20, new double[] {1, 1, 1}),
                new Student(5, "Edward", 19, new double[] {2, 2, 2}),
                new Student(6, "Frank", 19, new double[] {3, 3, 3})
        };

        new LinearSearch<Student>().apply(
                students,
                5,
                Student::getIDNumber
        ).ifPresent(System.out::println);

        new BinarySearch<Student>().apply(
                students,
                0,
                Student::getIDNumber
        ).ifPresent(System.out::println);

    }

}
