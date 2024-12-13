package test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Baseclass;
	import page.Loginpage;
	import utilities.Shoputilities;
	public class Logtest extends Baseclass{
		@Test
		public void test() throws Exception
		{
		Loginpage ob=new Loginpage(driver);
		
		
		String xl="D:\\shopindia.xlsx";
		String sheet="Sheet1";
		int rowcount=Shoputilities.getRowCount(xl, sheet);
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++)
		{
			Thread.sleep(2000);
			String username=Shoputilities.getCellValue(xl, sheet, i, 0);
			System.out.println("username--->"+username+i);
		
			String password=Shoputilities.getCellValue(xl, sheet, i, 1);
			
			System.out.println("password--->"+password);
			
			ob.setvalues(username,password);
			Thread.sleep(2000);
		ob.signin();
		//Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
		
		}
	}
	}



