package testng.parallel;

import org.testng.annotations.Test;

public class ParallelByInstanceTest {

    // Test method for valid login
    @Test
    public void testValidLogin() {
        // Print the name of the current thread executing the test method
        System.out.println(Thread.currentThread().getName()+ " Executing valid login test.");
    }

    // Test method for invalid login
    @Test
    public void testInvalidLogin() {
        // Print the name of the current thread executing the test method
        System.out.println(Thread.currentThread().getName()+ " Executing invalid login test.");
    }

}
