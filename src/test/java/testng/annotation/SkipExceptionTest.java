package testng.annotation;

import org.testng.SkipException;
import org.testng.annotations.Test;

/**
 * "SkipException" - It is used to forcefully skip the test case.
 * <p>
 * Throws a SkipException with the message "Skipping the test."
 * This exception signals to TestNG that the test should be marked
 * as skipped.
 * <p>
 * This test class contains a single test method, skipDemo, which
 * deliberately throws a SkipException.This exception is commonly
 * used when you want to skip the execution of a specific test under
 * certain conditions.
 *
 * @author Jagatheshwaran N
 */

// Test class for demonstrating the use of SkipException
public class SkipExceptionTest {

	// Test method to showcase skipping the test
	@Test
	public void skipDemo() {
		// Throw SkipException with a message to indicate skipping the test
		throw new SkipException("Skipping the test");
	}

}
