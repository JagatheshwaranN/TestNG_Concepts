package testng.function;

import org.testng.annotations.Test;

public class _Test_Groups_Demo2 {

	@Test(groups = "functional")
	public void startTrip() {
		System.out.println("Vacation trip started");
	}

	@Test(groups = "functional")
	public void reachDestination() {
		System.out.println("Reached destination safely");
	}

	@Test(groups = "regression")
	public void haveFood() {
		System.out.println("Eat food in the hotel");
	}

	@Test(groups = { "functional", "regression" })
	public void siteSee() {
		System.out.println("Rome around the places in the destination city");
	}
}
