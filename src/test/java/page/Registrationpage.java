package page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Registrationpage {
	WebDriver driver;
		
		@FindBy(xpath="//*[@id=\"shopify-section-sections--15425251606615__header\"]/sticky-header/header/div/a[2]")
		WebElement signin;

		@FindBy(xpath="	//*[@id=\"new_customer_login\"]/button[2]") 
		WebElement reg;


		@FindBy(xpath="//*[@id=\"RegisterForm-FirstName\"]")
		WebElement firstname;

		@FindBy(xpath="//*[@id=\"RegisterForm-LastName\"]") 
		WebElement lastname ;

		@FindBy(xpath="//*[@id=\"RegisterForm-email\"]")
		WebElement email;
		
		@FindBy(xpath="//*[@id=\"RegisterForm-password\"]") 
		WebElement password ;

		@FindBy(xpath="//*[@id=\"confirm-password\"]")
		WebElement retypepassword;
		
		@FindBy(xpath="//*[@id=\"dumRegFormButton\"]")
		WebElement register;
		
		@FindBy(xpath="//*[@id=\"shopify-section-template--15425251704919__main\"]/div/div[1]/a")
		WebElement logout;
		
	    public Registrationpage(WebDriver driver)   
		{
		    this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	    
	    public void regi()
	   	{
	   		signin.click();
	   		reg.click();
	   		
	   	}
	    public void setvalues(String fname,String lname,String email1,String pass,String pass1)
	    
	    {
	    	firstname.sendKeys(fname);
	    	lastname.sendKeys(lname);
	    	email.sendKeys(email1);
	    	password.sendKeys(pass);
	    	retypepassword.sendKeys(pass1);
	    }
	    public void registerbutton() throws Exception 
		{
			register.click();
			Thread.sleep(3000);
			signin.click();
			logout.click();
			
		}
	  
	}

