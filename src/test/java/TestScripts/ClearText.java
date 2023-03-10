package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationbookstore.dev");
        driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys("");
        boolean isDisp=driver.findElement(By.xpath("//a[contains(text(), 'Clear text')]")).isDisplayed ();
        if (isDisp) {
        driver.findElement(By.xpath("//a[contains(text (), 'Clear text')]")).click();
        System.out.println("text cleared"); }
        else
        	System.out.println("text button is hidden");

	}

}
