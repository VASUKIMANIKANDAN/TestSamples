package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class JqueryDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("http://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
        Select country = new Select (driver.findElement(By.id("country")));
        country.selectByValue ("Bangladesh");
        Select mul=new Select (driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']")));
        mul.selectByValue ("AL");
        mul.selectByValue ("AK");
        mul.selectByValue ("AZ");
        mul.selectByValue ("AR");
        Select Disable = new Select (driver.findElement(By.xpath("//select[@class='js-example-disabled-results select2-hidden-accessible]")));
        Disable.selectByValue ("MP");

        Select category = new Select (driver.findElement(By.xpath("//select[@id='files']")));
        category.selectByValue ("somefile");

	}

}
