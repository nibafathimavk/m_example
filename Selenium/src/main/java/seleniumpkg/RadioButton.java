package seleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		maleRadioButton.click();
		WebElement femaleRadioButton=driver.findElement(By.id("inlineRadio2"));
		femaleRadioButton.click();
		WebElement selectButton=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		selectButton.click();
		boolean maleEnableOrNot=maleRadioButton.isEnabled();
		System.out.println(maleEnableOrNot);
		boolean femaleEnableOrNot=femaleRadioButton.isEnabled();
		System.out.println(femaleEnableOrNot);
		boolean maleRadioButtonEnable=maleRadioButton.isEnabled();
		System.out.println(maleRadioButtonEnable);
		boolean femaleRadioButtonEnable=femaleRadioButton.isEnabled();
		System.out.println(femaleRadioButtonEnable);
		boolean maleRadioButtonDisplayed=maleRadioButton.isDisplayed();
		System.out.println(maleRadioButtonDisplayed);
		boolean femaleRadioButtonDisplayed=maleRadioButton.isDisplayed();
		System.out.println(femaleRadioButtonDisplayed);
		//Group radio button demo
		WebElement groupMaleButton=driver.findElement(By.id("inlineRadio11"));
		WebElement groupFemaleButton=driver.findElement(By.id("inlineRadio21"));
		WebElement ageButton_1_18=driver.findElement(By.xpath("//*[@id=\"inlineRadio22\"]"));
		WebElement ageButton_19_44=driver.findElement(By.xpath("//*[@id=\"inlineRadio23\"]"));
		WebElement ageButton_45_60=driver.findElement(By.xpath("//input[@id='inlineRadio24']"));
		WebElement resultButton=driver.findElement(By.xpath("//button[text()='Get Results']"));
		groupMaleButton.click();
		groupFemaleButton.click();
		ageButton_1_18.click();
		ageButton_19_44.click();
		ageButton_45_60.click();
		resultButton.click();
		boolean groupMaleSelect=groupMaleButton.isSelected();
		System.out.println(groupMaleSelect);
		boolean groupFemaleSelect=groupFemaleButton.isSelected();
		System.out.println(groupFemaleSelect);
		boolean ageButton1_Select=ageButton_1_18.isSelected();
		System.out.println(ageButton1_Select);
		boolean ageButton2_Select=ageButton_19_44.isSelected();
		System.out.println(ageButton2_Select);
		boolean ageButton3_Select=ageButton_45_60.isSelected();
		System.out.println(ageButton3_Select);
		boolean result_Select=resultButton.isSelected();
		System.out.println(result_Select);
		
		
		boolean groupMaleEnable=groupMaleButton.isEnabled();
		System.out.println(groupMaleEnable);
		boolean groupFemaleEnable=groupFemaleButton.isEnabled();
		System.out.println(groupFemaleEnable);
		boolean ageButton1_Enable=ageButton_1_18.isEnabled();
		System.out.println(ageButton1_Enable);
		boolean ageButton2_Enable=ageButton_19_44.isEnabled();
		System.out.println(ageButton2_Enable);
		boolean ageButton3_Enable=ageButton_45_60.isEnabled();
		System.out.println(ageButton3_Enable);
		boolean result_Enable=resultButton.isEnabled();
		System.out.println(result_Enable);
		
		boolean groupMaleDisplay=groupMaleButton.isDisplayed();
		System.out.println(groupMaleDisplay);
		boolean groupFemaleDisplay=groupFemaleButton.isDisplayed();
		System.out.println(groupFemaleDisplay);
		boolean ageButton1_Display=ageButton_1_18.isDisplayed();
		System.out.println(ageButton1_Display);
		boolean ageButton2_Display=ageButton_19_44.isDisplayed();
		System.out.println(ageButton2_Display);
		boolean ageButton3_Display=ageButton_45_60.isDisplayed();
		System.out.println(ageButton3_Display);
		boolean result_Display=resultButton.isDisplayed();
		System.out.println(result_Display);
	}
}
