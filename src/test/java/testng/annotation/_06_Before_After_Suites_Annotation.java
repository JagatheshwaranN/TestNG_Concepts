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
 * 
 * "AfterSuite" - The annotated method will be run after all tests in this suite
 * have run.
 * 
 * @author Jagatheshwaran N
 */
public class _06_Before_After_Suites_Annotation {

	@BeforeSuite
	public void setUp() {
		System.out.println("Initiailization");
	}

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

	@AfterSuite
	public void tearDown() {
		System.out.println("Close Everything");
	}

}
