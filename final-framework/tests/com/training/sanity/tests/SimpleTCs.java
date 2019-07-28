package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePagePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SimpleTCs {
	private WebDriver driver; 
	private String baseUrl; 
	private HomePagePOM homePagePOM; 
	private static Properties properties; 
	private ScreenShot screenShot; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		homePagePOM= new HomePagePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}
	
	@Test(enabled=false)
	public void createNewAccount() {
			homePagePOM.clickSignUpBtn();
			screenShot.captureScreenShot("First");
			homePagePOM.firstname();
			screenShot.captureScreenShot("Second");
			homePagePOM.lastName();
			screenShot.captureScreenShot("Third");
			homePagePOM.userEmail();
			screenShot.captureScreenShot("Fourth");
			homePagePOM.userName();
			screenShot.captureScreenShot("Fifth");
			homePagePOM.password();
			screenShot.captureScreenShot("Sixth");
			homePagePOM.confirmPassword();
			screenShot.captureScreenShot("Seventh");
			homePagePOM.phone();
			screenShot.captureScreenShot("Eighth");
			homePagePOM.registrationLanguage();
			screenShot.captureScreenShot("Ninth");
			homePagePOM.teachCourse();
			screenShot.captureScreenShot("Tenth");
			homePagePOM.registerbutton();
			screenShot.captureScreenShot("Eleven");
	}
	@Test(enabled=true)
	public void loginAsTeacher()
	{
		homePagePOM.loginUsername();
		screenShot.captureScreenShot("loginUsername");
		homePagePOM.loginPassword();
		screenShot.captureScreenShot("loginPassword");
		homePagePOM.loginButton();
		screenShot.captureScreenShot("loginButton");
	}
	
	
	
	
	
	
	
	

}
