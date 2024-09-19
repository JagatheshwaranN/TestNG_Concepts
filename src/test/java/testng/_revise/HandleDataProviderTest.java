package testng._revise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@SuppressWarnings("All")
public class HandleDataProviderTest {

    @Test(dataProvider = "getDisplayData")
    public static void displayDetails(String name, int age) {
        System.out.println(Thread.currentThread().getName() + " - " + name + " " + age);
    }

    @DataProvider(parallel = true)
    public static Object[][] getDisplayData() {
        return new Object[][]{{"John", 25}, {"Alex", 30}};
    }

    @Test(dataProvider = "supplyData", dataProviderClass = DataSupplier.class)
    public static void display(String name, String designation) {
        System.out.println(name + " " + designation);
    }

    @Test(dataProvider = "supplyData", dataProviderClass = DataSupplier.class)
    public static void show(String name, int mobile) {
        System.out.println(name + " " + mobile);
    }

}
