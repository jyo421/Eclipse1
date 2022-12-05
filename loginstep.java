package Stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstep {
	public WebDriver driver;
	@Given("To open the Browser")
	public void to_open_the_browser() {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		
		   driver=new ChromeDriver();
		   
	      }

	       @When("Enter the url {string}")
	       public void enter_the_url(String string) throws IOException {
		 driver.get("https://www.indiamart.com");
		    driver.manage().window().maximize(); 
		    
		    TakesScreenshot ts = (TakesScreenshot)driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
		    System.out.println("the Screenshot is taken");
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)", "");
	   
	                }

	@When("click on  Building construction Material and equpiment on Middle area")
	public void click_on_building_construction_material_and_equpiment_on_middle_area() throws Exception {
		WebElement Web = driver.findElement(By.xpath("//a[normalize-space()='Building Construction Material & Equipment']"));

		if (Web.isDisplayed()) {

			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].style.border='5px solid red'", Web);

			System.out.println("Web image is displayed");
		                       }
		else {
			System.out.println("Web image is not displayed");
	     	}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='product-meta']//a[normalize-space()='Brick Making Machines']")).click();
		  TakesScreenshot ts = (TakesScreenshot)driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(source, new File("./Screenshots/Task1.png"));
		    System.out.println("the Screenshot is taken");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='product-meta']//a[normalize-space()='Fly Ash Brick Making Machine']")).click();
		  TakesScreenshot tsa = (TakesScreenshot)driver;
		    File sourcae = tsa.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(sourcae, new File("./Screenshots/Task2.png"));
		    System.out.println("the Screenshot is taken");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Clay Brick Making Machine']")).click();
		 TakesScreenshot ts1 = (TakesScreenshot)driver;
		    File sourc = ts1.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(sourc, new File("./Screenshots/Task3.png"));
		    System.out.println("the Screenshot is taken");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Cement Brick Making Machine']")).click();
	
		 TakesScreenshot te = (TakesScreenshot)driver;
		    File sour = te.getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(sour, new File("./Screenshots/Task4.png"));
		    System.out.println("the Screenshot is taken");
		Thread.sleep(2000);
		driver.navigate().back();
	 }
     @Then("user is navigated to  Building construction Material and equpiment on Middle area")
	public void user_is_navigated_to_building_construction_material_and_equpiment_on_middle_area() throws InterruptedException {
			}

	@When("click on  Electronic and electrical Goods")
	public void click_on_electronic_and_electrical_goods() throws Exception {
		
		WebElement Web = driver.findElement(By.xpath("//a[normalize-space()='Electronics & Electrical Goods & Supplies']"));

		if (Web.isDisplayed()) {

			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].style.border='5px solid blue'", Web);

			System.out.println("Web image is displayed");
		   } else {
			System.out.println("Web image is not displayed");
		    }
		TakesScreenshot te = (TakesScreenshot)driver;
	    File sour = te.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sour, new File("./Screenshots/Task5.png"));
	    System.out.println("the Screenshot is taken");
		
		driver.findElement(By.xpath("//a[normalize-space()='Office Automation Products']")).click();
		Thread.sleep(2000);
		TakesScreenshot te1 = (TakesScreenshot)driver;
	    File sour1 = te1.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sour1, new File("./Screenshots/Task6.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='product-meta']//a[normalize-space()='Multifunction Printer']")).click();
		Thread.sleep(2000);
		TakesScreenshot te11 = (TakesScreenshot)driver;
	    File sour11 = te11.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sour11, new File("./Screenshots/Task7.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='product-meta']//a[normalize-space()='Xerox Machines']")).click();
		Thread.sleep(2000);
		TakesScreenshot ts2 = (TakesScreenshot)driver;
	    File sou = ts2.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sou, new File("./Screenshots/Task8.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Fingerprint Scanners']")).click();
		Thread.sleep(2000);
		TakesScreenshot e = (TakesScreenshot)driver;
	    File so = e.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(so, new File("./Screenshots/Task9.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
            }

	@When("click on  Pharmaceutical drug,Medicine,medical care and Consultation")
	public void click_on_pharmaceutical_drug_medicine_medical_care_and_consultation() throws Exception {
		
		WebElement Web = driver.findElement(By.xpath("//a[contains(text(),'Pharmaceutical Drug, Medicine, Medical Care & Cons')]"));

		if (Web.isDisplayed()) {

			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].style.border='5px solid blue'", Web);

			System.out.println("Web image is displayed");
		   } else {
			System.out.println("Web image is not displayed");
		    }
		
		TakesScreenshot te = (TakesScreenshot)driver;
	    File sour = te.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sour, new File("./Screenshots/Task10.png"));
	    System.out.println("the Screenshot is taken");
	    
		driver.findElement(By.xpath("//a[normalize-space()='Medical Test Services']")).click();
		Thread.sleep(2000);
		TakesScreenshot te1 = (TakesScreenshot)driver;
	    File sour1 = te1.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sour1, new File("./Screenshots/Task11.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='CT Scan Services']")).click();
		Thread.sleep(2000);
		TakesScreenshot p = (TakesScreenshot)driver;
	    File s99 = p.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(s99, new File("./Screenshots/Task12.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Ultrasound Services']")).click();
		Thread.sleep(2000);
		TakesScreenshot t45= (TakesScreenshot)driver;
	    File pk = t45.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(pk, new File("./Screenshots/Task13.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='ECHO Cardiography']")).click();
		Thread.sleep(2000);
		TakesScreenshot a1 = (TakesScreenshot)driver;
	    File s56 = a1.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(s56, new File("./Screenshots/Task14.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Blood Testing']")).click();
		Thread.sleep(2000);
		TakesScreenshot te56 = (TakesScreenshot)driver;
	    File sou11 = te56.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sou11, new File("./Screenshots/Task15.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
	  
     	}

	@When("click on  Hospital and Medical Equipment")
	public void click_on_hospital_and_medical_equipment() throws Exception {
		
		WebElement Web = driver.findElement(By.xpath("//a[normalize-space()='Hospital and Medical Equipment']"));

		if (Web.isDisplayed()) {

			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].style.border='5px solid blue'", Web);

			System.out.println("Web image is displayed");
		} else {
			System.out.println("Web image is not displayed");
		}
		driver.findElement(By.xpath("//a[normalize-space()='Rapid Test Kit']")).click();
		Thread.sleep(5000);
		TakesScreenshot te21 = (TakesScreenshot)driver;
	    File so21 = te21.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(so21, new File("./Screenshots/Task16.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Biochemistry Analyzer']")).click();
		Thread.sleep(5000);
		TakesScreenshot te56 = (TakesScreenshot)driver;
	    File so56 = te56.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(so56, new File("./Screenshots/Task17.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Blood Bank Equipments']")).click();
		Thread.sleep(5000);
		TakesScreenshot te89 = (TakesScreenshot)driver;
	    File so89 = te89.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(so89, new File("./Screenshots/Task18.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Hematology Analyzers']")).click();
		Thread.sleep(5000);
		TakesScreenshot te = (TakesScreenshot)driver;
	    File sour = te.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sour, new File("./Screenshots/Task19.png"));
	    System.out.println("the Screenshot is taken");
		driver.navigate().back();
		driver.navigate().back();
	   
	}

	@When("click on  Industrial plants,Machinery and Equipment")
	public void click_on_industrial_plants_machinery_and_equipment() throws Exception {
		
		WebElement Web = driver.findElement(By.xpath("//a[normalize-space()='Industrial Plants, Machinery & Equipment']"));

		if (Web.isDisplayed()) {

			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].style.border='5px solid blue'", Web);

			System.out.println("Web image is displayed");
		} else {
			System.out.println("Web image is not displayed");
		}
		
		TakesScreenshot oi = (TakesScreenshot)driver;
	    File sui = oi.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sui, new File("./Screenshots/Task20.png"));
	    System.out.println("the Screenshot is taken");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Food Processing Machine']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Flour Mill']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Rice Mill Machinery']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[normalize-space()='Spice Processing Machines']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
	   
	}
}
