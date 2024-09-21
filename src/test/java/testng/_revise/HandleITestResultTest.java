package testng._revise;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@SuppressWarnings("All")
public class HandleITestResultTest {

    @Test
    public void test1() {
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void test2() {
        Assert.assertTrue(false);
    }

    @Test(enabled = false)
    public void test3() {
        throw new SkipException("");
    }

    @AfterMethod
    public void verifyTestMethod(ITestResult result) {
        switch (result.getStatus()) {
            case 1:
                System.out.println("Test Passed");
                break;
            case 2:
                System.out.println("Test Failed");
                break;
            case 3:
                System.out.println("Test Skipped");
                break;
            default:
                System.out.println("Invalid Result Type");

        }
    }

}
