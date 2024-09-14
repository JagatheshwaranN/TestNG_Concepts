package testng._revise;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@SuppressWarnings("All")
public class HandleGroupAnnotationTest {

    @BeforeGroups(groups = {"funct"})
    public static void test1() {
        System.out.println("Before");
    }

    @Test(groups = {"funct"})
    public static void test2() {
        System.out.println("Functional");
    }

    @Test(groups = {"funct", "regr"})
    public static void test3() {
        System.out.println("Functional and Regression");
    }

    @Test(groups = {"regr"})
    public static void test4() {
        System.out.println("Regression");
    }

    @AfterGroups(groups = "funct")
    public static void test5() {
        System.out.println("After");
    }
}
