package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginRepository 
{
	public static WebElement lgGoogle(WebDriver wd)
	{
		//click on login with google
		WebElement lgGoogle= wd.findElement(By.cssSelector("div[data-cy=googleLogin]"));
		return lgGoogle;
	}


	public static WebElement lgpemail(WebDriver wd)
	{
		//login with PhoneNo/Email
		//WebElement lgpemailupdated = wd.findElement(By.cssSelector("makeFlex column flexOne"));

		WebElement lgpemail= wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[1]/ul/li[3]/div[3]/div/div[2]/div/p/label"));
		return lgpemail;
	}

	public static WebElement emailbox(WebDriver wd)
	{
		//email box
		WebElement emailbox=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[1]/div[1]/input[1]"));
		return emailbox;
	}

	public static WebElement contbtn(WebDriver wd)
	{
		// continue button
		WebElement contbtn=wd.findElement(By.cssSelector("button[data-cy=continueBtn]"));
		return contbtn;
	}
	// password
	public static WebElement pswd(WebDriver wd)
	{
		
		WebElement pswd=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[1]/div[1]/input[2]"));
		return pswd;
	}
	// login
	public static WebElement login(WebDriver wd)
	{
		
		WebElement login=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/section[1]/form[1]/div[2]/button[1]"));
		return login;
	}
	
	//hiaboli
	public static WebElement hiAboli(WebDriver wd)
	{
		WebElement hiAboli= wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/p[1]"));
		//WebElement hiAboli=wd.findElement(By.id("loginTrigger"));
		return hiAboli;
	}

	// profile 
	public static WebElement profile(WebDriver wd)
	{   
		WebDriverWait wait=new WebDriverWait(wd, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/a[1]/div[1]/p[1]")));
		WebElement profile=wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[2]/a[1]/div[1]/p[1]"));
		return profile;
	}
	// logout
	public static WebElement logout(WebDriver wd)   
	{
		//*[@id="myProfilePage"]/div[2]/div[1]/div/ul/li[4]
		WebElement logout=wd.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[2]/div[1]/div/ul/li[4]"));

		return logout;
	}




}
