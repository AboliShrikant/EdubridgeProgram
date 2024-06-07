package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupRepository 
{
	public static WebElement lgpemail(WebDriver wd)
	{
		// login with PhoneNo/Email
		WebElement lgpemail= wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[3]/div[1]/div[2]"));
		return lgpemail;
	}

	//login with google
	public static WebElement lgGoogle(WebDriver wd)
	{
		WebElement lgGoogle= wd.findElement(By.cssSelector("div[data-cy=googleLogin]"));
		return lgGoogle;
	}


	//for create account
	public static WebElement createacc(WebDriver wd)
	{                                                       
		WebElement createacc=wd.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div/button"));
		return createacc;  
	}


	//for email box
	public static WebElement emailbox(WebDriver wd)
	{
		WebDriverWait wait=new WebDriverWait(wd, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")));
		WebElement emailbox=wd.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input"));
		return emailbox;                                
	}

	//for firstName box
	public static WebElement firstN(WebDriver wd)
	{
		WebElement firstN=wd.findElement(By.name("firstName"));
		return firstN;
	}


	//for lastname box
	public static WebElement lastN(WebDriver wd)
	{
		WebElement lastN=wd.findElement(By.name("lastName"));
		return lastN;
	}


	//forUserNmae box
	public static WebElement userN(WebDriver wd)
	{
		WebElement userN=wd.findElement(By.name("Username"));
		return userN;
	}


	//for Password box
	public static WebElement pass(WebDriver wd)
	{
		WebElement pass=wd.findElement(By.name("Passwd"));
		return pass;
	}


	//for confirmpassword box
	public static WebElement confpass(WebDriver wd)
	{
		WebElement confpass=wd.findElement(By.name("ConfirmPasswd"));
		return confpass;
	}


	//for showpassword box
	public static WebElement showpass(WebDriver wd)
	{
		WebElement showpass=wd.findElement(By.id("i3"));
		return showpass;
	}

	public static WebElement next(WebDriver wd)
	{
		//WebElement next=wd.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/div[3]"));
		WebElement next=wd.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span"));

		return next;
	}

	public static WebElement verifyPno(WebDriver wd)
	{
		WebElement verifyPno=wd.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[2]/div/div[2]/div[1]/label/input"));

		return verifyPno;
	}

	public static WebElement next2(WebDriver wd)
	{
		//WebElement next2=wd.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[3]"));
		WebElement next2=wd.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[3]"));
	//	WebElement next2=wd.findElement(By.xpath(""));

		return next2;
	}
	
	

}
