package com.amazon.scenario2;

import org.testng.annotations.Test;

import com.amazon.genric.basetest.BaseClass;
import com.amazon.genric.objectRepositoryUtility.HOMEpage;

public class Removetheelementfromcart extends BaseClass{
	@Test
	public void removetheelement() throws InterruptedException
	{
		HOMEpage pg= new HOMEpage(driver);
		pg.getPassdata().sendKeys("iphone");
		pg.getSearchdata().click();
		pg.getAddcart().click();
		Thread.sleep(2000);;
		pg.getCartbtn().click();
		pg.getDelet().click();
		
		
	}

}
