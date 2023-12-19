package fb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import fb.objects.PracticeObjects;

public class PracticeLoginPage {
	
	WebDriver driver;
	@Test
	public void facebook() {
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, PracticeObjects.class);
		
		PracticeObjects.email.sendKeys("qwerty");
		PracticeObjects.pass.sendKeys("1234");
		PracticeObjects.login.click();
		
		
	}


	
	
	
	
}
