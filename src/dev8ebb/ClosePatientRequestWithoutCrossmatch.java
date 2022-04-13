package dev8ebb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ClosePatientRequestWithoutCrossmatch {
	static
	{
	 	String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
		}

	
	WebDriver driver=new ChromeDriver();
 	@Test
	public void ClosePatientRequestWithoutCrossmatch() throws InterruptedException 
	{
	//public static void main(String[] args) throws InterruptedException
	//{
	//WebDriver driver=new ChromeDriver();
	driver.get("https://dev8.ebloodbanking.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
	driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
	
	
	WebDriverWait wait=new WebDriverWait(driver,100);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//li[@class='expanded dropdown'])[3]")));
	driver.findElement(By.xpath("(//li[@class='expanded dropdown'])[3]")).click();
	driver.findElement(By.xpath("//a[@href='/create-patient-blood-requirement']")).click();
	
	DateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyy");

	//get current date time with Date()

	Date date1 = new Date();

	String  dd1=dateFormat1.format(date1);
	System.out.println(dd1);
	
	DateFormat dateFormat2 = new SimpleDateFormat("HH-mm");

	//get current date time with Date()
	Date date2 = new Date();

	String  dd2=dateFormat2.format(date2);
	System.out.println(dd2);
	
	
	WebElement element = driver.findElement(By.xpath("//input[@id='edit-field-patient-name-0-value']"));
	Actions action = new Actions(driver);
	action.moveToElement(element).click().perform();
	driver.findElement(By.xpath("//input[@id='edit-field-patient-name-0-value']")).sendKeys(dd1 + dd2);
	
	
	WebElement element1 = driver.findElement(By.xpath("//input[@id='edit-field-patient-id-0-value']"));
	Actions action1 = new Actions(driver);
	action1.moveToElement(element1).click().perform();
	driver.findElement(By.xpath("//input[@id='edit-field-patient-id-0-value']")).sendKeys(dd1 + dd2);
	
	driver.findElement(By.xpath("//input[@id='edit-field-hospital-id-0-target-id']")).sendKeys("tes");
	driver.findElement(By.xpath("//ul[@id='ui-id-1']")).click();
	
	driver.findElement(By.xpath("//button[@value='Save']")).click();
	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//a[text()='Close Patient Request']")).click();

	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

driver.findElement(By.xpath("(//button[@data-drupal-selector='edit-submit'])[2]")).click();

	//driver.findElement(By.xpath("//a[@title='Click to Close Patient Request']")).click();
	//driver.findElement(By.xpath("(//button[@data-drupal-selector='edit-submit'])[2]")).click();
	System.out.println("Setting the request status as dropped as not components were issued to the patient");

}
}

