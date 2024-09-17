package testng._revise;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class HandleMiscAttributesTest {

    @Test(priority = -1)
    public static void test1() {
        System.out.println("test1");
    }

    @Test(priority = 0)
    public static void test2() {
        System.out.println("test2");
    }

    @Test(enabled = false)
    public static void test3() {
        System.out.println("test3");
    }

    @Test
    public static void test4() {
        throw new SkipException("Skip Test4");
    }

    @Test(timeOut = 1000)
    public static void test5() {
        System.out.println("test5");
    }

    @Test(invocationCount = 3, threadPoolSize = 2)
    public static void test6() {
        System.out.println(Thread.currentThread().getName() +" - test6");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public static void test7() {
        System.out.println("test7");
        System.out.println(5/0);
    }


}
