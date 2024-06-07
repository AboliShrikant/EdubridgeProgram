package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flightRepository 
{
	public static WebElement logologin(WebDriver wd)
	{
		WebElement logologin=wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[3]"));
		return logologin;
	}
	public static WebElement flight (WebDriver wd)
	{
		//for flight
		WebElement flight=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]"));
		return flight;
	}

	public static WebElement oneway(WebDriver wd)
	{
		//for oneway
		WebElement oneway=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
		return oneway;
	}

	public static WebElement fromct(WebDriver wd)
	{
		//for fromcity
		WebElement fromct=wd.findElement(By.id("fromCity"));
		return fromct;
	}
	
	public static WebElement toct(WebDriver wd)
	{
		//for to city destination
		WebElement toct=wd.findElement(By.id("toCity"));
		return toct;
	}
	public static WebElement frompt(WebDriver wd)
	{
		//for from point
		WebElement frompt=wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return frompt;
	}
	
	public static WebElement topt(WebDriver wd)
	{
		//for topoint
		WebElement topt=wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
		return topt;
	}
	public static WebElement box1(WebDriver wd)
	{
		//for box1
		WebElement box1=wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		return box1;
	}
	public static WebElement departure(WebDriver wd)
	{
		WebElement dept=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/label[1]/span[1]"));

		//WebElement dept=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/label[1]"));
		return dept;
	}

	public static WebElement datedept(WebDriver wd)
	{                                                
		WebElement deptdate=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[5]/div[5]/div[1]"));
		return deptdate;
	}
	public static WebElement arrow(WebDriver wd)
	{                                                
		WebElement arrow=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[2]"));
		return arrow;
	}
	public static WebElement ret(WebDriver wd)
	{                                               
		WebElement ret=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/label[1]/span[1]"));
		return ret;
	}
	public static WebElement returndate(WebDriver wd)
	{                                               
		WebElement returndate=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[4]/div[7]"));
		return returndate;
	}
	public static WebElement guest(WebDriver wd)
	{
		WebElement guest=wd.findElement(By.id("guest"));
		return guest;
	}

	public static WebElement adult(WebDriver wd)
	{
		WebElement adult=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[4]"));
		return adult;
	}
	public static WebElement child(WebDriver wd)
	{
		WebElement child=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]"));
		return child;
	
	}
	public static WebElement child2(WebDriver wd)
	{
		WebElement child2=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[2]"));
		return child2;
	
	}
	public static WebElement travalclass (WebDriver wd)
	{
		WebElement peremium=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[1]/ul[2]/li[2]"));
		return peremium;
	
	}
	public static WebElement apply (WebDriver wd)
	{
		WebElement apply=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[2]/div[2]/button[1]"));
		return apply;
	
	}
}
