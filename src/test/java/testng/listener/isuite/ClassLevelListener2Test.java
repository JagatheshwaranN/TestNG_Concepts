package testng.listener.isuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * The ClassLevelListenerTest class represents a set of test methods related to visiting a
 * shopping mall, and the @Listeners annotation associates a custom test listener
 * (ISuiteListenerImplement) with this class to capture and handle test events during execution.
 */
public class ClassLevelListener2Test {

    // This method runs once before the entire suite
    @BeforeSuite
    public void enterMall() {
        // Enter into the online shopping mall
        System.out.println("Enter into the shopping mall");
    }

    // Test method to go to movie
    @Test
    public void gotoMovie() {
        System.out.println("Go to PVR movie at shopping mall");
    }

    // This method runs once after the entire suite
    @AfterSuite
    public void leaveMall() {
        // Leave from the online shopping mall
        System.out.println("Leave from the shopping mall");
    }

}
