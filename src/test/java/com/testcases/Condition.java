package com.testcases;

	import java.io.IOException;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.PageObjects.Condition;
	import com.PageObjects.ConditionTypeData;
	import com.PageObjects.Homepage;
	import com.PageObjects.Login_functionality;
	import com.Utils.Utils;
	import com.base.Testbase;

	public class Condition extends Testbase{
	 private String sheetname="AddCondition";
	 private String sheetname2="EditCondition";
	 private String sheetname3="DeleteCondition";
		public Condition() throws Throwable {
			super();
		}
		Login_functionality lf;
		Homepage h;
		Condition c;
		ConditionTypeData ctd;
	    @BeforeMethod
	    public void setup() throws Throwable
	    {
	    	Initialization();
	    	lf=new Login_functionality(driver);
	    	h=new Homepage(driver);
	    	c=new Condition(driver);
	    	ctd=new ConditionTypeData(driver);
	    	lf.Dologin();
	    }
	    @Test(priority=1,dataProvider="readdata",dataProviderClass=ConditionTest.class)
	    public void addCondition(String conditionname) throws Throwable
	    {
	    	h.Condition();
	    	c.addCondition();
	    	ctd.addCondition(conditionname);
	    }
	    @DataProvider
	    public Object[][] readdata() throws IOException
	    {
			return Utils.readDataFromExcel(sheetname);
	    	
	    }
	    @Test(priority=2,dataProvider="readdataExcel",dataProviderClass=ConditionTest.class)
	    public void editCondition(String Conditionname,String EditedConditionname) throws Throwable {
	    	h.Condition();
	    	c.editCondition(Conditionname);
	    	ctd.editcondition(EditedConditionname);
	    }
	    @DataProvider
	    public Object[][] readdataExcel() throws IOException
	    {
			return Utils.readDataFromExcel(sheetname2);
	    	
	    }
	    
	    @Test(priority=3,dataProvider="readdataExcelcondition",dataProviderClass=ConditionTest.class)
	    public void deleteCondition(String Changedcondition) throws Throwable
	    {
	    	h.Condition();
	    	c.deleteCondition(Changedcondition);
	    }
	    @DataProvider
	    public Object[][] readdataExcelcondition() throws IOException
	    {
			return Utils.readDataFromExcel(sheetname3);
	    	
	    }
	    @Test(priority=4,dataProvider="readdataExcelcondition",dataProviderClass=ConditionTest.class)
	    public void verify(String changedcondition) throws Throwable
	    {
	    	h.Condition();
	    	c.verify(changedcondition);
	    }
	    
	    @AfterMethod
	    public void teardown()
	    {
	    	driver.quit();
	    }
	}
	
	
	
	


