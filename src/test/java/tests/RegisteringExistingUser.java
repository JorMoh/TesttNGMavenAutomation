package tests;

import org.testng.annotations.Test;

import pagesPOM.EcommCommonPOM;
import pagesPOM.EcommSignUpPOM;
import utils.Driver;
import utils.dataReader;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class RegisteringExistingUser {
	EcommCommonPOM home = new EcommCommonPOM();
	EcommSignUpPOM signup = new EcommSignUpPOM();
//	Validate that if user enters the following fields: 
//	. Email - Email of an existing user.
//	. Valid First Name, Last Name and Password.
//	Then:
//	1.The System should  display the following error message in a red flash box with the following message:
//	”Please Try To Signup Again! That email address is already in use.” 
//	2. The user should remain on the sign up page. 
//	3. The system should not create the user. 
		
	
	
  @Test(description="validating that a registered user cannot register"
  		+ "again with the same email")
  public void registerExisitingUser() {
	//1.navigate to the “Prime Tech Ecommerce Store”, https://primetech-store-qa.herokuapp.com/
	  Driver.getDriver().get(dataReader.getData("primeTechUrl"));
	  //2.click on the Welcome Dropdown.
	  home.welcomeDropdown.click();
	  //3.click on the ‘Sign Up’ Link.
	  home.signUpLink.click();
	  //enter an Email of an existing user, a Valid First Name, Last Name and Password.
	  signup.emailAddressField.sendKeys("m.muhaidat877@yahoo.com");
	  signup.firstNameField.sendKeys("m");
	  signup.lastNameField.sendKeys("ab");
	  signup.passwordField.sendKeys("dep1@erD");
	  //click the signup button.
	  signup.signUpBtn.click();
	  //verify the error message is displayed and the text matches the criteria.
	  Assert.assertEquals(signup.existingUserErrorMsg.getText(), dataReader.getData("existingUserErrorMsg"));
	  //verify you're still on the sign up page.
	  Assert.assertTrue(signup.signUpHeader.isDisplayed());
	  //verify no new account was created.
	  
	  
  }
  
  
  
  @BeforeMethod
  public void setup() {
	  Driver.getDriver().manage().window().maximize();
	  Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  }

  @AfterTest
  public void quitDriver() {
	  Driver.quitDriver();
  }

}
