package testng.listener.itest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

/**
 * In TestNG, ITestListener is an interface that defines methods to listen to events related to
 * test execution.
 * TestNG provides this interface as part of its extensibility mechanism, allowing users to
 * implement custom behavior before, after, or during test execution.
 * <p>
 * ITestListener interface includes methods that can be implemented to perform actions based on
 * different events occurring during the test lifecycle.
 * 
 * @author Jagatheshwaran N
 */
public class ITestListenerImplement implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println("Captured the details of PASSED test case ==> " + result.getName());
		Reporter.log("Captured the details of PASSED test case ==> " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Captured the details of FAILED test case ==> " + result.getName());
		Reporter.log("Captured the details of FAILED test case ==> " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Captured the details of SKIPPED test case ==> " + result.getName());
		Reporter.log("Captured the details of SKIPPED test case ==> " + result.getName());
	}
}
