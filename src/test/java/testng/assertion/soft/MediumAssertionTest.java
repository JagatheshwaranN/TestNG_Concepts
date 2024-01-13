package testng.assertion.soft;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * "SoftAssert" - Soft assertions will capture the failed test cases and move
 * with the next code execution. It will not halt the program execution and
 * report all the captured failed test cases after the completion of program
 * execution.
 * <p>
 * The test class demonstrates how to use SoftAssert to handle multiple
 * assertions, including both positive and negative scenarios, and report all
 * failures at the end of the test
 * <p>
 * assertTrue: Verifies that the condition is true.
 * assertFalse: Verifies that the condition is false.
 * fail: Explicitly fails the test case.
 * assertNotEquals: Verifies that the values are not equal.
 * assertSame: Verifies that the values are same.
 * assertNotSame: Verifies that the values are not the same.
 * assertNull: Verifies that the value is null.
 * assertNotNull: Verifies that the value is not null.
 *
 * @author Jagatheshwaran N
 */

public class MediumAssertionTest {

    // Test using SoftAssert to perform multiple assertions
    @Test
    public void testSoftAssertion() {
        // Define boolean values for assertions
        boolean expected1 = true;
        boolean expected2 = false;
        String actual = "testNG";
        String expected3 = "testNG";
        String expected4 = "testNG1";

        // Create a SoftAssert instance to perform multiple assertions
        SoftAssert softAssert = new SoftAssert();

        // Soft assertion: Verify that the boolean expression 'expected1' is true
        softAssert.assertTrue(expected1);

        // Soft assertion: Verify that the boolean expression 'expected2' is false
        softAssert.assertFalse(expected2);

        // Soft assertion: Explicitly fail the test case with a custom failure message
        softAssert.fail("Explicitly failing the test case");

		// Soft assertion: Explicitly fail the test case with a custom failure message
        softAssert.assertNotEquals(actual, expected4);

		// Soft assertion: Check if actual and expected3 are the same reference
        softAssert.assertSame(actual, expected3);

		// Soft assertion: Check if actual and expected4 are not the same reference
        softAssert.assertNotSame(actual, expected4);

		// Soft assertion: Check if a null object is indeed null
        softAssert.assertNull(null, "Text is not null");

		// Soft assertion: Check if actual is not null
        softAssert.assertNotNull(actual, "Text is not null");

        // Perform all the assertions declared above and report any failures
        softAssert.assertAll();
    }

}
