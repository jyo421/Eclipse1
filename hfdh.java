package google;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class hfdh {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//single window
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("parent window handle"+parentWindowHandle);
		Thread.sleep(1000);
		driver.findElement(By.id("newWindowBtn")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.id("newWindowsBtn")).click();
//		Thread.sleep(10000);
		Set<String> windowHandles=driver.getWindowHandles();
		for(String windowHandle:windowHandles)
		{
		System.out.println(windowHandle);
		}
}
}