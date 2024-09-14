package testng._revise;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class HandleTestClassLevelTest {

    @BeforeTest
    public static void beforeTest() {
        System.out.println("BeforeTest");
    }

    public static void test1() {
        System.out.println("Test1");
    }

    public static void test2() {
        System.out.println("Test2");
    }

    @AfterTest
    public static void afterTest() {
        System.out.println("AfterTest");
    }
}
