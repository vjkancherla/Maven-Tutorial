package com.example.vjk;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void testAdd() {
        double num1 = 3.0;
        double num2 = 7.0;

        // Call the method to test
        double result = AddTwoNumbers.add(num1, num2);

        // Assert that the result is as expected
        assertEquals("Sum of 3.0 and 7.0 should be 10.0", 10.0, result, 0.001);
    }

    @Test
    public void testNegativeNumbers() {
        double num1 = -3.0;
        double num2 = -7.0;

        // Call the method to test
        double result = AddTwoNumbers.add(num1, num2);

        // Assert that the result is as expected
        assertEquals("Sum of -3.0 and -7.0 should be -10.0", -10.0, result, 0.001);
    }
}
