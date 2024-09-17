package seleniumpkg;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropTry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\LatestChrome2.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();  
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		executor.executeScript("scroll(0,500)");
WebElement element1=driver.findElement(By.xpath("//li[@id='credit1']//a[@class='button button-orange']"));
WebElement source1=driver.findElement(By.xpath("//ol[@id='loan']//li[@class='placeholder']"));
WebElement element2=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[4]/a"));
WebElement source2=driver.findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/ol/li"));
Actions act=new Actions(driver);
act.dragAndDrop(element1, source1).perform();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
act.dragAndDrop(element2, source2).perform();
	}

}
