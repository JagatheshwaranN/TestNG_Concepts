package testng._revise.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        System.out.println("Start of the Suite : " +suite.getName());
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("End of the Suite : " +suite.getName());
    }
}
