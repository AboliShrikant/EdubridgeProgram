package links;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import Repository.LoginRepository;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageLinks
{
	WebDriver wd;
	@Test
	public void login() throws IOException, InterruptedException 
	{
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//click onLogin with Phone no/email
		LoginRepository.lgpemail(wd).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//click on email box
		//LoginRepository.emailbox(wd).sendKeys(em);
		LoginRepository.emailbox(wd).sendKeys("jadhavaboli123@gmail.com");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Click on continue button
		LoginRepository.contbtn(wd).click();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Click on password
		//LoginRepository.pswd(wd).sendKeys(p);
		LoginRepository.pswd(wd).sendKeys("Aboli@#123");
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//click on login
		LoginRepository.login(wd).click();

		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//to find out the list links and size
		List<WebElement> links=wd.findElements(By.tagName("a"));
		int size1=links.size();

	/*	File f=new File("projectdata/Links.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wk=new XSSFWorkbook(fis);
		XSSFSheet sh=wk.getSheet("Sheet1");
		FileOutputStream fos = new FileOutputStream(f);*/

		System.out.println("Number of links are:" +size1);
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		for(int i=0; i<size1; i++)
		{
			
			System.out.println(links.get(i).getText());
		}

			/*try
			{
	
				String s=links.get(i).getText();
				//System.out.println(links.get(i).getText());
				//System.out.println("Link index:" +i+ ": " + s);
				sh.createRow(i).createCell(0).setCellValue(s);

			}
			catch(Exception e)
			{
		
				System.out.println("Link not found");
			}
		}	

		wk.write(fos);
		fos.close();*/


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
