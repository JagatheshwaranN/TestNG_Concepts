package testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * In TestNG, test-level parameters are often defined in the testng.xml file
 * or through other means and passed down to the test methods.
 * <p>
 * The code contains a single test method, testTestLevelParameter, annotated
 * with @Test and @Parameters({ "User", "Number" }).This indicates that the
 * test method expects two test-level parameters: "User" and "Number".The
 * method then prints a personalized greeting message incorporating the
 * provided user and their lucky number.
 *
 * @author Jagatheshwaran N
 */
public class TestLevelParameterTest {

	// Test method that takes test-level parameters named "User" and "Number"
	@Test
	// Annotation indicating test method takes parameters
	@Parameters({ "User", "Number" })
	public void testTestLevelParameter(String user, int number) {

		// Print a personalized greeting message with user and their lucky number
		System.out.println("Hello! " + user + ", Have a good day! and your lucky number for today is " + number);
	}

}

