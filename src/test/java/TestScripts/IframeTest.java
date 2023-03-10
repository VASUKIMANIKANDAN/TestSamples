package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver"); 
        String strlbl = driver.findElement(By.cssSelector("label span")).getText();
        System.out.println("Label in Main page:" + strlbl);
        
        // Mainpage to Frame 1
        
        driver.switchTo().frame("frame1");
        driver.findElement(By.xpath("//input")).sendKeys("Hello");
        
         //Frame 1 to Frame 3
        
        driver.switchTo().frame("frame3");
        driver.findElement(By.id("a")).click();

        //Frame3 to Frame 1

        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//input")).clear();
        driver.findElement(By.xpath("//input")).sendKeys("Hello welcome");
        
        //Frame 1 to mainpage
        driver.switchTo().defaultContent();
        
        // mainpage to Frame 2
        driver.switchTo().frame("frame2");
        Select Sel = new Select (driver.findElement(By.id("animals")));
        Sel.selectByValue("Avatar");
		System.out.println(Sel.getFirstSelectedOption().getText());

        
        
     

	}

}
