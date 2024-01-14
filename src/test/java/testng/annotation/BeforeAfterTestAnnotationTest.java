package testng.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * "BeforeTest" - The annotated method will be run before any test method
 * belonging to the class/es inside the @Test tag is run.
 * <p>
 * "AfterTest" - The annotated method will be run after all the test methods
 * belonging to the class/es inside the @Test tag have run.
 * <p>
 * In TestNG, @BeforeTest and @AfterTest annotations are used to mark methods
 * that should run before and after all the test methods within a <test> tag,
 * respectively.These annotations are particularly useful for performing setup
 * and cleanup tasks that are specific to a group of tests defined within a
 * <test> tag.
 * <p>
 * Common use cases for @BeforeTest include setting up resources that are shared
 * among multiple test methods, initializing data, or any setup required for the
 * entire set of tests within a <test> tag.
 * <p>
 * Common use cases for @AfterTest include performing cleanup tasks, releasing
 * resources, or any teardown actions required after all the tests within a
 * <test> tag have run.
 *
 * @author Jagatheshwaran N
 */

public class BeforeAfterTestAnnotationTest {

	// This method runs once before all the tests within a <test> tag
	@BeforeTest
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

	// This method runs after all the tests within a <test> tag
	@AfterTest
	public void closeBrowser() {
		// Close the browser after all tests
		System.out.println("Close the browser");
	}

}

