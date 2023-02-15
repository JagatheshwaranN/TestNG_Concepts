package testng.parallel.execution;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * "parallel='tests'" - TestNG will run all the methods in the same <test> tag
 * in the same thread, but each <test> tag will be in a separate thread. This
 * allows you to group all your classes that are not thread safe in the same
 * <test> and guarantee they will all run in the same thread while taking
 * advantage of TestNG using as many threads as possible to run your tests.
 * 
 * @author Jagatheshwaran N
 *
 */
public class Test_ParallelExecution_Demo {

	@Parameters({ "user" })
	@Test
	public void sayHello(String user) {
		Date date = new Date();
		System.out.println(Thread.currentThread().getName() + " Hello! " + user + ", Have a good day!"
				+ " and today's date is " + date);
	}
}
