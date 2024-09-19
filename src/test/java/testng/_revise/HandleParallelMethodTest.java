package testng._revise;

import org.testng.annotations.Test;

public class HandleParallelMethodTest {

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
