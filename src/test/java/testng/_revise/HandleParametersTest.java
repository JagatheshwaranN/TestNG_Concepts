package testng._revise;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HandleParametersTest {

    @Test
    @Parameters({"name"})
    public static void greet(@Optional("John") String name) {
        System.out.println("Hi " + name + ", Have a nice day!");
    }

}
