package PopupHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser value");
		String bv=sc.next();
		
		if(bv.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		}
		
		else if(bv.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			FirefoxOptions fo=new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			driver=new FirefoxDriver(fo);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
		}
		else if(bv.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			EdgeOptions eo=new EdgeOptions();
			eo.addArguments("--disable-notifications");
			driver=new EdgeDriver(eo);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
		}
		else {
			System.out.println("enter valid browser");
		}
		
		//Thread.sleep(3000);
		
		//driver.close();
	}

}
