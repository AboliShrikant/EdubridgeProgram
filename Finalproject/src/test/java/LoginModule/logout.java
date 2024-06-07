package LoginModule;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Repository.login1Repository;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logout 
{
	WebDriver wd;
	@Test
	public void log() throws IOException
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
			try
			{
				Actions action=new Actions(wd);
				WebElement a=login1Repository.hiAboli(wd);
				action.moveToElement(a).build().perform();
				System.out.println("Clicked on Hi Aboli");
				
				//click on profile
				login1Repository.profile(wd).click();
				
				System.out.println("Clicked on My Profile");
				
				Thread.sleep(5000);
				

				//Click on logout	
				login1Repository.logout(wd).click();
				System.out.println("Clicked on logout");
				Thread.sleep(5000);
			}
			catch(Exception e)
			{
				System.out.println("Invalid username/password");
				System.out.println(e);
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
