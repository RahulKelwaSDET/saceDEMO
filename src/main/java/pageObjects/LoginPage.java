package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}

	By usernametext = By.xpath("//input[@data-test='username']");
	By passwordtext = By.cssSelector("input[placeholder='Password']");
	By loginButton = By.id("login-button");

	public void login(String username, String password) throws InterruptedException {
		
		driver.findElement(usernametext).sendKeys(username);	
		driver.findElement(passwordtext).sendKeys(password);
		driver.findElement(loginButton).click();
		
		System.out.println("executed successfully");
		Thread.sleep(5000);
		
	
	
	}
	
	public void clearloginfields() throws InterruptedException
	{
		driver.findElements(usernametext).clear();
		driver.findElements(passwordtext).clear();
		Thread.sleep(2000);
		
		
	}
	

}
