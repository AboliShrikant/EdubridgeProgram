package Repository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Return;

public class TravllerDetailsRepository
{
	public static WebElement Savetravller(WebDriver wd)
	{
		WebElement Savettravller=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div/ul/li[3]"));
		return Savettravller;
	}
	public static WebElement AddTravellerDetail(WebDriver wd)
	{
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement TravellerDetails=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[4]/div/div[2]/button"));
	      return TravellerDetails;

	}
	public static WebElement TravellerName(WebDriver wd)
	{
		WebElement TravellerName=wd.findElement(By.id("travellerFirstName"));
	      return TravellerName;

	}
	public static WebElement TravellerGender(WebDriver wd)
	{
		WebElement TravellerGender=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/div/div[2]/form/div[1]/div[1]/div/div[1]/div[2]/div/div[2]/div"));
	      return TravellerGender;

	}
	public static WebElement female(WebDriver wd)
	{
		WebElement female=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/div/div[2]/form/div[1]/div[1]/div/div[1]/div[2]/div/div[2]/ul[1]/li[2]"));
		return female;
	}
	public static WebElement TravellerEmail(WebDriver wd)
	{
		WebElement TravellerEmail=wd.findElement(By.id("travellerEmailId"));
	      return TravellerEmail;

	}
	public static WebElement TravellerPhone(WebDriver wd)
	{
		WebElement TravellerEmail=wd.findElement(By.id("travellerPhoneNum"));
	      return TravellerEmail;

	}
	public static WebElement BasicInfo(WebDriver wd)
	{
		WebElement BasicInfo=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/div/div[2]/div/ul/li[1]"));
	      return BasicInfo;

	}
	public static WebElement TravellerBirthday(WebDriver wd)
	{
		WebDriverWait wait=new WebDriverWait(wd, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/div/div[2]/form/div[1]/div[1]/div/div[3]/div/div/div[2]/div[1]")));
		WebElement TravellerBirthday=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/div/div[2]/form/div[1]/div[1]/div/div[3]/div/div/div[2]/div[1]"));
	      return TravellerBirthday;

	}
	public static WebElement BirthdayYear(WebDriver wd)
	{
		WebElement BirthdayYear=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/select[1]"));
	      return BirthdayYear;

	}
	public static WebElement Nextmonth(WebDriver wd)
	{
		WebElement Nextmonth=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/div/div[2]/form/div[1]/div[1]/div/div[3]/div/div/div[2]/div[2]/div/div/div/div[1]/span[2]"));
	      return Nextmonth;

	}
	public static WebElement Birthdaymonth(WebDriver wd)
	{					
		WebElement Birthdaymonth=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/select[2]"));
	      return Birthdaymonth;

	}
	public static WebElement BirthdayDay(WebDriver wd)
	{
		WebElement BirthdayDay=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]"));
	      return BirthdayDay;

	}
	public static WebElement Save(WebDriver wd)
	{
		WebElement save=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[2]/div[4]/div[2]/div/div[2]/form/div[2]/div[2]/button"));
	      return save;

	}
}