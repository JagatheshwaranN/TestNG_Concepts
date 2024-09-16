package testng.attributes.group;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * "dependsOnGroups" - dependsOnGroups is used to depend on the test group
 * before the dependent test group run. All the methods you depend on must have
 * run and succeeded for you to run.
 * <p>
 * In TestNG, the dependsOnGroups attribute is used to declare dependencies between
 * groups of test methods. When a test method is annotated with dependsOnGroups,
 * it specifies that the test method should only be executed if all the groups
 * specified in dependsOnGroups have successfully passed.
 * <p>
 * The test class contains three methods annotated with @BeforeTest, @Test, and
 * @AfterTest.
 * <p>
 * The doLogin method is a setup method that simulates logging in before the tests.
 * <p>
 * The browseProducts method belongs to the "browse" group and simulates browsing
 * products.
 * <p>
 * The browse and checkout methods are defined and the checked method marked with
 * depends-on browse method in the testNG.xml config file, indicating that it depends
 * on the success of the "browse" group. It will only be executed if the group "browse"
 * (containing browseProducts) succeeds.
 * <p>
 * The doLogout method is a tear down method that simulates logging out after the
 * tests.
 *
 * @author Jagatheshwaran N
 */

public class GroupDependenciesTest {

	// BeforeTest method for user login
	@BeforeTest
	public void doLogin() {
		// Perform login to the online shopping platform
		System.out.println("Login to the online shopping platform");
	}

	// Test method belonging to the "browse" group
	@Test(groups={"browse"})
	public void browse() {
		// Browse and search for products on the online shopping platform
		System.out.println("Browse and search for products on the online shopping platform");
		// Assert.fail("Explicitly failing the test.");
	}

	// Test method that depends on the success of the "browse" group
	@Test(groups={"checkout"})
	public void checkout() {
		// Checkout product on the online shopping platform
		System.out.println("Checkout product on the online shopping platform");
	}

	// AfterTest method for user logout
	@AfterTest
	public void doLogout() {
		// Logout from the online shopping platform
		System.out.println("Logout from the online shopping platform");
	}

}

