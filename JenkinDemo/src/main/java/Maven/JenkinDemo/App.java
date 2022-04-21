package Maven.JenkinDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App 
{
WebDriver driver;

@Test	
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        
	 	driver = new ChromeDriver();
	 	
	 	driver.manage().window().maximize();
	 	
	 	driver.get("https://www.amazon.in/");
	 	
	 	driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
	 	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("dummyem123@gmail.com");
	 	driver.findElement(By.xpath("//span[@id='continue']")).click();
	 	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("dm@12345");
	 	driver.findElement(By.xpath("//input[@id='signInSubmit']")).submit();
	 	driver.close();
	}

}
