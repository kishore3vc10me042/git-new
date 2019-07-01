package copy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class copy1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/srinu/Desktop/locators.html");
		driver.findElement(By.id("t1")).sendKeys("ABC");
		driver.findElement(By.id("t1")).sendKeys(Keys.CONTROL+"ac");
		driver.findElement(By.id("t2")).sendKeys(Keys.CONTROL+"v");
		
		
	}

}
