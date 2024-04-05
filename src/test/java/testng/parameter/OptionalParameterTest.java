package testng.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * In TestNG, test-level parameters are often defined in the testng.xml file
 * or through other means and passed down to the test methods.
 * <p>
 * The code contains a single test method, testTestLevelParameter, annotated
 * with @Test and @Parameters({ "Message"}).This indicates that the
 * test method expects one test-level parameter which is optional: "Message".The
 * method then prints a personalized greeting message incorporating the
 * provided message. Optional parameters are defined similarly to Parameters
 * (with annotations), but the place they occupy is different. So, if no parameter
 * value is specified, the optional parameter value is taken.
 *
 * @author Jagatheshwaran N
 */
public class OptionalParameterTest {

	// Test method that takes test-level parameter named "Message"
	@Test
	// Annotation indicating test method takes optional parameter
	@Parameters({ "Message"})
	public void testTestLevelParameter(@Optional("Have a good day!") String message) {

		// Print a personalized greeting message with message parameter
		System.out.println("Hello! "+ message);
	}

}

