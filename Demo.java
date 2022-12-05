package google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		
		List<WebElement> allitems = driver.findElements(By.xpath("//a"));
		System.out.println(allitems.size());
	}
}
//		List<WebElement> h=driver.findElements(By.tagName("a"));
//	    for(WebElement f:h)
//		{
//		String a=f.getText();
//		System.out.println(a);
//		}
//
//		}
//}		
