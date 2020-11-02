package ru.north32.mireajava.lesson13.exercise1;

import java.util.Arrays;
import java.util.Comparator;

public class StudentTest {


    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Aaron", 20),
                new Student(2, "Bob", 19),
                new Student(1, "Clark", 19)
        };

        Arrays.sort(students, Comparator.comparingInt(Student::getIDNumber));

        for (var student : students) {
            System.out.println(student.toString());
        }
    }

}
