package LoginModule;

import org.testng.annotations.Test;

import Repository.LoginRepository;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class login 
{
	WebDriver wd;
	@Test
	public void log() throws IOException
	{
		File f=new File("projectdata/login.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wk=new XSSFWorkbook(fis);
		XSSFSheet sh= wk.getSheet("Sheet1");
		int size=sh.getLastRowNum();
		for(int i=0; i<=size; i++)
		{ 
			String em=sh.getRow(i).getCell(0).toString();
			String p=sh.getRow(i).getCell(1).toString();
			System.out.println(em  + "   |   " +p );

			//click on login
			LoginRepository.lgpemail(wd).click();

			//click on email box
			LoginRepository.emailbox(wd).sendKeys(em);

			//click on continue button
			LoginRepository.contbtn(wd).click();

			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			//Click on password			
			LoginRepository.pswd(wd).sendKeys(p);

			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			//click on login
			LoginRepository.login(wd).click();

				
		}

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
