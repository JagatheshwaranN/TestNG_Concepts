package testng.parallel;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * The TestNG suite configuration file, named "testng-parallel-methods.xml," is set
 * up to run tests in parallel using the "methods" mode. The suite includes a test
 * named "Parallel By Methods Test," with a thread count of 1. The test parameter
 * "user" is set to the value "John." The test involves executing the test methods
 * defined in the "ParallelByMethodsTest" class in a parallel manner.
 * <p>
 * The configuration is designed for parallel execution of methods in the
 * "ParallelByMethodsTest" class with a single thread, and it sets the value of the
 * "user" parameter to "John" for these test executions.
 *
 * @author Jagatheshwaran N
 */

@Test
public class ParallelByMethodsTest {

	// Test method that says hello
	@Parameters({ "user" })
	public void sayHello(String user) {
		// Get the current date
		Date date = new Date();

		// Print a hello message with the provided user and the current date
		System.out.println(Thread.currentThread().getName() + " Hello! " + user + ", Have a good day!"
				+ " and today's date is " + date);
	}

	// Another test method that says goodbye
	@Parameters({ "user" })
	public void sayGoodBye(String user) {
		// Print a goodbye message with the provided user
		System.out.println(Thread.currentThread().getName() + " Hello! " + user + ", Good bye!");
	}

}
