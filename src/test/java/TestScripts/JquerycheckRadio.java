package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JquerycheckRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/checkboxradio/");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("(//span[@class='ui-checkboxradio-icon ui-corner-all ui-icon ui-icon-background ui-icon-blank'])[3]")).click();
     	actions.sendKeys(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("(//label/span)[7]")).click();
		//driver.findElement(By.xpath("//label/span)[12]")).click();
	    //driver.findElement(By.xpath("(//label/span)[7]")).click();
		driver.findElement(By.xpath("(//label/span)[15]")).click();
		driver.findElement(By.xpath("(//label/span)[17]")).click();
	}


	}

