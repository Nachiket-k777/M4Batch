package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.Fetch_VtigerData_From_PropertiesFile;
import com.crm.Pom.Vtiger_LoginData;

public class VTigerBase {
	public static WebDriver driver;
	@BeforeClass
public void preCondition() throws IOException {
		String browser = Fetch_VtigerData_From_PropertiesFile.property("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
			driver =new EdgeDriver();
		} else if(browser.equalsIgnoreCase("safari")) {
			driver=new SafariDriver();
		} else if(browser.equalsIgnoreCase("internetExplorer")) {
			driver=new InternetExplorerDriver();
		} else {
			driver =new ChromeDriver();
		}
		String url = Fetch_VtigerData_From_PropertiesFile.property("url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to(url);
}
	@BeforeMethod
	public void login() throws IOException {
		Vtiger_LoginData ref = new Vtiger_LoginData(driver);
		String username = Fetch_VtigerData_From_PropertiesFile.property("username");
		ref.getUserName(username);
		String password = Fetch_VtigerData_From_PropertiesFile.property("password");
		ref.getPassword(password);
		ref.getButton();
	}
	@AfterMethod
	public void logout() {
//		Vtiger_LoginData ref = new Vtiger_LoginData(driver);
//		ref.getAdministrat();
//		ref.getLogout();
	}
	@AfterClass
	public void postCondition() {
		driver.quit();
	}
}
