
	package com.testcases;

	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.PageObjects.Holidays;
	import com.PageObjects.Homepage;
	import com.PageObjects.Login_Functionality;
	import com.base.Testbase;

	public class Holiday extends Testbase {

		public Holiday() throws Throwable {
			super();
		 
		}
		Login_Functionality lf;
		 Homepage h;
		 Holidays hd;
		 
		 @BeforeMethod
		 public void setup() throws Throwable {

				Initialization();
				 lf = new Login_Functionality(driver);
				 h=new Homepage(driver);
				 hd=new Holidays(driver);
				 lf.Dologin();		  
		 }
		 @Test(priority=1)
		 public void addholiday() throws Throwable
		 {
			 h.holidays();
			 hd.addholiday();
		 }
		 @Test(priority=2)
		 public void editholiday() throws Throwable
		 {
			 h.holidays();
			 hd.editholiday();
		 }
		 @Test(priority=3)
		 public void deleteholiday() throws Throwable
		 {
			 h.holidays();
			 hd.deleteholiday();
		 }
		 @Test(priority=4)
		 public void verify() throws Throwable
		 {
			 h.holidays();
			 hd.verify();
		 }
	}



