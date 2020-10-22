package ru.north32.mireajava.lesson21.exercise2;

import ru.north32.mireajava.lesson21.exercise2.chair.Chair;

public class Client {

    public void sit(Chair chair) {
        System.out.println("I'm sitting on " + chair.getType() + " chair!");
    }
}
