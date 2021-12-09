package dev8ebb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class blankfields {
	static{
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
		}
WebDriver driver=new ChromeDriver();

@Test
public void BlankFields() throws Exception

{

driver.get("https://dev8.ebloodbanking.com/");
driver.manage().window().maximize();
driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
driver.findElement(By.id("edit-submit")).click();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.xpath("(//span[@class='navbar-text dropdown-toggle'])[1]")).click();
driver.findElement(By.xpath("(//a[@href='/node/add/donation_record'])[1]")).click();
driver.findElement(By.name("field_donor_registration_id[0][value]")).sendKeys("test123");
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.findElement(By.xpath("//button[@id='edit-submit']")).click();


	
		
			
			System.out.println("Registration ID field is required.\r\n" + 
					"Registration id information is not entered.\r\n" + 
					"Donor Name information is not entered.\r\n" + 
					"Donor Gender information is not entered.\r\n" + 
					"Camp Location should be provided for Blood Donation in Camps.\r\n" + 
					"Weight information is not entered.\r\n" + 
					"BP Systolic information is not entered.\r\n" + 
					"BP Diastolic information is not entered.");
	}

private WebDriver Chromedriver() {
	// TODO Auto-generated method stub
	return null;
}
}
