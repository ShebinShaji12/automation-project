package test;

import org.testng.annotations.Test;


	import base.Baseclass;
	import page.Registrationpage;

	public class Regtest extends Baseclass{
		@Test
		public void test () throws Exception
		{
			Registrationpage ob=new Registrationpage(driver);
			ob.regi();
			ob.setvalues("shebinnnn", "shaji",  "hii23ddff9syyhhdsd0i@gmail.com", "Arya@1234", "Arya@1234");
			ob.registerbutton();
			
		}
	}



