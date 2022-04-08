package dev8ebb;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PartialDonor {
	static
	{
	 	String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
		}


	
	WebDriver driver=new ChromeDriver();
	@Test
	public void PartialDonor() throws InterruptedException 
	{
	
	
	//public static void main(String[] args) throws InterruptedException
//	{
	//WebDriver driver=new ChromeDriver();
	driver.get("https://dev8.ebloodbanking.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
	driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
	driver.findElement(By.xpath("//a[@href='/user/9']")).click();

	driver.findElement(By.xpath("(//a[@href='/node/1'])[1]")).click();
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	
	WebElement ele21 = driver.findElement(By.xpath("//a[@href='/node/1/edit']"));
	JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
	executor2111.executeScript("arguments[0].click();", ele21);
	
	
	
	/*WebDriverWait wait=new WebDriverWait(driver,150);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/node/1/edit']")));
	
	driver.findElement(By.xpath("//a[@href='/node/1/edit']")).click();
*/
	
	WebDriverWait wait9=new WebDriverWait(driver,90);
	wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#edit-group-miscellaneous']")));
	driver.findElement(By.xpath("//a[@href='#edit-group-miscellaneous']")).click();
	

	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@href='/node/1/edit']")).click();
	driver.findElement(By.xpath("//a[@href='#edit-group-miscellaneous']")).click();
	WebElement checking = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-allow-partial-donor-entry']"));
	if (checking.isSelected()) {
		
		
			
		WebElement ele211 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor21112 = (JavascriptExecutor)driver;
		executor21112.executeScript("arguments[0].click();", ele211);


 } else {
	 WebElement check1 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-allow-partial-donor-entry']"));
	 JavascriptExecutor executor211 = (JavascriptExecutor)driver;
		executor211.executeScript("arguments[0].click();", check1);
	 
          WebElement ele219 = driver.findElement(By.id("edit-submit"));
			JavascriptExecutor executor21119 = (JavascriptExecutor)driver;
			executor21119.executeScript("arguments[0].click();", ele219);
          
 }
	WebDriverWait wait1=new WebDriverWait(driver,90);
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='expanded dropdown first']")));
	driver.findElement(By.xpath("//li[@class='expanded dropdown first']")).click();
	
	driver.findElement(By.xpath("(//a[@href='/node/add/donation_record'])[1]")).click();
	driver.findElement(By.xpath("//select[@id='edit-field-donor-entry-type']")).click();
	driver.findElement(By.xpath("//option[@value='Partial']")).click();
	
	WebElement test = driver.findElement(By.xpath("//button[@id='edit-submit']"));
	JavascriptExecutor e3 = (JavascriptExecutor)driver;
	e3.executeScript("arguments[0].click();", test);
	
	System.out.println("Registration ID field is required" + 
				"Please provide a valid blood group" + 
				"Blood Bag number information is not entered" + 
				"Type of Bag information is not entered" +
				"Component to be prepared information is not entered");
	
	
}
}