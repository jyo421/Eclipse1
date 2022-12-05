package google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5 {
public static void main(String[]args) throws Exception {
	System.setProperty("\"webdriver.chrome.driver\", \"D://chromedriver.exe\"", null);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
	

	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[normalize-space()='New']")).click();
	WebElement actiTIME=driver.findElement(By.xpath("//*[@id='logo_aT']"));
	if(actiTIME.isDisplayed())
	{
	
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
jsExecutor.executeScript("arguments[0].style.border='5px solid blue'",actiTIME);    
	
		System.out.println("actiTIME image is displayed");
	}
	else {
		System.out.println("actiTIME image is not displayed");
}
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@class=\"content tasks\"]/div")).click();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@class=\"content reports\"]/div")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@class=\"content users\"]/div")).click();
//	Thread.sleep(5000);


driver.close();
	
}
}
