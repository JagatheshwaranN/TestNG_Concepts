package testng.features;

import org.testng.annotations.Test;

public class _Test_Groups_Demo1 {

	@Test(groups = "functional")
	public void buyProduct() {
		System.out.println("Buy home appliances in the Home Depo store at Shopping Mall");
	}

	@Test(groups = "functional")
	public void goForMovie() {
		System.out.println("Go for movie streaming in the PVR at Shopping Mall");
	}

	@Test(groups = "regression")
	public void eatFood() {
		System.out.println("Eat food in the McDonalds at Shopping Mall");
	}

	@Test(groups = { "functional", "regression" })
	public void playGame() {
		System.out.println("Play games in the Arena at Shopping Mall");
	}

	@Test(groups = "functional")
	public void takeMassage() {
		System.out.println("Relax yourself by taking massage in the Spa at Shopping Mall");
	}

	@Test(groups = { "functional", "regression" })
	public void parkVehicle() {
		System.out.println("Park the vehicle in the parking space at Shopping Mall");
	}

}
