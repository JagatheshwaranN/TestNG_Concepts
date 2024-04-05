package testng.attributes.others;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * "invocationCount" - The number of times this method should be invoked.
 * <p>
 * The Java class, InvocationCountTest, is a TestNG test class that uses
 * the invocationCount attribute to control how many times a test method
 * is invoked.
 * <p>
 * The invocationCount attribute in the @Test annotation is set to 5,
 * indicating that the greetUser method should be invoked five times with
 * the provided data.
 * As a result, the "Hello!John, Have a good day!" message will be printed
 * to the console five times, reflecting the invocation count.
 *
 * @author Jagatheshwaran N
 */

public class InvocationCountTest {

    // Test method "greeting" that receives data from the data provider "hello"
    // It is configured to be invoked 5 times using the "invocationCount" attribute
    @Test(dataProvider = "hello", invocationCount = 5)
    public void greetUser(String name) {
        System.out.println("Hello! " + name + ", Have a good day!");
    }

    // Data provider method named "hello"
    // It provides a single set of data with the name "John"
    @DataProvider(name = "hello")
    public Object[][] getData() {
        return new Object[][]{{"John"}};
    }

}
