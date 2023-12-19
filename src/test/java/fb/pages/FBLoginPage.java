package fb.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import  fb.objects.FBLoginObjects;
import library.ReadPropertyFile;


public class FBLoginPage {
	
	public static WebDriver driver;
	 
	@Test
	public static void openDriver() {
		
		if (ReadPropertyFile.getBrowser().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		 driver.get(ReadPropertyFile.getUrl());
		 driver.manage().window().maximize();
		 
		 
		 PageFactory.initElements(driver, FBLoginObjects.class);
		 
	

		FBLoginObjects.username.sendKeys(ReadPropertyFile.getUsername());
		FBLoginObjects.password.sendKeys(ReadPropertyFile.getPassword());
		FBLoginObjects.loginbtn.click();
		
		
		
	}
	    
	
}
