import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

// Methods to perform automated tasks in AppMgr application.
public class AppMgrSelenium {
	
	public static WebDriver setDriver ( ) throws IOException {
		WebDriver driver = null;
		Properties testdata = new Properties ();
		FileInputStream file = new FileInputStream("C:\\Users\\super\\Google Drive\\workspace\\SeleniumTraining\\src\\testdata.properties");
		testdata.load(file);
		if ( testdata.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		} else if ( testdata.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		return driver;
	}	
	
	// Change the wait time to allow pages to load
	public static void waitTime(int sec, WebDriver driver ) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	// Login to AppMgr...this may not work on the first try...need to improve this
	// one
	public static void login(String user, String password, WebDriver driver) {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[@class='v-button-caption']")).click();
	}

	// Logout of AppMgr
	public static void logout(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	}

	// Open the Items menu
	public static void launchItemsMenu(WebDriver driver) {
		driver.findElement(By.xpath("//span[@class='v-menubar-menuitem-caption']")).click();
	}

	// LAunch Item Maint. from the Item menu
	public static void itemMaint(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'Item Maintenance')]")).click();
	}

	// Launch Item Creation from the ITems menu
	public static void itemCreateMenu(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'Item Creation')]")).click();
	}

	// Click the Duplicate Check button
	public static void performDupCheck(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'Duplicate Check')]")).click();
	}

	// PErform a Duplicate check with a MFG Code
	public static void dupCheckMFG(String mfgCd, WebDriver driver) {
		WebElement mfgCode = driver.findElement(By.xpath(
				"//*[@id=\"appmanager-303111788\"]/div/div[2]/div/div/div[3]/div/div/div/div/div[2]/div/div[1]/div/div[3]/div/div[3]/input"));
		mfgCode.sendKeys(mfgCd);
		mfgCode.sendKeys(Keys.ENTER);
	}

	// Perform a duplicate check with a UPC
	public static void dupCheckUPC(String upc, WebDriver driver) {
		WebElement upcId = driver.findElement(By.xpath("//div[6]//input[1]"));
		upcId.sendKeys(upc);
		upcId.sendKeys(Keys.ENTER);
	}

	// Get next set of options from drop-down lists
	public static void getNextPage(WebDriver driver) {
		driver.findElement(By.xpath("//div[@class='v-filterselect-nextpage']//span[contains(text(),'Next')]")).click();
	}

	// Select an Item Type.....use contains(text) like this: contains(text(),
	// '"+type+"')
	public static void setItemType(String type, WebDriver driver) {
		driver.findElement(By.xpath("//div[@id='appmanager-303111788-overlays']//div[@class='v-slot']//div[3]//div[2]//div[1]")).click();
		// Optional to get next set of 10 options from drop-down
		//getNextPage(driver);
		driver.findElement(By.xpath("//span[contains(text(), '" + type.toUpperCase() + "')]")).click();
	}

	// Select a Site or Group from the drop-down....the contains(text) doesn't like
	// vars so have to hard code site # for now
	public static void setSiteGroup(String site, WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='gwt-uid-6']")).sendKeys(site);
		driver.findElement(By.xpath("//span[contains(text(),'" + site.toUpperCase() + "')]")).click();
	}

	// Enter a description
	public static void setDescription(String desc, WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='gwt-uid-8']")).sendKeys(desc);
	}

	// Select a Dept. Group from the drop-down
	public static void setDeptGrp(String deptGroup, WebDriver driver) {
		driver.findElement(By.xpath("//input[@id='gwt-uid-10']")).sendKeys(deptGroup);
		driver.findElement(By.xpath("//span[contains(text(), '" + deptGroup + "')]")).click();
	}

	// Select a Dept from the drop-down....this field is disabled until DeptGrp is
	// selected and it is throwing errors
	public static void setDept(String dpt, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='gwt-uid-12']")));
		driver.findElement(By.xpath("//input[@id='gwt-uid-12']")).sendKeys(dpt);
		driver.findElement(By.xpath("//span[contains(text(), '" + dpt + "')]")).click();
	}

	// Select a class from the drop-down...this field is disabled until a Dept is
	// selected and is throwing errors.
	public static void setCls(String clss, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='gwt-uid-14']")));
		driver.findElement(By.xpath("//input[@id='gwt-uid-14']")).sendKeys(clss);
		driver.findElement(By.xpath("//span[contains(text(),'" + clss + "')]")).click();
	}

	// Select a line from the drop-down....this field is disabled until a class is
	// entered and is throwing errors
	public static void setLine(String ln, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='gwt-uid-16']")));
		driver.findElement(By.xpath("//input[@id='gwt-uid-16']")).sendKeys(ln);
		driver.findElement(By.xpath("//span[contains(text(),'" + ln + "')]")).click();
	}

	// Only for Les CTs
	public static void setCat (String cat, WebDriver driver ) {
		driver.findElement(By.id("gwt-uid-20")).sendKeys(cat);
		driver.findElement(By.xpath("//span[contains(text(),'" + cat + "')]")).click();
	}
	
	// Enter a UPC on the Global Information window
	public static void setUpcGlobalInfo(String upc, WebDriver driver) {
		driver.findElement(By.xpath(
				"//*[@id=\"appmanager-303111788-overlays\"]/div[3]/div/div/div[3]/div/div/div[2]/div/div[1]/div/div[2]/div/div[5]/div/div[7]/input")).sendKeys(upc);
	}

	// Select a Unit of Measure
	public static void setUnitOfMeasure(String unit, WebDriver driver) {
		driver.findElement(By.xpath("//div[4]//div[1]//div[3]//div[2]//div[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'" + unit + "')]")).click();
	}

	// Click next on Global Information
	public static void clickNext(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	}

	public static void clickBack(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'Back')]")).click();
	}

	public static void clickAdditionalAttr(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'Additional Attributes')]")).click();

	}

	public static void clickDone(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
	}

		
	public static void addAttr(String attrName, String attrValue, WebDriver driver) {
		driver.switchTo().activeElement();
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"//div[@class='contentButton iconFlatButton firstButton addIconButton']//img[@class='v-icon']")));
		driver.findElement(By.xpath("//div[@class='contentButton iconFlatButton firstButton addIconButton']//img[@class='v-icon']")).click();
		WebElement addItem = driver.findElement(By.xpath(
				"//div[@class='v-window v-widget']//div[@class='v-verticallayout v-layout v-vertical v-widget v-has-width']"));
		addItem.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[7]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/input[1]")).sendKeys(attrName.toUpperCase());
		addItem.findElement(By.xpath("//span[contains(text(),'" + attrName.toUpperCase() + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html[1]/body[1]/div[2]/div[7]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[2]/td[2]/div[2]/div[1]/div[2]/input[1]")));
		addItem.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[7]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[2]/td[2]/div[2]/div[1]/div[2]/input[1]")).sendKeys(attrValue.toUpperCase());
		addItem.findElement(By.xpath("//td[@class='gwt-MenuItem gwt-MenuItem-selected']")).click();
		addItem.findElement(By.xpath("//div[@class='contentButton save preferred']//span[@class='v-button-caption'][contains(text(),'Add')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
		
	}

	public static void removeAttr(WebDriver driver) {

	}

	public static void editAttr(WebDriver driver) {

	}

	// Enter a price
	public static void setPriceLevel1(String price, WebDriver driver) {
		WebElement price1 = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/input[1]"));
		price1.clear();
		price1.sendKeys(price);
	}

	public static void setVendor( String vendor, WebDriver driver) {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(vendor);
	}
	
	public static void setVendorItem ( String vendItem, WebDriver driver ) {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/div[1]/div[3]/div[1]/div[7]/input[1]")).sendKeys(vendItem);
	}
	
	
	public static void setPackQty( String qty, WebDriver driver) {
		WebElement packQty = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/div[1]/div[3]/div[1]/div[11]/input[1]"));
		packQty.sendKeys(qty);
	}
	
	// Set the PAck Cost
	public static void setPackCost(String cost, WebDriver driver) {
		WebElement packCost = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/div[1]/div[3]/div[1]/div[13]/input[1]"));
		packCost.clear();
		packCost.sendKeys(cost);
	}

	// Click the Create Item button
	public static void clickCreateItem(WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'Create Item')]")).click();
	}

	// Copy the item identifier to the clipboard
	public static String copy2Clipboard ( WebDriver driver ) {
		String item = driver.findElement(By.xpath("//div[@id='appmanager-303111788-overlays']//div[7]")).getText();
		driver.findElement(By.xpath("//span[contains(text(),'Copy to Clipboard')]")).click();
		return item;
	}
	
	public static void clickOK (WebDriver driver) {
		driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
	}
	// Enter a SKU on Item Maint.
	public static void getSKU(String sku, WebDriver driver) {
		WebElement skuText = driver
				.findElement(By.xpath("//input[@class='v-textfield v-widget v-has-width v-textfield-prompt']"));
		skuText.sendKeys(sku);
		skuText.sendKeys(Keys.ENTER);
	}

	// Get the number of checkboxes
	public static int countCheckboxes(WebDriver driver) {
		int count = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(count);
		return count;
	}

	// Click the PRicing & Costing tab
	public static void getPriceAndCostTab(WebDriver driver) {
		driver.findElement(By.xpath("//div[contains(text(),'Pricing & Costing')]")).click();
	}

	// Click the Replenishment Information tab
	public static void getReplenishInfo(WebDriver driver) {
		driver.findElement(By.xpath("//div[contains(text(),'Replenishment Information')]")).click();
	}

	public static void clickEdit(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"ItemInfoMainLayout\"]/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/div/div/span/img")).click();
	}

	public static void clickCheckbox(String checkbox, WebDriver driver) {
		WebElement box2Check = driver.findElement(By.cssSelector(checkbox));
		Assert.assertFalse(box2Check.isSelected());
		box2Check.click();
		Assert.assertTrue(box2Check.isSelected());
	}
}
