package testng.test_result;

import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * It contains a test method testITestResultSkip intentionally throwing a
 * SkipException to skip the test. The tearDown method annotated with
 * @AfterMethod executes after the test method and checks if the test result
 * status is SKIP. If the test is skipped, it prints a message indicating the
 * skip. The purpose of this example is to illustrate the usage of ITestResult
 * to capture and handle the status of a skipped test.
 *
 * @author Jagatheshwaran N
 */
public class ITestResultSkipTest {

    // Test method intentionally throwing a SkipException to skip the test
    @Test
    public void testITestResultSkip() {
        throw new SkipException("Test is skipped!");
    }

    // AfterMethod annotated method to perform actions after the test method execution
    @AfterMethod
    public void tearDown(ITestResult iTestResult) {

        // Check if the test result status is SKIP
        if (ITestResult.SKIP == iTestResult.getStatus()) {
            System.out.println(iTestResult.getName() + " skipped!");
        }
    }

}

