package booking;

import org.testng.annotations.Test;

import Repository.LoginRepository;
import Repository.flightRepository;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class flightbook 
{
	private static final String List = null;
	WebDriver wd;
	@Test
	public void flight() throws IOException 
	{
		LoginRepository.lgpemail(wd).click();
		LoginRepository.emailbox(wd).sendKeys("jadhavaboli123@gmail.com");

		LoginRepository.contbtn(wd).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginRepository.pswd(wd).sendKeys("Aboli@#123");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		LoginRepository.login(wd).click();
		flightRepository.flight(wd).click();
		System.out.println("clicked on flight");
		
		flightRepository.oneway(wd).click();
		System.out.println("clicked on Oneway");
		
		File f=new File("projectdata/links.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wk=new XSSFWorkbook(fis);
		XSSFSheet sh=wk.getSheet("Sheet3");

		int Size=sh.getLastRowNum();
		for(int i=1; i<=Size; i++)
		{
			String fromNm=sh.getRow(i).getCell(0).toString();
			String ToNm=sh.getRow(i).getCell(1).toString();
			
			
			flightRepository.fromct(wd).click();
			System.out.println("clcik on fromct");
			
			WebElement frompt=wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
			frompt.sendKeys(fromNm);
			System.out.println("sendkeys fromNm");
			frompt.sendKeys(Keys.ARROW_DOWN);
			System.out.println("sendkeys arrowdown");

			frompt.sendKeys(Keys.ENTER);
			System.out.println("sendkeys enter");
			wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			WebElement topt=wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
			System.out.println("click on topt");
			
			topt.sendKeys(ToNm);
			System.out.println("sendkerys toNm");
			
			topt.sendKeys(Keys.ARROW_DOWN);
			System.out.println("sendkerys arrowdown");
			
			
			flightRepository.departure(wd).click();
			flightRepository.datedept(wd).click();
			
		}
		

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
