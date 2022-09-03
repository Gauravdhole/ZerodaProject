package FrontPageTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentsRepors {

	static ExtentsRepors extent;

	public static ExtentReports repors() {

		String path = System.getProperty("user.dir") + "\\ reports\\index.html";

		ExtentSparkReporter Sparks = new ExtentSparkReporter(path);

		Sparks.config().setReportName("web Automation reports");
		Sparks.config().setDocumentTitle("test result");

		ExtentReports extent = new ExtentReports();
		extent.attachReporter(Sparks);
		extent.setSystemInfo("Automation Tester", "Gaurav Dhole");

		return extent;
	}

}