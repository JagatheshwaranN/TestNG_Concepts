package testng.features;

import org.testng.annotations.Test;

/**
 * "priority" - The priority is set to the test method. Lower priorities will be
 * scheduled first.
 * 
 * @author Jagatheshwaran N
 */
public class _Test_Priority {

	@Test(priority = 1)
	public void doLogin() {
		System.out.println("Login to the online shopping platform");
	}

	@Test(priority = 2)
	public void browseProducts() {
		System.out.println("Browse and search for products on the online shopping platform");
	}
}
