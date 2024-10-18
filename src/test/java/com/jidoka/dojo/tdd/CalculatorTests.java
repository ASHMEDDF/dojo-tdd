package com.jidoka.dojo.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    @Test
    public void testZeroPlusZero() {
        Calculator calculator = new Calculator();
        int result = calculator.add(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testAPlusZero() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 0);
        assertEquals(1, result);
    }

    @Test
    public void testAPlusB() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }
}
