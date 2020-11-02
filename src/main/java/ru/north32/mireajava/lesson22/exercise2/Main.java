package ru.north32.mireajava.lesson22.exercise2;

public class Main {

    public static void main(String[] args) {
        Date date = new Date("1990.01.01");
        Calendar calendar = new Calendar("23:23");
        System.out.println("Date: " + date + ", Time: " + calendar);
    }

}
