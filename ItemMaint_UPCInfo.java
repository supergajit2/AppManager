package AppManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemMaint_UPCInfo {
	
	WebDriver driver;

	public ItemMaint_UPCInfo(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='contentButton iconFlatButton firstButton addIconButton']//img[@class='v-icon']")
	WebElement addIcon;
	
	@FindBy(xpath="//div[@class='contentButton iconFlatButton removeIconButton']//img[@class='v-icon']")
	WebElement deleteIcon;
	
	@FindBy(xpath="//div[@class='contentButton iconFlatButton editIconButton']//img[@class='v-icon']")
	WebElement editIcon;
	
	@FindBy(xpath="//span[contains(text(),'Close')]")
	WebElement close;
	
	@FindBy(css="#gwt-uid-37")
	WebElement primary;
	
	@FindBy(css="#gwt-uid-31")
	WebElement typeBox;
	
	@FindBy(xpath="//div[@class='v-filterselect v-widget v-required v-filterselect-required v-has-width']//div[@class='v-filterselect-button']")
	WebElement typeFilter;
	
	@FindBy(css="#gwt-uid-35")
	WebElement upcId;
	
	@FindBy(xpath="//tbody//tr[4]//td[2]//div[1]//input[1]")
	WebElement addAdjAmt;
	
	@FindBy(css="#gwt-uid-33")
	WebElement modifier;
	
	@FindBy(xpath="//div[@class='v-button v-widget']//span[@class='v-button-caption'][contains(text(),'Cancel')]")
	WebElement cancel;
	
	@FindBy(xpath="//span[contains(text(),'Add')]")
	WebElement add;
	
	@FindBy(xpath="//div[@id='confirmdialog-cancel-button']//span[@class='v-button-caption'][contains(text(),'Cancel')]")
	WebElement cancelDel;
	
	@FindBy(xpath="//span[contains(text(),'Delete')]")
	WebElement delete;
	
	@FindBy(xpath="//tbody//tr[4]//td[2]//div[1]//input[1]")
	WebElement editAdjAmt;
	
	@FindBy(xpath="//div[@class='v-button v-widget']//span[@class='v-button-caption'][contains(text(),'Save')]")
	WebElement save;
	
	@FindBy(xpath="//div[@id='447_window_close']")
	WebElement editClose;
	
	@FindBy(css="#471_window_close")
	WebElement addClose;

	public WebElement getAddIcon() {
		return addIcon;
	}

	public WebElement getDeleteIcon() {
		return deleteIcon;
	}

	public WebElement getEditIcon() {
		return editIcon;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getPrimary() {
		return primary;
	}

	public WebElement getTypeBox() {
		return typeBox;
	}

	public WebElement getTypeFilter() {
		return typeFilter;
	}

	public WebElement getUpcId() {
		return upcId;
	}

	public WebElement getAddAdjAmt() {
		return addAdjAmt;
	}

	public WebElement getModifier() {
		return modifier;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCancelDel() {
		return cancelDel;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getEditAdjAmt() {
		return editAdjAmt;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getEditClose() {
		return editClose;
	}

	public WebElement getAddClose() {
		return addClose;
	}
	
	
}
