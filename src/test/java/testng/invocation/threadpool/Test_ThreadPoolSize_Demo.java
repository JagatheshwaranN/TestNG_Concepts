package testng.invocation.threadpool;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * "threadPoolSize" - The size of the thread pool for this method. The method
 * will be invoked from multiple threads as specified by invocationCount.
 * 
 * Note: This attribute is ignored if invocationCount is not specified.
 * 
 * @author Jagatheshwaran N
 */
public class Test_ThreadPoolSize_Demo {

	@Test(dataProvider = "hello", invocationCount = 5, threadPoolSize = 5)
	public void greeting(String name) {
		Date date = new Date();
		System.out.println(Thread.currentThread().getName() + " Hello! " + name + ", Have a good day!"
				+ " and today's date is " + date);
	}

	@DataProvider(name = "hello")
	public Object[][] getData() {

		return new Object[][] { { "John" } };
	}
}
