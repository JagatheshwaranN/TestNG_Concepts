package testng.features;

import org.testng.annotations.Test;

/**
 * "Priority" - The priority is set to the test method.Lower priorities will be
 * scheduled first.
 * <p>
 * The test class contains two test methods with different priorities. The doLogin
 * method has a higher priority (1), indicating that it should be executed before
 * the browseProducts method, which has a lower priority (2). The messages printed
 * to the console provide a brief description of the actions performed by each test
 * method. The priority attribute allows you to control the order of test method
 * execution in TestNG.
 * 
 * @author Jagatheshwaran N
 */

public class PriorityTest {

	// Test method for login with priority 1
	@Test(priority = 1)
	public void doLogin() {
		// Print a message indicating the action being performed
		System.out.println("Login to the online shopping platform");
	}

	// Test method for browsing products with priority 2
	@Test(priority = 2)
	public void browseProducts() {
		// Print a message indicating the action being performed
		System.out.println("Browse and search for products on the online shopping platform");
	}

}
