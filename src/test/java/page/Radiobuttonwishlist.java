package page;

	import java.util.ArrayList;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class Radiobuttonwishlist {
		WebDriver driver;
		public Radiobuttonwishlist(WebDriver driver)   
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}
	public void Wishlist()                               //input[2][contains(@name,'gender')]
	{
		WebElement shopradio =driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div/div/div/ul/li[1]/div/div/div/div[3]/span"));
		shopradio.click();
		/*boolean l=shopradio.isSelected();
		   if(l)
		   {
			   System.out.println("Radio button is selected");
		   }
		   else
		   {
			   System.out.println("Radio button is not selected");
		   }*/
		
		
	}
	public void scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	public void dropdown()
	{                                                 
			   driver.findElement(By.xpath("/html/body/div[4]/footer/div[1]/div[2]/div[2]/div[3]/div/div[1]/p")).click();
			   driver.findElement(By.xpath("/html/body/div[4]/footer/div[1]/div[2]/div[2]/div[3]/div/div[2]/div[3]/a")).click();
	}

	public void switchto()
	{

		JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement switchton=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--15425251639383__footer\"]/footer/div[2]/div[2]/ul/li[2]/a"));
		//js.executeScript("arguments[0].scrollIntoView();", switchton);
		
		switchton.click();
	}
	public void switching() {
		ArrayList<String> windowdetails=new ArrayList<>(driver.getWindowHandles());
		System.out.println(windowdetails);
		driver.switchTo().window(windowdetails.get(0));
	}

	}


