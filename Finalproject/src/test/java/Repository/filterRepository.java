package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class filterRepository 
{
	public static WebElement logologin(WebDriver wd)
	{
		WebElement logologin=wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[3]"));
		return logologin;
	}
	public static WebElement homestay(WebDriver wd)
	{
		//forHomeStay
		WebElement homestay=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]"));
		return homestay;
	}
	public static WebElement delhi(WebDriver wd)
	{
		WebElement delhi=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[4]/div[1]/div[3]/div[1]/p[2]/p[1]/a[1]"));
		return delhi;
	}
	public static WebElement mumbai(WebDriver wd)
	{
		//WebElement mumbai=wd.findElement(By.cssSelector("p[data-cy='newsLetterText0']"));
    	WebElement mumbai=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/main[1]/div[4]/div[1]/div[2]/div[1]/p[2]/p[1]/a[1]"));
		return mumbai;
	}

	public static WebElement p1000(WebDriver wd)
	{
		WebElement p1000=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[1]/label[1]"));
		return p1000;
	}
	public static WebElement localitySMum (WebDriver wd)
	{
		//WebElement localitySMum =wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/ul[1]/li[1]/span[1]/label[1]/p[1]/span[1]"));
		
		WebElement localitySMum =wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div[1]/div/div[4]/div/div[1]/ul/li[1]/span/label"));
		return localitySMum ;                             
	}
	public static WebElement nearTrsnHub(WebDriver wd)
	{
		WebElement nearTrsnHub =wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div[1]/div/div[4]/div/div[3]/ul/li[1]/span/label"));
		return nearTrsnHub ;
	}
	public static WebElement userRating (WebDriver wd)
	{
		WebElement userRating=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/span[1]/label[1]"));
		return userRating;
	}
/*	public static WebElement  (WebDriver wd)
	{
		WebElement =wd.findElement();
		return ;
	}*/
}
