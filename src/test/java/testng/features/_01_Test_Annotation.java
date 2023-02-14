package testng.features;

import org.testng.annotations.Test;

/**
 * @Test - Marks a class or a method as a part of the test.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Test_Annotation {

	@Test
	public void searchProduct() {
		System.out.println("Search product anonymously on the online shopping platform");
	}
}
