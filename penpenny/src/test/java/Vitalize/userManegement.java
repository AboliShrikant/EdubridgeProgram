package Vitalize;

import org.testng.annotations.Test;

import Repository.SignInRepository;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class userManegement {
	
	WebDriver wd;
	@Test
	public void user() throws InterruptedException 
	{

		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[1]/div/input")).sendKeys("jadhavaboli123@gmail.com");
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[2]/div/input")).sendKeys("Aboli@#123");
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[2]/div/div[2]")).click();
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[3]/button")).click();
		Thread.sleep(5000); 
		
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div")).click();
		Thread.sleep(5000);  

		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		//wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[15]/div/div[3]/button")).click();
		
	/*	WebDriverWait wait=new WebDriverWait(wd,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[17]/div/div[3]/button")));
		//wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[17]/div/div[3]/button")).click();
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[17]/div/div[3]/button")).click();
	*/
		SignInRepository.view(wd).click();

	}
	@BeforeTest
	public void beforeTest()
	{
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://qa-app.admin.vitalizecare.co/");

	}

	@AfterTest
	public void afterTest() 
	{

	}

}
