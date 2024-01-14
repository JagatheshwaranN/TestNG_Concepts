package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * "@DataProvider(parallel = true)" - TestNG will run the <test> tag method
 * which takes data from the DataProvider in a separate thread in parallel.
 * <p>
 * The code showcases how TestNG allows parallel execution of test methods
 * by leveraging data providers, which can be useful for efficient testing
 * of multiple scenarios concurrently.
 * <p>
 * The class contains a single test method, greetUser, annotated with @Test
 * and using a data provider named "user."
 * The greetUser method takes a parameter String user and prints a welcome
 * message with the user's name.
 * The data provider method, getData, is annotated with @DataProvider(name = "user",
 * parallel = true).It provides data for the test method, and the parallel = true
 * attribute enables parallel execution of tests using this data provider.
 *
 * @author Jagatheshwaran N
 */

public class ParallelExecutionWithDataProviderTest {

	// Test method that greets a user, parameterized by the data provider "user"
	@Test(dataProvider = "user")
	public void greetUser(String user) {
		// Print a welcome message with the user's name
		System.out.println(Thread.currentThread().getName() + " Welcome! " + user + "!");
	}

	// Data provider method named "user" with parallel execution enabled
	@DataProvider(name = "user", parallel = true)
	public Object[][] getData() {
		// Providing data for the test method, each row represents a set of parameters
		return new Object[][] { { "John" }, { "Alex" } };
	}

}
