package testng._revise.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName() +" PASSED");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName() +" FAILED");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(result.getName() +" SKIPPED");
    }
}
