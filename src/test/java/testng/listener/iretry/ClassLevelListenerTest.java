package testng.listener.iretry;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The ClassLevelListenerTest class represents a set of test methods related to visiting a
 * shopping mall, and the @Listeners annotation associates a custom test listener
 * (IRetryAnalyzerListenerImplement) with this class to capture and handle test events during execution.
 *
 * @author Jagatheshwaran N
 */
public class ClassLevelListenerTest {

    // Test method to buy products
    @Test
    public void buyProduct() {
        Assert.fail("demo");
        System.out.println("Buy home appliances in the Home Depot store at Shopping Mall");
    }

    // Test method to go for a movie
    @Test
    public void goForMovie() {
        Assert.fail();
        System.out.println("Go for movie streaming in the PVR at Shopping Mall");
    }

}
