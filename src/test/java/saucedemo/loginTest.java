package saucedemo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.BaseTest;

public class loginTest extends BaseTest {

	public WebDriver driver;

	

@BeforeTest
public void initialize() throws IOException
{
	driver = initializeDriver();	
	
		
		
	}

	@Test(dataProvider = "data")
	public void loginTest(String username, String password) throws InterruptedException {
		driver.get(props.getProperty("URL"));
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		loginPage.clearloginfields();
	}

	@AfterTest()
	public void teardown() {

		driver.close();
	}

	@DataProvider
	public String[][] data() {
		String[][] data = new String[2][2];

		data[0][0] = "locked_out_user";
		data[0][1] = "secret_sauce";

		data[1][0] = "standard_user";
		data[1][1] = "secret_sauce";

		return data;

	}

}
