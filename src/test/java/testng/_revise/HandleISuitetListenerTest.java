package testng._revise;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HandleISuitetListenerTest {

    @BeforeSuite
    public void start() {
        System.out.println("Demo Suite Started");
    }

    @Test
    public void test() {
        Assert.assertTrue(true);
        System.out.println("Suite - Test Method");
    }

    @AfterSuite
    public void stop() {
        System.out.println("Demo Suite Ended");
    }
}
