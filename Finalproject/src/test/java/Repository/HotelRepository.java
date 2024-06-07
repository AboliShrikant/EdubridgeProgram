package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelRepository 
{
	public static WebElement logologin(WebDriver wd)
	{
		WebElement logologin=wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[3]"));
		return logologin;
	}
	public static WebElement hotels(WebDriver wd)
	{
		//for hotels                              
		WebElement hotels=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]"));
		return hotels;
	}
	public static WebElement city (WebDriver wd)
	{
		WebElement city=wd.findElement(By.id("city"));
		return city;
	}

	public static WebElement citypt (WebDriver wd)
	{
		WebElement citypt=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div/input"));
		return citypt;
	}
	public static WebElement checkIn(WebDriver wd)
	{
		WebElement checkIn=wd.findElement(By.id("checkin"));
		return checkIn;
	}

	public static WebElement dateIn(WebDriver wd)
	{                                                
		WebElement dateIn=wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/div[4]/div[4]"));
		return dateIn;
	}
	public static WebElement arrow(WebDriver wd)
	{                                                
		WebElement arrow=wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[2]"));
		return arrow;
	}
	
	public static WebElement checkout(WebDriver wd)
	{
		WebElement checkout=wd.findElement(By.id("checkout"));
		return checkout;
	}

	public static WebElement dateout(WebDriver wd)
	{                                               
		WebElement dateout=wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/div[7]"));
		return dateout;
	}
	public static WebElement guest(WebDriver wd)
	{
		WebElement guest=wd.findElement(By.id("guest"));
		return guest;
	}
	public static WebElement adult(WebDriver wd)
	{
		WebElement adult=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[1]/li[2]"));
		return adult;
	}
	public static WebElement child(WebDriver wd)
	{
		WebElement child=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[2]/li[2]"));
		return child;
	}
	public static WebElement apply(WebDriver wd)
	{
		WebDriverWait wait=new WebDriverWait(wd,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'APPLY')]")));
		WebElement apply=wd.findElement(By.xpath("//button[contains(text(),'APPLY')]"));
		//WebElement apply=wd.findElement(By.cssSelector("button[data-cy='submitGuest']"));
	//	WebElement apply=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[3]/button[2]"));
		//WebElement apply=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/div[3]/button[2]"));
		return apply;
	}
	public static WebElement travalFor(WebDriver wd)
	{
		WebElement travalfor=wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div[5]/label/span"));
		return travalfor;
	}
	public static WebElement leisure(WebDriver wd)
	{
		WebElement leisure=wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div[5]/ul/li[2]"));
		return leisure;
	}

	public static WebElement search(WebDriver wd)
	{
		WebElement search=wd.findElement(By.id("hsw_search_button"));
		return search;
	}
}
