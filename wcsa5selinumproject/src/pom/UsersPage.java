package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage {
	
	
	@FindBy(xpath="//input[@value='Create New User")private WebElement userListCreate;
	@FindBy(name="username")private WebElement username;
	@FindBy(xpath="//*[@name='passwordText']")private WebElement pass;
	@FindBy(xpath="//*[@name='passwordText']")private WebElement reTypePass;
	@FindBy(xpath="//*[@name='firstName']")private WebElement fName;
	@FindBy(xpath="//*[@name='lastName']")private WebElement lName;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement;
	

}
