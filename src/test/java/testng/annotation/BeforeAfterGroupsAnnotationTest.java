package testng.annotation;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAfterGroupsAnnotationTest {

    // Setup method executed before any test method in the "functional" group for entering inside the mall
    @BeforeGroups(groups = {"functional"})
    public void enterMall() {
        // Print a message indicating entering inside the mall
        System.out.println("Get into the Shopping Mall");
    }

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
    @Test(groups = {"functional", "regression"})
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

    // Tear down method executed after all test methods in the "functional" group for leaving the Shopping Mall
    @AfterGroups(groups = {"functional"})
    public void exitMall() {
        // Print a message indicating the action being performed
        System.out.println("Leave the Shopping Mall");
    }

}
