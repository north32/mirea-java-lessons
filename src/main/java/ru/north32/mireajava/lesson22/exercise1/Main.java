package ru.north32.mireajava.lesson22.exercise1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Student student = new Student(0, "Dave Chappelle",
                dateFormat.parse("01-01-1990"));
        System.out.println(student.getBirthDate("full"));
    }

}
