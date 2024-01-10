package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[6]/div[2]/ul[1]/li[2]/a")
	WebElement Electronics;
	
	@FindBy(xpath="/html/body/div[6]/div[2]/ul[1]/li[2]/ul/li[2]/a")
	WebElement Cellphones;
	
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")
	WebElement Smartphone;
	
	@FindBy(xpath="//*[@id=\"add-to-wishlist-button-18\"]")
	WebElement AddtoWhishlist;
	
	@FindBy(xpath="/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]")
	WebElement Whishlist;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input")
	WebElement Quantity;
	@FindBy(xpath="//*[@id=\"updatecart\"]")
	WebElement Updatewhishlist;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[1]/input")
	WebElement Checkbox;
	@FindBy(xpath="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[2]/button[2]")
	WebElement Addtocart;
	
	
	
	
	public  Addtocart (WebDriver driver)
	  {
	    this.driver=driver;
	    PageFactory.initElements(driver,this);
	  }
	public void Addtocart()
	{
		Actions act=new Actions(driver);

		act.moveToElement(Electronics).perform();

		Cellphones.click();
		Smartphone.click();
		AddtoWhishlist.click();
		Whishlist.click();
		Quantity.clear();
		Quantity.sendKeys("10");
		Updatewhishlist.click();
		Checkbox.click();
		Addtocart.click();
		
	
	{
}
}}


