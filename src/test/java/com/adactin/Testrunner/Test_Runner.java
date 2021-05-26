package com.adactin.Testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.properties.File_Reader_Manager;

import Base_Class.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature",glue ="com.adactin.Step_Definition",monochrome=true,
plugin= {"html:Reports/HtmlAdactin_Report" ,
//		
   "pretty",
//
"json:Report/jsonAdactin_Report.json",})
//"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"} )

public class Test_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
		
		

		driver = Base_Class.BrowserLaunch(browser);
	}

	@AfterClass
	public static void teardown() {
		driver.close();
	}
}