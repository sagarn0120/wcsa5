package qsp;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ToLaunchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		new FirefoxDriver();
		
	}

}
