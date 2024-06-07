package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login1Repository 
{
	public static WebElement lgGoogle(WebDriver wd)
	{
		////click on login with google
		WebElement lgGoogle= wd.findElement(By.cssSelector("div[data-cy=googleLogin]"));
		return lgGoogle;
	}


	public static WebElement lgpemail(WebDriver wd)
	{
		//click on login with PhoneNo/Email
		WebElement lgpemail= wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[3]/div[1]/div[2]"));
		return lgpemail;
	}

	public static WebElement emailbox(WebDriver wd)
	{
		//click on email box
		WebElement emailbox=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]"));
		return emailbox;
	}

	public static WebElement contbtn(WebDriver wd)
	{
		//click on continue button
		WebElement contbtn=wd.findElement(By.cssSelector("button[data-cy=continueBtn]"));
		return contbtn;
	}

	public static WebElement pswd(WebDriver wd)
	{
		//Click on password
		WebElement pswd=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[1]/div[1]/input[2]"));
		return pswd;
	}

	public static WebElement login(WebDriver wd)
	{
		//click on login
		WebElement login=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]"));
		return login;
	}

	public static WebElement hiAboli(WebDriver wd)
	{
		WebDriverWait wait=new WebDriverWait(wd,20);
		String css="p[data-cy='loggedInUser']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
		WebElement hiAboli= wd.findElement(By.cssSelector(css));
		return hiAboli;
	}

	public static WebElement profile(WebDriver wd)
	{
		//click on profile    
		WebDriverWait wait=new WebDriverWait(wd, 30);	
		String path="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/a[1]/div[1]/p[1]";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));
		WebElement profile=wd.findElement(By.xpath(path));
		return profile;
	}

	public static WebElement logout(WebDriver wd)
	{
		//click on logout
		WebDriverWait wait=new WebDriverWait(wd, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div/ul/li[4]")));
		WebElement logout=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div/ul/li[4]"));

		return logout;
	}


}

