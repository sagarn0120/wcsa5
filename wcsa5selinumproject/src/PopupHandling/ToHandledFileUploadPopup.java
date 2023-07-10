package PopupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandledFileUploadPopup {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		WebElement m=driver.findElement(By.xpath("//input[@id='uploadfile']"));
		
		Actions act=new Actions(driver);
		act.doubleClick(m).perform();
		
		Runtime.getRuntime().exec("./AutoItPrograms/OmayoFileUpload.exe");
	}

}
6	