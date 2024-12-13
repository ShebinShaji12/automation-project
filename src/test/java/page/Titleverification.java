package page;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

	public class Titleverification {
		WebDriver driver;
		public Titleverification(WebDriver driver)   
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}
		public void titleveri()
		{
			String act=driver.getTitle();
			String exp="The Shop India";
			if(act.equals(exp))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}	
		}
	}



