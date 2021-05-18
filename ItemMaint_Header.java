package AppManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemMaint_Header {
	
	WebDriver driver;
	
	public ItemMaint_Header(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='v-textfield v-widget v-has-width v-textfield-prompt']")
	WebElement itemLookup;
	
	@FindBy(xpath="//div[@class='v-button v-widget borderless v-button-borderless iconOnlyButton v-button-iconOnlyButton advLookup v-button-advLookup']//img[@class='v-icon']")
	WebElement search;
		
	@FindBy(xpath="//input[@class='v-filterselect-input']")
	WebElement currentSiteBox;
	
	@FindBy(xpath="//div[@class='v-filterselect v-widget']//div[@class='v-filterselect-button']")
	WebElement currentSiteFilter;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	WebElement nextList;
	
	@FindBy(xpath="//span[contains(text(),'Prev')]")
	WebElement prevList;
	
	@FindBy(xpath="//span[contains(text(),'Create Item')]")
	WebElement createItem;

	public WebElement ItemLookup() {
		return itemLookup;
	}

	public WebElement Search() {
		return search;
	}

	public WebElement CurrentSiteBox() {
		return currentSiteBox;
	}

	public WebElement CurrentSiteFilter() {
		return currentSiteFilter;
	}

	public WebElement NextList() {
		return nextList;
	}

	public WebElement PrevList() {
		return prevList;
	}

	public WebElement CreateItem() {
		return createItem;
	}
	
	

}
