package testng._revise;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HandleIInvokedMethodListenerTest {

    @Test
    public void test() {
        Assert.assertTrue(true);
        System.out.println("Test Method");
    }

}
