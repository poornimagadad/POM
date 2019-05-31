package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EdurekaSignInPage {
	
	WebDriver driver;
	

	public EdurekaSignInPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[@class='signin top-signin giTrackElementHeader hidden-xs']")
	WebElement signIn;

	@FindBy(id = "si_popup_email")
	WebElement email;

	@FindBy(id = "si_popup_passwd")
	WebElement password;
	
	@FindBy(xpath="//button[@class='clik_btn_log btn-block']")
	WebElement loginBtn;

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}