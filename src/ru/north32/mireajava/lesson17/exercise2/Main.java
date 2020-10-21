package ru.north32.mireajava.lesson17.exercise2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("file.txt");
        Scanner scanner = new Scanner(fileInputStream);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

}
