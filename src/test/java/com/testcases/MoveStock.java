package com.testcases;

public class MoveStock {
	

	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.PageObjects.Login_Functionality;
	import com.PageObjects.MoveStack_Pageobjects;
	import com.base.Testbase;

	public class MovestackTest extends Testbase {
		Login_Functionality lf;
		MoveStack_Pageobjects mp;

		public MovestackTest() throws Throwable {
			super();
			// TODO Auto-generated constructor stub
		}

		@BeforeMethod
		public void setup() throws Throwable {

			Initialization();

			lf = new Login_Functionality(driver);

			lf.Dologin();

			mp = new MoveStack_Pageobjects(driver);

		}

		@Test
		public void movestockWtoS() {

			mp.movestocktfromWtoS();

		}

		@Test
		public void movestockStoW() {

			mp.movestocktfromStoW();

		}

	}


