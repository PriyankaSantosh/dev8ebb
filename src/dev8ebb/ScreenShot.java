package dev8ebb;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	 static 
	
	{
		String key="webdriver.chrome.driver";
	   String value="./driver/chromedriver.exe";
	    System.setProperty(key, value);
	}
	 
	 public static void main(String[] args) throws InterruptedException
	 {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://dev.ebloodbanking.com/");
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
			driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
			driver.findElement(By.id("edit-submit")).click();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		 TakesScreenshot t=  (TakesScreenshot) driver;
		 File scrFile =t.getScreenshotAs(OutputType.FILE);
		 String path="./photo/"+".png";
	 }

}
