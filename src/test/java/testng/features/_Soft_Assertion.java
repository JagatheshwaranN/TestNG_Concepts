package testng.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * "SoftAssert" - Soft assertions will cpature the failed test cases and move
 * with the next code execution. It will not halt the program execution and
 * report all the captured failed test cases after the completion of program
 * execution.
 * 
 * @author Jagatheshwaran N
 */
public class _Soft_Assertion {

	@Test
	public void verifySoftAssertion() {

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("apple", "banana");
		softAssert.assertEquals(100, 100);
		softAssert.assertEquals(123456L, 1234567L);
		softAssert.assertEquals(10.5f, 10.5f);
		softAssert.assertEquals(100.0, 100.0);
		softAssert.assertEquals(true, true);
		softAssert.assertAll();
	}
}
