package links;

import org.testng.annotations.Test;

import Repository.LoginRepository;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class linksSize 
{
	WebDriver wd;
	@Test
	public void login() throws IOException, InterruptedException 
	{
	

			//click onLogin with Phone no/email
			LoginRepository.lgpemail(wd).click();

			//click on email box
			LoginRepository.emailbox(wd).sendKeys("jadhavaboli123@gmail.com");
			
			//Click on continue button
			LoginRepository.contbtn(wd).click();
			
			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			//Click on password
			LoginRepository.pswd(wd).sendKeys("Aboli@#123");

			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			//click on login
			LoginRepository.login(wd).click();
			
			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			//to find out the list links and size
			List<WebElement> links=wd.findElements(By.tagName("a"));

			int size1=links.size();
			
			System.out.println("Number of links are:" +size1);
			
	
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
