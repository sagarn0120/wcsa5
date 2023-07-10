package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ASUS/Desktop/wcsa5/wcsa5selinumproject/src/html/a.html");
		driver.findElement(By.linkText("link")).click();
		driver.manage().window().maximize();

	}

}
