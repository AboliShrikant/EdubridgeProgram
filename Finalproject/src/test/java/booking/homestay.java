package booking;

import org.testng.annotations.Test;

import Repository.menulinksRepository;
import Repository.HotelRepository;
import Repository.LoginRepository;
import Repository.homestayRepository;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class homestay 
{
	WebDriver wd;
	@Test
	public void homestay()
	{
		/*
		LoginRepository.lgpemail(wd).click();
		LoginRepository.emailbox(wd).sendKeys("jadhavaboli123@gmail.com");

		LoginRepository.contbtn(wd).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginRepository.pswd(wd).sendKeys("Aboli@#123");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginRepository.login(wd).click();*/
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homestayRepository.logologin(wd).click();
		homestayRepository.homestay(wd).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homestayRepository.city(wd).click();
		homestayRepository.citypt(wd).sendKeys("Delhi");;
		homestayRepository.citypt(wd).sendKeys(Keys.ARROW_DOWN);
		homestayRepository.citypt(wd).sendKeys(Keys.ENTER);

		homestayRepository.checkIn(wd).click();
		homestayRepository.dateIn(wd).click();
		homestayRepository.arrow(wd).click();
		homestayRepository.dateout(wd).click();
		homestayRepository.guest(wd).click();
		homestayRepository.adult(wd).click();
		homestayRepository.child(wd).click();
		homestayRepository.apply(wd).click();
		homestayRepository.travalfor(wd).click();
		homestayRepository.worktraval(wd).click();
		homestayRepository.search(wd).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
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
		wd.close();
	}

}
