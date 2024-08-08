package com.amazon.scenario2;

import org.testng.annotations.Test;

import com.amazon.genric.basetest.BaseClass;
import com.amazon.genric.objectRepositoryUtility.LoginPage;

public class Removetheelementfromcart extends BaseClass{
	@Test
	public void removetheelement()
	{
		LoginPage pg= new LoginPage(driver);
		pg.getPassdata().sendKeys("iphone");
		pg.getSearchbutton().click();
	}

}
