package com.datadriven;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Amazon_Login {
	
	public WebDriver driver;
	
	@Test 
	public void amazonloginpage() throws Exception {
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Viswanadh\\Documents\\Datadriven\\Amzon1.xls");
		
		Workbook wb=Workbook.getWorkbook(fi);
		
		Sheet sh=wb.getSheet(0);
		
		for (int c =3; c <sh.getColumns(); c++)
		{
		for (int i =0; i <sh.getRows(); i++)
		{
		
			if (sh.getCell(2, i).getContents().equalsIgnoreCase("textbox"))
			{
			driver.findElement(By.id(sh.getCell(0,i).getContents())).sendKeys(sh.getCell(c,i).getContents());	
			}
			else if (sh.getCell(2,i).getContents().equalsIgnoreCase("linktext")) 
			{
			driver.findElement(By.linkText(sh.getCell(0,i).getContents())).click();	
			}	
			
			else if (sh.getCell(2,i).getContents().equalsIgnoreCase("button"))
			{
			driver.findElement(By.id(sh.getCell(0,i).getContents())).click();	
			}
			else if (sh.getCell(2,i).getContents().equalsIgnoreCase("url"))
			{
			
				driver.get(sh.getCell(0,i).getContents());
			}
		
		}
			
		}	
		}

@BeforeTest
public void beforetest() {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Viswanadh\\Downloads\\SoftWare\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
}
}