package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * "DataProvider" - A Data Provider is a method on your class that returns an
 * array of array of objects. This method is annotated with @DataProvider
 * 
 * A @Test method specifies its Data Provider with the dataProvider attribute.
 * This name must correspond to a method on the same class annotated
 * with @DataProvider(name="...") with a matching name.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_TestNG_DataProvider_Demo1 {

	@Test(dataProvider = "provideData")
	public void doLogin(String username, String password) {

		System.out.println("UserName " + username + " | " + "Password " + password);
	}

	@DataProvider
	public Object[][] provideData() {

		Object[][] dataset = new Object[2][2];
		dataset[0][0] = "alex@gmail.com";
		dataset[0][1] = "pass@123";
		dataset[1][0] = "john@gmail.com";
		dataset[1][1] = "pass@123";
		return dataset;
	}

	@Test(dataProvider = "update")
	public void updateDetails(String username, String password) {

		System.out.println("UserName " + username + " | " + "Password " + password);
	}

	@DataProvider(name = "update")
	public Object[][] getData() {

		Object[][] dataset = new Object[2][2];
		dataset[0][0] = "alex@gmail.com";
		dataset[0][1] = "pass@123";
		dataset[1][0] = "john@gmail.com";
		dataset[1][1] = "pass@123";
		return dataset;
	}
}
