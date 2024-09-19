package testng._revise;

import org.testng.annotations.Test;

public class HandleParallelTest {

    @Test
    public void test1() {
        System.out.println(Thread.currentThread().getName() + " - Test1");
    }

    @Test
    public void test2() {
        System.out.println(Thread.currentThread().getName() + " - Test2");
    }

    @Test
    public void test3() {
        System.out.println(Thread.currentThread().getName() + " - Test3");
    }
}
