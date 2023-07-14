package pom;

import java.io.IOException;

public class ValidManagerTestcase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BaseTest bt=new BaseTest();
		bt.setUP();
		Flib flib=new Flib();
		
		// to call the webelements of login page create the obj of loginpage class
				
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH,"Username"),flib.readPropertyData(PROP_PATH, "Password"));
		// use homepage Elements create obj of HomePage POM
		//HomePage hp = new HomePage(driver);
		hp.clickOnLogoutLink();
		
	}

}
