package ru.north32.mireajava.lesson25.exercise4;

public class ExpressionUtils {

    public static boolean isBracketsBalanced(String expression) {
        /*
            Java doesnt support recursive regular expressions,
            like this \((?:[^)(]+|(?R))*+\).
            So let's find it out by manual count.
        */
        int value = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                value += 1;
            } else if (expression.charAt(i) == ')') {
                value -= 1;
            }
            if (value < 0) {
                return false;
            }
        }
        return value == 0;
    }

}
