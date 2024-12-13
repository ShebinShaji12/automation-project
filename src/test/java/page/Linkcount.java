package page;

import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;

	public class Linkcount {
		WebDriver driver;
		public Linkcount(WebDriver driver)   
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}


		public void lcount()
		{
			List<WebElement> li=driver.findElements(By.tagName("a"));
			System.out.println("No of links="+li.size());
	}
	}



