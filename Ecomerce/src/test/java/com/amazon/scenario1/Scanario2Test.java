package com.amazon.scenario1;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.amazon.genric.basetest.BaseClass;
import com.amazon.genric.objectRepositoryUtility.HomePage;
import com.amazon.genric.objectRepositoryUtility.LoginPage;
import com.amazon.genric.objectRepositoryUtility.ResultsPage;
import com.amazon.genric.objectRepositoryUtility.WishListPage;
import com.amazon.genric.webdriverUtility.webDriverUtility;

public class Scanario2Test extends BaseClass{

	@Test
	public void AddToWishListTest() throws EncryptedDocumentException, IOException
	{
		
		String data = elib.getDataFromExcel("Sheet1", 1, 2);
		HomePage hp=new HomePage(driver);
		wlib.waitForElementPrasent(driver, hp.getSearchBoxEdt());
		hp.searchProduct(data);
		
		ResultsPage rp=new ResultsPage(driver);
		rp.getProductEdt().click();
		wlib.switchToTabOnURL(driver);
		
		WishListPage wp=new WishListPage(driver);
		wp.getAddToWishListEdt().click();
		Assert.fail();
		
		String USERNAME = flib.getDataFromPropertiesFile("username"); 
		String PASSWORD= flib.getDataFromPropertiesFile("password");
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp1(USERNAME, PASSWORD);
	}
}
