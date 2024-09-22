package testng._revise.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {

    int count = 1;
    int maxRetry = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(!iTestResult.isSuccess()) {
            if(count <= maxRetry) {
                count++;
                return true;
            }
        }
        return false;
    }
}
