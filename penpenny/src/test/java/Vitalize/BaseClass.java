package Vitalize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	
	public ChromeDriver wd;
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	@BeforeTest
	public void setExtentreport() 
	{
		  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/myReport.html");
		  htmlReporter.config().setDocumentTitle("Automation Report"); 
		  htmlReporter.config().setReportName("Functional Testing"); 
		  htmlReporter.config().setTheme(Theme.DARK);
		  extent = new ExtentReports();
		  extent.attachReporter(htmlReporter);
		  
		  extent.setSystemInfo("Host name", "localhost");
		  extent.setSystemInfo("Environemnt", "QA");
		  extent.setSystemInfo("user", "Aboli");
		  

	}
	@BeforeMethod
	public void setup() 
	{
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://qa-app.admin.vitalizecare.co/");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		 if (result.getStatus() == ITestResult.FAILURE) 
		 {
			 test.log(Status.FAIL,"TEST CASE FAILED IS  "+result.getName()); 
			 test.log(Status.FAIL, "TEST CASE FAILED IS  "+result.getThrowable());  
		 }
		 else if(result.getStatus() == ITestResult.SKIP)
		 {
			 test.log(Status.SKIP, "TEST CASE SKIPPED Is  " +result.getName());
		 }
		 else if(result.getStatus() == ITestResult.SUCCESS)
		 {
			 test.log(Status.PASS, "TEST CASE PASSED IS" +result.getName());
		 }

		 wd.quit();
	}

	@AfterTest
	public void endExtentreport() 
	{
	
		extent.flush();

	}


	

}
