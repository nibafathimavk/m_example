package seleniumpkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BasicSelenium {

	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","driver Path"); 
		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver-win64\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver for edge---download the driver for edge
		//webdriver.edge.driver
		//WebDriver driver = new EdgeDriver();
		//driver for firefox---download the driver for firefox
		//System.setProperty("webdriver.gecko.driver",Path_of_Firefox_Driver"); // Setting system properties of FirefoxDriver
			//WebDriver driver = new FirefoxDriver();
		
//		driver.navigate().to("https://www.google.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		//driver.close();
		driver.quit();
	}

}
