package AppManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemMaint_GlobalInfo {
	
	WebDriver driver;

	public ItemMaint_GlobalInfo(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/img[1]")
	WebElement globalEdit;
	
	@FindBy(xpath="//div[@class='v-gridlayout v-layout v-widget gridSpace v-gridlayout-gridSpace editModal v-gridlayout-editModal']//div[5]//input[1]")
	WebElement mfgCode;
	
	@FindBy(xpath="//span[contains(text(),'UPC Information')]")
	WebElement upcInfo;
	
	@FindBy(xpath="//div[@class='v-gridlayout v-layout v-widget gridSpace v-gridlayout-gridSpace editModal v-gridlayout-editModal fieldset v-gridlayout-fieldset']//div[3]//div[1]//input[1]")
	WebElement deptGrpBox;
	
	@FindBy(xpath="//div[@class='v-gridlayout v-layout v-widget gridSpace v-gridlayout-gridSpace editModal v-gridlayout-editModal fieldset v-gridlayout-fieldset']//div[3]//div[1]//div[1]")
	WebElement deptGrpFilter;
	
	@FindBy(xpath="//div[6]//div[1]//input[1]")
	WebElement deptBox;
	
	@FindBy(xpath="//div[6]//div[1]//div[1]")
	WebElement deptFilter;
	
	@FindBy(xpath="//body[@class='v-generated-body v-sa v-ch v-webkit v-android v-touch']/div[@id='appmanager-303111788']/div[@class='v-ui v-scrollable']/div[@class='v-verticallayout v-layout v-vertical v-widget v-has-width']/div[@class='v-slot v-slot-main-bg']/div[@class='v-verticallayout v-layout v-vertical v-widget main-bg v-verticallayout-main-bg v-has-width']/div[@class='v-slot v-slot-featureLayout']/div[@class='v-horizontallayout v-layout v-horizontal v-widget featureLayout v-horizontallayout-featureLayout v-has-width']/div[@class='v-expand']/div[@class='v-slot']/div[@class='v-panel v-widget v-has-width']/div[@class='v-panel-content v-scrollable']/div[@class='v-absolutelayout v-layout v-widget v-has-width v-has-height']/div/div[@class='v-absolutelayout-margin']/div[@class='v-absolutelayout-wrapper']/div[@id='ItemInfoMainLayout']/div/div[@class='v-absolutelayout-margin']/div[@class='v-absolutelayout-wrapper']/div[@class='v-tabsheet v-widget v-has-width v-has-height']/div[@class='v-tabsheet-content']/div[@class='v-tabsheet-tabsheetpanel']/div[@class='v-scrollable']/div[@class='v-verticallayout v-layout v-vertical v-widget']/div[@class='v-slot']/div[@class='v-verticallayout v-layout v-vertical v-widget v-has-width']/div[@class='v-slot']/div[@class='v-horizontallayout v-layout v-horizontal v-widget']/div[@class='v-slot']/div[@class='v-verticallayout v-layout v-vertical v-widget']/div[@class='v-slot v-slot-gridSpace v-slot-editModal v-slot-fieldset']/div[@class='v-gridlayout v-layout v-widget gridSpace v-gridlayout-gridSpace editModal v-gridlayout-editModal fieldset v-gridlayout-fieldset']/div[9]/div[1]/input[1]")
	WebElement classBox;
	
	@FindBy(xpath="//body[@class='v-generated-body v-sa v-ch v-webkit v-android v-touch']/div[@id='appmanager-303111788']/div[@class='v-ui v-scrollable']/div[@class='v-verticallayout v-layout v-vertical v-widget v-has-width']/div[@class='v-slot v-slot-main-bg']/div[@class='v-verticallayout v-layout v-vertical v-widget main-bg v-verticallayout-main-bg v-has-width']/div[@class='v-slot v-slot-featureLayout']/div[@class='v-horizontallayout v-layout v-horizontal v-widget featureLayout v-horizontallayout-featureLayout v-has-width']/div[@class='v-expand']/div[@class='v-slot']/div[@class='v-panel v-widget v-has-width']/div[@class='v-panel-content v-scrollable']/div[@class='v-absolutelayout v-layout v-widget v-has-width v-has-height']/div/div[@class='v-absolutelayout-margin']/div[@class='v-absolutelayout-wrapper']/div[@id='ItemInfoMainLayout']/div/div[@class='v-absolutelayout-margin']/div[@class='v-absolutelayout-wrapper']/div[@class='v-tabsheet v-widget v-has-width v-has-height']/div[@class='v-tabsheet-content']/div[@class='v-tabsheet-tabsheetpanel']/div[@class='v-scrollable']/div[@class='v-verticallayout v-layout v-vertical v-widget']/div[@class='v-slot']/div[@class='v-verticallayout v-layout v-vertical v-widget v-has-width']/div[@class='v-slot']/div[@class='v-horizontallayout v-layout v-horizontal v-widget']/div[@class='v-slot']/div[@class='v-verticallayout v-layout v-vertical v-widget']/div[@class='v-slot v-slot-gridSpace v-slot-editModal v-slot-fieldset']/div[@class='v-gridlayout v-layout v-widget gridSpace v-gridlayout-gridSpace editModal v-gridlayout-editModal fieldset v-gridlayout-fieldset']/div[9]/div[1]/div[1]")
	WebElement classFilter;
	
	@FindBy(xpath="//div[12]//div[1]//input[1]")
	WebElement lineBox;
	
	@FindBy(xpath="//div[12]//div[1]//div[1]")
	WebElement lineFilter;
	
	@FindBy(xpath="//div[@class='v-gridlayout-slot']//div[@class='v-filterselect v-widget v-has-width v-filterselect-prompt']//input[@class='v-filterselect-input']")
	WebElement GLCatBox;
	
	@FindBy(xpath="//div[@class='v-gridlayout-slot']//div[@class='v-filterselect v-widget v-has-width v-filterselect-prompt']//div[@class='v-filterselect-button']")
	WebElement GLCatFilter;
	
	@FindBy(css="#gwt-uid-2")
	WebElement nonRev;
	
	@FindBy(css="#gwt-uid-3")
	WebElement storeCoupon;
	
	@FindBy(css="#gwt-uid-4")
	WebElement negPrice;
	
	@FindBy(css="#gwt-uid-5")
	WebElement nonInv;
	
	@FindBy(css="#gwt-uid-6")
	WebElement supply;
	
	@FindBy(css="#gwt-uid-7")
	WebElement flex;
	
	@FindBy(css="#gwt-uid-8")
	WebElement meas;
	
	@FindBy(css="#gwt-uid-9")
	WebElement core;
	
	@FindBy(css="#gwt-uid-10")
	WebElement reorder;
	
	@FindBy(css="#gwt-uid-11")
	WebElement disc;
	
	@FindBy(css="#gwt-uid-12")
	WebElement obsolete;
	
	@FindBy(css="#gwt-uid-13")
	WebElement downloadPOS;
	
	@FindBy(css="#gwt-uid-16")
	WebElement webEnabled;
	
	@FindBy(css="#gwt-uid-17")
	WebElement webNonInv;
	
	@FindBy(xpath="//div[@id='appmanager-303111788']//div//div//div[@class='v-verticallayout v-layout v-vertical v-widget v-has-width']//div[@class='v-verticallayout v-layout v-vertical v-widget']//div[1]//div[1]//div[3]//div[1]//div[3]//input[1]")
	WebElement desc;
	
	@FindBy(xpath="//div[@id='appmanager-303111788']//div//div//div[@class='v-verticallayout v-layout v-vertical v-widget v-has-width']//div[@class='v-verticallayout v-layout v-vertical v-widget']//div[1]//div[1]//div[3]//div[1]//div[5]//input[1]")
	WebElement receipt;
	
	@FindBy(xpath="//div[@class='v-gridlayout v-layout v-widget gridSpace v-gridlayout-gridSpace editModal v-gridlayout-editModal fieldset v-gridlayout-fieldset']//div[7]//input[1]")
	WebElement alpha;
	
	@FindBy(xpath="//div[@class='v-horizontallayout v-layout v-horizontal v-widget']//div[@class='v-slot']//div[@class='v-slot']//div[@class='v-gridlayout v-layout v-widget gridSpace v-gridlayout-gridSpace editModal v-gridlayout-editModal fieldset v-gridlayout-fieldset']//input[@class='v-filterselect-input']")
	WebElement uomBox;
	
	@FindBy(xpath="//div[@class='v-horizontallayout v-layout v-horizontal v-widget']//div[@class='v-slot']//div[@class='v-slot']//div[@class='v-gridlayout v-layout v-widget gridSpace v-gridlayout-gridSpace editModal v-gridlayout-editModal fieldset v-gridlayout-fieldset']//div[@class='v-filterselect-button']")
	WebElement uomFilter;
	
	@FindBy(css="#gwt-uid-18")
	WebElement kitHeader;
	
	@FindBy(css="#gwt-uid-19")
	WebElement kitComp;
	
	@FindBy(xpath="//div[@class='v-horizontallayout v-layout v-horizontal v-widget gridSpace v-horizontallayout-gridSpace editModal v-horizontallayout-editModal fieldset v-horizontallayout-fieldset']//input[@class='v-filterselect-input']")
	WebElement idBox;
	
	@FindBy(xpath="//div[@class='v-horizontallayout v-layout v-horizontal v-widget gridSpace v-horizontallayout-gridSpace editModal v-horizontallayout-editModal fieldset v-horizontallayout-fieldset']//div[@class='v-filterselect-button']")
	WebElement idFilter;
	
	@FindBy(xpath="//span[contains(text(),'Item Attributes')]")
	WebElement itemAttr;
	
	@FindBy(xpath="//body[@class='v-generated-body v-sa v-ch v-webkit v-android v-touch']/div[@id='appmanager-303111788']/div[@class='v-ui v-scrollable']/div[@class='v-verticallayout v-layout v-vertical v-widget v-has-width']/div[@class='v-slot v-slot-main-bg']/div[@class='v-verticallayout v-layout v-vertical v-widget main-bg v-verticallayout-main-bg v-has-width']/div[@class='v-slot v-slot-featureLayout']/div[@class='v-horizontallayout v-layout v-horizontal v-widget featureLayout v-horizontallayout-featureLayout v-has-width']/div[@class='v-expand']/div[@class='v-slot']/div[@class='v-panel v-widget v-has-width']/div[@class='v-panel-content v-scrollable']/div[@class='v-absolutelayout v-layout v-widget v-has-width v-has-height']/div/div[@class='v-absolutelayout-margin']/div[@class='v-absolutelayout-wrapper']/div[@id='ItemInfoMainLayout']/div/div[@class='v-absolutelayout-margin']/div[@class='v-absolutelayout-wrapper']/div[@class='v-tabsheet v-widget v-has-width v-has-height']/div[@class='v-tabsheet-content']/div[@class='v-tabsheet-tabsheetpanel']/div[@class='v-scrollable']/div[@class='v-verticallayout v-layout v-vertical v-widget']/div[@class='v-slot']/div[@class='v-verticallayout v-layout v-vertical v-widget v-has-width']/div[@class='v-slot']/div[@class='v-horizontallayout v-layout v-horizontal v-widget']/div[@class='v-slot']/div[@class='v-verticallayout v-layout v-vertical v-widget']/div[3]/div[1]/div[3]/div[1]/div[3]/input[1]")
	WebElement prodType;
	
	@FindBy(xpath="//body[@class='v-generated-body v-sa v-ch v-webkit v-android v-touch']/div[@id='appmanager-303111788']/div[@class='v-ui v-scrollable']/div[@class='v-verticallayout v-layout v-vertical v-widget v-has-width']/div[@class='v-slot v-slot-main-bg']/div[@class='v-verticallayout v-layout v-vertical v-widget main-bg v-verticallayout-main-bg v-has-width']/div[@class='v-slot v-slot-featureLayout']/div[@class='v-horizontallayout v-layout v-horizontal v-widget featureLayout v-horizontallayout-featureLayout v-has-width']/div[@class='v-expand']/div[@class='v-slot']/div[@class='v-panel v-widget v-has-width']/div[@class='v-panel-content v-scrollable']/div[@class='v-absolutelayout v-layout v-widget v-has-width v-has-height']/div/div[@class='v-absolutelayout-margin']/div[@class='v-absolutelayout-wrapper']/div[@id='ItemInfoMainLayout']/div/div[@class='v-absolutelayout-margin']/div[@class='v-absolutelayout-wrapper']/div[@class='v-tabsheet v-widget v-has-width v-has-height']/div[@class='v-tabsheet-content']/div[@class='v-tabsheet-tabsheetpanel']/div[@class='v-scrollable']/div[@class='v-verticallayout v-layout v-vertical v-widget']/div[@class='v-slot']/div[@class='v-verticallayout v-layout v-vertical v-widget v-has-width']/div[@class='v-slot']/div[@class='v-horizontallayout v-layout v-horizontal v-widget']/div[@class='v-slot']/div[@class='v-verticallayout v-layout v-vertical v-widget']/div[3]/div[1]/div[3]/div[1]/div[5]/input[1]")
	WebElement unId;
	
	@FindBy(css="#gwt-uid-20")
	WebElement serial;
	
	@FindBy(css="#gwt-uid-21")
	WebElement autoGenSer;
	
	@FindBy(css="#gwt-uid-22")
	WebElement captureSer;
	
	@FindBy(xpath="//div[@class='v-verticallayout v-layout v-vertical v-widget fieldset v-verticallayout-fieldset v-has-width']//img[@class='v-icon']")
	WebElement statusEdit;
	
	@FindBy(xpath="//span[contains(text(),'Item Notes')]")
	WebElement itemNotes;
	
	@FindBy(xpath="//span[contains(text(),'Site Summary Info')]")
	WebElement siteSummary;
	
	@FindBy(xpath="//span[contains(text(),'Item Replacement')]")
	WebElement itemReplace;
	
	@FindBy(xpath="//span[contains(text(),'Cancel')]")
	WebElement cancel;
	
	@FindBy(xpath="//span[contains(text(),'Save')]")
	WebElement save;

	public WebElement getGlobalEdit() {
		return globalEdit;
	}

	public WebElement getMfgCode() {
		return mfgCode;
	}

	public WebElement getUpcInfo() {
		return upcInfo;
	}

	public WebElement getDeptGrpBox() {
		return deptGrpBox;
	}

	public WebElement getDeptGrpFilter() {
		return deptGrpFilter;
	}

	public WebElement getDeptBox() {
		return deptBox;
	}

	public WebElement getDeptFilter() {
		return deptFilter;
	}

	public WebElement getClassBox() {
		return classBox;
	}

	public WebElement getClassFilter() {
		return classFilter;
	}

	public WebElement getLineBox() {
		return lineBox;
	}

	public WebElement getLineFilter() {
		return lineFilter;
	}

	public WebElement getGLCatBox() {
		return GLCatBox;
	}

	public WebElement getGLCatFilter() {
		return GLCatFilter;
	}

	public WebElement getNonRev() {
		return nonRev;
	}

	public WebElement getStoreCoupon() {
		return storeCoupon;
	}

	public WebElement getNegPrice() {
		return negPrice;
	}

	public WebElement getNonInv() {
		return nonInv;
	}

	public WebElement getSupply() {
		return supply;
	}

	public WebElement getFlex() {
		return flex;
	}

	public WebElement getMeas() {
		return meas;
	}

	public WebElement getCore() {
		return core;
	}

	public WebElement getReorder() {
		return reorder;
	}

	public WebElement getDisc() {
		return disc;
	}

	public WebElement getObsolete() {
		return obsolete;
	}

	public WebElement getDownloadPOS() {
		return downloadPOS;
	}

	public WebElement getWebEnabled() {
		return webEnabled;
	}

	public WebElement getWebNonInv() {
		return webNonInv;
	}

	public WebElement getDesc() {
		return desc;
	}

	public WebElement getReceipt() {
		return receipt;
	}

	public WebElement getAlpha() {
		return alpha;
	}

	public WebElement getUomBox() {
		return uomBox;
	}

	public WebElement getUomFilter() {
		return uomFilter;
	}

	public WebElement getKitHeader() {
		return kitHeader;
	}

	public WebElement getKitComp() {
		return kitComp;
	}

	public WebElement getIdBox() {
		return idBox;
	}

	public WebElement getIdFilter() {
		return idFilter;
	}

	public WebElement getItemAttr() {
		return itemAttr;
	}

	public WebElement getProdType() {
		return prodType;
	}

	public WebElement getUnId() {
		return unId;
	}

	public WebElement getSerial() {
		return serial;
	}

	public WebElement getAutoGenSer() {
		return autoGenSer;
	}

	public WebElement getCaptureSer() {
		return captureSer;
	}

	public WebElement getStatusEdit() {
		return statusEdit;
	}

	public WebElement getItemNotes() {
		return itemNotes;
	}

	public WebElement getSiteSummary() {
		return siteSummary;
	}

	public WebElement getItemReplace() {
		return itemReplace;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getSave() {
		return save;
	}
	
}
