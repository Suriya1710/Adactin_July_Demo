package com.adactinsite.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactinsite.pom.LogInPage;
import com.adactinsite.pom.SearchHotelPage;

public class Page_Object_Manager {

	public WebDriver driver; // ---> null

	private LogInPage login; // private ClassName objName

	private SearchHotelPage search;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public LogInPage get_Instance_Login() {

		login = new LogInPage(driver);

		return login;
	}

	public SearchHotelPage get_Instance_Search() {

		search = new SearchHotelPage(driver);

		return search;

	}

}
