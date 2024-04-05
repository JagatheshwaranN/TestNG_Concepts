package testng.attributes.others;

import org.testng.annotations.Test;

/**
 * The Test class defines a test method doLogin() for logging into an online shopping platform.
 * However, the test method is disabled (enabled = false) using the @Test annotation, which means
 * that it will not be executed when the test suite is run. Therefore, the doLogin() method will
 * not contribute to the test execution flow, and its associated functionality will not be tested.
 */
public class DisableTest {

    // Test method for login with priority 1
    @Test(priority = 1, enabled = false)
    public void doLogin() {
        // Print a message indicating the action being performed
        System.out.println("Login to the online shopping platform");
    }

}
