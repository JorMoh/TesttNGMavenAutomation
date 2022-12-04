package pagesPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class EcommSignUpPOM {
	
	public EcommSignUpPOM() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath="//h2[text()='Sign Up']")
    public WebElement signUpHeader;
	
	@FindBy(xpath="//label[text()='Email Address']")
    public WebElement emailAddressLabel;
	
	@FindBy(name="email")
	public WebElement emailAddressField;
	
	@FindBy(xpath="//label[text()='First Name']")
	public WebElement firstNameLabel;
	
	@FindBy(name="firstName")
	public WebElement firstNameField;
	
	@FindBy(xpath="//label[text()='Last Name']")
	public WebElement lastNameLabel;
	
	@FindBy(name="lastName")
	public WebElement lastNameField;
	
	@FindBy(xpath="//label[text()='Password']")
	public WebElement passwordLabel;
	
	@FindBy(name="password")
	public WebElement passwordField;
	
	@FindBy(xpath="//span[text()='Login with Google']")
	public WebElement loginWithGoogleBtn;
	
	@FindBy(xpath="//span[text()='Login with Facebook']")
	public WebElement loginWithFacebookBtn;
	
	@FindBy(xpath="//hr[1]")
	public WebElement underlineBeneathPassword;
	
	@FindBy(css="#subscribe")
	public WebElement newsletterSubscriptioncheck;
	
	@FindBy(xpath="//label[text()='Subscribe To Our Newsletter']")
	public WebElement newsletterSubscriptionlabel;
	
	@FindBy(xpath="//a[text()='Back to login']")
	public WebElement backToLoginLink;
	
	@FindBy(xpath="//span[text()='Sign Up']")
	public WebElement signUpBtn;
	
	//Required Fields Error Messages:
	@FindBy(xpath="//span[text()='Email is required.']")
	public WebElement EmailRequiredMsg;
	
	@FindBy(xpath="//span[text()='First Name is required.']")
	public WebElement firstNameRequiredMsg;

	@FindBy(xpath="//span[text()='Last Name is required.']")
	public WebElement lastNameRequiredMsg;
	
	@FindBy(xpath="//span[text()='Password is required.']")
	public WebElement passwordRequiredMsg;
	
	

	
	
}
