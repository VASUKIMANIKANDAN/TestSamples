package TestScripts;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class SiblingDisp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/blog/");
		
		List<WebElement> preceding_siblings = driver.findElements(By.xpath("//li[@id='menu-item-31219']//preceding-sibling::li"));
		for(WebElement item:preceding_siblings) {
			System.out.println("The preceding siblings to the playwrite : "+item.getText());
		}
		List<WebElement> following_siblings = driver.findElements(By.xpath("//li[@id='menu-item-31219']//following-sibling::li"));
		for(WebElement item:following_siblings) {
			System.out.println("The following siblings to the playwrite : "+item.getText());
		}
	
	}

}
