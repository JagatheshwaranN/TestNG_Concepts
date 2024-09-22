package testng._revise;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testng._revise.listener.ExecutionListener;

@Listeners(value = ExecutionListener.class)
public class HandleIExecutiontListenerTest {

    @Test
    public void test1() {
        System.out.println("Test Method1");
    }

    @Test
    public void test2() {
        System.out.println("Test Method2");
    }

}
