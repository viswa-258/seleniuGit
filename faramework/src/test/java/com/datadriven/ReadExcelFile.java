package com.datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	
	//public WebDriver driver;
	public static void main(String[] args) throws Exception {
	//public void ReadExcelfiledata() throws Exception {
		
		File src= new File("C:\\Users\\Viswanadh\\Documents\\Datadriven\\ReadExcelData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
	XSSFSheet sheet1=wb.getSheetAt(0);
	
	String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from Excel is "+data0);
		
	}
}
