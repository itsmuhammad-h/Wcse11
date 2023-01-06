package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataUsingExcelpractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

	//	-------------> rows
	//	|
	//  |
	//	| 
	//	columns
		
		FileInputStream fis=new FileInputStream("./Book1.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
	String url=	wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
	String username=wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
	String password=wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
	

	
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get(url);
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(password); 
	
	
	
	   
	 //instagram exmple 
	
	String url1=wb.getSheet("sheet1").getRow(2).getCell(0).getStringCellValue();
	 String user=wb.getSheet("sheet1").getRow(2).getCell(1).getStringCellValue();
	 String pass=wb.getSheet("sheet1").getRow(2).getCell(2).getStringCellValue();
	 
	 driver.switchTo().newWindow(WindowType.TAB);
	 driver.get(url1);
	 driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys(user);
	 driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(pass);              
	
	 Thread.sleep(3000);
	driver.close();
	
	}

}
