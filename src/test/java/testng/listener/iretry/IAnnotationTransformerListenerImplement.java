package testng.listener.iretry;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * The IAnnotationTransformer listener, as its name suggests, transforms the annotation provided inside
 * the test case code. These annotations transform through the "transform" method available in the listener.
 * This method will detect the annotation and then transform it according to the code written inside the
 * method. The transform method contains the following parameters:
 * <p>
 * 1. annotation: This is the annotation that was read from your test class.
 * 2. testClass: If the annotation was found in a class, this parameter would then represent the class
 * (otherwise null).
 * 3. testMethod: If the annotation was found on the method, this parameter would then represent the method
 * ( otherwise null).
 * 4. testConstructor: If the annotation were found on a constructor, this parameter would then represent
 * that constructor (otherwise null).
 *
 * @author Jagatheshwaran N
 */
public class IAnnotationTransformerListenerImplement implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(IRetryAnalyzerListenerImplement.class);
    }
}
