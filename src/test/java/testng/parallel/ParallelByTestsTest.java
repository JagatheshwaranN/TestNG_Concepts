package testng.parallel;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * The TestNG suite configuration file, named "testng-parallel-tests.xml," is
 * configured to run tests in parallel using the "tests" mode. The suite includes
 * three tests: "Parallel By Tests - Test1," "Parallel By Tests - Test2," and
 * "Parallel By Tests - Test3." Each test has a thread count of 3 and includes a
 * class with associated parameter values.
 * <p>
 * The configuration is designed for parallel execution of individual tests, each
 * with its own thread count and parameter values. The tests include different
 * classes, namely "ParallelByMethodsTest," "ParallelByClassesTest," and
 * "ParallelByTestsTest," each contributing to parallel test execution within the
 * "Parallel By Tests Suite."
 *
 * @author Jagatheshwaran N
 */

@Test
public class ParallelByTestsTest {

    // Test method that greets the user
    @Parameters({"user"})
    public void greetUser(String user) {
        // Print a welcome message with the provided user
        System.out.println(Thread.currentThread().getName() + " Welcome! " + user + "!");
    }

}

