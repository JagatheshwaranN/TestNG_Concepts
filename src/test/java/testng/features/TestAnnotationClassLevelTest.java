package testng.features;

import org.testng.annotations.Test;

/**
 * "Test"- Marks a class or a method as a part of the test.
 * <p>
 * The @Test annotation indicates that this method is a TestNG test.
 * <p>
 * This test class contains a single test method focused on searching
 * for a product, and it is appropriately annotated with @Test to signify
 * it as a TestNG test method.
 *
 * @author Jagatheshwaran N
 */

// Test class with a test method at the class level
@Test
public class TestAnnotationClassLevelTest {

	public void searchProduct() {
		// Print a message indicating the action being performed
		System.out.println("Search product anonymously on the online shopping platform");
	}
}
