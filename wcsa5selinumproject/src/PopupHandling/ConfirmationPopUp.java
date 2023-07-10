package PopupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ASUS/OneDrive/Desktop/wcsa5/wcsa5selinumproject/src/html/a.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		
		Alert al=driver.switchTo().alert();
		
		//al.accept();
				al.dismiss();
				Thread.sleep(2000);
				
				System.out.println(al.getText());
				al.dismiss();
				driver.close();

	}

}
