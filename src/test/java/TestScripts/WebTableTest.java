package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class WebTableTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
       // String strSalary=driver.findElement(
        		//By.xpath("//td[contains(text(), 'Wagner')]//following-sibling::td[5]")).getText(); 
       // System.out.println("Salary of Wagner: "+ strSalary);
  

			List<WebElement> salary = driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//following-sibling::td[3]"));
			List<WebElement> name = driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//preceding-sibling::td[2]"));
			List<WebElement> office =driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]"));
			for (int j = 0; j < salary.size(); j++) {
				System.out.println(name.get(j).getText()+" is the employee salary who work in San Francisco with the salary : "+salary.get(j).getText());

	}
		}

	}

