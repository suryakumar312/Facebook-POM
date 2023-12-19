package fb.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class FBLoginObjects {
	
	@FindBy(id="email")
	public static WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	public static WebElement password;
	
	@FindBy(name="login")
	public static WebElement loginbtn;

    
}