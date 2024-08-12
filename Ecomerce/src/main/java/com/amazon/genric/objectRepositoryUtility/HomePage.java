package com.amazon.genric.objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBoxEdt;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchButtonEdt;
	
	
	@FindBy(xpath = "//span[@class='nav-action-inner' and text()='Your Wish List']")
	private WebElement yourWishListEdt;
	
	@FindBy(id="nav-cart-count-container")
	private WebElement cartButtonEdt;
	
	
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getSearchBoxEdt() {
	return searchBoxEdt;
}

public WebElement getSearchButtonEdt() {
	return searchButtonEdt;
}

public WebElement getCartButtonEdt() {
	return cartButtonEdt;
}

public void searchProduct(String data)
{
	searchBoxEdt.sendKeys(data);
	searchButtonEdt.click();
}
}
