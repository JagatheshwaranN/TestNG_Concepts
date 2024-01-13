package testng.test_result;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 *  The test method testITestResultPass with an assertion that passes (assertTrue(true)).
 *  The tearDown method annotated with @AfterMethod executed after the test method and
 *  checks if the test result status is SUCCESS. If the test passes, it prints a message
 *  indicating the success. The purpose of this example is to illustrate the usage of
 *  ITestResult to capture and handle the status of a test result, specifically for the
 *  case when the test passes.
 *
 * @author Jagatheshwaran N
 */
public class ITestResultPassTest {

    // Test method with assertion to pass
    @Test
    public void testITestResultPass() {
        Assert.assertTrue(true);
    }

    // AfterMethod annotated method to perform actions after the test method execution
    @AfterMethod
    public void tearDown(ITestResult iTestResult) {

        // Check if the test result status is SUCCESS
        if (ITestResult.SUCCESS == iTestResult.getStatus()) {
            System.out.println(iTestResult.getName() + " passed!");
        }
    }

}

