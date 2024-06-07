package links;

import org.testng.annotations.Test;

import Repository.menulinksRepository;
import Repository.LoginRepository;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MenuLinks
{
	WebDriver wd;
	@Test
	public void Button() throws IOException 
	{

		File f=new File("projectdata/login.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wk=new XSSFWorkbook(fis);
		XSSFSheet sh= wk.getSheet("Sheet2");
		int size=sh.getLastRowNum();
		for(int i=1; i<=size; i++)
		{
			String em=sh.getRow(1).getCell(0).toString();
			String p=sh.getRow(1).getCell(1).toString();
			System.out.println(em  +"    |    " +p);
			
			LoginRepository.lgpemail(wd).click();

			LoginRepository.emailbox(wd).sendKeys(em);
			System.out.println(LoginRepository.emailbox(wd).getText());
			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			LoginRepository.contbtn(wd).click();
			System.out.println(LoginRepository.contbtn(wd).getText());
			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


			LoginRepository.pswd(wd).sendKeys(p);
			System.out.println(LoginRepository.pswd(wd).getSize());
			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			LoginRepository.login(wd).click();
			wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			
			menulinksRepository.flight(wd).click();
			System.out.println(menulinksRepository.flight(wd).getText());

			
			
			menulinksRepository.hotels(wd).click();
			System.out.println(menulinksRepository.hotels(wd).getText());

			
			
			menulinksRepository.homestay(wd).click();
			System.out.println(menulinksRepository.homestay(wd).getText());
			System.out.println(menulinksRepository.homestay(wd).getTagName());

			
			menulinksRepository.hodiday(wd).click();
			System.out.println(menulinksRepository.hodiday(wd).getText());
			System.out.println(menulinksRepository.hodiday(wd).getTagName());
			
			
			menulinksRepository.trains(wd).click();
			System.out.println(menulinksRepository.trains(wd).getText());
			System.out.println(menulinksRepository.trains(wd).getLocation());

			
			menulinksRepository.buses(wd).click();
			System.out.println(menulinksRepository.buses(wd).getText());
			System.out.println(menulinksRepository.buses(wd).getLocation());

			
			menulinksRepository.cab(wd).click();
			System.out.println(menulinksRepository.cab(wd).getText());
			System.out.println(menulinksRepository.cab(wd).getSize());

			menulinksRepository.visa(wd).click();
			System.out.println(menulinksRepository.visa(wd).getText());
			System.out.println(menulinksRepository.visa(wd).getSize());

			menulinksRepository.Charter(wd).click();
			System.out.println(menulinksRepository.Charter(wd).getText());
			System.out.println(menulinksRepository.Charter(wd).getRect());

			menulinksRepository.activity(wd).click();
			System.out.println(menulinksRepository.activity(wd).getText());
			System.out.println("Succesfully run");

			
		}


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
			wd.close();
		}

	}
