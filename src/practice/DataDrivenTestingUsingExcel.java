package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTestingUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
   
   FileInputStream fis=new FileInputStream("./Book1.xlsx");
   Workbook wb=WorkbookFactory.create(fis);
   String url=	wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		
   String username=wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
   String password=wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
   
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get(url); //here we gave facebook url in sheet and we are accessing here
   driver.findElement(By.id("email")).sendKeys(username); //accessing username we gave in excel sheet
   driver.findElement(By.id("pass")).sendKeys(password); //accessing password we gave in excel sheet 
   
   
   
		
		
		
		
		
		
		
		
		
		
	}

}
