package ru.north32.mireajava.lesson21.exercise2.chair.factory;

import ru.north32.mireajava.lesson21.exercise2.chair.Chair;
import ru.north32.mireajava.lesson21.exercise2.chair.VictorianChair;

public class VictorianChairFactory implements AbstractChairFactory {

    @Override
    public Chair create() {
        return new VictorianChair();
    }

}
