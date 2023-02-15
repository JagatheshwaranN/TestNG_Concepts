package testng.dataprovider;

import org.testng.annotations.Test;

public class _03_TestNG_DataProvider_Demo3 {

	@Test(dataProvider = "update", dataProviderClass = DataProviderClass.class)
	public void updateDetails(String username, String password) {

		System.out.println("UserName " + username + " | " + "Password " + password);
	}

	@Test(dataProvider = "get", dataProviderClass = DataProviderClass.class)
	public void getDetails(String name, int age) {

		System.out.println("Name " + name + " | " + "Age " + age);
	}
}
