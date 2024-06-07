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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NavigateToAllFunct extends BaseClass
{


  @Test
  public void naviagtetoallfunctionality() throws InterruptedException 
  {
	  test = extent.createTest("naviagtetoallfunctionality");

	  wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[1]/div/input")).sendKeys("jadhavaboli123@gmail.com");
	  wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[2]/div/input")).sendKeys("Aboli@#123");
	  wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[2]/div/div[2]")).click();
	  wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[3]/button")).click();
	  Thread.sleep(5000);                  
	  wd.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div")).click();
	  Thread.sleep(5000);                  
	  wd.navigate().back();
	  Thread.sleep(5000);                  
	  wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div/div[3]/div/div/div")).click();
	  Thread.sleep(5000);                  
	  wd.navigate().back();
  }
  

}