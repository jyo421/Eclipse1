package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gd {

	
	public static void main(String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/");
		driver.navigate().to("http://omayo.blogspot.com/");
//		driver.navigate().back();
}
}