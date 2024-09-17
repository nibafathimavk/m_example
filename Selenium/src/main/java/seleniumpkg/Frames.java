package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Driver\\\\LatestChrome2.0\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		//Switch by name/id
		//driver.switchTo().frame("frame1");      //---step 1
		
		//Switch by web element
		WebElement iframeElement=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement); 
		
		WebElement frameText=driver.findElement(By.id("sampleHeading"));  //---step2
		System.out.println(frameText.getText());
		
		//Switching back to parent                  ---step 3
		//driver.switchTo().parentFrame();     
		driver.switchTo().defaultContent();

	}

}
