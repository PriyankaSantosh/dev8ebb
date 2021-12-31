package dev8ebb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegIdAsBagNumberPartial {
	static
	{
	 	String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
		}


	public static void main(String[] args) throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://dev8.ebloodbanking.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
	driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
	driver.findElement(By.xpath("//a[@href='/user/9']")).click();
	driver.findElement(By.xpath("(//a[@href='/node/1'])[1]")).click();
	driver.findElement(By.xpath("//a[@href='/node/1/edit']")).click();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@href='#edit-group-miscellaneous']")).click();
	

	WebElement checking = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-allow-partial-donor-entry']"));
	if (checking.isSelected()) {
		
		
			
		WebElement ele21 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
		executor2111.executeScript("arguments[0].click();", ele21);


 } else {
	 WebElement check1 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-allow-partial-donor-entry']"));
	 JavascriptExecutor executor211 = (JavascriptExecutor)driver;
		executor211.executeScript("arguments[0].click();", check1);
	 
          WebElement ele21 = driver.findElement(By.id("edit-submit"));
			JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
			executor2111.executeScript("arguments[0].click();", ele21);
          
 }
	WebDriverWait wait=new WebDriverWait(driver,90);
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='expanded dropdown first']")));
	driver.findElement(By.xpath("//li[@class='expanded dropdown first']")).click();
	
	driver.findElement(By.xpath("(//a[@href='/node/add/donation_record'])[1]")).click();
	driver.findElement(By.xpath("//select[@id='edit-field-donor-entry-type']")).click();
	driver.findElement(By.xpath("//option[@value='Partial']")).click();
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


	/*JavascriptExecutor jse = ((JavascriptExecutor) driver); 
	jse.executeScript("document.getElementById('edit-field-donor-registration-id-0-value').value='test'");

	JavascriptExecutor jse1=((JavascriptExecutor)driver);
	jse1.executeScript("document.getElementById('edit-field-donor-name-0-value').value='test11'");*/

			
			WebElement element = driver.findElement(By.id("edit-field-donor-registration-id-0-value"));
			Actions action = new Actions(driver);
			action.moveToElement(element).click().perform();
			driver.findElement(By.id("edit-field-donor-registration-id-0-value")).sendKeys(dd1 + dd2);


			 WebElement element1 = driver.findElement(By.id("edit-field-donor-name-0-value"));
			 Actions actions= new Actions(driver);
			 action.moveToElement(element1).click().perform();
				driver.findElement(By.id("edit-field-donor-name-0-value")).sendKeys(dd1 + dd2);
				
				


	/*WebDriverWait wait1=new WebDriverWait(driver,90);
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='edit_field_blood_group_chosen']")));
	driver.findElement(By.xpath("//div[@id='edit_field_blood_group_chosen']")).click();
	driver.findElement(By.xpath("//li[text()='A1 Neg']")).click();
*/

	driver.findElement(By.xpath("//select[@id='edit-field-gender']")).click();
	driver.findElement(By.xpath("//option[@value='Female']")).click();
	
	driver.findElement(By.xpath("//input[@id='edit-field-blood-donation-camp-0-target-id']")).sendKeys("tes");
WebElement a1 = driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]/span/span"));
Actions a2=new Actions(driver);
a2.moveToElement(a1).click().perform();
//driver.findElement(By.xpath("//*[@id=\\\"ui-id-6\\\"]/span/span")).click();



	 WebElement aa = driver.findElement(By.xpath("//div[@id='edit_field_number_of_donations_chosen']"));

	Actions action11=new Actions(driver);
	action11.moveToElement(aa).click().perform();

	WebElement check1 = driver.findElement(By.xpath("//li[text()='First Time']"));
	JavascriptExecutor executor211 = (JavascriptExecutor)driver;
		executor211.executeScript("arguments[0].click();", check1);

//.findElement(By.xpath("//input[@id='edit-field-age-0-value']")).sendKeys("18");
	//driver.findElement(By.xpath("//a[@href='#edit-group-medical-examination']")).click();
	driver.findElement(By.xpath("//a[@href='#edit-group-blood-collection-details']")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-0-value-date']")).sendKeys(dd1);


	
	
	driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-0-value-time']")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-0-value-time']")).sendKeys(dd2);
	driver.findElement(By.xpath("//input[@id='edit-field-bag-no-0-value']")).sendKeys("test1356");
	driver.findElement(By.xpath("//input[@id='edit-field-batch-no-0-value']")).sendKeys("test12365");
	driver.findElement(By.xpath("//input[@id='edit-field-donor-segment-number-0-value']")).sendKeys(dd1 + dd2);
	driver.findElement(By.xpath("//select[@id='edit-field-type-of-bag']")).click();
	driver.findElement(By.xpath("//option[text()='350 ml Double CPDA']")).click();
	driver.findElement(By.xpath("//div[@id='edit_field_er_technician_chosen']")).click();
	driver.findElement(By.xpath("//li[text()='PriyankaGK']")).click();
	
	driver.findElement(By.xpath("(//button[@data-drupal-selector='edit-submit'])[3]")).click();
}
}