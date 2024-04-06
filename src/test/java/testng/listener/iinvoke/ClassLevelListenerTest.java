package testng.listener.iinvoke;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The ClassLevelListenerTest class represents a set of test methods related to visiting a
 * shopping mall, and the @Listeners annotation associates a custom test listener
 * (IReportListenerImplement) with this class to capture and handle test events during execution.
 *
 * @author Jagatheshwaran N
 */
public class ClassLevelListenerTest {

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

}
