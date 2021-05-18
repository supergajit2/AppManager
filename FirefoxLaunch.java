import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Driver object for Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://ice101lb01.rn.int.cc.salesforce.com:9000/security/admin/index.html#/login");
		System.out.println (driver.getTitle());
		//URL correct? Redirected?
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		
	}

}