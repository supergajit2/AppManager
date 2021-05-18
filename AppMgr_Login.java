package AppManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppMgr_Login {
	WebDriver driver;
	
	public AppMgr_Login(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement pwd;
	
	@FindBy(xpath = "//span[@class='v-button-caption']")
	WebElement login;
	
	public WebElement Username() {
		return username;
	}

	public WebElement Pwd() {
		return pwd;
	}

	public WebElement Login() {
		return login;
	}
}
