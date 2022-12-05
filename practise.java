package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise  {
	
	public static void main(String[]args) throws Exception{
	System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://talentzing.com/");
	driver.findElement(By.xpath("//span[@id='lnkRegistration']")).click();
	driver.findElement(By.xpath("//span[@id='lblJsRegister']")).click();
	
	boolean a;
	 a= driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[4]/div[6]/div[1]/span[1]/input[1]")).isEnabled();
//	 a= driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[3]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[4]/div[6]/div[1]/span[1]/input[2]")).isEnabled();
	// b=driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_rblstNotice_0']")).isEnabled();
     System.out.println(a);
     driver.quit();
}
}