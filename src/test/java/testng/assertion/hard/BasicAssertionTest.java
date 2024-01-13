package testng.assertion.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * "Assert" - Assertions in TestNG are a way to test that the expected result
 * and the actual result matched or not.
 * <p>
 * Hard assertions will fail the test case and halt the program execution.
 * <p>
 * The code contains several test methods, each focusing on different data types
 * and using assertions to validate expected and actual values.
 * <p>
 * Each test method follows a similar structure: defining expected and actual
 * values and using TestNG's Assert.assertEquals to perform the assertions.
 * The tests are designed to check the equality of values for different data types.
 *
 * @author Jagatheshwaran N
 */
public class BasicAssertionTest {

    // Test for String assertion
    @Test
    public void testStringAssertion() {
        // Expected title
        String expectedTitle = "TestNG";

        // Actual titles to be compared
        String actualTitle1 = "TestNG";
        String actualTitle2 = "Java";

        // Assert the equality of actual and expected titles
        Assert.assertEquals(actualTitle1, expectedTitle);
        Assert.assertEquals(actualTitle2, expectedTitle);
    }

    // Test for Integer assertion
    @Test
    public void testIntegerAssertion() {
        // Expected integer value
        int expectedInt = 100;

        // Actual integers to be compared
        int actualInt1 = 100;
        int actualInt2 = 50;

        // Assert the equality of actual and expected integers
        Assert.assertEquals(actualInt1, expectedInt);
        Assert.assertEquals(actualInt2, expectedInt);
    }

    // Test for Long assertion
    @Test
    public void testLongAssertion() {
        // Expected long value
        long expectedLong = 123456789L;

        // Actual longs to be compared
        long actualLong1 = 123456789L;
        long actualLong2 = 123456799L;

        // Assert the equality of actual and expected longs
        Assert.assertEquals(actualLong1, expectedLong);
        Assert.assertEquals(actualLong2, expectedLong);
    }

    // Test for Float assertion
    @Test
    public void testFloatAssertion() {
        // Expected float value
        float expectedFloat = 10.0f;

        // Actual floats to be compared
        float actualFloat1 = 10.0f;
        float actualFloat2 = 10.1f;

        // Assert the equality of actual and expected floats
        Assert.assertEquals(actualFloat1, expectedFloat);
        Assert.assertEquals(actualFloat2, expectedFloat);
    }

    // Test for Double assertion
    @Test
    public void testDoubleAssertion() {
        // Expected double value
        double expectedDouble = 123.45;

        // Actual doubles to be compared
        double actualDouble1 = 123.45;
        double actualDouble2 = 123.44;

        // Assert the equality of actual and expected doubles
        Assert.assertEquals(actualDouble1, expectedDouble);
        Assert.assertEquals(actualDouble2, expectedDouble);
    }

    // Test for Boolean assertion
    @Test
    public void testBooleanAssertion() {
        // Expected boolean value
        boolean expected = true;

        // Actual booleans to be compared
        boolean actual1 = true;
        boolean actual2 = false;

        // Assert the equality of actual and expected booleans
        Assert.assertEquals(actual1, expected);
        Assert.assertEquals(actual2, expected);
    }

    // Test for Char assertion
    @Test
    public void testCharAssertion() {
        // Expected char value
        char expected = 'a';

        // Actual chars to be compared
        char actual1 = 'a';
        char actual2 = 'e';

        // Assert the equality of actual and expected chars
        Assert.assertEquals(actual1, expected);
        Assert.assertEquals(actual2, expected);
    }

}

