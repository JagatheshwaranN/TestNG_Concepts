package testng.assertion.soft;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * "SoftAssert" - Soft assertions will capture the failed test cases and move
 * with the next code execution. It will not halt the program execution and
 * report all the captured failed test cases after the completion of program
 * execution.
 * <p>
 * The code contains a single test method named testSoftAssertion, which
 * utilizes TestNG's SoftAssert for making multiple assertions without
 * immediately failing the test upon the first assertion failure.
 * <p>
 * This test method is useful when you want to capture multiple assertion
 * failures within a single test case without terminating the test immediately
 * after the first failure. This allows you to gather more comprehensive
 * information about the state of the system under test.
 * <p>
 * assertAll(): Invokes this method at the end to check if any soft assertions
 * failed. If any did, the test will be marked as failed, and the details of
 * all failures will be reported.
 * 
 * @author Jagatheshwaran N
 */
public class BasicAssertionTest {

	// Test using SoftAssert to perform multiple assertions
	@Test
	public void testSoftAssertion() {
		// Create a SoftAssert instance to perform multiple assertions
		SoftAssert softAssert = new SoftAssert();

		// Soft assertion: Compare strings "apple" and "banana"
		softAssert.assertEquals("apple", "banana");

		// Soft assertion: Compare integers 100 and 100
		softAssert.assertEquals(100, 100);

		// Soft assertion: Compare long values 123456L and 1234567L
		softAssert.assertEquals(123456L, 1234567L);

		// Soft assertion: Compare float values 10.5f and 10.5f
		softAssert.assertEquals(10.5f, 10.5f);

		// Soft assertion: Compare double values 100.0 and 100.0
		softAssert.assertEquals(100.0, 100.0);

		// Soft assertion: Compare boolean values true and true
		softAssert.assertEquals(true, true);

		// Perform all the assertions declared above and report any failures
		softAssert.assertAll();
	}

}
