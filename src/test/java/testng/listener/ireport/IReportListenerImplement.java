package testng.listener.ireport;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Map;

/**
 * IReporter is an interface in TestNG that allows users to implement custom reporters to generate
 * test reports.
 * TestNG invokes the generateReport method of the implemented IReporter during the test execution
 * process.
 * Users can implement this interface to generate custom test reports in various formats (e.g.,
 * HTML, XML, JSON) based on their specific reporting requirements.
 * Users can implement this interface to customize the reporting behavior for TestNG.
 * IReporterListener provides additional hooks compared to ITestListener, enabling more fine-grained
 * control over the reporting process.
 *
 * @author Jagatheshwaran N
 */
public class IReportListenerImplement implements IReporter {

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {

        for(ISuite suite: suites){
            String suiteName = suite.getName();
            Map<String, ISuiteResult> suiteResultMap = suite.getResults();
            for(ISuiteResult suiteResult : suiteResultMap.values()){
                ITestContext testContext = suiteResult.getTestContext();
                System.out.println("Passed Tests From Suite : "+suiteName +" is "+testContext.getPassedTests().getAllResults().size());
                System.out.println("Failed Tests From Suite : "+suiteName +" is "+testContext.getFailedTests().getAllResults().size());
                System.out.println("Skipped Tests From Suite : "+suiteName +" is "+testContext.getSkippedTests().getAllResults().size());
            }

        }
    }

}
