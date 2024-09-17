package testNgPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeAfterMethod {
	@Test                 
	  public void TestCase01() {
		  System.out.println("TestCase01");
	  }
	  @Test   
	  public void TestCase02() {
		  System.out.println("TestCase02");
	  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

}
