package account;

import org.testng.annotations.Test;

import Repository.LoginRepository;
import Repository.SignupRepository;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class SignUp
{
	WebDriver wd;
	@Test
	public void signup() 
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		SignupRepository.lgpemail(wd).click();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement lgGoogle= wd.findElement(By.cssSelector("div[data-cy=googleLogin]"));

		String winHandleBefore=wd.getWindowHandle();      //storing current window
		lgGoogle.click();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("click on google");
		for(String winHandle:wd.getWindowHandles())
		{
			wd.switchTo().window(winHandle);             ////switching to new window
		}
		System.out.println("switch");
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		SignupRepository.createacc(wd).click();
		System.out.println("click on create acc");
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		SignupRepository.firstN(wd).sendKeys("Aboli");
		SignupRepository.lastN(wd).sendKeys("Jadhav");
		SignupRepository.userN(wd).sendKeys("phateshiru123");
		SignupRepository.pass(wd).sendKeys("Aboli@#123");
		SignupRepository.confpass(wd).sendKeys("Aboli@#123");;
		
		SignupRepository.next(wd).click();
		
		SignupRepository.verifyPno(wd).sendKeys("8975884998");
	}
	@BeforeClass
	public void beforeClass() 
	{
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.makemytrip.com");


	}

	@AfterClass
	public void afterClass() 
	{


	}

}
