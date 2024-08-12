package com.amazon.genric.objectRepositoryUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.genric.fileUtility.FileUtility;
import com.amazon.genric.webdriverUtility.webDriverUtility;

public class LoginPage extends webDriverUtility {
	webDriverUtility wlib = new webDriverUtility();        

	public FileUtility flib = new FileUtility();
	WebDriver driver;
	public LoginPage(WebDriver driver) {            
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	public WebElement getMouseover() {
		return mouseover;
	}

	public WebElement getSigninlink() {
		return signinlink;
	}

	public WebElement getMailIdfield() {
		return mailIdfield;
	}

	public WebElement getPasswordfield() {
		return passwordfield;
	}

	public WebElement getSigninlink2() {
		return signinlink2;
	}
	@FindBy(xpath="//span[@class=\"nav-line-2 \"]")
	private WebElement mouseover;

	@FindBy(xpath="//div[@id=\"nav-al-container\"]/descendant::a[@class=\"nav-action-signin-button\" and contains(.,'Sign in')]")
	private WebElement signinlink;

	@FindBy(id="ap_email_login")
	private WebElement mailIdfield;

	@FindBy(id = "continue")
	private WebElement continueEdt;

	@FindBy(id = "ap_password")
	private WebElement passwordfield;

	@FindBy(id="signInSubmit")
	private WebElement signinlink2;
	
	public WebElement getContinueEdt() {
		return continueEdt;
	}

	public void loginToApp(String url) throws IOException {

		driver.get(url);
		maximizeWindow(driver);
	}

	public void loginToApp1(String username ,String password) throws IOException {

//		maximizeWindow(driver);
//		Actions act=new Actions(driver);
//		act.moveToElement(mouseover).perform();
//		waitForElementPrasent(driver, signinlink);
//		signinlink.click();
		mailIdfield.sendKeys(username);
		continueEdt.click();
		passwordfield.sendKeys(password);
		signinlink2.click();

	}

}