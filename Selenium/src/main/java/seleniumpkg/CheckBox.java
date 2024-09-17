package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement checkBox=driver.findElement(By.xpath("//*[@id=\"gridCheck\"]"));
		checkBox.click();
		boolean checkboxEnable=checkBox.isEnabled();
		System.out.println(checkboxEnable);
		boolean checkboxSelect=checkBox.isSelected();
		System.out.println(checkboxSelect);
		boolean checkboxDisplay=checkBox.isDisplayed();
		System.out.println(checkboxDisplay);
		

	}

}
