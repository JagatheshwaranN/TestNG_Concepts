package testng.annotation;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * The @Factory annotation in TestNG is used to create a factory method that generates instances
 * of test classes or test cases at runtime. This is particularly useful when you need to dynamically
 * generate test cases based on certain conditions, parameters, or configurations.
 * <p>
 * The Test class demonstrates the usage of TestNG @Factory annotation to dynamically generate
 * and execute test instances. The DynamicTest class represents the dynamic test instances with
 * each having its unique ID. When TestNG runs, it invokes the factory method to create instances
 * of DynamicTest, and each instance executes its test() method, printing a message indicating its
 * execution with the associated ID.
 */
public class FactoryAnnotationTest {

    // Factory method to create test instances
    @Factory
    public Object[] createTestInstance() {
        // Create an array to hold test instances
        Object[] result = new Object[3];

        // Create and configure each test instance
        for (int i = 0; i < 3; i++) {
            // Create an instance of DynamicTest class
            result[i] = new DynamicTest(i + 1);
        }

        // Return the array of test instances
        return result;
    }

    // Static nested class representing a dynamic test
    public static class DynamicTest {
        int id;

        // Constructor to initialize the dynamic test with an ID
        public DynamicTest(int id) {
            this.id = id;
        }

        // Test method
        @Test
        public void test() {
            System.out.println("Test " + id + " executed.");
        }
    }
}

