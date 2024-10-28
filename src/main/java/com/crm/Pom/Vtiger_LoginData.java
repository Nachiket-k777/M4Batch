package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vtiger_LoginData {
	// constructor //
	public Vtiger_LoginData(WebDriver driver) {
		PageFactory.initElements(driver , this);
	}
		// make variable private //
	private @FindBy(css = "input[name='user_name']")
		 WebElement userName;
		
	private @FindBy(css = "input[name='user_password']")
		WebElement password;
		
	private @FindBy(css = "input[id='submitButton']")
		 WebElement button;
	
	private @FindBy(xpath = "(//td[@class='small'])[2]")
		WebElement administrat;
	
	private @FindBy(xpath = "//a[contains(text(),'Sign Out')]")
		WebElement signOut;
		
		// to access private variables // make getter methods //
		public void getUserName(String data) {
			userName.sendKeys(data);
		}
		public void getPassword(String data) {
			password.sendKeys(data);
		}
		public void getButton() {
			button.click();
		}
		public void getAdministrat() {
			administrat.click();
		}
		public void getLogout() {
			signOut.click();
		}
		
		
//		public void login(String userName, String password) {
//			getUserName(userName);
//			getPassword(password);
//			getButton();
//		}
		
}
