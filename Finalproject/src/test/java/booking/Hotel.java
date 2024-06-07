package booking;

import org.testng.annotations.Test;

import Repository.menulinksRepository;
import Repository.HotelRepository;
import Repository.LoginRepository;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Hotel 
{
	WebDriver wd;
	@Test
	public void Hotel() throws InterruptedException
	{
		/*LoginRepository.lgpemail(wd).click();
		LoginRepository.emailbox(wd).sendKeys("jadhavaboli123@gmail.com");

		LoginRepository.contbtn(wd).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginRepository.pswd(wd).sendKeys("Aboli@#123");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginRepository.login(wd).click();*/
		HotelRepository.logologin(wd).click();
		HotelRepository.hotels(wd).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		HotelRepository.city(wd).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		HotelRepository.citypt(wd).sendKeys("Pune, Maharashtra, India");
		HotelRepository.citypt(wd).sendKeys(Keys.ARROW_DOWN);
		HotelRepository.citypt(wd).sendKeys(Keys.ENTER);
		HotelRepository.checkIn(wd).click();
		HotelRepository.dateIn(wd).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		HotelRepository.arrow(wd).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//HotelRepository.checkout(wd).click();
		HotelRepository.dateout(wd).click();
		HotelRepository.guest(wd).click();
		HotelRepository.adult(wd).click();
		HotelRepository.child(wd).click();
		Select age=new Select(wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[3]/li/label/select")));
		age.selectByIndex(3);
		JavascriptExecutor js=(JavascriptExecutor)wd;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		HotelRepository.apply(wd).click();
		js.executeScript("window.scrollBy(0,-300)");
		Thread.sleep(2000);

		HotelRepository.travalFor(wd).click();
		//js.executeScript("window.scrollBy(0,-50)");

		HotelRepository.leisure(wd).click();

		HotelRepository.search(wd).click();

		

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
		// wd.close();
	}

}
