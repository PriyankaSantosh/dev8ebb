package dev8ebb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CrossmatchWithExpiredComponent implements IAutoConst{
	static
	{
	 	/*String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);*/
		
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		}

	WebDriver driver=new ChromeDriver();
	@Test
	public void CrossmatchWithExpiredComponent() throws InterruptedException, FileNotFoundException, IOException, EncryptedDocumentException, InvalidFormatException 
	{
	//public static void main(String[] args) throws InterruptedException
	//{
	//WebDriver driver=new ChromeDriver();
		
		
		Properties p=new Properties();
		p.load(new FileInputStream("./configs/configuration.properties"));
		//String v=p.getProperty("url");

		
		driver.get(p.getProperty("url"));
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

	
		Workbook w= WorkbookFactory.create(new FileInputStream("./configs/data.xlsx"));
		String username=w.getSheet("DemoA").getRow(0).getCell(0).getStringCellValue();
		
		Workbook w1= WorkbookFactory.create(new FileInputStream("./configs/data.xlsx"));
		String password=w.getSheet("DemoA").getRow(0).getCell(1).getStringCellValue(); 
		
	//driver.get("https://dev8.ebloodbanking.com/");
//	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	driver.findElement(By.id("edit-name")).sendKeys(username);
	driver.findElement(By.id("edit-pass")).sendKeys(password);
	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
	driver.findElement(By.xpath("(//li[@class='expanded dropdown'])[3]")).click();
	driver.findElement(By.xpath("//a[@href='/BloodStockPosition']")).click();
	 WebElement test1 = driver.findElement(By.xpath("//*[@id=\"views-form-blood-stock-position-page-1-1\"]/div[2]/table/tbody/tr[1]/td[3]/a"));

		Actions action5=new Actions(driver);
		action5.moveToElement(test1).click().perform();
		System.out.println("crossmatch button should not be displayed since the component is expired");
		

	}
}