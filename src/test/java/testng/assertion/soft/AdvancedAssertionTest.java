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
 * assertTrue: Verifies that the boolean expression expected1 is true.
 * assertFalse: Verifies that the boolean expression expected2 is false.
 * fail: Explicitly fails the test case with a custom failure message.
 * 
 * @author Jagatheshwaran N
 */

public class AdvancedAssertionTest {

	// Test using SoftAssert to perform multiple assertions
	@Test
	public void verifySoftAssertion() {
		// Define boolean values for assertions
		boolean expected1 = true;
		boolean expected2 = false;

		// Create a SoftAssert instance to perform multiple assertions
		SoftAssert softAssert = new SoftAssert();

		// Soft assertion: Verify that the boolean expression 'expected1' is true
		softAssert.assertTrue(expected1);

		// Soft assertion: Verify that the boolean expression 'expected2' is false
		softAssert.assertFalse(expected2);

		// Soft assertion: Explicitly fail the test case with a custom failure message
		softAssert.fail("Explicitly failing the test case");

		// Perform all the assertions declared above and report any failures
		softAssert.assertAll();
	}

}
