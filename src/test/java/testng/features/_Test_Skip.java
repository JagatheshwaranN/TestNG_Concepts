package testng.features;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class _Test_Skip {

	@Test
	public void skipDemo() {
		throw new SkipException("Skipping the test");
	}
}
