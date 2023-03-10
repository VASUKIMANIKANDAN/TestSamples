package TestScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		System.out.println("Alert msg "+txt);
		alert.accept();
		
		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]")).click();
		Alert confirm = driver.switchTo().alert();
		String text = confirm.getText();
		System.out.println("Confirm msg "+text);
		confirm.dismiss();
		
		driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]")).click();
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(2000);
		prompt.sendKeys("No name");
		String text1 = prompt.getText();
		System.out.println("Prompt msg "+text1);
		prompt.accept();		
	}

	}


