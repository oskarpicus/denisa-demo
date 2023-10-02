package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void myBeautifulTest() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }
}