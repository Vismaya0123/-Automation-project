package test;



import org.testng.annotations.Test;

import basepkg.baseclass;
import pages.Addtocart;
import pages.Checkoutpage;
import pages.Loginpage;
import pages.Registrationpage;

public class Testdemo extends baseclass {
	@Test
	public void test() throws Exception
	{
		Registrationpage ob=new Registrationpage(driver);
		ob.Registration();
		Loginpage ob1=new Loginpage(driver);
		ob1.Login();
		Addtocart ob2=new Addtocart(driver);
		ob2.Addtocart();
		Checkoutpage ob3=new Checkoutpage(driver);
		ob3.Address1();
		ob3.checkout();
		ob3.Orderconfirm();
		ob3.orderscreenshot();
		
		
	}
	}


