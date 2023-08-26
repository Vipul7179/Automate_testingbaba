package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Baselibrary_utility;
import pages.CheckBox_page;

public class Checkbox_test extends Baselibrary_utility {

	CheckBox_page ob;

	@BeforeTest

	public void getdata() {
		getdata("https://www.testingbaba.com/");
		ob = new CheckBox_page();

	}

	@Test(priority = 0)
	public void clickoncheckboxpage() {
		ob.opencheckbox();
	}

	@Test(priority = 1)
	public void checkallelement() {
		ob.checkallelement();
	}

}
