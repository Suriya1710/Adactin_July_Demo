package com.adactinjune.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactinsite.baseclass.BaseClass;
import com.adactinsite.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactinjune//feature", 
glue = "com.adactinjune.stepdefinition")

public class Test_Runner {

	public static WebDriver driver; // ---> null

	@BeforeClass
	public static void set_Up() throws Throwable {
		
		String browser = File_Reader_Manager.getInstance().getInstanceCR().get_Browser();
		
		driver = BaseClass.getDriver(browser);

	}

	@AfterClass
	public static void tear_Down() {

		//  	

	}

}
