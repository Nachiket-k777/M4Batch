package com.crm.JavaUtility;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import com.crm.FileUtility.FactoryMethod_VtigerOrganization_Details;

public class Read_OrganizationData {
	public static String organizationName;
	public static String websiteName;
	public static String symbol;
	public static String employees;
	public static String email2;
	public static String phoneNo;
	public static String  otherPhoneNo;
	
	public static void readData() throws EncryptedDocumentException, IOException {
		 organizationName = FactoryMethod_VtigerOrganization_Details.excel("Sheet1", 0, 0);
		 websiteName = FactoryMethod_VtigerOrganization_Details.excel("Sheet1", 1, 0);
		 symbol = FactoryMethod_VtigerOrganization_Details.excel("Sheet1", 2, 0);
		 employees = FactoryMethod_VtigerOrganization_Details.excel("Sheet1", 3, 0);
		 email2 = FactoryMethod_VtigerOrganization_Details.excel("Sheet1", 4, 0);
		 phoneNo = FactoryMethod_VtigerOrganization_Details.excel("Sheet1", 5, 0);
	}
}
