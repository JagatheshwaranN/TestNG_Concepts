package testng.features;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * "BeforeMethod" - The annotated method will be run before each test method.
 * 
 * "AfterMethod" - The annotated method will be run after each test method.
 * 
 * @author Jagatheshwaran N
 */
public class _02_Before_After_Methods_Annotation {

	@BeforeMethod
	public void doLogin() {
		System.out.println("Login to online shopping platform");
	}

	@Test
	public void search() {
		System.out.println("Search product on the online shopping platform");
	}
	
	@Test
	public void checkout() {
		System.out.println("Checkout product on the online shopping platform");
	}

	@AfterMethod
	public void doLogout() {
		System.out.println("Logout from the online shopping platform");
	}
}
