package AppManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppMgr_Home {
	
	WebDriver driver;
	
	public AppMgr_Home(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='v-menubar-menuitem-caption']")
	WebElement items;
	
	@FindBy(xpath="//span[contains(text(),'Item Maintenance')]")
	WebElement itemMaint;
	
	@FindBy(xpath="//span[contains(text(),'Item Creation')]")
	WebElement itemCreate;
	
	@FindBy(xpath="//span[contains(text(),'Logout')]")
	WebElement logout;

	public WebElement Items() {
		return items;
	}

	public WebElement ItemMaint() {
		return itemMaint;
	}

	public WebElement ItemCreate() {
		return itemCreate;
	}

	public WebElement Logout() {
		return logout;
	}
	
	

}
