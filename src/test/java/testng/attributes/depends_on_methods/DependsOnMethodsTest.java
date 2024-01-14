package testng.attributes.depends_on_methods;

import org.testng.annotations.Test;

/**
 * "DependsOnMethods" - DependsOnMethods is used to depend on the test case
 * before the dependent test case run. All the methods you depend on must have
 * run and succeeded for you to run.
 * <p>
 * In TestNG, the dependsOnMethods attribute is used to specify dependencies
 * between test methods. When a test method is annotated with dependsOnMethods,
 * it indicates that the test method should only be executed if the specified
 * methods, referred to as its dependencies, have successfully passed.
 * <p>
 * The primary use of the dependsOnMethods attribute is to control the order
 * of test method execution and ensure that certain methods are only executed
 * when their dependencies succeed. This can be helpful in scenarios where
 * specific actions need to be performed in a sequence or when one test method
 * sets up a precondition for another.
 * <p>
 * The test class demonstrates the sequencing of test methods by specifying
 * dependencies using the dependsOnMethods attribute. The doLogout method will
 * only be executed if both doLogin and browseProducts methods complete
 * successfully. This allows for better control over the order of test execution
 * in scenarios where certain actions depend on the successful completion of others.
 * 
 * @author Jagatheshwaran N
 */

public class DependsOnMethodsTest {

	// Test method for login
	@Test
	public void doLogin() {
		// Print a message indicating the action being performed
		System.out.println("Login to the online shopping platform");
	}

	// Test method for browsing products, depends on 'doLogin'
	@Test(dependsOnMethods = "doLogin")
	public void browseProducts() {
		// Print a message indicating the action being performed
		System.out.println("Browse and search for products on the online shopping platform");
	}

	// Test method for logout, depends on both 'doLogin' and 'browseProducts'
	@Test(dependsOnMethods = { "doLogin", "browseProducts" })
	public void doLogout() {
		// Print a message indicating the action being performed
		System.out.println("Logout from the online shopping platform");
	}

}
