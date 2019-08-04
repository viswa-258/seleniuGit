package com.datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPage_Amazon {
	public WebDriver driver;
	@Test(dataProvider="wordpressData")
	public void Loginpage(String username, String password) throws Exception {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Viswanadh\\Downloads\\SoftWare\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_signin&");
	
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.findElement(By.id("nav-link-accountList")).click();
	
	driver.findElement(By.id("ap_email")).sendKeys(username);
	
	System.out.println("username");
	
	driver.findElement(By.id("continue")).click();
	System.out.println("Password");
	Thread.sleep(2000);
	driver.findElement(By.id("ap_password")).sendKeys(password);
	
	driver.findElement(By.id("signInSubmit")).click();

	

}
	@DataProvider(name="wordpressData")
public Object[][] passdata()
{
Object[][] data=new Object[3][2];
data[0][0]="viswanadh7845@gmail.com";
data[0][1]="viswanadh7845";

data[1][0]="viswanadh7846@gmail.com";
data[1][1]="viswanadh7846";

data[2][0]="viswanadh7846@gmail.com";
data[2][1]="viswanadh7846";

	
	
	
	return data;
	
} 

}
