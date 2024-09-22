package testng._revise.listener;

import org.testng.*;

public class HookableListener implements IHookable {

    @Override
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        if(iTestResult.getMethod().getMethodName().equals("test1")) {
            iHookCallBack.runTestMethod(iTestResult);
        } else {
            throw  new SkipException("Skip Test..");
        }
    }
}
