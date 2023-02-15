package testng.parallel.execution;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * "@DataProvider(parallel = true)" - TestNG will run the <test> tag method
 * which takes data from the DataProvider in a separate thread in parallel.
 * 
 * @author Jagatheshwaran N
 */
public class _02_Test_ParallelExecution_DataProvider_Demo2 {

	@Test(dataProvider = "update")
	public void sayHello(String user) {
		Date date = new Date();
		System.out.println(Thread.currentThread().getName() + " Hello! " + user + ", Have a good day!"
				+ " and today's date is " + date);
	}

	@DataProvider(name = "update", parallel = true)
	public Object[][] getData() {

		return new Object[][] { { "John" }, { "Alex" } };
	}
}
