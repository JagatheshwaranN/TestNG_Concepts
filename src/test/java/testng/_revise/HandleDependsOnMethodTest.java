package testng._revise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDependsOnMethodTest {

    @Test
    public static void test1() {
        System.out.println("Test1");
        Assert.fail();
    }

    @Test(dependsOnMethods = "test1", alwaysRun = true)
    public static void test2() {
        System.out.println("Test2");
    }

    @Test(dependsOnMethods = {"test1", "test2"})
    public static void test3() {
        System.out.println("Test3");
    }

    @Test
    public static void test4() {
        System.out.println("Test4");
    }

    @Test
    public static void test5() {
        System.out.println("Test5");
    }
}
