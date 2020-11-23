package ru.north32.mireajava.lesson27.exercise1;

import java.util.List;
import java.util.Stack;

public class CalculatorModel {

    private final List<String> operators = List.of("+", "-", "*", "/");

    public int calculate(String expression) {
        String[] value = expression.split(" ");
        Stack<Integer> calculation = new Stack<>();
        for (String word : value) {
            if (isOperator(word)) {
                if (calculation.size() >= 2) {
                    calculation.add(makeOperation(word, calculation.pop(), calculation.pop()));
                } else {
                    throw new IllegalArgumentException("Invalid expression");
                }
            } else {
                calculation.add(Integer.valueOf(word));
            }
        }
        if (calculation.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }
        return calculation.pop();
    }

    private boolean isOperator(String i) {
        return operators.contains(i);
    }

    private int makeOperation(String i, int a, int b) {
        switch (i) {
            case "+":
                return b + a;
            case "-":
                return b - a;
            case "*":
                return b * a;
            case "/":
                return b / a;
            default:
                return 0;
        }
    }

}
