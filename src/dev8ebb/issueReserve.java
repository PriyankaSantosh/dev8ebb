package dev8ebb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

public class issueReserve {
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
	
	
	WebDriverWait wait=new WebDriverWait(driver,90);
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
	driver.findElement(By.xpath("//div[@id='edit_field_abo_chosen']")).click();
	driver.findElement(By.xpath("//li[text()='A1']")).click();
	driver.findElement(By.xpath("//select[@id='edit-field-rh']")).click();
	driver.findElement(By.xpath("//option[@value='Neg']")).click();
	

	driver.findElement(By.xpath("//button[@value='Save']")).click();
	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

driver.findElement(By.xpath("//a[@href='/user/9']")).click();
driver.findElement(By.xpath("//a[@href='/user/9']")).click();


	WebElement ele5 = driver.findElement(By.xpath("(//a[text()='First Centre'])[1]"));
	Actions action5=new Actions(driver);
	action5.moveToElement(ele5).click().perform();
	
	
	driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
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
		
		
		
		WebElement ele219 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor21119 = (JavascriptExecutor)driver;
		executor21119.executeScript("arguments[0].click();", ele219);


 }
	else {
	 WebElement check3 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-mandatory-blood-group-verification']"));
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
	
	 WebElement checking4 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-mandatory-serology-verification']"));
	if (checking4.isSelected()) {
		
		
		
		WebElement ele219 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor21119 = (JavascriptExecutor)driver;
		executor21119.executeScript("arguments[0].click();", ele219);


 }
	else {
	 WebElement check3 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-mandatory-serology-verification']"));
	 JavascriptExecutor exe2 = (JavascriptExecutor)driver;
		exe2.executeScript("arguments[0].click();", check3);
	 
          WebElement ele3= driver.findElement(By.id("edit-submit"));
			JavascriptExecutor execute = (JavascriptExecutor)driver;
			execute.executeScript("arguments[0].click();", ele3);
          
 }
	
		
	
	WebDriverWait wait88=new WebDriverWait(driver,90);
	wait88.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='expanded dropdown first']")));
	driver.findElement(By.xpath("//li[@class='expanded dropdown first']")).click();
	driver.findElement(By.xpath("(//a[@href='/node/add/donation_record'])[1]")).click();

	DateFormat dateFormat12 = new SimpleDateFormat("dd-MM-yyy");

	//get current date time with Date()

	Date date12 = new Date();

	String  apple=dateFormat12.format(date12);
	System.out.println(apple);
	
	DateFormat dateFormat21 = new SimpleDateFormat("HH-mm");

	//get current date time with Date()

	Date date22 = new Date();

	String  bat=dateFormat21.format(date22);
	System.out.println(bat);


	/*JavascriptExecutor jse = ((JavascriptExecutor) driver); 
	jse.executeScript("document.getElementById('edit-field-donor-registration-id-0-value').value='test'");

	JavascriptExecutor jse1=((JavascriptExecutor)driver);
	jse1.executeScript("document.getElementById('edit-field-donor-name-0-value').value='test11'");*/

			
			WebElement element11 = driver.findElement(By.id("edit-field-donor-registration-id-0-value"));
			Actions action11 = new Actions(driver);
			action11.moveToElement(element11).click().perform();
			driver.findElement(By.id("edit-field-donor-registration-id-0-value")).sendKeys(apple + bat);


			 WebElement element27 = driver.findElement(By.id("edit-field-donor-name-0-value"));
			 Actions action27= new Actions(driver);
			 action27.moveToElement(element27).click().perform();
				driver.findElement(By.id("edit-field-donor-name-0-value")).sendKeys(apple + bat);
				
				


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

	Actions action112=new Actions(driver);
	action112.moveToElement(aa).click().perform();

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
	driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-0-value-date']")).sendKeys(apple);

	

	driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-0-value-time']")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-0-value-time']")).sendKeys(bat);
	driver.findElement(By.xpath("//input[@id='edit-field-bag-no-0-value']")).sendKeys("test1356");
	driver.findElement(By.xpath("//input[@id='edit-field-batch-no-0-value']")).sendKeys("test12365");
	driver.findElement(By.xpath("//input[@id='edit-field-donor-segment-number-0-value']")).sendKeys(apple + bat);
	driver.findElement(By.xpath("//select[@id='edit-field-type-of-bag']")).click();
	driver.findElement(By.xpath("//option[text()='350 ml Double CPDA']")).click();
	driver.findElement(By.xpath("//div[@id='edit_field_er_technician_chosen']")).click();
	driver.findElement(By.xpath("//li[text()='PriyankaGK']")).click();
	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
	
	//driver.findElement(By.xpath("//*[@id=\"block-createcontentfooterlinksblock\"]/div[2]/a")).click();

	//driver.findElement(By.xpath("//button[@id='edit-submit']")).click();   //create components 

	/*driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	
	WebElement qq = driver.findElement(By.xpath("//a[text()='Verify Blood Group']"));
	JavascriptExecutor tt = (JavascriptExecutor)driver;
	tt.executeScript("arguments[0].click();", qq);                                  //verify Blood group
	*/
	
	
	

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


	driver.findElement(By.xpath("//div[@id='edit_field_tests_technician_chosen']")).click();
	driver.findElement(By.xpath("//li[text()='PriyankaGK']")).click();


	WebElement ele11111 = driver.findElement(By.id("edit-submit"));
	JavascriptExecutor executor11111 = (JavascriptExecutor)driver;
	executor11111.executeScript("arguments[0].click();", ele11111);
	
	/*driver.findElement(By.xpath("//div[@class='field-item even']/a")).click();
	*/
	driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

	
	WebElement app = driver.findElement(By.xpath("//a[text()='Verify Serology']"));
	JavascriptExecutor ee = (JavascriptExecutor)driver;
	ee.executeScript("arguments[0].click();", app);
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div[2]/article/div[2]/div[1]/div[2]/a")).click();
	
	
	driver.findElement(By.xpath("//*[@id=\"block-createcontentfooterlinksblock\"]/div[2]/a")).click();

		driver.findElement(By.xpath("//button[@id='edit-submit']")).click();   //create components 

	
driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
	
	WebElement qq = driver.findElement(By.xpath("//a[text()='Verify Blood Group']"));
	JavascriptExecutor tt = (JavascriptExecutor)driver;
	tt.executeScript("arguments[0].click();", qq);  //verify Blood group
	
	driver.findElement(By.xpath("(//a[text()='view'])[1]")).click();
	driver.findElement(By.xpath("(//a[contains(@href,'edit')])[1]")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-quantity-0-value']")).sendKeys("500");
	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();  
	driver.findElement(By.xpath("//a[text()='Create Crossmatch Report']")).click();
	driver.findElement(By.xpath("//div[@id='edit_field_crossmatch_patient_chosen']")).click();
	driver.findElement(By.xpath("(//input[@class='chosen-search-input'])[1]")).sendKeys(dd1 + dd2);
	driver.findElement(By.xpath("//li[@data-option-array-index='1']")).click();
	driver.findElement(By.xpath("//div[@id='edit_field_compatibility_chosen']")).click();
	driver.findElement(By.xpath("//li[text()='Yes']")).click();
	
driver.findElement(By.xpath("//button[@id='edit-submit']")).click();


driver.findElement(By.xpath("//a[text()='Issue/Reserve']")).click();
//driver.findElement(By.xpath("//div[@id='edit_patient_id_chosen']")).click();

//driver.findElement(By.xpath("(//input[@class='chosen-search-input'])[1]")).sendKeys(dd1 + dd2);
//driver.findElement(By.xpath("//*[@id=\"edit_patient_id_chosen\"]/div/ul/li[1]")).click();
driver.findElement(By.xpath("//button[@value='Process']")).click();


driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS );

driver.findElement(By.xpath("//*[@id=\"block-views-block-component-crossmatch-block-1\"]/div[2]/div/div[2]/table/tbody/tr/td[4]/a")).click();
driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS );
driver.findElement(By.xpath("//a[contains(@href,'/node/add/patient_bill?field_patient_bill_patient')]")).click();


ArrayList tabs = new ArrayList (driver.getWindowHandles());
System.out.println(tabs.size());
driver.switchTo().window((String) tabs.get(1));

driver.findElement(By.xpath("//input[@id='edit-field-bill-receipt-number-text-0-value']")).sendKeys("test123456");


driver.findElement(By.xpath("(//button[@data-drupal-selector='edit-submit'])[2]")).click();
driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div[2]/article/div[2]/div[3]/div[2]/a")).click();
driver.findElement(By.xpath("//a[text()='Close Patient Request']")).click();
driver.findElement(By.xpath("(//button[@data-drupal-selector='edit-submit'])[2]")).click();
	}
}
