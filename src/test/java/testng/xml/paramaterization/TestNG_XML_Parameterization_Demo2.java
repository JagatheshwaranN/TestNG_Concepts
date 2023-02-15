package testng.xml.paramaterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_XML_Parameterization_Demo2 {

	@Parameters({ "user", "number" })
	@Test
	public void sayHello(String user, int number) {
		System.out.println("Hello! " + user + ", Have a good day! and your lucky number for today is " + number);
	}
}
