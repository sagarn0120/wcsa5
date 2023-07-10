package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-k938cu7e/login.do");
		
		WebElement checkbox=driver.findElement(By.name("remember"));
		boolean verify=checkbox.isSelected();
		System.out.println(verify);
		Thread.sleep(2000);
		checkbox.click();
		Thread.sleep(2000);
		boolean verify1=checkbox.isSelected();
		System.out.println(verify1);

	}

}
