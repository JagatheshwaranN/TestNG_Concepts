package testng.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * "BeforeSuite" - The annotated method will be run before all tests in this
 * suite have run.
 * <p>
 * "AfterSuite" - The annotated method will be run after all tests in this
 * suite have run.
 * <p>
 * In TestNG, @BeforeSuite and @AfterSuite annotations are used to define
 * methods that should run before and after the entire test suite, respectively.
 * These annotations are particularly useful for performing setup and cleanup
 * tasks that are related to the entire test suite.
 * <p>
 * Common use cases for @BeforeSuite include initializing resources, setting up
 * a test environment, or any one-time setup required for the entire suite.
 * <p>
 * Common use cases for @AfterSuite include performing cleanup tasks, releasing
 * resources, or generating a final report for the entire suite.
 *
 * @author Jagatheshwaran N
 */

public class BeforeAfterSuiteAnnotationTest {

	// This method runs once before the entire suite
	@BeforeSuite
	public void setUp() {
		// Perform any initial setup actions
		System.out.println("Initialization");
	}

	// This method runs once before all the tests within a <test> tag
	@BeforeTest
	public void openBrowser() {
		// Open the browser for testing
		System.out.println("Open the browser");
	}

	// This method runs before each test method
	@BeforeMethod
	public void doLogin() {
		// Log in to the platform
		System.out.println("Login to online shopping platform");
	}

	// The actual test method
	@Test
	public void search() {
		// Perform the search action
		System.out.println("Search product on the online shopping platform");
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
		// Close the browser after each test
		System.out.println("Close the browser");
	}

	// This method runs once after the entire suite
	@AfterSuite
	public void tearDown() {
		// Perform any final cleanup actions
		System.out.println("Close Everything");
	}

}
