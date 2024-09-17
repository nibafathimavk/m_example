package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseAction {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chrome\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//WebDriverManager.firefoxdriver().setup();
			//WebDriver driver = new FirefoxDriver();
			driver.get("https://demoqa.com/buttons");
			driver.manage().window().maximize();
			Actions actionObj = new Actions(driver);
			WebElement doubleClickMe = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
			actionObj.doubleClick(doubleClickMe).perform();
		    WebElement rightClickMeBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
			actionObj.contextClick(rightClickMeBtn).perform();
			 WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
			 actionObj.contextClick(clickMeBtn).perform();
			//Mouse Hovering
		//	actionObj.moveToElement(doubleClickMe);
			//Keyboard action
			//actionObj.sendKeys(Keys.ARROW_DOWN).perform();
			}

	}