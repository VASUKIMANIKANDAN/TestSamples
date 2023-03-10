package TestScripts;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
	    driver.get("http://the-internet.herokuapp.com/login"); 
	    
	    //driver.findElement(By.id("username")).sendKeys("tomsmith");
	    
	    driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");

		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

		driver.findElement(By.className("radius")).click();
		
		//driver.findElement(By.cssSelector("radius")).click();
		
		boolean isDisp = driver.findElement(By.cssSelector(".flash.success")).isDisplayed();

		if(isDisp) {

        String strMsg = driver.findElement(By.cssSelector(".flash.success")).getText(); 
        
        System.out.println(strMsg);

		}

	}

}
