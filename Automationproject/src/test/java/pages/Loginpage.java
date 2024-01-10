package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement Login;
	
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement Password;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement Loginbutton;
	
	public  Loginpage  (WebDriver driver)
	  {
	    this.driver=driver;
	    PageFactory.initElements(driver,this);
	  }
	    
	    public void Login()
	    {
	    	String email="vichuanuu123i@gmail.com";
			 String password="vichu@123";
			 
			 Login.click();
			 Email.sendKeys(email);
			 Password.sendKeys(password);
			 Loginbutton.click();
			 
	    }
	  }

