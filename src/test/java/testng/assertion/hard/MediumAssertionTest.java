package testng.assertion.hard;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * "Assert" - Assertions in TestNG are a way to test that the expected result
 * and the actual result matched or not.
 * <p>
 * Hard assertions will fail the test case and halt the program execution.
 * <p>
 * The code contains three test methods, each demonstrating different types of
 * assertions using TestNG Assert class.
 * <p>
 * Each test method focuses on showcasing a specific type of assertion available
 * in TestNG. These assertions are fundamental for creating robust and expressive
 * test cases.
 * testAssertTrue: Asserts that the boolean expression is true.
 * <p>
 * testAssertFalse: Asserts that the boolean expression is false.
 * <p>
 * testAssertFail: Explicitly fails the test case with a custom failure message.
 * <p>
 * testAssertNotEquals: Defines expected and actual strings, and asserts that they
 * are the same reference (intentionally failing the test).
 * <p>
 * testAssertSame: Defines expected and actual strings, and asserts that they are the
 * same reference (should pass).
 * <p>
 * testAssertNotSame: Defines expected and actual strings, and asserts that they are
 * not the same reference (should pass).
 * <p>
 * testAssertNull: Asserts that a null object is indeed null (should pass).
 * <p>
 * testAssertNotNull: Defines a non-null text and asserts that the object is not null
 * (should pass).
 *
 * @author Jagatheshwaran N
 */
public class MediumAssertionTest {

	// Test for assertTrue
	@Test
	public void testAssertTrue() {
		// Expected boolean value
		boolean expected = true;

		// Assert that the boolean expression is true
		Assert.assertTrue(expected);
	}

	// Test for assertFalse
	@Test
	public void testAssertFalse() {
		// Expected boolean value
		boolean expected = false;

		// Assert that the boolean expression is false
		Assert.assertFalse(expected);
	}

	// Test for fail
	@Test
	public void testAssertFail() {
		// Explicitly fail the test case with a custom failure message
		Assert.fail("Explicitly failing the test case");
	}

	// Test for assert not equals
	@Test
	public void testAssertNotEquals() {
		// Define expected and actual strings
		String expected = "testNG1";
		String actual = "testNG2";

		// Assert that actual and expected are not equals
		Assert.assertNotEquals(actual, expected);
	}

	// Test for assert same
	@Test
	public void testAssertSame() {
		// Define expected and actual strings
		String expected = "testNG";
		String actual = "testNG";

		// Assert that actual and expected are the same reference (should pass)
		Assert.assertSame(actual, expected);
	}

	// Test for assert not same
	@Test
	public void testAssertNotSame() {
		// Define expected and actual strings
		String expected = "testNG";
		String actual = "testNG1";

		// Assert that actual and expected are not the same reference (should pass)
		Assert.assertNotSame(actual, expected);
	}

	// Test for assert null
	@Test
	public void testAssertNull() {
		// Assert that the object is null (should pass)
		Assert.assertNull(null, "Text is not null");
	}

	// Test for assert not null
	@Test
	public void testAssertNotNull() {
		// Define a non-null text
		String text = "testNG";

		// Assert that the object is not null (should pass)
		Assert.assertNotNull(text, "Text is null");
	}

}
