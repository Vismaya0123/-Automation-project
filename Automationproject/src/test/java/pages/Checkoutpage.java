package pages;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkoutpage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"termsofservice\"]")
	WebElement Checkbutton;
	
	@FindBy(xpath="//*[@id=\"checkout\"]")
	WebElement Checkoutbutton;
	
	@FindBy(xpath="//*[@id=\"BillingNewAddress_Company\"]")
	WebElement Companyname;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[5]/select")
	WebElement Country;
	
	@FindBy(xpath="//*[@id=\"BillingNewAddress_City\"]")
	WebElement City;
	
	@FindBy(xpath="//*[@id=\"BillingNewAddress_Address1\"]")
	WebElement Address1;
	
	@FindBy(xpath="//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
	WebElement Zipcode;
	
	@FindBy(xpath="//*[@id=\"BillingNewAddress_PhoneNumber\"]")
	WebElement Phonenumber;
	
	@FindBy(xpath="//*[@id=\"billing-buttons-container\"]/button[4]")
	WebElement Continue1;
	
	@FindBy(xpath="//*[@id=\"shippingoption_1\"]")
	WebElement Shippingoption;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")
	WebElement Continue2;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")
	WebElement Continue3;
	
	@FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/button")
	WebElement Continue4;
	
	@FindBy(xpath="//*[@id=\"payment-info-buttons-container\"]/button")
	WebElement Continue5;
	
	@FindBy(xpath="//*[@id=\"confirm-order-buttons-container\"]/button")
	WebElement Orderconfirm;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[3]/button")
	WebElement Continue6;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div")
	WebElement Orderplaced;
	
	public Checkoutpage(WebDriver driver)
	  {
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	  }
	public void Address1()
	  {  
		Checkbutton.click();
	 	Checkoutbutton.click();
	 	Companyname.sendKeys("Tcs");
	 	Select country = new Select(Country);
	 	country.selectByValue("239");
	 	City.sendKeys("Palakkad");
	 	Address1.sendKeys("chittur");
	 	Zipcode.sendKeys("678101");
	 	Phonenumber.sendKeys("9632145782");
	 	
	  }
	public void checkout()
	  {
		Continue1.click();
		Shippingoption.click();
		Continue2.click();
		Continue3.click();
		Continue4.click();
		Continue5.click();
	  }
		public void Orderconfirm()
		  {
			Orderconfirm.click();
		  }
		public void orderscreenshot() throws Exception
		  {
			Thread.sleep(3000);
			File orderscr=Orderplaced.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(orderscr, new File("./Screenshot/OrderConfirmation.png"));
			
			System.out.println("\n Order Placed Successfully");
			System.out.println();
		  }  
		
	  }
	

	
	


