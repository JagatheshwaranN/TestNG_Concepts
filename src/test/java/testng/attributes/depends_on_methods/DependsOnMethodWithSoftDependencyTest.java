package testng.attributes.depends_on_methods;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * "dependsOnMethods" - DependsOnMethods is used to depend on the test case
 * before the dependent test case run. All the methods you depend on must have
 * run and succeeded for you to run.
 * <p>
 * In TestNG, the dependsOnMethods attribute is used to specify dependencies
 * between test methods. When a test method is annotated with dependsOnMethods,
 * it indicates that the test method should only be executed if the specified
 * methods, referred to as its dependencies, have successfully passed.
 * <p>
 * Soft Dependency, Your test will always be run after the methods your test
 * depends on, even if some of them have failed. This is useful when you just
 * want to make sure that your test methods are run in a certain order, but
 * their success doesn't really depend on the success of others.
 * <p>
 * A soft dependency is obtained by adding "alwaysRun=true" in your @Test
 * annotation.
 * <p>
 * The test class contains three test methods: doLogin, browseProducts, and
 * doLogout.
 * The doLogin method is intentionally designed to fail using Assert.fail for
 * demonstration purposes.
 * The browseProducts method is marked with dependsOnMethods = "doLogin" and
 * alwaysRun = true. This means that it depends on the success of doLogin, and
 * the alwaysRun attribute ensures that it will be executed even if its
 * dependencies fail.
 * The doLogout method is marked with dependsOnMethods = { "doLogin",
 * "browseProducts" }, indicating that it depends on the success of both doLogin
 * and browseProducts. It will only be executed if both dependencies succeed
 * 
 * @author Jagatheshwaran N
 */

public class DependsOnMethodWithSoftDependencyTest {

	// Test method for user login
	@Test
	public void doLogin() {
		// Perform login to the online shopping platform
		System.out.println("Login to the online shopping platform");

		// Simulating a failure in this method for demonstration purposes
		Assert.fail("Failing this test method to demo the behavior when a dependency method fails");
	}

	// Test method that depends on the success of "doLogin"
	@Test(dependsOnMethods = "doLogin", alwaysRun = true)
	public void browseProducts() {
		// Browse and search for products on the online shopping platform
		System.out.println("Browse and search for products on the online shopping platform");
	}

	// Test method that depends on the success of "doLogin" and "browseProducts"
	@Test(dependsOnMethods = { "doLogin", "browseProducts" })
	public void doLogout() {
		// Logout from the online shopping platform
		System.out.println("Logout from the online shopping platform");
	}

}
