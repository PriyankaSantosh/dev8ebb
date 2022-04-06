package dev8ebb;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	 static 
	
	{
		String key="webdriver.chrome.driver";
	   String value="./driver/chromedriver.exe";
	    System.setProperty(key, value);
	}
	 
	 WebDriver driver=new ChromeDriver();
		@Test
		public void ScreenShot() throws InterruptedException, IOException 
		{
	 
	 
	// public static void main(String[] args) throws InterruptedException, IOException
	 //{
		// WebDriver driver=new ChromeDriver();
		 driver.get("https://dev.ebloodbanking.com/");
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
			driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
			driver.findElement(By.id("edit-submit")).click();

		 TakesScreenshot t=  (TakesScreenshot) driver;
		 File scrFile =t.getScreenshotAs(OutputType.FILE);
		 String path="./photo/Screenshot(2).png";
		 File desFile= new File(path);
		 FileUtils.copyFile(scrFile, desFile);
		 driver.close();
		 

	 }

}
