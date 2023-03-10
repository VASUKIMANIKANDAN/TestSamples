package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
       // Actions actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/");
        WebElement menu = driver.findElement(By.xpath("//li/a[contains(text(), 'Components')]")); 
        WebElement submenu = driver.findElement(By.xpath("//a[contains(text(), 'Monitors')]"));
        actions.moveToElement (menu).click(submenu).build().perform();
        actions.moveToElement (menu).perform();
        actions.click(submenu).perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Hi')");
        String strTitle= (String)js.executeScript ("return document.title"); System.out.println(strTitle);
        js.executeScript("window.scrollBy(0, document.b .body-scrollHeight);");
        js.executeScript ("history.go(-1)");
        WebElement box = (WebElement)js.executeScript("return document.getElementsByName('search')[0]");
	}

	
}
