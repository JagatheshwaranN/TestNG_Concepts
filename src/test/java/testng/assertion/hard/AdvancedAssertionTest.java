package testng.assertion.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * "Assert" - Assertions in TestNG are a way to verify that the expected result
 * and the actual result matched or not.
 * <p>
 * Hard assertions will fail the test case and halt the program execution.
 * <p>
 * The code contains three test methods, each demonstrating different types of
 * assertions using TestNG's Assert class.
 * <p>
 * Each test method focuses on showcasing a specific type of assertion available
 * in TestNG. These assertions are fundamental for creating robust and expressive
 * test cases.
 * verifyAssertTrue: Asserts that the boolean expression is true.
 * verifyAssertFalse: Asserts that the boolean expression is false.
 * verifyAssertFail: Explicitly fails the test case with a custom failure message.
 * 
 * @author Jagatheshwaran N
 */
public class AdvancedAssertionTest {

	// Test for assertTrue
	@Test
	public void verifyAssertTrue() {
		// Expected boolean value
		boolean expected = true;

		// Assert that the boolean expression is true
		Assert.assertTrue(expected);
	}

	// Test for assertFalse
	@Test
	public void verifyAssertFalse() {
		// Expected boolean value
		boolean expected = false;

		// Assert that the boolean expression is false
		Assert.assertFalse(expected);
	}

	// Test for fail
	@Test
	public void verifyAssertFail() {
		// Explicitly fail the test case with a custom failure message
		Assert.fail("Explicitly failing the test case");
	}

}
