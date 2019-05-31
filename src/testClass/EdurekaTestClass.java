package testClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pageClass.EdurekaSignInPage;

public class EdurekaTestClass {
	
	@Test
	public void applicationTest(){
		
	
	System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.edureka.co/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	EdurekaSignInPage signInPage=new EdurekaSignInPage(driver);
		signInPage.getSignIn().click();
		signInPage.getEmail().sendKeys("Poornima.gadad@gmail.com");
		signInPage.getPassword().sendKeys("Babysoap18li");
		signInPage.getLoginBtn().click();
		
	}
}
