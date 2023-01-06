package pom;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram {
	
	//declaration
	
	@FindBy(name="username") private WebElement usernametb;
	
	@FindBy(name="password") private WebElement passwordtb;
	
	@FindBy(xpath="//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '][1]")private WebElement loginbtn;
	
	
	
	//initialization
    
	public Instagram(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public void username(String name)
	{
		usernametb.sendKeys(name);
	}
	
	public void password(String pass)
	{
		passwordtb.sendKeys(pass);
	}
	
	public void login()
	{
		loginbtn.click();
	}
	
	
	

}
