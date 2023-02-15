package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_TestNG_DataProvider_Demo2 {

	@Test(dataProvider = "update")
	public void updateDetails(String name, int age) {

		System.out.println("Name " + name + " | " + "Age " + age);
	}

	@DataProvider(name = "update")
	public Object[][] getData() {

		return new Object[][] { { "John", 25 }, { "Alex", 27 } };
	}
}
