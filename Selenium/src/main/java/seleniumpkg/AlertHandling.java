package seleniumpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php\\r\\n");
		driver.manage().window().maximize();
		WebElement clickMe=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMe.click();
		driver.switchTo().alert().accept(); //for clicking ok button
		WebElement clickMe2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMe2.click();
		String alertText=driver.switchTo().alert().getText(); // for getting the text in the alert box
		System.out.println(alertText);
		driver.switchTo().alert().dismiss();    //for clicking cancel button
		WebElement clickMe3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickMe3.click();
	//	driver.switchTo().alert().sendKeys("hiiiiii");   //for sending text to the alert
		Alert alertSend=driver.switchTo().alert();
		alertSend.sendKeys("Input values");
	     alertSend.accept();
		
		
	}

}
