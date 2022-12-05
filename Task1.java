package google;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();

      Thread.sleep(5000);
      
      driver.manage().window().maximize();
      WebElement actiTime = driver.findElement(By.xpath("//*[@id=\'logo_aT\']"));  
     JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;         
     jsExecutor.executeScript("arguments[0].style.border='5px solid blue'",actiTime);
     Thread.sleep(5000);
     
     if(actiTime.isDisplayed()) {  
 	   System.out.println("image is displayed");
 	   }else {
 	   System.out.println("image is not displayed");   	 
 	   }
        
        driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='container_reports']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='container_users']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='content tt']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='New']")).click();
        Thread.sleep(1000);
       
        
        WebElement createtask = driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/table/tbody/tr/td/div[2]"));
        JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
        jsExecutor1.executeScript("arguments[0].style.border='5px solid green'", createtask);
        
		 driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']//div[@class='dropdownButton']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='itemRow cpItemRow selected'][normalize-space()='Big Bang Company']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/div[1]/div[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='itemRow cpItemRow selected'][normalize-space()='Flight operations']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@placeholder='Enter task name'])[1]")).sendKeys("Task5");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//input[@placeholder='not needed'])[1]")).sendKeys("45");
	 Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='ext-gen34']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@title='today']//a[@class='x-date-date']")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Create Tasks')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_tips']//div[@class='popup_menu_icon']")).click();
  driver.close();
         }
 	}  

