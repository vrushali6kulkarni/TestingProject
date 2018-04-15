import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		/*driver.get("file:///C:/Users/etil/Downloads/HTMLTag.html");
		driver.findElement(By.xpath(".//input[@id='txtUserName']")).sendKeys("vrushali");
		driver.findElement(By.xpath(".//input[@id='txtPassowrd']")).sendKeys("abcde");
		driver.findElement(By.xpath(".//a[contains(text(),'Forgot Password')]")).click();
		//driver.findElement(By.partialLinkText("demoaut")).click();
		
		Select s=new Select(driver.findElement(By.xpath(".//*[@id='selCity']")));
		s.selectByVisibleText("Ahmedabad");
		s.selectByValue("PUNE");
		
		Select s1=new Select(driver.findElement(By.xpath(".//select[@id='Select1']")));
		s1.selectByIndex(0);
		s1.deselectByIndex(0);
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		
		List <WebElement> e=s1.getOptions();
		for(WebElement f : e)
		{
			System.out.println(f.getText());
		}
		
		WebElement e1= driver.findElement(By.xpath(".//form[@id='myRegistractionForm']/input[5]"));
		
		if(e1.isSelected())
			System.out.println(e1.getText()+" is already selected");
		else
		{
			e1.click(); 
		    System.out.println(e1.getText()+" is now selected");
		}*/  
		
		
		driver.get("file:///C:/Users/etil/Downloads/OpenWindow.html");
/*		
		//Child window handler
		driver.findElement(By.id("btnConfirm")).click();
		
		String parentwin= driver.getWindowHandle();
		Set<String> childwin= driver.getWindowHandles();
		
		for(String win: childwin)
       {
			if(!win.equals(parentwin))
			{
				driver.switchTo().window(win);
	            driver.findElement(By.name("firstName")).sendKeys("selenium");
			    Thread.sleep(5000);
       }				
			driver.switchTo().window(parentwin);

	}
	*/		
		
	//Alert and Prompt box.
		
		/*driver.findElement(By.id("btnAlert")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();*/

		
		driver.findElement(By.id("btnPrompt")).click();
		Alert a1= driver.switchTo().alert();
		a1.sendKeys("test");
		a1.accept();
		
		
		
		
		
   
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
