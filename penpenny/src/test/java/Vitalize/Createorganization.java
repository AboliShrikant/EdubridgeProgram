package Vitalize;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Createorganization extends BaseClass
{
	@Test
	public void Createorganization() throws InterruptedException
	{
		test= extent.createTest("Createorganization");

		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[1]/div/input")).sendKeys("jadhavaboli123@gmail.com");
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[2]/div/input")).sendKeys("Aboli@#123");
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[2]/div/div[2]")).click();
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[3]/button")).click();
		Thread.sleep(5000);  
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div")).click();
		Thread.sleep(5000);  

		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[1]/button")).click();


		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[5]/div/textarea")).sendKeys("testing demo");

		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("LifeLine Hospital");

		Select country=new Select(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div/select")));
		country.selectByVisibleText("Indonesia");

		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[3]/div/div/input")).sendKeys("http://www.lifeline.com");


		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("window.scrollBy(0,550)");

		Select timezone=new Select(wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div[4]/div/select")));
		timezone.selectByVisibleText("Asia/Kabul");

	//	wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[3]/button")).click();
		wd.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div/div/div/div[3]/button")).click();

	}
}