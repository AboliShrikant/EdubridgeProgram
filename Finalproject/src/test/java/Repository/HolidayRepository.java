package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HolidayRepository
{
	public static WebElement logologin(WebDriver wd)
	{
		WebElement logologin=wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[3]"));
		return logologin;
	}
	public static WebElement hodiday(WebDriver wd)
	{
		//for hodiday                               
		WebElement hodiday=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]"));
		return hodiday;
	}


	public static WebElement destination(WebDriver wd)
	{

		WebElement destination=wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/ul/li[2]"));
		return destination;
	}
	public static WebElement Andaman(WebDriver wd)
	{

		WebElement Andaman=wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div/div/div/div[2]/div[1]/ul[2]/li[3]/a"));
		return Andaman;
	}
	public static WebElement Skip(WebDriver wd)
	{

		WebElement Skip=wd.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[2]/div/button[1]"));
		return Skip;
	}
	public static WebElement forbtn(WebDriver wd)
	{
		WebDriverWait wait= new WebDriverWait(wd,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div/div[1]/div/div")));
		WebElement forbtn=wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div/div[1]/div/div"));

		//WebElement forbtn=wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div/div[1]/div/div/a/span/span[3]"));
		return forbtn;
	}
	public static WebElement couple(WebDriver wd)
	{

		WebElement couple=wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div/div/div[1]/div/div/div/p[2]"));
		return couple;
	}
	public static WebElement stars4 (WebDriver wd)
	{

		WebElement star4=wd.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[4]/div/div/div[4]/ul/li[2]"));
		return star4;
	}
	public static WebElement couplepkg(WebDriver wd)
	{
		WebDriverWait wait=new WebDriverWait(wd, 30) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/main/div[1]/div/div[7]/div/div/div/div[2]/div/div[3]/div/div[1]/div[1]/div/img")));
		WebElement couplepkg=wd.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/div[7]/div/div/div/div[2]/div/div[3]/div/div[1]/div[1]/div/img"));
		return couplepkg;
	}
	public static WebElement couplepkg1(WebDriver wd)
	{
		WebDriverWait wait=new WebDriverWait(wd, 30) ;
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/main/div[1]/div/div[7]/div/div/div/div[2]/div/div[3]/div/div[2]")));
		WebElement couplepkg1=wd.findElement(By.xpath("/html/body/div[2]/div/main/div[1]/div/div[7]/div/div/div/div[2]/div/div[3]/div/div[2]"));
		return couplepkg1;
	}
	public static WebElement Skip2(WebDriver wd)
	{
		WebElement Skip2=wd.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[2]/div[2]/div[2]/div/button[1]"));
		return Skip2;
	}
	public static WebElement proceedtoBook(WebDriver wd)
	{
		WebElement proceedtoBook=wd.findElement(By.xpath("/html/body/div[2]/div/div/div[4]/div[2]/div[1]/div[2]/div[2]/span"));
		return proceedtoBook;
	}
	public static WebElement Adult1(WebDriver wd)
	{
		//WebElement Adult1=wd.findElement(By.xpath("/html/body/div[2]/div/div[5]/form/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div/div/div[2]/div/svg"));

		WebElement Adult1=wd.findElement(By.xpath("/html/body/div[2]/div/div[5]/form/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div/div"));
		return Adult1;
	}
	public static WebElement AddTravller(WebDriver wd)
	{										
		WebElement AddTravller=wd.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/section[1]/div[2]/div/div/section/div[2]/div[2]/div[1]/div/div[1]/p[2]"));
		return AddTravller;
	}
	public static WebElement FirstName(WebDriver wd)
	{										
		WebElement FirstName=wd.findElement(By.name("FIRST_NAME"));
		return FirstName;
	}
	public static WebElement lastName(WebDriver wd)
	{										
		WebElement lastName=wd.findElement(By.name("LAST_NAME"));
				return lastName;
	}
	public static WebElement DOBDay(WebDriver wd)
	{										
		WebElement DOBDay=wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[1]/div/div/div/div[1]"));
				return DOBDay;
	}
	public static WebElement DOBMonth(WebDriver wd)
	{										
		WebElement DOBMonth=wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[2]/div/div/div/div[1]"));
				return DOBMonth;
	}
	public static WebElement DOBYear(WebDriver wd)
	{										
		WebElement DOBYear=wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div/div[3]/div/div/div/div[1]"));
				return DOBYear;
	}
	public static WebElement Gender(WebDriver wd)
	{										
		WebElement Gender=wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[3]/div[2]/div/div[2]/div/div[4]/div/div[2]/div/div[1]"));
		
				return Gender;
	}
	public static WebElement AddTravllercompt(WebDriver wd)
	{										
		WebElement AddTravllercompt=wd.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div[4]/button"));
		
				return AddTravllercompt;
	}
}
