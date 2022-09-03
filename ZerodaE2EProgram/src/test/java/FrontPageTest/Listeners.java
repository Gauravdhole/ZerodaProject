package FrontPageTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseClases.BasedClassBrowsers;

public class Listeners extends BasedClassBrowsers implements ITestListener {
	ExtentTest test;
	ExtentReports extent = ExtentsRepors.repors();

	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test passed");
	}

	public void onFinish(ITestContext context) {

		extent.flush();
	}

	public void onTestFailure(ITestResult result) {

		test.fail(result.getThrowable());
		WebDriver driver = null;

		String testCaseName = result.getMethod().getMethodName();
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver")
					.get(result.getInstance());
		} catch (Exception e) {

		}

		try {
			GetScreenShrot(testCaseName, driver);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
