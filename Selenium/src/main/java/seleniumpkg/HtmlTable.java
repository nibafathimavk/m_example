package seleniumpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		List<WebElement>tableHeader=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		for(int i=0;i<tableHeader.size();i++)
		{
			String header=tableHeader.get(i).getText();
			System.out.print(header+" ");
		}
//		System.out.println();
//		List<WebElement>tableRows=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));	
//		for(int j=0;j<tableRows.size();j++)
//		{
//			String rows=tableRows.get(j).getText();
//			System.out.print(rows+" ");
//		}
//		System.out.println();
//		List<WebElement>tableColumns=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));	
//		for(int k=0;k<tableColumns.size();k++)
//		{
//			String columns=tableColumns.get(k).getText();
//			System.out.println(columns+" ");
//		}
//		//dynamic table handling
//		System.out.println();
//		List<WebElement>tableColumnsName=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
//		for(int l=0;l<tableColumnsName.size();l++)
//		{
//			if(tableColumnsName.get(l).getText().equals("Ashton Cox"))   //searching a single data from table
//			{
//				String locator="//table[@id='dtBasicExample']//tbody//tr["+(l+1)+"]//td[1]";
//				System.out.println();
//				System.out.println(locator);
//				WebElement name=driver.findElement(By.xpath(locator));
//				System.out.println(name.getText());
//			}
//		}
		//for printing whole table
		System.out.println();
		List<WebElement>tableRowsColumnsName=driver.findElements(By.xpath("//*[@id=\"dtBasicExample\"]/tbody"));
		for(int j=0;j<tableRowsColumnsName.size();j++)
			{
			for(int k=0;k<tableRowsColumnsName.size();k++)
			{
				String rows=tableRowsColumnsName.get(j).getText();
				String columns=tableRowsColumnsName.get(k).getText();
				System.out.print(rows+" ");
				System.out.println(columns+" ");
				System.out.println();				
			}
			}

	}

}
