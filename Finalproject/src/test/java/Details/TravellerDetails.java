package Details;

import org.testng.annotations.Test;

import Repository.TravllerDetailsRepository;
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

public class TravellerDetails 
{
	WebDriver wd;
	@Test
	public void f() throws InterruptedException
	{
		login1Repository.lgpemail(wd).click();

		//type in email box
		login1Repository.emailbox(wd).sendKeys("jadhavaboli123@gmail.com");

		//click on continue button
		login1Repository.contbtn(wd).click();

		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//type in password

		login1Repository.pswd(wd).sendKeys("Aboli@#123");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//click on login
		login1Repository.login(wd).click();
		Actions action=new Actions(wd);
		WebElement a=login1Repository.hiAboli(wd);
		action.moveToElement(a).build().perform();
		System.out.println("Clicked on Hi Aboli");

		//click on profile
		login1Repository.profile(wd).click();

		System.out.println("Clicked on My Profile");
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//	TravllerDetailsRepository.Savetravller(wd).click();
		JavascriptExecutor js=(JavascriptExecutor)wd;
		js.executeScript("window.scrollBy(0,800)");

		TravllerDetailsRepository.AddTravellerDetail(wd).click();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		TravllerDetailsRepository.TravellerName(wd).sendKeys("Aboli Bharat Jadhav");
		TravllerDetailsRepository.TravellerGender(wd).click();
		TravllerDetailsRepository.female(wd).click();

		TravllerDetailsRepository.TravellerEmail(wd).sendKeys("jadhavaboli123@gmail.com");
		TravllerDetailsRepository.TravellerPhone(wd).sendKeys("8975884998");
		//JavascriptExecutor js1 =(JavascriptExecutor)wd;
		//js1.executeScript("window.scrollBy(0,50)");
		
		TravllerDetailsRepository.BasicInfo(wd).click();
		
		TravllerDetailsRepository.TravellerBirthday(wd).click();
		Select BirthdayYear=new Select(wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/select[1]")));
		BirthdayYear.selectByValue("1999");
		TravllerDetailsRepository.Nextmonth(wd).click();
		//Select BirthdayMonth=new Select(wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/select[2]")));
		//Select BirthdayMonth=new Select(TravllerDetailsRepository.Birthdaymonth(wd));
		//BirthdayYear.selectByVisibleText("April");
		TravllerDetailsRepository.BirthdayDay(wd).click();
		TravllerDetailsRepository.Save(wd).click();



	}
	@BeforeTest
	public void beforeTest() 
	{
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.makemytrip.com");
	}

	@AfterTest
	public void afterTest() 
	{
		//wd.close();
	}

}
