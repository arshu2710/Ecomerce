package com.amazon.genric.objectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOMEpage {
	
	public HOMEpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	 @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
     private WebElement passdata;
	 
	 @FindBy(xpath = " //div[@class='s-desktop-width-max s-desktop-content s-opposite-dir s-wide-grid-style sg-row']/div/div/span[1]/div/div[5]/div/div/descendant::button[text()='Add to cart']")
	 private WebElement addcart;
	@FindBy(xpath = "//span[@data-action='delete']")
	private WebElement delet;
	public WebElement getDelet() {
		return delet;
}
	@FindBy(xpath = "//div[@id='nav-cart-count-container']")
	private WebElement cartbtn;
	@FindBy(xpath = "//a[@id='icp-nav-flyout']")
	private WebElement languagemove;
	
	
	public WebElement getSearchdata() {
		return searchdata;
	}
	public void setSearchdata(WebElement searchdata) {
		this.searchdata = searchdata;
	}

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	 private WebElement searchdata; 
	
	
	
	public void setDelet(WebElement delet) {
		this.delet = delet;
	}
	public WebElement getCartbtn() {
		return cartbtn;
	}
	public void setCartbtn(WebElement cartbtn) {
		this.cartbtn = cartbtn;
	}
	 public WebElement getAddcart() {
			return addcart;
		}
		public void setAddcart(WebElement addcart) {
			this.addcart = addcart;
		}
		public WebElement getPassdata() {
			return passdata;
		}
		public void setPassdata(WebElement passdata) {
			this.passdata = passdata;
		}

}
