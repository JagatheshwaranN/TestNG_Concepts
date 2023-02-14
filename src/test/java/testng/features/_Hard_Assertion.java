package testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Assertions in TestNG are a way to verify that the expected result and the
 * actual result matched or not.
 * 
 * Hard assertions will fail the test case and halt the program execution.
 * 
 * @author Jagatheshwaran N
 */
public class _Hard_Assertion {

	@Test
	public void verifyStringAssertion() {

		String expectedTitle = "TestNG";
		String actualTitle1 = "TestNG";
		String actualTitle2 = "Java";
		Assert.assertEquals(actualTitle1, expectedTitle);
		Assert.assertEquals(actualTitle2, expectedTitle);
	}

	@Test
	public void verifyIntegerAssertion() {

		int expectedInt = 100;
		int actualInt1 = 100;
		int actualInt2 = 50;
		Assert.assertEquals(actualInt1, expectedInt);
		Assert.assertEquals(actualInt2, expectedInt);
	}

	@Test
	public void verifyLongAssertion() {

		long expectedLong = 123456789l;
		long actualLong1 = 123456789l;
		long actualLong2 = 123456799l;
		Assert.assertEquals(actualLong1, expectedLong);
		Assert.assertEquals(actualLong2, expectedLong);
	}

	@Test
	public void verifyFloatAssertion() {

		float expectedFloat = 10.0f;
		float actualFloat1 = 10.0f;
		float actualFloat2 = 10.1f;
		Assert.assertEquals(actualFloat1, expectedFloat);
		Assert.assertEquals(actualFloat2, expectedFloat);
	}

	@Test
	public void verifyDoubleAssertion() {

		double expectedDouble = 123.45;
		double actualDouble1 = 123.45;
		double actualDouble2 = 123.44;
		Assert.assertEquals(actualDouble1, expectedDouble);
		Assert.assertEquals(actualDouble2, expectedDouble);
	}

	@Test
	public void verifyBooleanAssertion() {

		boolean expected = true;
		boolean actual1 = true;
		boolean actual2 = false;
		Assert.assertEquals(actual1, expected);
		Assert.assertEquals(actual2, expected);
	}

	@Test
	public void verifyCharAssertion() {

		char expected = 'a';
		char actual1 = 'a';
		char actual2 = 'e';
		Assert.assertEquals(actual1, expected);
		Assert.assertEquals(actual2, expected);
	}

	@Test
	public void verifyAssertTrue() {

		boolean expected = true;
		Assert.assertTrue(expected);
	}

	@Test
	public void verifyAssertFalse() {

		boolean expected = false;
		Assert.assertFalse(expected);
	}

	@Test
	public void verifyAssertFail() {

		Assert.fail("Explicitly failing the test case");
	}
}
