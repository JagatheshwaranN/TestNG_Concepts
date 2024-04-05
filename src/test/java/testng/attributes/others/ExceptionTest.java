package testng.attributes.others;

import org.testng.annotations.Test;

/**
 * The Test class defines a test method calculate() that tests for an expected ArithmeticException
 * by intentionally performing a calculation that will result in such an exception. This demonstrates
 * how TestNG's expectedExceptions attribute can be used to handle and validate expected exceptions
 * in test methods.
 */
public class ExceptionTest {

    @Test(priority = 1, expectedExceptions = ArithmeticException.class)
    public void calculate() {
        // Print a message indicating the action being performed
        System.out.println("Calculation Method");

        // Perform a calculation that may result in an ArithmeticException
        int a = 5/0; // This line will throw an ArithmeticException

        // This line will not be executed because an exception will be thrown before reaching it
        System.out.println(a);
    }

}
