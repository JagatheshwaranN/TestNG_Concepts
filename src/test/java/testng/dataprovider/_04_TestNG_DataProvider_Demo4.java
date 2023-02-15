package testng.dataprovider;

import org.testng.annotations.Test;

public class _04_TestNG_DataProvider_Demo4 {

	@Test(dataProvider = "getData", dataProviderClass = DataProviderClass.class)
	public void updateDetails(String username, String password) {

		System.out.println("UserName " + username + " | " + "Password " + password);
	}

	@Test(dataProvider = "getData", dataProviderClass = DataProviderClass.class)
	public void getDetails(String name, int age, String gender) {

		System.out.println("Name " + name + " | " + "Age " + age + " | " + "Gender " + gender);
	}
}
