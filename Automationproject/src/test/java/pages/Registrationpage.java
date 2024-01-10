package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Registrationpage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement Register;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[1]/div/span[2]/input")
	WebElement Gender;
	
	@FindBy(xpath="//*[@id=\"FirstName\"]")
	WebElement Firstname;
	
	@FindBy(xpath="//*[@id=\"LastName\"]")
	WebElement Lastname;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")
	WebElement Day;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")
	WebElement Month;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")
	WebElement Year;
	
	@FindBy(xpath="//*[@id=\"Email\"]")
	WebElement Email;
	
	@FindBy(xpath="//*[@id=\"Password\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"ConfirmPassword\"]")
	WebElement Confirmpassword;
	
	@FindBy(xpath="//*[@id=\"register-button\"]")
	WebElement Registerbutton;
	
	public  Registrationpage  (WebDriver driver)
	  {
	    this.driver=driver;
	    PageFactory.initElements(driver,this);
	  }
	public void Registration()
	{
		String email="vichuanuu123i@gmail.com";
		 String password="vichu@123";
		 
		 Register.click();
		 Gender.click();
		 Firstname.sendKeys("Vismaya");
		 Lastname.sendKeys("vichu");
		 
		 
		 Select day=new Select(Day);
			day.selectByValue("2");
			
			 Select month=new Select(Month);
			month.selectByVisibleText("February");
			 
			 Select year=new Select(Year);
			year.selectByValue("1914");
			
			Email.sendKeys(email);
			Password.sendKeys(password);
			Confirmpassword.sendKeys(password);
			Registerbutton.click(); 
		 
	}
	

}
