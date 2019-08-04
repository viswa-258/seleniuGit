package com.Web_datadriven;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selenium4Testing {
	
	public WebDriver driver;
	public void takeScreenShot(String str) throws Exception{
		  ;
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f, new File("C:\\Users\\Viswanadh\\Downloads\\Selenium Documents\\Screenshot_Seenium.png"));
	}

	
	@Test
	public void Loginpage() throws Exception {
		
	
driver.findElement(By.id("nav-link-accountList")).click();

//driver.findElement(By.linkText("Sign in")).click();

		driver.findElement(By.id("ap_email")).sendKeys("viswanadh7846@gmail.com");
		
		takeScreenShot("username");
		System.out.println("username");
		
		driver.findElement(By.id("continue")).click();
		takeScreenShot("password");
		System.out.println("Password");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("viswanadh7846");
		
		driver.findElement(By.id("signInSubmit")).click();
		takeScreenShot("Homepage");
	}
	@Test
	public void TodayDeals() throws Exception {
		

	driver.findElement(By.linkText("Today's Deals")).click();
	takeScreenShot("TodayDeals");
	System.out.println("tosaydeals");
	Actions a=new Actions(driver);
	a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	
	Thread.sleep(2000);
	a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	
	}
@BeforeTest
public void beforetest() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Viswanadh\\Downloads\\SoftWare\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_signin&");
	
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}

}