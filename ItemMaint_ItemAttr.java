package AppManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemMaint_ItemAttr {
	
	WebDriver driver;

	public ItemMaint_ItemAttr(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='contentButton iconFlatButton firstButton addIconButton']//img[@class='v-icon']")
	WebElement addIcon;
	
	

}
