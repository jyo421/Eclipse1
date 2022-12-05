package google;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("alert1")).click();
	Alert alt = driver.switchTo().alert();
	System.out.println(alt.getText());
//		
		
//	driver.findElement(By.xpath("//a[@id='selenium143']")).click();
//	// 
//		Set<String> window=driver.getWindowHandles();
//      Iterator<String> itr=window.iterator();
//      String defaultwindow=itr.next();
//        String childwindow=itr.next();
//	        driver.switchTo().window(childwindow);
}
}
