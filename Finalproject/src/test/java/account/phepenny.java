package account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class phepenny 
{
	public static void main(String [] arg) throws InterruptedException
	{
		WebDriver wd;
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.penpenny.com/");

		//sign In
		wd.findElement(By.xpath("/html/body/app-root/div[2]/app-navbar/nav/div/div/ul/li[2]/a/button")).click();
		
		//Email
		wd.findElement(By.xpath("/html/body/app-root/div[2]/app-signin/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/form/input[1]")).sendKeys("aboli.jadhav@anuyat.com");
		
		//pass
		wd.findElement(By.xpath("/html/body/app-root/div[2]/app-signin/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/form/input[2]")).sendKeys("Phate@1234567");
	
		//sign In
		wd.findElement(By.xpath("/html/body/app-root/div[2]/app-signin/div/div/div/div/div[2]/div/div[1]/div/div/div[2]/form/div/button")).click();
		
		wd.close();
	}

}
