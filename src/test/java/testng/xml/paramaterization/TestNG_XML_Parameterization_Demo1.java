package testng.xml.paramaterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_XML_Parameterization_Demo1 {

	@Parameters({"user"})
	@Test
	public void sayHello(String user) {
		System.out.println("Hello! " + user + ", Have a good day!");
	}
}
