package com.adactinsite.helper;

import org.junit.Test;

public class CCC {

	@Test
	public  void setUp() {

		String browser = BBB.getInstanceBBB().getInstanceAAA().getBrowser();

		System.out.println(browser);

	}

	
	@Test
	public  void url() {

		String url = BBB.getInstanceBBB().getInstanceAAA().getUrl();

		System.out.println(url);

	}
	

}
