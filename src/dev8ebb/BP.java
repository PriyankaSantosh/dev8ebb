package dev8ebb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BP {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	WebDriver driver=new ChromeDriver();
	@Test
			public void BP() throws InterruptedException
			{
			//	public static void main(String[] args) throws InterruptedException {
				//WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("http://dev8.ebloodbanking.com/");
				driver.navigate().refresh();
				driver.manage().window().maximize();
				
				driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
				driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//button[@id='edit-submit']")).click();

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("(//span[@class='navbar-text dropdown-toggle'])[1]")).click();
				
				
				driver.findElement(By.xpath("(//a[@href='/node/add/donation_record'])[1]")).click();
				 
				 
				DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
	            
	            //get current date time with Date()
	            
	            Date date = new Date();
	            
	          String  dd=dateFormat.format(date);
	          System.out.println(dd);
	          
	          DateFormat dateFormat11 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	            
	            //get current date time with Date()
	            
	            Date date11 = new Date();
	            
	          String  rr=dateFormat11.format(date11);
	          System.out.println(rr);
	          
			          

				driver.findElement(By.xpath("//input[@id='edit-field-donor-registration-id-0-value']")).sendKeys(rr);
				
				
				
				
				
				driver.findElement(By.xpath("//input[@id='edit-field-donor-name-0-value']")).sendKeys("testing");
				
				driver.findElement(By.xpath("//div[@id='edit_field_blood_group_chosen']")).click();
				driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

				driver.findElement(By.xpath("//li[text()='A1 Pos']")).click();
				
			WebElement e=driver.findElement(By.id("edit-field-gender"));
			Actions action= new Actions(driver);
			action.moveToElement(e).click().perform();
				driver.findElement(By.xpath("//option[@value='Male']")).click();
				
				driver.findElement(By.xpath("//div[@id='edit_field_number_of_donations_chosen']")).click();
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				
				WebElement e1=driver.findElement((By.xpath("(//li[@data-option-array-index='1'])[2]")));
				Actions action1= new Actions(driver);
				action.moveToElement(e1).click().perform();

				//driver.findElement(By.xpath("(//li[@data-option-array-index='1'])[2]")).click();
				
				driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

				
				driver.findElement(By.xpath("//input[@id='edit-field-age-0-value']")).sendKeys("18");

				
				driver.findElement(By.xpath("//select[@id='edit-field-donor-type']")).click();
				driver.findElement(By.xpath("//option[@value='Vol']")).click();
				
				
				driver.findElement(By.xpath("//a[@href='#edit-group-medical-examination']")).click();
				
				
				
				
			
				
				
				
				
				
				
				

				


				driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

				

				WebElement ele1 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--2']"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();", ele1);

				driver.findElement(By.xpath("//select[@id='edit-field-donor-doctor-und']")).click();
				driver.findElement(By.xpath("//option[@value='4973']")).click();


				driver.findElement(By.xpath("//input[@id='edit-field-weight-und-0-value']")).sendKeys("45");
				driver.findElement(By.xpath("//input[@id='edit-field-bp-systolic-und-0-value']")).sendKeys("109");
				driver.findElement(By.xpath("//input[@id='edit-field-bp-diastolic-und-0-value']")).sendKeys("65");

				driver.findElement(By.xpath("//input[@id='edit-field-hemoglobin-test-und-more-than-125']")).click();

				driver.findElement(By.xpath("//input[@id='edit-field-deferral-status-und-normal']")).click();

				driver.findElement(By.xpath("//select[@id='edit-field-donor-sdp-suff-duration-und']")).click();
				driver.findElement(By.xpath("//option[@value='YES']")).click();

				driver.findElement(By.xpath("//select[@id='edit-field-donation-type-und']")).click();
				driver.findElement(By.xpath("//option[@value='WBD']")).click();

				driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


				WebElement ele2 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--7']"));
				JavascriptExecutor executor2 = (JavascriptExecutor)driver;
				executor2.executeScript("arguments[0].click();", ele2);
				

				driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-datepicker-popup-0']")).sendKeys(dd);
				driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-timeEntry-popup-1']")).sendKeys("01:50am");

				driver.findElement(By.xpath("//input[@id='edit-field-bag-no-und-0-value']")).sendKeys("65");
				driver.findElement(By.xpath("//input[@id='edit-field-batch-no-und-0-value']")).sendKeys("65");
				driver.findElement(By.xpath("//input[@id='edit-field-donor-segment-number-und-0-value']")).sendKeys("65");

				driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


				driver.findElement(By.xpath("//select[@id='edit-field-type-of-bag-und']")).click();
				driver.findElement(By.xpath("//option[@value='5074']")).click();

				driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


				driver.findElement(By.xpath("//select[@id='edit-field-components-to-be-prepared-und']")).click();
				driver.findElement(By.xpath("//option[text()='PC, FFP']")).click();

				driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


				driver.findElement(By.xpath("//select[@id='edit-field-er-technician-und']")).click();
				driver.findElement(By.xpath("(//option[text()='  anushka '])[2]")).click();

				WebElement ele11 = driver.findElement(By.id("edit-submit"));
				JavascriptExecutor executor11 = (JavascriptExecutor)driver;
				executor11.executeScript("arguments[0].click();", ele11);
				
				driver.findElement(By.xpath("//a[text()='Edit']")).click();
				WebElement ele111 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--2']"));
				JavascriptExecutor executor111 = (JavascriptExecutor)driver;
				executor111.executeScript("arguments[0].click();", ele111);
				
				WebElement a= driver.findElement(By.xpath("//input[@id='edit-field-bp-systolic-und-0-value']"));
				a.sendKeys(Keys.BACK_SPACE);
				a.sendKeys(Keys.BACK_SPACE);
				a.sendKeys(Keys.BACK_SPACE);

				driver.findElement(By.xpath("//input[@id='edit-field-bp-systolic-und-0-value']")).sendKeys("151");
				
			WebElement ele1111 = driver.findElement(By.id("edit-submit"));
				JavascriptExecutor executor1111 = (JavascriptExecutor)driver;
				executor1111.executeScript("arguments[0].click();", ele1111);
				driver.findElement(By.xpath("//a[text()='Edit']")).click();
				
				
				driver.findElement(By.xpath("//a[text()='Edit']")).click();
				
				WebElement ele4 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--2']"));
				JavascriptExecutor executor4= (JavascriptExecutor)driver;
				executor4.executeScript("arguments[0].click();", ele4);
				
				WebElement a1= driver.findElement(By.xpath("//input[@id='edit-field-bp-systolic-und-0-value']"));
				a1.sendKeys(Keys.BACK_SPACE);
				a1.sendKeys(Keys.BACK_SPACE);
				a1.sendKeys(Keys.BACK_SPACE);

				driver.findElement(By.xpath("//input[@id='edit-field-bp-systolic-und-0-value']")).sendKeys("110");
				
				
				WebElement ele11111 = driver.findElement(By.id("edit-submit"));
				JavascriptExecutor executor11111 = (JavascriptExecutor)driver;
				executor11111.executeScript("arguments[0].click();", ele11111);
				
				}
}
