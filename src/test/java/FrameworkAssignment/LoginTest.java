package FrameworkAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PagesAssignment.LoginPage;



public class LoginTest extends BaseClass{
	@Test
	public void LoginSuccess(){
		
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("standard_user", "secret_sauce");
		WebElement productTitle = driver.findElement(By.className("product_label"));
		String prdTitle = productTitle.getText();
		Assert.assertEquals(prdTitle, "Products");
   }
	

}
