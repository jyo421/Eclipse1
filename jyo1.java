package google;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class jyo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.xpath("//span[normalize-space()= 'Create account']")).click();
	
		//driver.findElement(By.xpath("//span[normalize-space()= 'For my personal use']")).click();
	//driver.findElement(By.xpath("//span[normalize-space()='For my child']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='To manage my business']']")).click();
	}

}