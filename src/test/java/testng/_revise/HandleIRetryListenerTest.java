package testng._revise;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import testng._revise.listener.RetryListener;


public class HandleIRetryListenerTest {

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test Method1");
    }

    @Test(priority = 2, retryAnalyzer = RetryListener.class)
    public void test2() {
        System.out.println("Test Method2");
        Assert.fail();
    }

}
