package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInRepository 
{
	public static WebElement view (WebDriver wd)
	{
		WebDriverWait wait=new WebDriverWait(wd,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[15]/div[1]/div[3]/button[1]")));
		//wd.findElement(By.xpath("/html/body/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[15]/div/div[3]/button")).click();
		WebElement view=wd.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[15]/div[1]/div[3]/button[1]"));
		return view;
	}

}
