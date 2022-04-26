package dev8ebb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot implements IAutoConst {
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
		public void ScreenShot() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException 
		{
	 
	 
	// public static void main(String[] args) throws InterruptedException, IOException
	 //{
		// WebDriver driver=new ChromeDriver();
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
			
			
		// driver.get("https://dev.ebloodbanking.com/");
		 //driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("edit-name")).sendKeys(username);
			driver.findElement(By.id("edit-pass")).sendKeys(password);
			driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
		 TakesScreenshot t=  (TakesScreenshot) driver;
		 File scrFile =t.getScreenshotAs(OutputType.FILE);
		 String path="./photo/Screenshot(2).png";
		 File desFile= new File(path);
		 FileUtils.copyFile(scrFile, desFile);
		 driver.close();
		 

	 }

}
