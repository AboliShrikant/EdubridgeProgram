package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homestayRepository 
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
	public static WebElement city (WebDriver wd)
	{
		WebElement city=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/div[1]/label/input"));
		return city;
	}
	public static WebElement citypt (WebDriver wd)
	{
		WebElement citypt=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div/div/div/input"));
		return citypt;
	}
	public static WebElement checkIn(WebDriver wd)
	{
		WebElement checkIn=wd.findElement(By.id("checkin"));
		return checkIn;
	}

	public static WebElement dateIn(WebDriver wd)
	{                                                
		WebElement dateIn=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[4]"));
		return dateIn;
	}
	public static WebElement arrow(WebDriver wd)
	{                                                
		WebElement arrow=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/span[2]"));
		return arrow;
	}
	
	public static WebElement checkout(WebDriver wd)
	{
		WebElement checkout=wd.findElement(By.id("checkout"));
		return checkout;
	}

	public static WebElement dateout(WebDriver wd)
	{                                               
		WebElement dateout=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[4]/div[7]"));
		return dateout;
	}
	public static WebElement guest(WebDriver wd)
	{
		WebElement guest=wd.findElement(By.id("guest"));
		return guest;
	}

	public static WebElement adult(WebDriver wd)
	{
		WebElement adult=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[1]/li[2]"));
		return adult;
	}
	public static WebElement child(WebDriver wd)
	{
		WebElement child=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[2]/li[2]"));
		return child;
	}
	public static WebElement apply(WebDriver wd)
	{
		WebElement apply=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/div[4]/div[1]/div[2]/button"));
		return apply;
	}
	public static WebElement travalfor(WebDriver wd)
	{
	//	WebElement travalfor=wd.findElement(By.id("travelFor"));
		WebElement travalfor=wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div[5]/label"));
		return travalfor;
	}
	public static WebElement worktraval(WebDriver wd)
	{
		WebElement work=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[1]/div[5]/ul/li[1]"));
		return work;
	}
	public static WebElement search(WebDriver wd)
	{
		WebElement search=wd.findElement(By.id("hsw_search_button"));
		return search;
	}
}
