package testng._revise.listener;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MethodInterceptListener implements IMethodInterceptor {

    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> list, ITestContext iTestContext) {
        List<IMethodInstance> result = new ArrayList<>();
        for(IMethodInstance instance : list) {
            Test method = instance.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
            if(method.priority() == 1){
                result.add(instance);
            }
        }
        return result;
    }
}
