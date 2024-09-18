package testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * "DataProvider" - A Data Provider is a method on your class that returns an
 * array of objects.The method is annotated with @DataProvider.
 * <p>
 * A @Test method specifies its Data Provider with the dataProvider attribute.
 * This name must correspond to a method in the same class annotated
 * with @DataProvider(name="...") with a matching name.
 * <p>
 * In TestNG, the @DataProvider attribute is used to define a method as a data
 * provider for test methods in a test class.A data provider method supplies
 * data to one or more test methods, allowing those methods to be executed with
 * different sets of input parameters.
 * <p>
 * The primary use of the @DataProvider attribute is to facilitate parameterized
 * testing by supplying various sets of input data to test methods.This is
 * particularly useful when you want to run the same test logic with different
 * input values or configurations.
 * <p>
 * The class contains two test methods, getUserDetails and displayUserData, each
 * annotated with @Test and using different data providers.
 * The getUserDetails method receives user details (username and password) from the
 * data provider method named "provideUserDetails."
 * The data provider method "provideUserDetails" returns a 2D array containing two
 * sets of user details for the test method.
 * The displayUserData method receives user data (name and age) from the data
 * provider method named "fetchUserData."
 * The data provider method "fetchUserData" returns a 2D array containing two sets
 * of user data for the test method.
 * TestNG will execute these test methods with the provided data from their
 * respective data providers.
 *
 * @author Jagatheshwaran N
 */

public class DataProviderTest {

	// Test method that receives user details from the data provider "provideUserDetails"
	@Test(dataProvider = "provideUserDetails")
	public void getUserDetails(String username, String password) {
		System.out.println("UserName " + username + " | " + "Password " + password);
	}

	// Data provider method named "provideUserDetails"
	@DataProvider
	public Object[][] provideUserDetails() {
		// Creating a 2D array to provide user details for the test method
		Object[][] dataset = new Object[2][2];
		dataset[0][0] = "alex@gmail.com";
		dataset[0][1] = "pass@123";
		dataset[1][0] = "john@gmail.com";
		dataset[1][1] = "pass@123";
		return dataset;
	}

	// Test method that receives user data from the data provider "fetchUserData"
	@Test(dataProvider = "data")
	public void displayUserData(String name, int age) {
		System.out.println("Name " + name + " | " + "Age " + age);
	}

	// Data provider method named "fetchUserData"
	@DataProvider(name = "data")
	public Object[][] fetchUserData() {
		// Providing user data for the test method
		return new Object[][] { { "John", 25 }, { "Alex", 27 } };
	}

}
