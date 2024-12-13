package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"shopify-section-sections--15425251606615__header\"]/sticky-header/header/div/a[2]")
	WebElement signin;
	
	

	@FindBy(xpath="//*[@id=\"CustomerEmail\"]") 
	WebElement email;
	

	@FindBy(xpath="//*[@id=\"CustomerPassword\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"new_customer_login\"]/button[1]")
	WebElement sign;
	
	
	
     public Loginpage(WebDriver driver)   
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	public void setvalues(String emails, String password1) {
	
		signin.click();
		
		email.sendKeys(emails);
	
		password.sendKeys(password1);
		
	}
	public void signin()
	{
		sign.click();
	}
	
	
}

		
		
		
	
	
	
	
	
