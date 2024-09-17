package seleniumpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableTry {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\LatestChrome2.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/invoice/index");
		driver.manage().window().maximize();
	}
}
