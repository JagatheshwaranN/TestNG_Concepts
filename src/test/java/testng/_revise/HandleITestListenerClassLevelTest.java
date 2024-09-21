package testng._revise;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testng._revise.listener.TestListener;

// To run the testcase in suitelevel, please comment the below @Listeners(TestListener.class) line
// and then execute it from TestNG.xml file.
@SuppressWarnings("All")
@Listeners(TestListener.class)
public class HandleITestListenerClassLevelTest {

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

}
