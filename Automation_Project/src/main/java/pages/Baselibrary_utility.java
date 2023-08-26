package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baselibrary_utility {
	
	public static WebDriver driver;
	
	public void getdata(String url)
	
	
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//button[@class=\"close\"]")).click();
		 driver.findElement(By.xpath("(//a[@class=\"kbt\"])[5]")).click();
		 driver.findElement(By.xpath("(//button[@class=\"btn btn-block p-0 text-left\"])[1]")).click();
	}
	
}
