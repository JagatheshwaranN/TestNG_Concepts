package testng._revise.listener;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.Map;

public class ReportListener implements IReporter {

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        for (ISuite isuite : suites) {
            String suiteName = isuite.getName();
            Map<String, ISuiteResult> suiteResultMap = isuite.getResults();
            for (ISuiteResult result : suiteResultMap.values()) {
                ITestContext context = result.getTestContext();
                System.out.println("Passed Tests in  " + suiteName + " is " + context.getPassedTests().getAllResults().size());
                System.out.println("Failed Tests in  " + suiteName + " is " + context.getFailedTests().getAllResults().size());
                System.out.println("Skipped Tests in " + suiteName + " is " + context.getSkippedTests().getAllResults().size());
            }
        }
    }

}
