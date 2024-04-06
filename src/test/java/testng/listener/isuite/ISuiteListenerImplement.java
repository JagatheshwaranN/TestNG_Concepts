package testng.listener.isuite;

import org.testng.*;

/**
 * ISuiteListener is an interface in TestNG that allows users to define custom behavior for
 * suite-level events. It provides methods to listen to events related to test suite execution.
 * TestNG invokes these methods at various stages of the test suite lifecycle, allowing users
 * to perform custom actions or behaviors accordingly.
 *
 * @author Jagatheshwaran N
 */
public class ISuiteListenerImplement implements ISuiteListener {


    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite Level Start Function of Suite : " + suite.getName());
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Suite Level Finish Function of Suite : " + suite.getName());
    }

}
