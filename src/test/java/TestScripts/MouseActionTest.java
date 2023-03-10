package TestScripts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://demo.opencart.com/");
        TakesScreenshot screen = (TakesScreenshot) driver; 
        //File scr = screen.getScreenshotAs(OutputType.FILE); 
        //FileUtils.copyFile(scr, new File("D:\\Screenshot\\FullScreen.png"));
        
        

        WebElement menu = driver.findElement(By.xpath("//li/a[contains(text(), 'Components')]")); 
        WebElement submenu = driver.findElement(By.xpath("//a[contains(text(), 'Monitors ')]")); 
       // actions.moveToElement(menu).click(submenu).build().perform();

        actions.moveToElement(menu).perform();

        actions.click(submenu).perform();
        
        driver.findElement(By.partialLinkText("Apple Cinema")).click();

        WebElement searchbox = driver.findElement(By.name("search")); 
        File scrBox = screen.getScreenshotAs(OutputType.FILE); 
        FileUtils.copyFile(scrBox, new File("D:\\Screenshot\\ElementScreen.png"));
        
        
        actions.contextClick(searchbox). perform();

        Thread.sleep(30);

        actions.scrollByAmount(10, 500).perform();

	}

}
