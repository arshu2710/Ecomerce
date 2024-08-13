package com.amazon.genric.objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {

	@FindBy(xpath=" //a[text()=' Add to Wish List ']")
	private WebElement AddToWishListEdt;
	
	public WishListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddToWishListEdt() {
		return AddToWishListEdt;
	}
	
	}
