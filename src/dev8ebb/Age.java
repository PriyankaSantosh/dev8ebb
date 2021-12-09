package dev8ebb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Age
{
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

WebDriverWait wait=new WebDriverWait(driver,20);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='expanded dropdown first']")));
driver.findElement(By.xpath("//li[@class='expanded dropdown first']")).click();
driver.findElement(By.xpath("(//a[@href='/node/add/donation_record'])[1]")).click();


JavascriptExecutor jse = ((JavascriptExecutor) driver); 
jse.executeScript("document.getElementById('edit-field-donor-registration-id-0-value').value='test'");

JavascriptExecutor jse1=((JavascriptExecutor)driver);
jse1.executeScript("document.getElementById('edit-field-donor-name-0-value').value='test1'");


WebDriverWait wait1=new WebDriverWait(driver,20);
wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='edit_field_blood_group_chosen']")));
driver.findElement(By.xpath("//div[@id='edit_field_blood_group_chosen']")).click();
driver.findElement(By.xpath("//li[text()='A1 Neg']")).click();

 WebElement aa = driver.findElement(By.xpath("//div[@id='edit_field_number_of_donations_chosen']"));

Actions action=new Actions(driver);
action.moveToElement(aa).click().perform();

WebElement check1 = driver.findElement(By.xpath("//li[text()='First Time']"));
JavascriptExecutor executor211 = (JavascriptExecutor)driver;
	executor211.executeScript("arguments[0].click();", check1);

driver.findElement(By.xpath("//input[@id='edit-field-age-0-value']")).sendKeys("18");
driver.findElement(By.xpath("//a[@href='#edit-group-medical-examination']")).click();




}
}
