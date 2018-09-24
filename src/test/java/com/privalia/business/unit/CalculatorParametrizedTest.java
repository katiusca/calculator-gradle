package com.privalia.business.unit;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedTest {
    private ICalculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @Parameters({"1, 1, 2", "3, 2, 5"})
    public void shouldReturnACorrectSum(int first, int second, int expectedResultSum) {
        int actualResult = calculator.sum(first, second);
        assertEquals(expectedResultSum, actualResult);
    }

    @Test
    @Parameters({"4, 2, 2", "1, 1, 0"})
    public void shouldReturnACorrectSubstract(int first, int second, int expectedResultSubstract) {
        int actualResult = calculator.substract(first, second);
        assertEquals(expectedResultSubstract, actualResult);
    }

    @Test
    @Parameters({"4, 2, 8", "2, 5, 10"})
    public void shouldReturnACorrectMultiply(int first, int second, int expectedResultMultiply) {
        int actualResult = calculator.multiply(first, second);
        assertEquals(expectedResultMultiply, actualResult);
    }

    @Test
    @Parameters({"2, 2, 1", "8, 2, 4"})
    public void shouldReturnACorrectDivide(int first, int second, int expectedResultDivide) {
        int actualResult = calculator.divide(first, second);
        assertEquals(expectedResultDivide, actualResult);
    }
}
