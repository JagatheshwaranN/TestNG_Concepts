package testng.listener.iexecution;

import org.testng.IExecutionListener;

/**
 * This class serves as a basic example of implementing an execution listener in TestNG to capture and
 * handle events occurring before and after the execution of the entire test suite.
 * The purpose of this class is to define actions to be performed at the start and end of the test suite
 * execution.
 * It demonstrates how to use the IExecutionListener interface to create custom listeners for capturing
 * events related to the entire test suite execution.
 *
 * @author Jagatheshwaran N
 */
public class IExecutionListenerImplement implements IExecutionListener {


    @Override
    public void onExecutionStart() {
        System.out.println("IExecutionListener - Execution Start Method");
    }

    @Override
    public void onExecutionFinish() {
        System.out.println("IExecutionListener - Execution Finish Method");
    }
}
