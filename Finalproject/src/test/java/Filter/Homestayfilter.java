package Filter;

import org.testng.annotations.Test;

import Repository.filterRepository;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Homestayfilter 
{
	WebDriver wd;

	@Test
	public void filter() throws InterruptedException 
	{
		filterRepository.logologin(wd).click();
		filterRepository.homestay(wd).click();

		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)wd;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000); 
		
		filterRepository.mumbai(wd).click();
		filterRepository.p1000(wd).click();
		js.executeScript("window.scrollBy(0,400)");


		filterRepository.localitySMum(wd).click();
		js.executeScript("window.scrollBy(0,1200)");

		filterRepository.nearTrsnHub(wd).click();
		js.executeScript("window.scrollBy(0,1200)");

		filterRepository.userRating(wd).click();
		js.executeScript("window.scrollBy(0,1200)");

		

	}
	@BeforeTest
	public void beforeTest() 
	{
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.makemytrip.com/");
	}

	@AfterTest
	public void afterTest() 
	{
		//wd.close();
	}

}
