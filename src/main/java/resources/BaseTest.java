package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.Timeout;

public class BaseTest {
	
	public WebDriver driver;
	public FileInputStream fis;
	public Properties props;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		String datapropertiespath = "\\src\\main\\java\\resources\\data.properties";
		 String projectpath= System.getProperty("user.dir");
		  fis = new FileInputStream(projectpath+datapropertiespath);
		 
		  props = new Properties();
		 props.load(fis);
		 
		 if(props.get("Browser").equals("Chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", projectpath+"\\src\\main\\java\\resources\\chromedriver.exe");
			 driver = new ChromeDriver();
		 }
		 
		 if(driver==null)
			{
				//System.out.println("driver is null");
				
			}
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().getCookies();
		return driver;	
		
		
	}
	
	
	

	
	
	
	
	

}





