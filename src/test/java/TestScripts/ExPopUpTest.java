package TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExPopUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.seleniumeasy.com/window-popup-modal-demo.html");
        String parentWin = driver.getWindowHandle();
        System.out.println("Parent Win Handle: " + parentWin);
        driver.findElement(By.xpath("//a[text() = Follow On Twitter ']")).click();
        Set<String> tabs = driver.getWindowHandles();
        for (String tab: tabs) if(!tab.equalsIgnoreCase (parentWin))
        driver.switchTo (). window (tab);
        driver.manage().window().maximize();
        driver.close();
        driver.switchTo().window (parentWin);
        driver.findElement(By.xpath("//a[text()=' Like us on Facebook ']")).click();
        Set<String> One = driver.getWindowHandles ();
        for(String tab: One)
        if (!tab.equalsIgnoreCase (parentWin))
        {
        driver.switchTo().window (tab); driver.manage() .window().maximize();
        }

        driver.close();
        driver.switchTo().window (parentWin);
        driver.findElement(By.xpath("//a[text ()='Follow Twitter & Facebook']")).click();
        Set<String> Two = driver.getWindowHandles ();
        for(String tab: Two)
        if(!tab.equalsIgnoreCase (parentWin))
        {
        driver.switchTo().window (tab); driver.manage() .window().maximize();
        driver.close();
        }
        driver.switchTo().window (parentWin);
        driver.findElement(By.xpath("//a[text ()='Follow Twitter & Facebook']")).click(); 
       Set<String> Three = driver.getWindowHandles();
       for (String tab: Three)

		if(!tab.equalsIgnoreCase (parentWin))
        {
        driver.switchTo().window (tab);
        driver.manage() .window() .maximize();
        driver.close(); }
        driver.switchTo() .window (parentWin);
        driver.findElement(By.xpath("//a[text ()='Follow All']")).click(); 
        Set<String> four = driver.getWindowHandles ();
        for(String tab: four)
        if(!tab.equalsIgnoreCase (parentWin))
        {
        driver.switchTo () .window (tab); 
        driver.manage (). window () .maximize();
        driver.close();
        }
        Thread.sleep(3000);
        driver.quit();
        }
       

}
