package testng._revise.listener;

import org.testng.IExecutionListener;

public class ExecutionListener implements IExecutionListener {

    @Override
    public void onExecutionStart() {
        System.out.println("Before Test Execution Start");
    }

    @Override
    public void onExecutionFinish() {
        System.out.println("After Test Execution Finish");
    }

}
