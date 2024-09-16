package testng._revise;

import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("All")
public class HandleDependsOnGroupsTestNGTest {

    @Test(groups = "smoke")
    public static void test1() {
        System.out.println("test1");
        //Assert.fail();
    }

    @Test(groups = {"sanity"})
    public static void test2() {
        System.out.println("test2");
    }

    @Test(dependsOnGroups = {"sanity"})
    public static void test3() {
        System.out.println("test3");
    }

    @Test(dependsOnGroups = {"smoke", "sanity"})
    public static void test4() {
        System.out.println("test4");
    }

    @Test
    public static void test5() {
        System.out.println("test5");
    }
}
