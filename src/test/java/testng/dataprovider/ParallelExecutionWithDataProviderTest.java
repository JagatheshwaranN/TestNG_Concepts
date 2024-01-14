package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * "@DataProvider(parallel = true)" - TestNG will run the <test> tag method
 * which takes data from the DataProvider in a separate thread in parallel.
 * 
 * @author Jagatheshwaran N
 */
public class ParallelExecutionWithDataProviderTest {

	@Test(dataProvider = "user")
	// Test method that greets the user
	public void greetUser(String user) {
		// Print a welcome message with the provided user
		System.out.println(Thread.currentThread().getName() + " Welcome! " + user + "!");
	}

	@DataProvider(name = "user", parallel = true)
	public Object[][] getData() {

		return new Object[][] { { "John" }, { "Alex" } };
	}
}
