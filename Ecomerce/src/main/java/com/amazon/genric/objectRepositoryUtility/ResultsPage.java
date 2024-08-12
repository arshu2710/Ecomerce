package com.amazon.genric.objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {

	@FindBy(xpath="//span[text()='Apple iPhone 15 (128 GB) - Black' ][1]")
	private WebElement ProductEdt;
	
	public ResultsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getProductEdt() {
		return ProductEdt;
	}

	
	
}
