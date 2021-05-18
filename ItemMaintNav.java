import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ItemMaintNav {

	public static void main(String[] args) throws IOException {
		Properties testdata = new Properties ();
		FileInputStream file = new FileInputStream("G:\\My Drive\\Selenium\\SeleniumTraining\\src\\testdata.properties");
		testdata.load(file);
		WebDriver driver = AppMgrSelenium.setDriver();
		driver.get(testdata.getProperty("appmgr101"));
		AppMgrSelenium.login(testdata.getProperty("username"), testdata.getProperty("pwd"), driver);
		AppMgrSelenium.waitTime(15,driver);	
		AppMgrSelenium.launchItemsMenu(driver);
		AppMgrSelenium.waitTime(15,driver);	
		AppMgrSelenium.itemMaint(driver);
		AppMgrSelenium.waitTime(15,driver);	
		AppMgrSelenium.getSKU(testdata.getProperty("sku"), driver);
		AppMgrSelenium.countCheckboxes(driver);
		AppMgrSelenium.clickCheckbox("#gwt-uid-2", driver);
		
	}

}
