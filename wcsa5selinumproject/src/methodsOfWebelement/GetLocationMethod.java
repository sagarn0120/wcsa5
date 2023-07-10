package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		//System.out.print((driver.findElement(By.xpath("//h2[.='News']")).getLocation().getX())+(driver.findElement(By.xpath("//h2[.='News']")).getLocation().getY()));
		Point x=driver.findElement(By.xpath("//h2[.='News']")).getLocation();
		//WebElement y=driver.findElement(By.xpath("//h2[].='News']")).getLocation();
		int xaxis=x.getX();
		int yaxis=x.getY();
		System.out.println(xaxis);
		System.out.print(yaxis);
	}

}
