package testng.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * "BeforeTest" - The annotated method will be run before any test method
 * belonging to the class/es inside the @Test tag is run.
 * 
 * "AfterTest" - The annotated method will be run after all the test methods
 * belonging to the class/es inside the @Test tag have run.
 * 
 * @author Jagatheshwaran N
 */
public class _03_Before_After_Tests_Annotation {

	@BeforeTest
	public void openBrowser() {
		System.out.println("Open the browser");
	}

	@BeforeMethod
	public void doLogin() {
		System.out.println("Login to online shopping platform");
	}

	@Test
	public void search() {
		System.out.println("Search product on the online shopping platform");
	}

	@AfterMethod
	public void doLogout() {
		System.out.println("Logout from the online shopping platform");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
}
