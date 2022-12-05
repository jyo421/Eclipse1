package google;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class vgh {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
        
        String windowID=driver.getWindowHandle();
        System.out.println(windowID);
//        System.out.println(driver.getWindowHandle());
//    
//        Set<String> handles = driver.getWindowHandles();
//        for(String str1:handles) {
//        System.out.println(str1);
//        }
}
}