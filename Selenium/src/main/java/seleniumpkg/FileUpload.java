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

public class FileUpload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\LatestChrome2.0\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
		//chooseFile.sendKeys("C:\\\\Users\\\\ASUS\\\\Desktop\\\\nii");   //one way 
		
		Actions obj = new Actions(driver);                     //incase choosefile will not be clicked that why here we use action class we can also use .click method also
	    obj.moveToElement(chooseFile).click().perform();
	  
	    //put path to your image in a clipboard
	    StringSelection s1=new  StringSelection("C:\\Users\\ASUS\\Desktop\\download");	 
	   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
	   Robot robot = new Robot();     //second way
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     
	     robot.delay(250);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_CONTROL);	
	     
	        
	     
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     
	     WebElement checkbox=driver.findElement(By.id("terms"));
	     checkbox.click();
	     WebElement submitButton =driver.findElement(By.id("submitbutton"));
	     submitButton.click();
	     
	     
	}

}
