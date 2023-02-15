package testng.invocation.threadpool;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * "invocationCount" - The number of times this method should be invoked.
 * 
 * @author Jagatheshwaran N
 */
public class Test_InvocationCount_Demo {

	@Test(dataProvider = "hello", invocationCount = 5)
	public void greeting(String name) {
		Date date = new Date();
		System.out.println("Hello! " + name + ", Have a good day!" + " and today's date is " + date);
	}

	@DataProvider(name = "hello")
	public Object[][] getData() {

		return new Object[][] { { "John" } };
	}
}
