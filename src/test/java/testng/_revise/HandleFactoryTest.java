package testng._revise;

import org.testng.annotations.Factory;

public class HandleFactoryTest {

    @Factory
    public Object[] createTestInstance() {
        Object[] result = new Object[3];
        for(int i = 0; i < 3; i++) {
            result[i] = new FactoryDemoTest(i);
        }
        return result;
    }

}
