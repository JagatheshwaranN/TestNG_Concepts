package testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * In TestNG, suite-level parameters are often defined in the XML suite
 * configuration file and passed down to the test methods.
 * <p>
 * The code contains a single test method, testSuiteLevelParameter,
 * annotated with @Test and @Parameters("User").This indicates that the
 * test method expects a suite-level parameter named "User".The method
 * then prints a greeting message using the provided parameter.
 *
 * @author Jagatheshwaran N
 */
public class SuiteLevelParameterTest {

	// Test method that takes a suite-level parameter named "User"
	@Test
	// Annotation indicating a test method that takes a parameter
	@Parameters("User")
	public void testSuiteLevelParameter(String user) {

		// Print a greeting message using the provided parameter
		System.out.println("Hello! " + user + ", Have a good day!");
	}

}
