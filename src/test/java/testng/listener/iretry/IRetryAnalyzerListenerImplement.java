package testng.listener.iretry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * In TestNG, IRetryAnalyzer is an interface that allows users to implement retry logic for failed
 * test cases. It provides a way to specify custom retry behavior for individual test methods,
 * allowing them to be rerun a certain number of times if they fail during execution.
 * IRetryAnalyzer interface consists of a single method: retry(ITestResult result), which returns a
 * boolean value indicating whether the test method should be retried.
 *
 * @author Jagatheshwaran N
 */
public class IRetryAnalyzerListenerImplement implements IRetryAnalyzer {

    int counter  = 1;

    int retryLimit = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(!iTestResult.isSuccess()) {
            if (counter <= retryLimit) {
                counter++;
                return true;
            }
        }
        return false;
    }

}
