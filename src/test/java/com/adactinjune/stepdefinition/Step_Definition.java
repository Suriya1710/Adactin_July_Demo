package com.adactinjune.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactinjune.runner.Test_Runner;
import com.adactinsite.baseclass.BaseClass;
import com.adactinsite.helper.File_Reader_Manager;
import com.adactinsite.helper.Page_Object_Manager;
import com.adactinsite.pom.LogInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {

	public static WebDriver driver = Test_Runner.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		String url = File_Reader_Manager.getInstance().getInstanceCR().get_Url();

		getURL(url);

	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {

		// Thread.sleep(2000);

		inputValueElement(pom.get_Instance_Login().getUsername(), "SuriyaVeeran17");

	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {

		inputValueElement(pom.get_Instance_Login().getPassword(), "Music17");

	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {

		clickOnElement(pom.get_Instance_Login().getLogin());

	}

}
