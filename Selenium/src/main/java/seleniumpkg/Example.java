package seleniumpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import javax.swing.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Example {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.ChromeDriver", "D:\\Driver\\chromedriver-win64\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		List<WebElement> tableHeader=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr/th"));
//		for(int i=0;i<tableHeader.size();i++)
//		{
//			String header=tableHeader.get(i).getText();
//			System.out.print(header);
//		}
//		
//		System.out.println();
//		List<WebElement>tableRows=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));	
//		for(int j=0;j<tableRows.size();j++)
//		{
//			String rows=tableRows.get(j).getText();
//			System.out.print(rows+" ");
//		}
		

		
		
		
		
		
		
		
		
		//fileupload
//		driver.get("https://demo.guru99.com/selenium/upload");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		WebElement chooseFile=driver.findElement(By.id("uploadfile_0"));
//		Actions obj=new Actions(driver);
//		obj.click(chooseFile).perform();
//		StringSelection s1=new StringSelection("C:\\Users\\ASUS\\Desktop\\nii");
//		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
//		 Robot robot = new Robot();     //second way
//	     robot.delay(250);
//	     robot.keyPress(KeyEvent.VK_CONTROL);
//	     robot.keyPress(KeyEvent.VK_V);
//	     
//	     robot.delay(250);
//	     robot.keyRelease(KeyEvent.VK_V);
//	     robot.keyRelease(KeyEvent.VK_CONTROL);	
//	     
//	        
//	     
//	     robot.delay(250);
//	     robot.keyPress(KeyEvent.VK_ENTER);
//	     robot.keyRelease(KeyEvent.VK_ENTER);
//	     WebElement checkbox=driver.findElement(By.id("terms"));
//	     checkbox.click();
//	     WebElement submitButton =driver.findElement(By.id("submitbutton"));
//	     submitButton.click();
		
		//Multipletabhandling
//		driver.get("https://demoqa.com/browser-windows");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		String parentWindow=driver.getWindowHandle();
//		WebElement newTab=driver.findElement(By.id("tabButton"));
//		newTab.click();
//		System.out.println(parentWindow);
//		Set<String> allWindows=driver.getWindowHandles();
//		for(String childWindow:allWindows)
//		{
//			if(!parentWindow.equals(childWindow))
//			{
//				driver.switchTo().window(childWindow);
//				WebElement childText=driver.findElement(By.id("sampleHeading"));
//				System.out.println(childText.getText());
//			}
//		}
//		driver.switchTo().window(parentWindow);
		
		
		//frames
//		driver.get("https://demoqa.com/frames");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		//firstway by name/id
//		WebElement frameid=driver.findElement(By.id("frame1"));
//		driver.switchTo().frame("frame1");
//		//secondway by webelement
//		driver.switchTo().frame(frameid);
//		WebElement frameText=driver.findElement(By.id("sampleHeading"));
//		System.out.println(frameText.getText());
//		driver.switchTo().parentFrame();
		
		
		
		
		
		//keyboard and mouse handling
//		driver.get("https://demoqa.com/buttons");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//		Actions obj=new Actions(driver);
//		WebElement doubleClickMe = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
//		obj.doubleClick(doubleClickMe).perform();
//		 WebElement rightClickMeBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//		 obj.contextClick(rightClickMeBtn).perform();
//		 WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
//		 clickMeBtn.click();
//		 obj.moveToElement(doubleClickMe).perform();
//		 obj.sendKeys(Keys.ARROW_DOWN).perform();
		 
		 
		//draganddrop
//		driver.get("https://demo.guru99.com/test/drag_drop.html");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//implicit wait
//		WebElement dragElement=driver.findElement(By.xpath("//li[@id='credit2']//a[@class='button button-orange']"));
//		WebElement dropLocation=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
//				Actions object=new Actions(driver);
//				object.dragAndDrop(dragElement, dropLocation).perform();
		
		//alerthandling
//		driver.get("https://selenium.obsqurazone.com/javascript-alert.php\\r\\n");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//implicit wait
//		WebElement clickMe1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[3]/div/div[2]/button"));
//		clickMe1.click();
//		String aletrText=driver.switchTo().alert().getText();
//	     System.out.println(aletrText);
//		Alert alertSend=driver.switchTo().alert();
//		alertSend.sendKeys("Input values");
//	     alertSend.accept();
	     
		
		
		//dropdown
//		driver.get("https://selenium.obsqurazone.com/select-input.php\\r\\n");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));//implicit wait
//	   WebElement dropdown=driver.findElement(By.id("single-input-field"));
//	   Select selectObj=new Select(dropdown);
//	   selectObj.selectByIndex(2);
//	   selectObj.selectByValue("Red");
//	   selectObj.selectByVisibleText("Green");
//	   WebElement multiDropdown=driver.findElement(By.id("multi-select-field"));
//	   Select multiSelectObj=new Select(multiDropdown );
//	   for(int i=0;i<3;i++)
//	   {
//		   multiSelectObj.selectByIndex(i);
//	   }
//	   List<WebElement> list=multiSelectObj.getAllSelectedOptions();
//	   for(int j=0;j<list.size();j++)
//	   {
//	   System.out.println(list.get(j).getText());
//	   }
	}

}
