package testng.dataprovider;

import org.testng.annotations.Test;

/**
 * In TestNG, the @DataProvider attribute is used to define a method as a data
 * provider for test methods in a test class.A data provider method supplies
 * data to one or more test methods, allowing those methods to be executed with
 * different sets of input parameters.
 * <p>
 * The primary purpose of DataProviderClass is to centralize and manage data for
 * multiple test methods across different test classes.
 * It encapsulates data retrieval logic within methods annotated with @DataProvider.
 * By centralizing data provisioning logic in a separate class (DataProviderClass),
 * you improve the maintainability of your code.
 * Since the DataProviderClass is a standalone class, its data provider methods can
 * be reused across multiple test classes.
 * Test classes can reference the DataProviderClass and its data providers, promoting
 * code reusability.
 * <p>
 * The class contains three test methods, each annotated with @Test.
 * The displayUserData method receives user data (name and age) from the data
 * provider class named "DataProviderClass" and the method named "userdata."
 * The displayPersonLogin method receives person login data (username and password)
 * from the same data provider class and the method "person_data."
 * The displayPersonDetails method also receives person details data (name, age,
 * and gender) from the "DataProviderClass" and the method "person_data."
 * The dataProvider attribute specifies the name of the data provider method, and
 * the dataProviderClass attribute specifies the class containing the data provider
 * methods.
 * The actual data and logic for providing data are implemented in the
 * DataProviderClass class.
 *
 * @author Jagatheshwaran N
 */
public class DataProviderWithDataProviderClassTest {

	// Test method that receives user data from the data provider class "DataProviderClass"
	// and method "userdata"
	@Test(dataProvider = "userdata", dataProviderClass = DataProviderClass.class)
	public void displayUserData(String name, int age) {
		System.out.println("Name " + name + " | " + "Age " + age);
	}

	// Test method that receives person login data from the data provider class "DataProviderClass"
	// and method "person_data"
	@Test(dataProvider = "person_data", dataProviderClass = DataProviderClass.class)
	public void displayPersonLogin(String username, String password) {
		System.out.println("UserName " + username + " | " + "Password " + password);
	}

	// Test method that receives person details data from the data provider class "DataProviderClass"
	// and method "person_data"
	@Test(dataProvider = "person_data", dataProviderClass = DataProviderClass.class)
	public void displayPersonDetails(String name, int age, String gender) {
		System.out.println("Name " + name + " | " + "Age " + age + " | " + "Gender " + gender);
	}

}
