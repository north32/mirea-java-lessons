package ru.north32.mireajava.lesson25.lesson4;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List.of(
                "()()()",
                "((()))",
                ")))(((",
                "()()((",
                "))))))"
        ).stream().map(ExpressionUtils::isBracketsBalanced)
                .forEach(System.out::println);
    }

}
