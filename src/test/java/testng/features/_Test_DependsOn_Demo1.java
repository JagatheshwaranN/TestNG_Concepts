package testng.features;

import org.testng.annotations.Test;

/**
 * "dependsOnMethods" - DependsOnMethods is used to depend on the test case
 * before the dependent test case run. All the methods you depend on must have
 * run and succeeded for you to run.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _Test_DependsOn_Demo1 {

	@Test
	public void doLogin() {
		System.out.println("Login to the online shopping platform");
	}

	@Test(dependsOnMethods = "doLogin")
	public void browseProducts() {
		System.out.println("Browse and search for products on the online shopping platform");
	}

	@Test(dependsOnMethods = { "doLogin", "browseProducts" })
	public void doLogout() {
		System.out.println("Logout from the online shopping platform");
	}
}
