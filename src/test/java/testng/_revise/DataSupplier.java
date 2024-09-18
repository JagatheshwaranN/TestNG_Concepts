package testng._revise;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataSupplier {

    @DataProvider(name="supplyData")
    public static Object[][] supplyData(Method method) {
        Object[][] dataSet = null;
        String methodName = method.getName();
        if(methodName.contentEquals("display")) {
            dataSet = new Object[][] {{"John", "Dev"}, {"Alex", "QA"}};
        } else if(methodName.contentEquals("show")) {
            dataSet = new Object[][] {{"John", 123456789}, {"Alex", 123456789}};
        }
        return dataSet;
    }

}
