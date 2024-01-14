package testng.dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

/**
 * The provided Java class, DataProviderClass, serves as a data provider for the
 * test methods in the DataProviderWithDataProviderClassTest class.It contains
 * two data provider methods.
 * <p>
 * The class contains two data provider methods annotated with @DataProvider.
 * The fetchUserData method provides user data for the test method annotated with
 * @Test(dataProvider = "userdata").
 * The retrievePersonData method dynamically provides data based on the name of the
 * test method using the Method parameter.It checks the method name and returns the
 * corresponding dataset for either "displayPersonDetails" or "displayPersonLogin."
 * The conditional logic in retrievePersonData allows different test methods to
 * request different sets of data, enhancing flexibility in data provisioning.
 * The @DataProvider annotation's name attribute specifies the name of the data
 * provider that will be referenced in the test methods.
 *
 * @author Jagatheshwaran N
 */

public class DataProviderClass {

	// Data provider method named "userdata"
	@DataProvider(name = "userdata")
	public Object[][] fetchUserData() {
		// Providing user data for the test method
		return new Object[][] { { "John", 25 }, { "Alex", 27 } };
	}

	// Data provider method named "person_data"
	@DataProvider(name = "person_data")
	public Object[][] retrievePersonData(Method method) {
		Object[][] dataset = null;

		// Conditional data provision based on the test method's name
		if (method.getName().contentEquals("displayPersonDetails")) {
			dataset = new Object[][] { { "John", 25, "Male" }, { "Alex", 27, "Male" } };
		} else if (method.getName().contentEquals("displayPersonLogin")) {
			dataset = new Object[][] { { "alex@gmail.com", "pass@123" }, { "john@gmail.com", "pass@123" } };
		}

		return dataset;
	}

}

