package testng.listener.imethodintercept;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * In TestNG, IMethodInterceptor is an interface that allows users to intercept and modify the
 * test methods that are about to be executed. It provides a way to dynamically change the test
 * method execution order or filter out certain test methods based on specific criteria.
 * <p>
 * Intercept(List<ITestNGMethod> methods, ITestContext context): TestNG invokes this method
 * to intercept the list of test methods (methods) that are about to be executed. It allows the
 * implementation to modify the list of methods based on specific criteria.
 * <p>
 * Methods: List of test methods to be executed.
 * Context: The context of the current test run.
 *
 * @author Jagatheshwaran N
 */
public class IMethodInterceptorListenerImplement implements IMethodInterceptor {
    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> list, ITestContext iTestContext) {
        List<IMethodInstance> result = new ArrayList<>();
        for(IMethodInstance methodInstance : list){
            Test testMethod = methodInstance.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
            if(testMethod.priority() == 1){
                result.add(methodInstance);
            }
        }
        return result;
    }
}
