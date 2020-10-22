package ru.north32.mireajava.lesson22.exercise2;

public class Calendar {

    private int hours, minutes;

    public Calendar(String calendar) {
        String[] split = calendar.split(":");
        this.hours = Integer.parseInt(split[0]);
        this.minutes = Integer.parseInt(split[1]);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }

}
