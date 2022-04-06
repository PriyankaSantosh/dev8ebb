package dev8ebb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CrossmatchWithExpiredComponent {
	static
	{
	 	String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
		}

	WebDriver driver=new ChromeDriver();
	@Test
	public void CrossmatchWithExpiredComponent() throws InterruptedException 
	{
	//public static void main(String[] args) throws InterruptedException
	//{
	//WebDriver driver=new ChromeDriver();
	driver.get("https://dev8.ebloodbanking.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
	driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
	driver.findElement(By.xpath("(//li[@class='expanded dropdown'])[3]")).click();
	driver.findElement(By.xpath("//a[@href='/BloodStockPosition']")).click();
	 WebElement test1 = driver.findElement(By.xpath("//*[@id=\"views-form-blood-stock-position-page-1-1\"]/div[2]/table/tbody/tr[1]/td[3]/a"));

		Actions action5=new Actions(driver);
		action5.moveToElement(test1).click().perform();
		System.out.println("crossmatch button should not be displayed since the component is expired");
		

	}
}