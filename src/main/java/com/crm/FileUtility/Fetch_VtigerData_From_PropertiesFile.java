package com.crm.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fetch_VtigerData_From_PropertiesFile {
public static String property(String key) throws IOException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("./src/test/resources/ConfigurationFile/Vtiger_LoginData.properties");
	prop.load(fis);
	String data = prop.getProperty(key);
	return data;
}
}
