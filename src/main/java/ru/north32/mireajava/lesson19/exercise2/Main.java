package ru.north32.mireajava.lesson19.exercise2;

import ru.north32.mireajava.lesson13.exercise1.Student;
import ru.north32.mireajava.lesson13.exercise2.MergeSort;
import ru.north32.mireajava.lesson13.exercise2.QuickSort;
import ru.north32.mireajava.lesson13.exercise2.SortConsumer;
import ru.north32.mireajava.lesson13.exercise2.StudentComparatorByGPA;
import ru.north32.mireajava.lesson14.exercise1.BinarySearch;
import ru.north32.mireajava.lesson14.exercise1.LinearSearch;
import ru.north32.mireajava.lesson14.exercise1.SearchFunction;
import ru.north32.mireajava.lesson14.exercise2.RecursiveBinarySearch;
import ru.north32.mireajava.lesson14.exercise2.RecursiveLinearSearch;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Clark", 19, new double[] {3, 3, 3}),
                new Student(2, "Bob", 19, new double[] {2, 2, 2}),
                new Student(3, "Aaron", 20, new double[] {1, 1, 1}),
                new Student(5, "Edward", 19, new double[] {5, 5, 5}),
                new Student(4, "Frank", 19, new double[] {6, 6, 6}),
                new Student(6, "David", 20, new double[] {4, 4, 4})
        };

        System.out.println(Arrays.toString(students));

        System.out.println(
                "Сортировка и поиск:"
                + "\n0 по GPA"
                + "\n~ по имени"
        );
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        List<SortConsumer<Student>> sortConsumers = List.of(
                new QuickSort<>(),
                new MergeSort<>()
        );

        for (int i = 0; i < sortConsumers.size(); i++) {
            System.out.println(i + " " + sortConsumers.get(i).getClass().getSimpleName());
        }
        SortConsumer<Student> sortConsumer = sortConsumers.get(scanner.nextInt());

        if (value == 0) {
            sortConsumer.accept(students, new StudentComparatorByGPA());
        } else {
            sortConsumer.accept(students, Comparator.comparing(Student::getName));
        }

        System.out.println(Arrays.toString(students));

        List<SearchFunction<Student>> searchFunctions = List.of(
                new LinearSearch<>(),
                new BinarySearch<>(),
                new RecursiveLinearSearch<>(),
                new RecursiveBinarySearch<>()
        );

        for (int i = 0; i < searchFunctions.size(); i++) {
            System.out.println(i + " " + searchFunctions.get(i).getClass().getSimpleName());
        }
        SearchFunction<Student> searchFunction = searchFunctions.get(scanner.nextInt());

        Optional<Integer> index;
        if (value == 0) {
            index = searchFunction.apply(students, scanner.nextDouble(), Student::getGpa);
        } else {
            index = searchFunction.apply(students, scanner.next(), Student::getName);
        }
        try {
            int result = index.orElseThrow(ElementNotFoundException::new);
            System.out.println("Индекс равен " + result + "!");
        } catch (NoSuchElementException e) {
            System.out.println("Индекс не найден!");
        }
    }

}
