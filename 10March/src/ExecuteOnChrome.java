import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ExecuteOnChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	    driver.manage().window().maximize();
		
        WebElement e1=driver.findElement(By.xpath(".//*[@id='header']/div[1]/ul/li[10]/div"));
        
        Actions a1=new Actions(driver);
        a1.moveToElement(e1);
        a1.build().perform();
        try {
			Thread.sleep(5000);
		} 
        catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       // driver.close();
        System.out.println("test exception");

	}

}
