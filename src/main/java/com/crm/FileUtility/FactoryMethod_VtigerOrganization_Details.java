package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FactoryMethod_VtigerOrganization_Details {
	public static String excel(String s,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("E:/Vtiger_OrganizationDetails.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		String data = sheet.getRow(row).getCell(cell).toString();
		return data;
}
}
