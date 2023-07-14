package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(xpath="//@name='username']") private WebElement usnTB;
	@FindBy(xpath="//@name='pwd']") private WebElement pass;
	@FindBy(xpath="//@id='loginButton']") private WebElement loginbtn;
	//@FindBy(xpath="//@id='loginButton']") private WebElement ;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	public WebElement getUsnTB() {
		return usnTB;
	}

	public void setUsnTB(WebElement usnTB) {
		this.usnTB = usnTB;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}
	
}
