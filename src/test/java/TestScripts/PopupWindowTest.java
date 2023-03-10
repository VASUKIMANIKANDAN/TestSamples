package TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWindowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Web Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stqatools.com/demo/Windows.php");
        String parentwin = driver.getWindowHandle(); 
        System.out.println("Parent Win Handle: "+parentwin);
        driver.findElement(By.xpath(" (//button[@class='btn btn-info'])[1]")).click();
        Set<String> tabs = driver.getWindowHandles(); 
        System.out.println("Number of windows: "+tabs.size());
        for(String tab: tabs) {

        	if(!tab.equalsIgnoreCase(parentwin)) {

        	driver.switchTo().window(tab);

        	driver.findElement(By.xpath("(//span[contains(text(), 'Java')])[1]")).click();
        	}
	}
        driver.close();
        driver.switchTo().window(parentwin);
        driver.findElement(By.xpath("(//button[@class='btn btn-info']) [2]")).click();
        driver.switchTo().newWindow (WindowType.WINDOW); 
        driver.navigate().to("http://watir.com/examples/shadow_dom.html");
        driver.quit();

}
}
