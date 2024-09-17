package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesTry {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\LatestChrome2.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();		
		//driver.switchTo().frame("frame1");
//		WebElement frameElement=driver.findElement(By.id("frame1"));
//		driver.switchTo().frame(frameElement);
//		WebElement frameText=driver.findElement(By.id("sampleHeading")); 
//		System.out.println(frameText.getText());
		
		WebElement frameElemt=driver.findElement(By.id("frame2"));
        driver.switchTo().frame(frameElemt);
        WebElement frnetxt=driver.findElement(By.id("sampleHeading"));
        		System.out.println(frnetxt.getText());
		;
	}

}
