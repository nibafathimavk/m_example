package testNgPkg;

import org.testng.annotations.Test;

public class basicAnnotations {
  @Test(priority=1)                     //for setting priority--first tc with no priorities will be executed then tc with priority will run with priority order and if 2 tc has same priority that is executed based on as alphabetic order
  public void TestCase07() {
	  System.out.println("TestCase07");
  }
  @Test(priority=2)   //
  public void TestCase02() {
	  System.out.println("TestCase02");
  }
  @Test(priority=1)
  public void TestCase03() {
	  System.out.println("TestCase03");
  }
  @Test(enabled=false)            //for running/not running particular testcase we can use enabled=true/false
  public void TestCase04() {
	  System.out.println("TestCase04");
  }
  @Test
  public void TestCase05() {
	  System.out.println("TestCase05");
  }
}
