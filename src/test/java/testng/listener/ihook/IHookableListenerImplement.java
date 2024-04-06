package testng.listener.ihook;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.SkipException;

/**
 * The code is to selectively execute test methods based on their names. Specifically, it allows the
 * "goForMovie" test method to execute normally but skips the execution of any other test methods.
 * It demonstrates how IHookable can be used to intercept test method execution and customize the
 * behavior based on certain conditions.
 *
 * @author Jagatheshwaran N
 */
public class IHookableListenerImplement implements IHookable {

    @Override
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        // Check if the test method name is "goForMovie"
        if (iTestResult.getMethod().getMethodName().equalsIgnoreCase("goForMovie")) {

            // If the test method is "goForMovie", proceed with the test execution
            iHookCallBack.runTestMethod(iTestResult);
        } else {
            // If the test method is not "goForMovie", skip the test execution
            System.out.println("Skip the test execution");

            // Throw a SkipException to indicate that the test should be skipped
            throw new SkipException("Skip the test execution");
        }
    }
}
