package testng.features;

import org.testng.SkipException;
import org.testng.annotations.Test;

/**
 * "SkipException" - It is used to forcefully skip the test case.
 * 
 * @author Jagatheshwaran N
 */
public class _Test_Skip {

	@Test
	public void skipDemo() {
		throw new SkipException("Skipping the test");
	}
}
