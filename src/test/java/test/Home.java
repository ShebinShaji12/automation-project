package test;

import org.testng.annotations.Test;

import base.Baseclass;
import page.Linkcount;
import page.Mousehover;
import page.Radiobuttonwishlist;
import page.Titleverification;

public class Home extends Baseclass {
	@Test
	public void test () throws Exception
	{
		Mousehover ob=new Mousehover(driver);
		Titleverification ob1=new Titleverification(driver);
		Linkcount ob2=new Linkcount(driver);
		Radiobuttonwishlist ob3=new Radiobuttonwishlist(driver);
		
		ob1.titleveri();
		ob.mhover();
		ob2.lcount();
		Thread.sleep(3000);
		ob3.Wishlist();
		Thread.sleep(1000);
		ob3.scrolldown();
		Thread.sleep(2000);
		ob3.dropdown();
		Thread.sleep(3000);
		driver.navigate().back();
		ob3.scrolldown();
		ob3.switchto();
		Thread.sleep(3000);
		ob3.switching();
		
		
		
	}
}





























