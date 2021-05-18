import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Create an Item from the Items Menu option
public class CreateItemMenu extends AppMgrSelenium {

	public static void main(String[] args) throws IOException {
		ArrayList<String> tests = new ArrayList<String>(Arrays.asList("test1", "test2", "test3", "test4", "test5"));
		//System.out.println(tests.get(0));
		Excel e = new Excel();	

		for (int i = 0; i < tests.size(); i++) {
			ArrayList<String> data = e.getData(tests.get(i));
			System.out.println(data.size());
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://ice101lb01.rn.int.cc.salesforce.com:8943/app-manager/?app_name=ar-print-statements");
			waitTime(15, driver);
			login(data.get(1), data.get(2), driver);
			launchItemsMenu(driver);
			itemCreateMenu(driver);
			dupCheckMFG(data.get(3), driver);
			setItemType(data.get(4), driver);
			setSiteGroup(data.get(5), driver);
			setDescription(data.get(6), driver);
			setDeptGrp("700", driver);
			setDept("700", driver);
			setCls("1", driver);
			setLine("1", driver); 
			// setCat("STD", driver);
			// setUpcGlobalInfo("20190606", driver); 
			clickNext(driver);
			clickAdditionalAttr(driver);
			addAttr("class", "c", driver);
			clickNext(driver);
			setPriceLevel1(data.get(7), driver);
			setVendor("SA2", driver); //
			//setVendorItem(data.get(8), driver);
			setPackQty("1", driver);
			setPackCost(data.get(9), driver);
			clickCreateItem(driver);
		}

	}

}
