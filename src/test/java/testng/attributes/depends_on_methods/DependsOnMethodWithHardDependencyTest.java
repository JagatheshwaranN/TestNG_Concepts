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
 * Hard Dependency, If at least one failure occurred in your test dependencies,
 * your test will not be invoked and marked as a SKIP in the report.
 * <p>
 * The test class contains three test methods: doLogin, browseProducts, and doLogout.
 * The doLogin method is intentionally designed to fail using Assert.fail for
 * demonstration purposes.
 * The browseProducts method is marked with dependsOnMethods = "doLogin", indicating
 * that it depends on the success of the doLogin method. It will only be executed if
 * doLogin succeeds.
 * The doLogout method is marked with dependsOnMethods = { "browseProducts" },
 * indicating that it depends on the success of the browseProducts method. It will
 * only be executed if browseProducts succeeds.
 *
 * @author Jagatheshwaran N
 */

public class DependsOnMethodWithHardDependencyTest {

	// Test method for user login
	@Test
	public void doLogin() {
		// Perform login to the online shopping platform
		System.out.println("Login to the online shopping platform");

		// Simulating a failure in this method for demonstration purposes
		Assert.fail("Failing this test method to demo the behavior when a dependency method fails");
	}

	// Test method that depends on the success of "doLogin"
	@Test(dependsOnMethods = "doLogin")
	public void browseProducts() {
		// Browse and search for products on the online shopping platform
		System.out.println("Browse and search for products on the online shopping platform");
	}

	// Test method that depends on the success of "browseProducts"
	@Test(dependsOnMethods = { "browseProducts" })
	public void doLogout() {
		// Logout from the online shopping platform
		System.out.println("Logout from the online shopping platform");
	}

}

