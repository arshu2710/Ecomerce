package com.amazon.genric.basetest;

import java.io.IOException;
import java.sql.SQLException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.amazon.genric.database.DataBaseUtility;
import com.amazon.genric.fileUtility.ExcelUtility;
import com.amazon.genric.fileUtility.FileUtility;
import com.amazon.genric.fileUtility.JavaUtility;
import com.amazon.genric.objectRepositoryUtility.LoginPage;
import com.amazon.genric.webdriverUtility.webDriverUtility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {
	// create object */
	public FileUtility flib = new FileUtility();
	public ExcelUtility elib = new ExcelUtility();
	public JavaUtility jlib = new JavaUtility();
	public webDriverUtility wlib = new webDriverUtility();
	public DataBaseUtility dblib = new DataBaseUtility();
	public WebDriver driver = null;

	public static WebDriver sdriver = null;

	@BeforeSuite

	public void configBs() throws SQLException {
		System.out.println("=====Connect to DB, Report Config====");
		dblib.getDbconnection();
	}

	@BeforeClass

	public void configBC() throws IOException {
		System.out.println("======Launch the Browser=======");

		String BROWSER = flib.getDataFromPropertiesFile("browser");
		
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		sdriver = driver;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}

	@BeforeMethod

	public void configBM() throws IOException {
		System.out.println("===Login====");

		
		String URL = flib.getDataFromPropertiesFile("url");
		  String USERNAME = flib.getDataFromPropertiesFile("username"); 
		 String PASSWORD= flib.getDataFromPropertiesFile("password");
		 LoginPage lp=new LoginPage(driver);
				 lp.loginToApp(URL, USERNAME, PASSWORD);
	}

	@AfterMethod

	public void configAM() throws InterruptedException {
		System.out.println("======Logout=====");
	}

	@AfterClass

	public void configAC() {
		System.out.println("======Close the Browser=======");
		// driver.quit();
	}

	@AfterSuite
	public void configAs() {
		System.out.println("=====Close DB, Report backUp====");
		dblib.closeDbconnection();

	}
}
