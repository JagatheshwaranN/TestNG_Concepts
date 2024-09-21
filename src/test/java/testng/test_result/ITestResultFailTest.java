package testng.test_result;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * The test method testITestResult intentionally failing by asserting assertTrue(false).
 * The tearDown method annotated with @AfterMethod executed after the test method and
 * checks if the test result status is FAILURE. If the test fails, it prints a message
 * indicating the failure. The purpose of this example is to illustrate the usage of
 * ITestResult to capture and handle the status of a test result, specifically for the
 * case when the test fails.
 *
 * @author Jagatheshwaran N
 */
@SuppressWarnings("All")
public class ITestResultFailTest {

    // Test method intentionally failing by asserting false
    @Test
    public void testITestResult() {
        Assert.assertTrue(false);
    }

    // AfterMethod annotated method to perform actions after the test method execution
    @AfterMethod
    public void tearDown(ITestResult iTestResult) {

        // Check if the test result status is FAILURE
        if (ITestResult.FAILURE == iTestResult.getStatus()) {
            System.out.println(iTestResult.getName() + " failed!");
        }
    }

}
