package testng.attributes.others;

import org.testng.annotations.Test;

/**
 * In TestNG, "timeout" is a parameter that defines the maximum time that a method can take
 * for execution. The timeout parameter is handy if the execution time is a constraint during
 * testing, or the tester wants to take precautions against the endless execution of tests.
 * <p>
 * The code snippet demonstrates how to set a timeout for a test method using TestNG @Test
 * annotation. In this example, the doLogin() method is expected to complete within 1 second
 * (1000 milliseconds). If the method exceeds this time limit, it will be considered failed.
 * This feature is useful for ensuring that test methods do not hang indefinitely, allowing
 * the test execution framework to proceed even if a test method takes longer than expected.
 */
public class TimeoutTest {

    // Test method for login with priority 1 and a timeout of 1000 milliseconds
    @Test(priority = 1, timeOut = 1000)
    public void doLogin() {
        try {
            // Simulate some processing time for login (750 milliseconds)
            Thread.sleep(750);
        } catch (InterruptedException e) {
            // Throw a runtime exception if the thread sleep is interrupted
            throw new RuntimeException(e);
        }
        // Print a message indicating the action being performed
        System.out.println("Login to the online shopping platform");
    }

}
