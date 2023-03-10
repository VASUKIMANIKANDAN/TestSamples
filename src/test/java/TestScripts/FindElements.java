package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationbookstore.dev/");
       // List<WebElement> items= driver.findElements (By.xpath("//h2[starts-with(@id, 'pid')]")); 
        List<WebElement> items= driver.findElements (By.xpath("//li/descendant::p[@class='ui-li-aside']")); 

        for (WebElement item: items) {
        	System.out.println("Book Name is "+item.getText());
        	System.out.println("Id of the book is :"+item.getAttribute("id"));
        	//if(item.getText().equalsIgnoreCase("Agile Testing"))
        	//{
        		//item.click();
        	//}
        }
	}

}
