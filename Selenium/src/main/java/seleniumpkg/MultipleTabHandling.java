package seleniumpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		//getting window handles
		String parentWindow=driver.getWindowHandle();
		WebElement newTabClick=driver.findElement(By.id("tabButton"));
		newTabClick.click();
		
		System.out.println(parentWindow);
		//Keeping all window handles in a set
		Set<String> allWindows=driver.getWindowHandles();
		//iterating set with foreach loop
		for(String childWindow : allWindows)
		{
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				WebElement newTabText=driver.findElement(By.id("sampleHeading"));
				System.out.println(newTabText.getText());
			}
		}
	driver.switchTo().window(parentWindow);   //switching back to parent window

	}

}
