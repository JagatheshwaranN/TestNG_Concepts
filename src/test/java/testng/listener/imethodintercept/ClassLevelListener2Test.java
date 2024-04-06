package testng.listener.imethodintercept;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * The ClassLevelListenerTest class represents a set of test methods related to visiting a
 * shopping mall, and the @Listeners annotation associates a custom test listener
 * (IMethodInterceptorImplement) with this class to capture and handle test events during execution.
 */
public class ClassLevelListener2Test {

    // Test method to enter into mall
    @Test(priority = 1)
    public void enterMall() {
        // Enter into the online shopping mall
        System.out.println("Enter into the shopping mall");
    }

    // Test method to go to movie
    @Test(priority = 2)
    public void gotoMovie() {
        System.out.println("Go to PVR movie at shopping mall");
    }

    // Test method to leave mall
    @Test(priority = 3)
    public void leaveMall() {
        // Leave from the online shopping mall
        System.out.println("Leave from the shopping mall");
    }

}
