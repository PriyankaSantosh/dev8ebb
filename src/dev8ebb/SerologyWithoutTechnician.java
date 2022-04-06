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
import org.testng.annotations.Test;

public class SerologyWithoutTechnician {
	static
	{
	 	String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
		}


	WebDriver driver=new ChromeDriver();
	@Test
	public void SerologyWithoutTechnician() throws InterruptedException 
	{
	
	
	//public static void main(String[] args) throws InterruptedException
	//{
	//WebDriver driver=new ChromeDriver();
	driver.get("https://dev8.ebloodbanking.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
	driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();

	
	driver.findElement(By.xpath("//a[@href='/user/9']")).click();
	
	driver.findElement(By.xpath("(//a[@href='/node/1'])[1]")).click();
	
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	
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
	 WebElement checking2 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-blood-group-non-mandatory-in-donation-record']"));
	if (checking2.isSelected()) {
		
		
		
		WebElement ele213 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor21115 = (JavascriptExecutor)driver;
		executor21115.executeScript("arguments[0].click();", ele213);


 }
	else {
	 WebElement check3 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-blood-group-non-mandatory-in-donation-record']"));
	 JavascriptExecutor exe2 = (JavascriptExecutor)driver;
		exe2.executeScript("arguments[0].click();", check3);
	 
          WebElement ele3= driver.findElement(By.id("edit-submit"));
			JavascriptExecutor execute = (JavascriptExecutor)driver;
			execute.executeScript("arguments[0].click();", ele3);
          
 }
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@href='/node/1/edit']")).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//a[@href='#edit-group-miscellaneous']")).click();
	
	 WebElement checking3 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-mandatory-blood-group-verification']"));
	if (checking3.isSelected()) {
		
		WebElement check3 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-mandatory-blood-group-verification']"));
		 JavascriptExecutor exe2 = (JavascriptExecutor)driver;
			exe2.executeScript("arguments[0].click();", check3);
		
		
		
		WebElement ele219 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor21119 = (JavascriptExecutor)driver;
		executor21119.executeScript("arguments[0].click();", ele219);


 }
	else {
	 
	 
          WebElement ele3= driver.findElement(By.id("edit-submit"));
			JavascriptExecutor execute = (JavascriptExecutor)driver;
			execute.executeScript("arguments[0].click();", ele3);
          
 }
	
	
		
	
	WebDriverWait wait88=new WebDriverWait(driver,90);
	wait88.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='expanded dropdown first']")));
	driver.findElement(By.xpath("//li[@class='expanded dropdown first']")).click();
	driver.findElement(By.xpath("(//a[@href='/node/add/donation_record'])[1]")).click();

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

			
			WebElement element1 = driver.findElement(By.id("edit-field-donor-registration-id-0-value"));
			Actions action1 = new Actions(driver);
			action1.moveToElement(element1).click().perform();
			driver.findElement(By.id("edit-field-donor-registration-id-0-value")).sendKeys(dd1 + dd2);


			 WebElement element2 = driver.findElement(By.id("edit-field-donor-name-0-value"));
			 Actions action2= new Actions(driver);
			 action2.moveToElement(element2).click().perform();
				driver.findElement(By.id("edit-field-donor-name-0-value")).sendKeys(dd1 + dd2);
				
				


	WebDriverWait wait2=new WebDriverWait(driver,90);
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='edit_field_blood_group_chosen']")));
	driver.findElement(By.xpath("//div[@id='edit_field_blood_group_chosen']")).click();
	driver.findElement(By.xpath("//li[text()='A1 Neg']")).click();


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

	driver.findElement(By.xpath("//input[@id='edit-field-age-0-value']")).sendKeys("18");
	driver.findElement(By.xpath("//a[@href='#edit-group-medical-examination']")).click();
	


	driver.findElement(By.xpath("//input[@id='edit-field-weight-0-value']")).sendKeys("45");
	driver.findElement(By.xpath("//input[@id='edit-field-bp-systolic-0-value']")).sendKeys("110");
	driver.findElement(By.xpath("//input[@id='edit-field-bp-diastolic-0-value']")).sendKeys("65");
	driver.findElement(By.xpath("//select[@id='edit-field-hemoglobin-test']")).click();
	driver.findElement(By.xpath("//option[@value='More than 12.5']")).click();



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
	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
	
	driver.findElement(By.xpath("//*[@id=\"block-createcontentfooterlinksblock\"]/div[2]/a")).click();

	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();   //create components 

	driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	
	/*WebElement qq = driver.findElement(By.xpath("//a[text()='Verify Blood Group']"));
	JavascriptExecutor tt = (JavascriptExecutor)driver;
	tt.executeScript("arguments[0].click();", qq);     */                             //verify Blood group
	
	
	
	

	try {
		WebElement elem12 = driver.findElement(By.xpath("//a[text()=' Add New Serology Tests']"));
		JavascriptExecutor exec211 = (JavascriptExecutor)driver;
		exec211.executeScript("arguments[0].click();", elem12);

	}
	catch(org.openqa.selenium.StaleElementReferenceException ex)
	{
	            WebElement ele23 = driver.findElement(By.xpath("//a[text()=' Add New Serology Tests']"));
	        	JavascriptExecutor executor23 = (JavascriptExecutor)driver;
	        	executor23.executeScript("arguments[0].click();", ele23);
	}
	
	driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


	//driver.findElement(By.xpath("//div[@id='edit_field_tests_technician_chosen']")).click();
//	driver.findElement(By.xpath("//li[text()='PriyankaGK']")).click();


	WebElement ele11111 = driver.findElement(By.id("edit-submit"));
	JavascriptExecutor executor11111 = (JavascriptExecutor)driver;
	executor11111.executeScript("arguments[0].click();", ele11111);
	
	/*driver.findElement(By.xpath("//div[@class='field-item even']/a")).click();
	*/
	
	
	
	
	System.out.println("please enter the name of the technician");
	
	
	
	//driver.findElement(By.xpath("//*[@id=\"block-createcontentfooterlinksblock\"]/div[2]/a")).click();

}
}