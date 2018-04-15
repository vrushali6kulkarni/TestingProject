//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;

public class vpathAxes {

	public static void main(String[] args) throws InterruptedException {
	//	System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
				
		driver.get("https://www.github.com/login");
		//Thread.sleep(2000);
		WebElement e1= driver.findElement(By.xpath(".//*[@id='login_field']"));
		e1.sendKeys("abc");
		WebElement e2= driver.findElement(By.id("password"));
	    e2.sendKeys("test123");
	    WebElement e3= driver.findElement(By.xpath(".//*[@id='login']/form/div[3]/input[3]"));
	    e3.click();
		e2= driver.findElement(By.xpath(".//*[@id='password']"));
		Thread.sleep(5000);
	    e2.sendKeys("test1234");
	    
	    e3.click();
	    
		driver.close();
	
	}
	
        

	}


