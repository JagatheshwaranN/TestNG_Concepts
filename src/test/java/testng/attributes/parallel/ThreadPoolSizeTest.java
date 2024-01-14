package testng.attributes.parallel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * "threadPoolSize" - The size of the thread pool for this method. The method
 * will be invoked from multiple threads as specified by invocationCount.
 * Note: This attribute is ignored if invocationCount is not specified.
 * <p>
 * The Java class, ThreadPoolSizeTest, is a TestNG test class that uses the
 * threadPoolSize attribute to control the size of the thread pool when running
 * the test method concurrently
 * <p>
 * The threadPoolSize attribute helps control the degree of parallelism by
 * specifying the maximum number of threads that can run the test concurrently.
 * The threadPoolSize attribute is set to 2, specifying that up to two
 * threads can run the test method concurrently.
 * The System.out.println statement within the test method includes the
 * thread name, allowing you to observe concurrent execution.
 *
 * @author Jagatheshwaran N
 */

public class ThreadPoolSizeTest {

	// Test method "greetUser" that receives data from the data provider "hello"
	// It is configured to be invoked 5 times using the "invocationCount" attribute
	// The "threadPoolSize" attribute is set to 2, indicating that up to 2 threads
	// can run the test concurrently
	@Test(dataProvider = "hello", invocationCount = 5, threadPoolSize = 2)
	public void greetUser(String name) {
		System.out.println(Thread.currentThread().getName() + " Hello! " + name + ", Have a good day!");
	}

	// Data provider method named "hello"
	// It provides a single set of data with the name "John"
	@DataProvider(name = "hello")
	public Object[][] getData() {
		return new Object[][] { { "John" } };
	}

}
