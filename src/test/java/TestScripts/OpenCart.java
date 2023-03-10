package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/");
        WebElement menu=driver.findElement(By.xpath("//span[contains(text(), 'My Account')}"));

        WebElement submenu =driver.findElement(By.xpath("//ul//a[contains(text(), 'Register')]"));
        actions.moveToElement (menu) .perform();
        actions.click();
        actions.click (submenu).perform(); 
        driver.findElement(By.xpath("//input [@name='firstname']")).sendKeys ("vasuki");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("manikandan");
        driver.findElement(By.xpath("//input [@name='email']")).sendKeys("vasuki.manikandan@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vasuki");
        driver.findElement(By.xpath("//div[@class='form-check form-check-inline']")).sendKeys("1");
        driver.findElement(By.id("input-newsletter-yes")).click();
       // driver.findElement(By.xpath("//label [contains(text(), 'Yes')]")).sendKeys("checked"); 
        //driver.findElement(By.xpath("//input[@name='agree']")).sendKeys("checked");
      //  driver.findElement(By.cssSelector(".btn.btn-primary")).click();

	}

}
