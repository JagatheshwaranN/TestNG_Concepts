package testng.attributes.others;

import org.testng.annotations.Test;

/**
 * "Priority" - The priority is set to the test method.Lower priorities will be
 * scheduled first.
 * <p>
 * The test class contains two test methods with different priorities. The checkout
 * method has a higher priority (1), indicating that it should be executed after
 * the doLogin method, which has a lower priority (0). The doLogin  method has a higher
 * priority (0), indicating that it should be executed after the browseProducts method
 * which has lower priority (-1). The messages printed to the console provide a brief
 * description of the actions performed by each test method. The priority attribute
 * allows you to control the order of test method execution in TestNG.
 * 
 * @author Jagatheshwaran N
 */

public class PriorityTest {

	// Test method for login with priority -1
	@Test(priority = 0)
	public void doLogin() {
		// Print a message indicating the action being performed
		System.out.println("Login to the online shopping platform");
	}

	// Test method for browsing products with priority 0
	@Test(priority = -1)
	public void browseProducts() {
		// Print a message indicating the action being performed
		System.out.println("Browse and search for products on the online shopping platform");
	}

	// Test method for checkout with priority 1
	@Test(priority = 1)
	public void checkout() {
		// Checkout product on the online shopping platform
		System.out.println("Checkout product on the online shopping platform");
	}
}
