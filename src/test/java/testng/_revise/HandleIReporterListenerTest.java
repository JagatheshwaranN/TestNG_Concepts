package testng._revise;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class HandleIReporterListenerTest {

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test Method1");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test Method2");
        Assert.fail();
    }

    @Test(priority = 3)
    public void test3() {
        throw  new SkipException("");
    }

    @Test(priority = 4)
    public void test4() {
        System.out.println("Test Method4");
    }

}
