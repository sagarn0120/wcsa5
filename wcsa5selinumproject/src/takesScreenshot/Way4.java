package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		 File src=driver.getScreenshotAs(OutputType.FILE);
		 
		 File dest=new File("./screenshots/w444.png");
		 Files.copy(src, dest);
		 
		 driver.close();
	}

}
