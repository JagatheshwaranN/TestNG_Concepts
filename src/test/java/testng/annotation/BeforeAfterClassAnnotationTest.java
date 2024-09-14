package testng.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * "BeforeClass" - The annotated method will be run before the first test method
 * in the current class is invoked.
 * <p>
 * "AfterClass" - The annotated method will be run after all the test methods in
 * the current class have been run.
 * <p>
 * In TestNG, @BeforeClass and @AfterClass annotations are used to mark methods
 * that should run once before and after all the test methods in a test class,
 * respectively. These annotations are particularly useful for performing setup
 * and tear down tasks that are common to the entire test class.
 * <p>
 * Common use cases for @BeforeClass include setting up resources, initializing
 * shared data, or any one-time setup required for the entire test class.
 * <p>
 * Common use cases for @AfterClass include performing cleanup tasks, releasing
 * resources, or any tear down actions required after all the test methods in the
 * class have run.
 *
 * @author Jagatheshwaran N
 */

public class BeforeAfterClassAnnotationTest {

	// This method runs once before any test method in the class
	@BeforeClass
	public void openBrowser() {
		// Open the browser for testing
		System.out.println("Open the browser");
	}

	// This method runs before each test method
	@BeforeMethod
	public void doLogin() {
		// Log in to the online shopping platform
		System.out.println("Login to online shopping platform");
	}

	// The actual test method
	@Test
	public void search() {
		// Perform the search action
		System.out.println("Search product on the online shopping platform");
	}

	// Another test method
	@Test
	public void checkout() {
		// Perform the checkout action
		System.out.println("Checkout product on the online shopping platform");
	}

	// This method runs after each test method
	@AfterMethod
	public void doLogout() {
		// Log out after each test
		System.out.println("Logout from the online shopping platform");
	}

	// This method runs once after all test methods in the class
	@AfterClass
	public void closeBrowser() {
		// Close the browser after all tests in the class
		System.out.println("Close the browser");
	}

}

