package testng._revise.listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class InvokedMethodListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("Before Invocation of " + method.getTestMethod().getMethodName()+" of "+testResult.getTestClass().getName());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("After Invocation of " + method.getTestMethod().getMethodName()+" of "+testResult.getTestClass().getName());
    }
}
