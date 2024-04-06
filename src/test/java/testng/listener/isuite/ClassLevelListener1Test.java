package testng.listener.isuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * The ClassLevelListenerTest class represents a set of test methods related to visiting a
 * shopping mall, and the @Listeners annotation associates a custom test listener
 * (ISuiteListenerImplement) with this class to capture and handle test events during execution.
 */
public class ClassLevelListener1Test {

    // This method runs once before the entire suite
    @BeforeSuite
    public void doLogin() {
        // Log in to the online shopping platform
        System.out.println("Login to online shopping platform");
    }

    // Test method to buy products
    @Test
    public void buyProduct() {
        System.out.println("Buy home appliances on the shopping platform");
    }

    // This method runs once after the entire suite
    @AfterSuite
    public void doLogout() {
        // Log out from the online shopping platform
        System.out.println("Logout from the online shopping platform");
    }

}
