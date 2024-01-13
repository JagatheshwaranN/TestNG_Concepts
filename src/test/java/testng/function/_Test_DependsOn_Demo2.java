package testng.function;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * "dependsOnMethods" - DependsOnMethods is used to depend on the test case
 * before the dependent test case run. All the methods you depend on must have
 * run and succeeded for you to run.
 * 
 * Hard Dependency, If at least one failure occurred in your test dependencies,
 * your test will not be invoked and marked as a SKIP in the report.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _Test_DependsOn_Demo2 {

	@Test
	public void doLogin() {
		System.out.println("Login to the online shopping platform");
		Assert.fail("Failing this test method to demo the behavior when a dependency method fail");
	}

	@Test(dependsOnMethods = "doLogin")
	public void browseProducts() {
		System.out.println("Browse and search for products on the online shopping platform");
	}

	@Test(dependsOnMethods = { "browseProducts" })
	public void doLogout() {
		System.out.println("Logout from the online shopping platform");
	}
}
