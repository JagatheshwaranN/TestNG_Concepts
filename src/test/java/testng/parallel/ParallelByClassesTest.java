package testng.parallel;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * The TestNG suite configuration file, named "testng-parallel-classes.xml," is
 * configured to run tests in parallel using the "classes" mode. The suite includes
 * a test named "Parallel By Classes Test," with a thread count of 2. The test
 * parameter "user" is set to the value "Alex." Within the test, two classes are
 * specified for execution in parallel: "ParallelByMethodsTest" and
 * "ParallelByClassesTest."
 * <p>
 * The configuration is designed for parallel execution of classes (specified as
 * "ParallelByMethodsTest" and "ParallelByClassesTest") within the "Parallel By
 * Classes Suite" TestNG suite, with the common parameter "user" set to the value
 * "Alex" for these test executions.
 * 
 * @author Jagatheshwaran N
 */

@Test
public class ParallelByClassesTest {

	// Test method that welcomes the user
	@Parameters({ "user" })
	public void welcomeUser(String user) {
		// Get the current date
		Date date = new Date();

		// Print a good morning welcome message with the provided user and the current date
		System.out.println(Thread.currentThread().getName() + " Good Morning! " + user + ", Have a good day!"
				+ " and today's date is " + date);
	}

	// Another test method that sends off the user
	@Parameters({ "user" })
	public void sendoffUser(String user) {
		// Print a good morning goodbye message with the provided user
		System.out.println(Thread.currentThread().getName() + " Good Morning! " + user + ", Good bye!");
	}

}

