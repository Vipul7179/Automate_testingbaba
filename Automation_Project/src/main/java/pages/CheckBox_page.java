package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckBox_page extends Baselibrary_utility {

	public CheckBox_page() {
		PageFactory.initElements(driver, this);
	}

	// checkbox page xpath
	@FindBy(xpath = "(//a[@onclick=\"changeText(this)\"])[2]")
	private WebElement Checkbox;

	// iframe page xpath
	@FindBy(xpath = "(//iframe[@class=\"embed-responsive-item\"])[1]")
	private WebElement iframe;

	// mobile checkbox xpath
	@FindBy(xpath = "(//input[@id=\"myCheck\"])[1]")
	private WebElement mobile;

	// mobile text read xpath
	@FindBy(xpath = "//h6[@id=\"text\"]")
	private WebElement mobileText;

	// laptop checkbox xpath
	@FindBy(xpath = "//input[@id=\"mylaptop\"]")
	private WebElement laptop;

	// laptoptext read xpath
	@FindBy(xpath = "//h6[@id=\"text1\"]")
	private WebElement laptoptext;

	// Desktop checkbox xpath
	@FindBy(xpath = "//input[@id=\"mydesktop\"]")
	private WebElement Desktop;

	// Desktop read xpath
	@FindBy(xpath = "//h6[@id=\"text2\"]")
	private WebElement DesktopText;

	// open checkbox page
	public void opencheckbox() {
		Checkbox.click();
	}

	// switch iframe
	public void checkallelement() {

		driver.switchTo().frame(iframe);
		mobile.click();
		String actualtext = mobileText.getText();
		String expctedtext = "You are selected Mobile";
		Assert.assertEquals(actualtext, expctedtext);
		laptop.click();
		String actualtext1 = laptoptext.getText();
		String expctedtext1 = "You are Selected Laptop";
		Assert.assertEquals(actualtext1, expctedtext1);
		Desktop.click();
		String actualtext2 = DesktopText.getText();
		String expctedtext2 = "You are Selected Desktop";
		Assert.assertEquals(actualtext2, expctedtext2);
		// exit from iframe now
		driver.switchTo().defaultContent();
	}

}
