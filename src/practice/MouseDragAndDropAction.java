package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDropAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			
		   WebDriver driver=new ChromeDriver();
		 
		   driver.manage().window().maximize();
		   driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		   
		   //rome=italy
	WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
	WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
	
			//madrid=spain
	WebElement madrid=driver.findElement(By.xpath("//div[@id='box7']"));
	WebElement spain=driver.findElement(By.xpath("//div[@id='box107']"));
	
	//seoul=south korea
	WebElement seoul=driver.findElement(By.xpath("//div[@id='box5']"));
	WebElement southkorea=driver.findElement(By.xpath("//div[@id='box105']"));
	
	
//oslo=norway
	
	WebElement oslo=driver.findElement(By.xpath("//div[@id='box1']"));
	
	WebElement norway=driver.findElement(By.xpath("//div[text()='Norway']"));         
//stockholm=sweden
	
	 WebElement stockholm=driver.findElement(By.xpath("//div[@id='box2']"));
	 WebElement sweden=driver.findElement(By.xpath("//div[@id='box101']"));  
	 
	 //washington=usa
	 WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
	 WebElement usa=driver.findElement(By.xpath("//div[text()='United States']"));
	 
	 
	 //copenhagen=denmark
	 WebElement copenhagen=driver.findElement(By.xpath("//div[@id='box4']"));
	 WebElement denmark=driver.findElement(By.xpath("//div[text()='Denmark']"));
	 
	 
	Actions act=new Actions(driver);
	
act.dragAndDrop(rome, italy).dragAndDrop(seoul, southkorea).dragAndDrop(madrid, spain).dragAndDrop(copenhagen, denmark).dragAndDrop(washington, usa).dragAndDrop(stockholm,sweden).dragAndDrop(oslo,norway).perform();
		   
		   
	}

}
