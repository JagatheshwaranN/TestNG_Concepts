package testng._revise;

import org.testng.annotations.*;

public class HandleAnnotationTest {

    @BeforeSuite
    public static void testBeforeSuite() {
        System.out.println("BeforeSuite");
    }

    @BeforeClass
    public static void testBeforeClass() {
        System.out.println("BeforeClass");
    }

    @BeforeTest
    public static void testBeforeTest() {
        System.out.println("BeforeTest");
    }

    @BeforeMethod
    public static void testBeforeMethod() {
        System.out.println("BeforeMethod");
    }

    @Test
    public static void testMethod1() {
        System.out.println("Test1");
    }

    @Test
    public static void testMethod2() {
        System.out.println("Test2");
    }

    @AfterMethod
    public static void testAfterMethod() {
        System.out.println("AfterMethod");
    }

    @AfterTest
    public static void testAfterTest() {
        System.out.println("AfterTest");
    }

    @AfterClass
    public static void testAfterClass() {
        System.out.println("AfterClass");
    }

    @AfterSuite
    public static void testAfterSuite() {
        System.out.println("AfterSuite");
    }

}
