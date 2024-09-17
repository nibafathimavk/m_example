package testNgPkg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ScrollTest {
	@DataProvider (name = "scroll-test")
	public Object[][] dpMethod(){
	return new Object[][] {{"a","b"}, {"xy","z"},{"pq","rs"}};
	}
  @Test
  public void scrollTeatCase() {
	  System.setProperty("webdriver.ChromeDriver", "D:\\Driver\\chromedriver-win64\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,4500)");
	    WebElement element =driver.findElement(null);
	    js.executeScript("arguments[0].click()", element);     //for click
  }
}

//sending and holding values using javascriptexecutor
//
//public void sendValueUsingJavaScript(WebDriver driver,WebElement element,String value) {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].value = '"+value+"'", element);     ---sending values
//}
//public void blurThePlaceHolder(WebDriver driver,WebElement element) {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].blur()", element);      ----holding values in placeholder
//}
