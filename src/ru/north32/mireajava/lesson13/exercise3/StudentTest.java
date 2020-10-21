package ru.north32.mireajava.lesson13.exercise3;

import ru.north32.mireajava.lesson13.exercise1.Student;

import java.util.Comparator;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {
        List<Student> students1 = List.of(
                new Student(3, "Aaron", 20, new double[] {1, 1, 1}),
                new Student(2, "Bob", 19, new double[] {2, 2, 2}),
                new Student(1, "Clark", 19, new double[] {3, 3, 3})
        );

        List<Student> students2 = List.of(
                new Student(6, "David", 20, new double[] {1, 1, 1}),
                new Student(5, "Edward", 19, new double[] {2, 2, 2}),
                new Student(4, "Frank", 19, new double[] {3, 3, 3})
        );

        List<Student> students3 = new MergeLists<Student>().apply(
                students1,
                students2,
                Comparator.comparingInt(Student::getIDNumber));

        for (var student : students3) {
            System.out.println(student);
        }
    }

}
