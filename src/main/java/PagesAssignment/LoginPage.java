package PagesAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(id ="user-name")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement passW;
	
	@FindBy(id = "login-button")
    WebElement loginButt;
	
	@FindBy(xpath = "//h3[contains(text(),'Epic sadface: ')]")
	WebElement errorMsg;
	
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void LoginFunction(String UserName ,String PassWord){
		
		username.sendKeys(UserName);
		passW.sendKeys(PassWord);
		loginButt.click();
		
	}
}

 