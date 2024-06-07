package account;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PenpennySign 
{
	WebDriver wd;
	@Test
	public void Sign()
	{
		//sign In
		wd.findElement(By.xpath("/html/body/app-root/div[2]/app-navbar/nav/div/div/ul/li[2]/a/button")).click();

		//Email
		wd.findElement(By.xpath("/html/body/app-root/div[2]/app-signin/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/form/input[1]")).sendKeys("aboli.jadhav@anuyat.com");

		//pass
		wd.findElement(By.xpath("/html/body/app-root/div[2]/app-signin/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/form/input[2]")).sendKeys("Phate@1234567");

		//sign In
		wd.findElement(By.xpath("/html/body/app-root/div[2]/app-signin/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/form/div/button")).click();
	}
	@BeforeTest
	public void beforeTest()
	{

		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.penpenny.com/");


	}

	@AfterTest
	public void afterTest() 
	{
		wd.close();
	}

}
