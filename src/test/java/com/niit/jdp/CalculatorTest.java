/*
 *Author Name:Praveen Kumar
 *Date: 15-Nov-22
 *Created With IntelliJ Idea Community Edition
 */


package com.niit.jdp;

import com.niit.jdp.calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    //Test case for addition two positive numbers
    @Test
    public void additionTestPositive() {
        assertEquals(20, calculator.addition(10, 10));
    }

    //Test case for addition two negative numbers
    @Test
    public void additionTestNegative() {
        assertEquals(-6, calculator.addition(-5, -1));
    }

    //Test case for subtraction two positive number
    @Test
    public void subtractionTestPositive() {
        assertEquals(0, calculator.subtraction(10, 10));
    }

    //Test case for subtraction two negative number
    @Test
    public void subtractionTestNegative() {
        assertEquals(10, calculator.subtraction(-10, -20));
    }

    //Test case for multiplication two positive numbers
    @Test
    public void multiplicationTestPositive() {
        assertEquals(100, calculator.multiplication(100, 1));
    }

    //Test case for multiplication with one negative number
    @Test
    public void multiplicationTestOneNegative() {
        assertEquals(-200, calculator.multiplication(-20, 10));
    }

    //Test case for multiplication with one negative number
    @Test
    public void multiplicationTestTwoNegative() {
        assertEquals(10, calculator.multiplication(-5, -2));
    }

    //Test case for number divisible by 0
    @Test
    public void divisionTestZero() {
        assertEquals(0, calculator.division(0, 5));
    }

    //Test case for number divisible by non-zero number
    @Test
    public void divisionTestByNonZero() {
        assertEquals(2, calculator.division(10, 5));
    }

}
