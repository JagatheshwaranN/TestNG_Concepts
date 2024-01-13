package testng.features;

import org.testng.annotations.Test;

/**
 * "Groups" - TestNG allows you to perform sophisticated groupings of test
 * methods. Not only can you declare that methods belong to groups, but you can
 * also specify groups that contain other groups.
 * <p>
 * Groups are specified in your testng.xml file and can be found either under
 * the <test> or <suite> tag. Groups specified in the <suite> tag apply to all
 * the <test> tags underneath. Note that groups are accumulative in these tags:
 * if you specify group "a" in <suite> and "b" in <test>, then both "a" and "b"
 * will be included.
 * <p>
 * The provided code is a TestNG test class named GroupsTest that showcases the
 * usage of groups to categorize and selectively execute tests based on specific
 * functionalities.
 * <p>
 * This test class demonstrates the grouping of tests into different categories
 * ("functional" and "regression") using the groups attribute in the @Test annotations.
 * The grouping allows for selective test execution based on specific functionalities,
 * providing flexibility in organizing and running tests according to different criteria.
 * 
 * @author Jagatheshwaran N
 */

public class GroupsTest {

	// Test method for buying a product in the "functional" group
	@Test(groups = "functional")
	public void buyProduct() {
		// Print a message indicating the action being performed
		System.out.println("Buy home appliances in the Home Depot store at Shopping Mall");
	}

	// Test method for going for a movie in the "functional" group
	@Test(groups = "functional")
	public void goForMovie() {
		// Print a message indicating the action being performed
		System.out.println("Go for movie streaming in the PVR at Shopping Mall");
	}

	// Test method for eating food in the "regression" group
	@Test(groups = "regression")
	public void eatFood() {
		// Print a message indicating the action being performed
		System.out.println("Eat food in the McDonald's at Shopping Mall");
	}

	// Test method for playing a game in both "functional" and "regression" groups
	@Test(groups = { "functional", "regression" })
	public void playGame() {
		// Print a message indicating the action being performed
		System.out.println("Play games in the Arena at Shopping Mall");
	}

	// Test method for taking a massage in the "functional" group
	@Test(groups = "functional")
	public void takeMassage() {
		// Print a message indicating the action being performed
		System.out.println("Relax yourself by taking massage in the Spa at Shopping Mall");
	}

	// Test method for parking a vehicle in both "functional" and "regression" groups
	@Test(groups = { "functional", "regression" })
	public void parkVehicle() {
		// Print a message indicating the action being performed
		System.out.println("Park the vehicle in the parking space at Shopping Mall");
	}

}
