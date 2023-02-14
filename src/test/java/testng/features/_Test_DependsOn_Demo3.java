package testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * "dependsOnMethods" - DependsOnMethods is used to depend on the test case
 * before the dependent test case run. All the methods you depend on must have
 * run and succeeded for you to run.
 * 
 * Soft Dependency, You will always be run after the methods you depend on, even
 * if some of them have failed. This is useful when you just want to make sure
 * that your test methods are run in a certain order but their success doesn't
 * really depend on the success of others.
 * 
 * A soft dependency is obtained by adding "alwaysRun=true" in your @Test
 * annotation.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _Test_DependsOn_Demo3 {

	@Test
	public void doLogin() {
		System.out.println("Login to the online shopping platform");
		Assert.fail("Failing this test method to demo the behavior when a dependency method failure");
	}

	@Test(dependsOnMethods = "doLogin", alwaysRun = true)
	public void browseProducts() {
		System.out.println("Browse and search for products on the online shopping platform");
	}

	@Test(dependsOnMethods = { "doLogin", "browseProducts" })
	public void doLogout() {
		System.out.println("Logout from the online shopping platform");
	}
}
