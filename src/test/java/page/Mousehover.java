package page;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Mousehover {
		WebDriver driver;
		public Mousehover(WebDriver driver)   
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
	}
		public void mhover() throws Exception
		{
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //Implicit wait
			
			
			
			//explicit
			//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			
			Actions act=new Actions(driver);
			Thread.sleep(2000);
			
			WebElement a=driver.findElement(By.xpath("//*[@id=\"HeaderMenu-our-shop\"]/span"));
			act.moveToElement(a);
			act.perform();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebElement b=driver.findElement(By.xpath("//*[@id=\"HeaderMenu-our-shop-women\"]/span"));
			act.moveToElement(b);
			act.perform();
			
			//explicit
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"HeaderMenu-our-shop-women-sarees\"]"))).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	       WebElement dress = driver.findElement(By.xpath("//*[@id='HeaderMenu-our-shop-women-dresses']"));
	       act.moveToElement(dress);
	       act.perform();
	       dress.click();
	       
			
		}
	}

