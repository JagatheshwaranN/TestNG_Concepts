package testng._revise;


import org.testng.annotations.Test;


public class HandleIMethodInterceptListenerTest {

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test Method1");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test Method2");
    }

}
