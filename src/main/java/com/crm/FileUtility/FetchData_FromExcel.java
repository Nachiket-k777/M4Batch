package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchData_FromExcel  {
	@Test
public static void excel(String s,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("E:\\Practice Prog\\Automation\\Vitiger_SearchTextfield.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	String data = sheet.getRow(0).getCell(0).toString();
	System.out.println(data);
	
}
}
