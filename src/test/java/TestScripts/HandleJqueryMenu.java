package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleJqueryMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu");
		WebElement btn = driver.findElement(By.xpath("//a[text()='Disabled']"));
		WebElement btn1 = driver.findElement(By.xpath("//a[text()='Enabled']"));
		actions.moveToElement(btn1).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Downloads = driver.findElement(By.xpath("//a[text()='Downloads']"));
		Downloads.click();
		driver.findElement(By.xpath("//a[text()='PDF']")).click();
	}



	}


