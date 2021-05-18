import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Driver object for Firefox
		System.setProperty("webdriver.ie.driver", "C:\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://ice101lb01.rn.int.cc.salesforce.com:9000/security/admin/index.html#/login");
		driver.findElement(By.id("input_0")).sendKeys("SLA3");
		//driver.close();
		//driver.quit();
	}

}
