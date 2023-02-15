package testng.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "update")
	public Object[][] updateDetails() {

		Object[][] dataset = new Object[2][2];
		dataset[0][0] = "alex@gmail.com";
		dataset[0][1] = "pass@123";
		dataset[1][0] = "john@gmail.com";
		dataset[1][1] = "pass@123";
		return dataset;
	}

	@DataProvider(name = "get")
	public Object[][] getDetails() {

		return new Object[][] { { "John", 25 }, { "Alex", 27 } };
	}

	@DataProvider(name = "getData")
	public Object[][] getData(Method method) {

		Object[][] dataset = null;
		if (method.getName().contentEquals("getDetails")) {
			dataset = new Object[][] { { "John", 25, "Male" }, { "Alex", 27, "Male" } };
		} else if (method.getName().contentEquals("updateDetails")) {
			dataset = new Object[][] { { "alex@gmail.com", "pass@123" }, { "john@gmail.com", "pass@123" } };
		}
		return dataset;
	}
}
