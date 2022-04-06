package dev8ebb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class checkeligibility {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	WebDriver driver=new ChromeDriver();

public void CheckEligibleage() throws InterruptedException
{

	
	
		//public static void main(String[] args) throws InterruptedException, AWTException {
			//WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://dev8.ebloodbanking.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
			driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.findElement(By.id("edit-submit")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[1]")).click();
			driver.findElement(By.xpath("//a[@href='/node/add/donation-record']")).click();

			driver.findElement(By.xpath("//select[@id='edit-field-donor-entry-type-und']")).click();
			driver.findElement(By.xpath("//option[@value='Full']")).click();

			DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
            
            //get current date time with Date()
            
            Date date = new Date();
            
          String  dd=dateFormat.format(date);
          System.out.println(dd);
          
          DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            //get current date time with Date()
            
            Date date1 = new Date();
            
          String  dd1=dateFormat1.format(date1);
          System.out.println(dd1);
          
          
			driver.findElement(By.xpath("//input[@class='text-full form-control form-text required']")).sendKeys(dd1);//mandatory unique
			driver.findElement(By.xpath("//input[@id='edit-field-donor-name-und-0-value']")).sendKeys("test21");
			//driver.findElement(By.xpath("(//select[@class='form-control form-select'])[2]")).click(By.xpath("//option[@value='A1 Pos']"));

			driver.findElement(By.xpath("//select[@id='edit-field-blood-group-und']")).click();
			driver.findElement(By.xpath("//option[@value='A1 Neg']")).click();

			/*WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edit-field-gender-und")));
			Category_Body.click();
			*/
			WebElement element = driver.findElement(By.id("edit-field-gender-und"));
			Actions action = new Actions(driver);
			action.moveToElement(element).click().perform();
			driver.findElement(By.xpath("//option[@value='Female']")).click();

			driver.findElement(By.xpath("//div[@id='edit_field_donor_occupation_und_chosen']")).click();
			driver.findElement(By.xpath("//li[@data-option-array-index='2']")).click();

			driver.findElement(By.xpath("//div[@id='edit_field_address_und_0_country_chosen']")).click();
			driver.findElement(By.xpath("//li[@data-option-array-index='102']")).click();

			driver.findElement(By.xpath("//input[@id='edit-field-address-und-0-thoroughfare']")).sendKeys("MG");
			driver.findElement(By.xpath("//input[@id='edit-field-address-und-0-premise']")).sendKeys("uma hotel");

			driver.findElement(By.xpath("//div[@id='edit_field_address_und_0_locality_chosen']")).click();
			driver.findElement(By.xpath("(//li[@data-option-array-index='44'])[2]")).click();

			driver.findElement(By.xpath("//div[@id='edit_field_address_und_0_administrative_area_chosen']")).click();
			driver.findElement(By.xpath("//li[text()='Karnataka']")).click();

			driver.findElement(By.xpath("//input[@id='edit-field-address-und-0-postal-code--2']")).sendKeys("584101");

			driver.findElement(By.xpath("//input[@id='edit-field-mobile-und-0-value']")).sendKeys("1478523690");

			driver.findElement(By.xpath("//input[@id='edit-field-email-und-0-email']")).sendKeys("adc@gmail.com");

			driver.findElement(By.xpath("//input[@id='edit-field-aadhar-pan-number-und-0-value']")).sendKeys("987654321077");

			driver.findElement(By.xpath("//select[@id='edit-field-donor-donation-location-und']")).click();
			driver.findElement(By.xpath("//option[@value='Camp']")).click();

			driver.findElement(By.xpath("//div[@id='edit_field_blood_donation_camp_und_0_nid_chosen']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//li[text()='Applied Materials 30-Mar-2019']")).click();

			driver.findElement(By.xpath("//input[@value='Yes']")).click();

			driver.findElement(By.xpath("//div[@id='edit_field_number_of_donations_und_chosen']")).click();
			driver.findElement(By.xpath("//li[text()='First Time']")).click();


			driver.findElement(By.xpath("//input[@id='edit-field-age-und-0-value']")).sendKeys("17");

			driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

			

			WebElement ele1 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--2']"));
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();", ele1);

			driver.findElement(By.xpath("//select[@id='edit-field-donor-doctor-und']")).click();
			driver.findElement(By.xpath("//option[@value='4973']")).click();


			driver.findElement(By.xpath("//input[@id='edit-field-weight-und-0-value']")).sendKeys("45");
			driver.findElement(By.xpath("//input[@id='edit-field-bp-systolic-und-0-value']")).sendKeys("110");
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
			driver.findElement(By.xpath("(//option[@value='4973'])[1]")).click();

			WebElement ele11 = driver.findElement(By.id("edit-submit"));
			JavascriptExecutor executor11 = (JavascriptExecutor)driver;
			executor11.executeScript("arguments[0].click();", ele11);
			System.out.println("Components could not be generated as the donor is not eligible\r\n" + 
					"Components are not separated for the donation record test21-age111 ");
			
			
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement a= driver.findElement(By.xpath("//input[@id='edit-field-age-und-0-value']"));
		a.sendKeys(Keys.BACK_SPACE);
		a.sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.xpath("//input[@id='edit-field-age-und-0-value']")).sendKeys("61");
		
		
		WebElement ele111 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor111 = (JavascriptExecutor)driver;
		executor111.executeScript("arguments[0].click();", ele111);
		
		
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement a1= driver.findElement(By.xpath("//input[@id='edit-field-age-und-0-value']"));
		a1.sendKeys(Keys.BACK_SPACE);
		a1.sendKeys(Keys.BACK_SPACE);
		System.out.println("The donor has improper age and is therefore ineligible");
		
		
		driver.findElement(By.xpath("//input[@id='edit-field-age-und-0-value']")).sendKeys("60");
		WebElement ele1111 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor1111 = (JavascriptExecutor)driver;
		executor111.executeScript("arguments[0].click();", ele1111);
		
	}
}
