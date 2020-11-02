package com.north32.mireajava.lesson27.exercise1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.north32.mireajava.lesson27.exercise1.CalculatorModel;

public class CalculatorModuleTest {

    private static CalculatorModel calculatorModel;

    @BeforeClass
    public static void init() {
        calculatorModel = new CalculatorModel();
    }

    @Test
    public void sumTest() {
        Assert.assertEquals(1, calculatorModel.calculate("1 0 +"));
        Assert.assertEquals(1, calculatorModel.calculate("0 1 +"));
        Assert.assertEquals(2, calculatorModel.calculate("1 1 +"));
        Assert.assertEquals(4, calculatorModel.calculate("2 2 +"));
    }

    @Test
    public void multiplicationTest() {
        Assert.assertEquals(0, calculatorModel.calculate("1 0 *"));
        Assert.assertEquals(0, calculatorModel.calculate("0 1 *"));
        Assert.assertEquals(1, calculatorModel.calculate("1 1 *"));
        Assert.assertEquals(4, calculatorModel.calculate("2 2 *"));
    }

    @Test
    public void subtractionTest() {
        Assert.assertEquals(1, calculatorModel.calculate("1 0 -"));
        Assert.assertEquals(-1, calculatorModel.calculate("0 1 -"));
        Assert.assertEquals(0, calculatorModel.calculate("1 1 -"));
        Assert.assertEquals(0, calculatorModel.calculate("2 2 -"));
    }

    @Test (expected = ArithmeticException.class)
    public void divisionByZeroTest() {
        calculatorModel.calculate("1 0 /");
    }




}
