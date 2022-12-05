package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pra {

	
	public static void main(String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gramawardsachivalayam.ap.gov.in/GSWSLMS/Login");
         driver.findElement(By.id("remember_me")).click();
	boolean e;
	e=driver.findElement(By.id("remember_me")).isSelected();
	System.out.println(e);
}
}