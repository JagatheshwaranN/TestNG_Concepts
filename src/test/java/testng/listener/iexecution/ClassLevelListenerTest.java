package testng.listener.iexecution;

import org.testng.IExecutionListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testng.listener.ihook.IHookableListenerImplement;

/**
 * The ClassLevelListenerTest class represents a set of test methods related to visiting a
 * shopping mall, and the @Listeners annotation associates a custom test listener
 * (IExecutionListenerImplement) with this class to capture and handle test events during execution.
 *
 * @author Jagatheshwaran N
 */
@Listeners(value = IExecutionListenerImplement.class)
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
