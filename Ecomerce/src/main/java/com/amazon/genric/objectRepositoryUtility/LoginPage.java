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
		
		 @FindBy(xpath="//span[@class=\"nav-line-2 \"]")
			private WebElement mouseover;
		 
		 @FindBy(xpath="//div[@id=\"nav-al-container\"]/descendant::a[@class=\"nav-action-signin-button\" and contains(.,'Sign in')]")
			private WebElement signinlink;
		 
		 @FindBy(xpath="//input[@id='ap_email']")
			private WebElement mailIdfield;
		 
		
		 @FindBy(xpath="//input[@id='ap_password']")
			private WebElement passwordfield;
		 
		 @FindBy(xpath="//span[@id=\"auth-signin-button\"]")
			private WebElement signinlink2;
		 
		 

		
		 
		 
			public WebElement getMouseover() {
			return mouseover;
		}






		public void setMouseover(WebElement mouseover) {
			this.mouseover = mouseover;
		}






		public WebElement getSigninlink() {
			return signinlink;
		}






		public void setSigninlink(WebElement signinlink) {
			this.signinlink = signinlink;
		}






		public WebElement getMailIdfield() {
			return mailIdfield;
		}

		




		public void setMailIdfield(WebElement mailIdfield) {
			this.mailIdfield = mailIdfield;
		}






		public WebElement getPasswordfield() {
			return passwordfield;
		}






		public void setPasswordfield(WebElement passwordfield) {
			this.passwordfield = passwordfield;
		}






		public WebElement getSigninlink2() {
			return signinlink2;
		}






		public void setSigninlink2(WebElement signinlink2) {
			this.signinlink2 = signinlink2;
		}






			public void loginToApp(String url,String username ,String password) throws IOException {

				System.out.println("Hell0====");
				driver.get(url);
				Actions act=new Actions(driver);
				act.moveToElement(mouseover).perform();
				signinlink.click();
				 mailIdfield.sendKeys(username);
				  passwordfield.sendKeys(password);
				  signinlink2.click();
				 
		 }
			
}