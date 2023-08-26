package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Baselibrary_utility;
import pages.Textbox_page;

public class Textbox_test extends Baselibrary_utility{
	
	Textbox_page ob;
	@BeforeTest
	
	public void getdata()
	{
		getdata("https://www.testingbaba.com/");
		ob= new Textbox_page();
	}
	
	@Test(priority=0)
	public void clickontextbox()
	{
		ob.clickontextbox();
	}
	
	@Test(priority=1)
	public void clickonfillname()
	{
		ob.fillname();
	}
	
	@Test(priority=2)
	public void fillalldetails()
	{
		ob.filldetails();
	}

	@Test(priority=3)
	public void submitbutton()
	{
		ob.clickonsubmitbutton();
	}
}
