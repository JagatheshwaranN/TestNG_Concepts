package testng.listener.iinvoke;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

/**
 * IInvokedMethodListener is an interface in TestNG that allows users to define custom
 * behavior for method invocation events during test execution. It provides methods to
 * listen to events related to individual test method invocation. TestNG invokes these
 * methods before and after each test method is invoked, enabling users to perform
 * custom actions or behaviors based on method execution events.
 *
 * @author Jagatheshwaran N
 */
public class IInvokeMethodListenerImplement implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("Before invocation method started for " + method.getTestMethod().getMethodName() + " of " + testResult.getTestClass().getName());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("After invocation method started for " + method.getTestMethod().getMethodName() + " of " + testResult.getTestClass().getName());
    }

}
