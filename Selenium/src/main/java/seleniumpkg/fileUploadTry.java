package seleniumpkg;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileUploadTry {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\LatestChrome2.0\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/selenium/upload");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
WebElement uploadfile=driver.findElement(By.id("uploadfile_0"));
Actions act=new Actions(driver);
act.moveToElement(uploadfile).click().perform();
StringSelection s1=new StringSelection("C:\\Users\\ASUS\\Desktop\\download");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
Robot robot = new Robot(); 
robot.delay(250);
robot.keyPress(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_V);
robot.keyRelease(KeyEvent.VK_CONTROL);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
WebElement checkBox=driver.findElement(By.id("terms"));
checkBox.click();
	}

}
