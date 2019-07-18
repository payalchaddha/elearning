package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOM {
	private WebDriver driver; 

	public HomePagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(), 'Sign up!')]")
	private WebElement signUpBtn;
	
	
	@FindBy(id="registration_firstname")
	private WebElement firstName;
	
	@FindBy(id="registration_lastname")
	private WebElement lastName;
	
	@FindBy(id="registration_email")
	private WebElement userEmail;
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(id="pass1")
	private WebElement Password;
	
	@FindBy(id="pass2")
	private WebElement confirmPassword;
	
	@FindBy(id="registration_phone")
	private WebElement phone;
	
	@FindBy(id="registration_language")
	private WebElement language;
	
	@FindBy(xpath="//input[@value= '1']")
	private WebElement teachCourse;
	
	
	@FindBy(id="registration_submit")
	private WebElement registerbutton;
	
	public void clickSignUpBtn(){
		this.signUpBtn.click();
	}
	
	public void firstname()
	{
		this.firstName.sendKeys("manzoor");
	}
	
	public void lastName()
	{
		this.lastName.sendKeys("mehadi");
	}
	
	public void userEmail()
	{
		this.userEmail.sendKeys("manzoor12@gmail.com");
	}
	public void userName()
	{
		this.userName.sendKeys("manzoor12");
	}
	public void password()
	{
		this.Password.sendKeys("manzoor1234");
	}
	public void confirmPassword()
	{
		this.confirmPassword.sendKeys("manzoor1234");
	}
	public void phone()
	{
		this.phone.sendKeys("9876543210");
	}
	public void registrationLanguage()
	{
		Select languagedropdown = new Select(language) ;
		languagedropdown.selectByVisibleText("English");
	}
	public void teachCourse()
	{
		this.teachCourse.click();
		
	}
	public void registerbutton()
	{
		this.registerbutton.click();
	}
}
