package testng.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * "BeforeMethod" - The annotated method will be run before each test method.
 * <p>
 * "AfterMethod" - The annotated method will be run after each test method.
 * <p>
 * In TestNG, @BeforeMethod and @AfterMethod annotations are used to mark methods
 * that should run before and after each test method, respectively.These annotations
 * are particularly useful for performing setup and cleanup tasks that are specific
 * to each test method.
 * <p>
 * Common use cases for @BeforeMethod include actions that need to be performed before
 * the execution of every test method, such as logging in, initializing data, or setting
 * up the environment.
 * <p>
 * Common use cases for @AfterMethod include cleanup tasks or actions that need to be
 * performed after the execution of every test method, such as logging out, resetting
 * state, or releasing resources.
 * 
 * @author Jagatheshwaran N
 */

public class BeforeAfterMethodAnnotationTest {

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
	public void addToCart() {
		// Perform the adding to cart action
		System.out.println("Add product on the online shopping platform");
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

}
