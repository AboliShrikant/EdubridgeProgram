package Vitalize;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DeleteOraganization extends BaseClass
{
	
	@Test
	public void Oragnization() throws InterruptedException 
	{
		 test = extent.createTest("DeleteOraganization");
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[1]/div/input")).sendKeys("jadhavaboli123@gmail.com");
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[2]/div/input")).sendKeys("Aboli@#123");
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[2]/div/div[2]")).click();
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div/div/form/div[3]/button")).click();
		Thread.sleep(5000);                  
		wd.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[1]/div/div[2]/div/div/div")).click();
		Thread.sleep(5000);  
		
		//Click on view account
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/div[3]/button")).click();
		Thread.sleep(3000);
		
		//click on edit profile
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div/div[1]/div[1]/button")).click();
		
		//For Scroll down the window
		JavascriptExecutor js=(JavascriptExecutor) wd;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000);
		
		/*//Click on cancel button
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div/button[1]")).click();
		Thread.sleep(3000);*/
		
	/*	//click on save account
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div/button[2]")).click();
		Thread.sleep(3000); */
		
		//click on delete account
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div/p")).click();
		//Click on confirmation message CANCEL
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div/div/button[1]")).click();
		//Click on confirmation message Delete
		//wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div/div/div/div[3]/div[2]/div/div/button[2]")).click();
        
		//Click on cancel button
		wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]/div/button[1]")).click();
		Thread.sleep(3000);
		wd.navigate().back();
		wd.navigate().back();

	}
	

}
