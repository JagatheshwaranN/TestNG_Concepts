package testng._revise;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testng._revise.listener.ExecutionListener;
import testng._revise.listener.HookableListener;

@Listeners(value = HookableListener.class)
public class HandleIHookableListenerTest {

    @Test
    public void test1() {
        System.out.println("Test Method1");
    }

    @Test
    public void test2() {
        System.out.println("Test Method2");
    }

}
