package seleniumpkg;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class numtiWindowtry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Driver\\LatestChrome2.0\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("https://demoqa.com/browser-windows");
driver.get("https://demoqa.com/buttons");
driver.manage().window().maximize();
//String parentWindow=driver.getWindowHandle();
//WebElement newWindow=driver.findElement(By.id("tabButton"));
//newWindow.click();
//Set<String> allWindows=driver.getWindowHandles();
//for(String childWindow:allWindows) {
//	if(!parentWindow.equals(childWindow)) {
//		driver.switchTo().window(childWindow);
//		WebElement element=driver.findElement(By.id("sampleHeading"));
//		System.out.println(element.getText());
//	}
//	
//}
//Thread.sleep(2000);
//driver.switchTo().window(parentWindow);
//JavascriptExecutor executor=(JavascriptExecutor)driver;
//executor.executeScript("scroll(0,500)");
//Thread.sleep(2000);
//WebElement mouseElementCheck=driver.findElement(By.id("windowButton"));
Actions actionObj=new Actions(driver);
WebElement doubleclickMe=driver.findElement(By.id("doubleClickBtn"));
actionObj.doubleClick(doubleclickMe).perform();
JavascriptExecutor executor=(JavascriptExecutor)driver;
executor.executeScript("scroll(0,300)");
Thread.sleep(2000);
WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
clickMeBtn.click();
Thread.sleep(2000);
WebElement rightClickBtn=driver.findElement(By.id("rightClickBtn"));
actionObj.contextClick(rightClickBtn).perform();





	}

}
