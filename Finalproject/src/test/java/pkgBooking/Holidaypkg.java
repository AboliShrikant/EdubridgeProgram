package pkgBooking;

import org.testng.annotations.Test;

import Repository.HolidayRepository;
import Repository.login1Repository;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Holidaypkg 
{
	WebDriver wd;
	@Test
	public void Holiday() throws InterruptedException 
	{
		HolidayRepository.logologin(wd).click();
		HolidayRepository.hodiday(wd).click();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HolidayRepository.destination(wd).click();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//HolidayRepository.Andaman(wd).click();
		WebElement Andaman=wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/ul[2]/li[3]/a"));
		String winHandleBefore=wd.getWindowHandle();
		Andaman.click();
		System.out.println("click on Andaman");

		for(String winHandle:wd.getWindowHandles())
		{
			wd.switchTo().window(winHandle);
		}
		System.out.println("window1 switched to window2");
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		HolidayRepository.Skip(wd).click();
		System.out.println("clicked on Skip");

		HolidayRepository.forbtn(wd).click();
		HolidayRepository.couple(wd).click();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		HolidayRepository.stars4(wd).click();
		JavascriptExecutor js=(JavascriptExecutor)wd;
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);

		HolidayRepository.couplepkg1(wd).click();

		System.out.println("click on pkg");
		for(String winHandle1:wd.getWindowHandles())
		{
			wd.switchTo().window(winHandle1);
		}
		System.out.println("window2 switched to window3");
		HolidayRepository.Skip2(wd).click();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		HolidayRepository.proceedtoBook(wd).click();

		
		/*if(HolidayRepository.Adult1(wd).isDisplayed())    
		{*/
			HolidayRepository.Adult1(wd).click();
			System.out.println("click on adult");

			HolidayRepository.Adult1(wd).sendKeys(Keys.ARROW_DOWN);

			System.out.println("arrow down");
			HolidayRepository.Adult1(wd).sendKeys(Keys.ENTER);
			System.out.println("ENTER");
			//HolidayRepository.Adult1(wd).sendKeys(Keys.TAB);
		//	System.out.println("click on Tab");

		/*}
		else 
		{
			HolidayRepository.AddTravller(wd).click();
			System.out.println("click on addtravller");
			HolidayRepository.FirstName(wd).sendKeys("Aboli");
			HolidayRepository.lastName(wd).sendKeys("Jadhav");

			Select DObDay=new Select(wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[1]/div/div/div/div[1]")));
			DObDay.selectByIndex(1);
			Select DobMonth=new Select(wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[2]/div/div/div/div[1]")));
			DobMonth.selectByIndex(3);
			Select DobYear=new Select(wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[3]/div/div/div/div[1]")));
			DobYear.selectByVisibleText("1999");
			Select Gender=new Select(wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div[1]")));
			Gender.selectByVisibleText("FEMALE");

			/*HolidayRepository.DOBDay(wd).click();
			HolidayRepository.DOBDay(wd).sendKeys("1");
			HolidayRepository.DOBDay(wd).sendKeys(Keys.ENTER);
			HolidayRepository.DOBMonth(wd).sendKeys("Apr");
			HolidayRepository.DOBMonth(wd).sendKeys(Keys.ENTER);
			HolidayRepository.DOBYear(wd).sendKeys("1999");
			HolidayRepository.DOBYear(wd).sendKeys(Keys.ENTER);
			HolidayRepository.Gender(wd).sendKeys("FEMALE");
			HolidayRepository.Gender(wd).sendKeys(Keys.ENTER);*/


		/*	HolidayRepository.AddTravllercompt(wd).click();




		}
	*/


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
