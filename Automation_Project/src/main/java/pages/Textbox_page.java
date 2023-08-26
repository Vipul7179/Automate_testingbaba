package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Textbox_page extends Baselibrary_utility{
	public Textbox_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	String path= "C:\\Users\\lenovo\\eclipse-workspace\\Automation_Project\\Datadriven\\automation excel sheet.xlsx";
	
	@FindBy(xpath="(//a[@class=\"nav-link\"])[1]")
	private WebElement textbox;
	
	@FindBy(xpath="//input[@id=\"fullname1\"]")
	private WebElement Fullname;
	
	@FindBy(xpath="//input[@id=\"fullemail1\"]")
	private WebElement Email;
	
	@FindBy(xpath="//textarea[@id=\"fulladdresh1\"]")
	private WebElement currentadd;
	
	@FindBy(xpath="//textarea[@id=\"paddresh1\"]")
	private WebElement permanantadd;
	
	@FindBy(xpath="//input[@class=\"btn btn-success\"]")
	private WebElement submitbutton;
	
	
	public void clickontextbox()
	{
		textbox.click();
	}
	
	public void fillname()
	{
		Fullname.click();
	}
	
	public void clickonsubmitbutton()
	{
		submitbutton.click();
	}
	
	public void filldetails()
	{
		Fullname.sendKeys(Excelutility.getReaddata(path, 1, 0));
		Email.sendKeys(Propertyfile_utility.getproperties("Email"));
		currentadd.sendKeys(Propertyfile_utility.getproperties("Currentaddress"));
		permanantadd.sendKeys(Excelutility.getReaddata(path, 1, 3));
	}

}
