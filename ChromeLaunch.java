import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create Driver object for Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ice101lb01.rn.int.cc.salesforce.com:9000/security/admin/index.html#/login");
		driver.findElement(By.id("input_0")).sendKeys("SLA3");
	}

}
