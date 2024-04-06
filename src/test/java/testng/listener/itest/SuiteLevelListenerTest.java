package testng.listener.itest;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The SuiteLevelListenerTest class represents a set of test methods related to visiting a
 * shopping mall, and the @Listeners annotation associates a custom test listener
 * (ITestListenerImplement) with this class to capture and handle test events during execution
 * from the suite level using XML file.
 *
 * @author Jagatheshwaran N
 */
public class SuiteLevelListenerTest {

	// Test method to buy products
	@Test
	public void buyProduct() {
		System.out.println("Buy home appliances in the Home Depot store at Shopping Mall");
	}

	// Test method to go for a movie
	@Test
	public void goForMovie() {
		System.out.println("Go for movie streaming in the PVR at Shopping Mall");
	}

	// Test method to eat food
	@Test
	public void eatFood() {
		System.out.println("Eat food in the McDonald's at Shopping Mall");
	}

	// Test method to play games
	@Test
	public void playGame() {
		System.out.println("Play games in the Arena at Shopping Mall");
	}

	// Test method to take massage, depends on the success of parkVehicle
	@Test(dependsOnMethods = "parkVehicle")
	public void takeMassage() {
		System.out.println("Relax yourself by taking massage in the Spa at Shopping Mall");
	}

	// Test method to park vehicle, failing to demonstrate listener behavior
	@Test
	public void parkVehicle() {
		System.out.println("Park the vehicle in the parking space at Shopping Mall");
		Assert.fail("Failing this test case to demonstrate the behavior of Listener when test case fail");
	}

}
