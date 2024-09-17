package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		// Xpath=//tagname[@attribute='value']----locating element using xpath
		WebElement userNameField = driver.findElement(By.xpath("//input[@id='loginform-username']")); // xpath by id
		userNameField.sendKeys("Niba");
		WebElement passwordField = driver.findElement(By.id("loginform-password")); 
		passwordField.sendKeys("password");
		WebElement loginButton=driver.findElement(By.xpath("//button[text()='Login']"));
		loginButton.click();
		userNameField.clear();
		String fontSize=loginButton.getCssValue("font-size");
		System.out.println(fontSize);
		String fontFamily=loginButton.getCssValue("font-family");
		System.out.println(fontFamily);
		String backgroundColor=loginButton.getCssValue("background-color");
		System.out.println(backgroundColor);
		String attributeValue=loginButton.getAttribute("class");
		System.out.println(attributeValue);
		String tagName=loginButton.getTagName();
		System.out.println(tagName);
		String elementText=loginButton.getText();
		System.out.println(elementText);
		driver.close();
	}
}


