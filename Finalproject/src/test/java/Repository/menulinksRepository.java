package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class menulinksRepository
{
	public static WebElement flight(WebDriver wd)
	{
		//for flight
		WebElement flight=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]"));
		return flight;
	}
	public static WebElement hotels(WebDriver wd)
	{
		//for hotels                              
		WebElement hotels=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]"));
		return hotels;
	}

	public static WebElement homestay(WebDriver wd)
	{
		//forHomeStay
		WebElement homestay=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]"));
		return homestay;
	}
	public static WebElement hodiday(WebDriver wd)
	{
		//for hodiday                               
		WebElement hodiday=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]"));
		return hodiday;
	}
	public static WebElement trains(WebDriver wd)
	{
		//for trains                             
		WebElement trains=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]"));
		return trains;
	}
	public static WebElement buses(WebDriver wd)
	{
		//for buses                              
		WebElement buses=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]"));
		return buses;
	}
	public static WebElement cab(WebDriver wd)
	{
		//for  cab                             
		WebElement cab=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]"));
		return cab;
	}
	public static WebElement visa(WebDriver wd)
	{
		//for visa                               
		WebElement visa=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[8]/a[1]"));
		return visa;
	}
	public static WebElement Charter(WebDriver wd)
	{
		//for  Charter                             
		WebElement Charter=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[9]/a[1]"));
		return Charter;
	}

	public static WebElement activity(WebDriver wd)
	{
		//for activity                               
		WebElement activity=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[10]/a[1]"));
		return activity;
	}

	

}
