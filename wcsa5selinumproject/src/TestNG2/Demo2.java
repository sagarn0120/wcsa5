package TestNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void method3() {
	  Reporter.log("this is method 3",true);
  }
  @Test
  public void method4() {
	  int i=0;
	  int j=15;
	  //int res=j/i;
	  Reporter.log("this is method 4",true);
  }
}
