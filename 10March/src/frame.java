import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		//frame
		/*driver.get("http://www.dezlearn.com/testingpage/");
		driver.switchTo().frame(0);
		WebElement e=driver.findElement(By.xpath(".//*[@id='main']/section/div/form/input"));
		e.click();
        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath(".//*[@id='panel-197-0-0-1']/div/div/p[2]/button")).click();
        */
		
        //Drag and drop
       driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
        
        Actions a1=new Actions(driver);
        
        WebElement e1=driver.findElement(By.id("draggable"));
        WebElement e2=driver.findElement(By.id("droppable"));
        
        a1.dragAndDrop(e1, e2);
        a1.build().perform();/////------ performs drag and drop method
       
        
		//mouse hover
		driver.get("https://www.goibibo.com/");
        WebElement e1=driver.findElement(By.xpath(".//*[@id='header']/div[1]/ul/li[10]/div"));
        
        Actions a1=new Actions(driver);
        a1.moveToElement(e1);
        a1.build().perform();
        Thread.sleep(2000);
        
        //Show list of elements
        List<WebElement> l= driver.findElements(By.xpath(".//*[@id='header']/div[1]/ul/li[10]/div/div/a"));
         for(int i=0;i<l.size();i++)
        	 System.out.println(l.get(i).getText());      
        
        
		
        //tooltip
		/*driver.get("https://docs.seleniumhq.org/");
        WebElement e1=driver.findElement(By.xpath(".//*[@id='menu_documentation']/a"));
        
        Actions a1=new Actions(driver);
        a1.moveToElement(e1).build().perform();
        System.out.println(e1.getAttribute("title"));//----print tooltip text
		*/
        
        
        
        
        
        
        
        
        
        
	}

}
