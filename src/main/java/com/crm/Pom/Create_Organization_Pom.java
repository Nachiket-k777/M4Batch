package com.crm.Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.JavaUtility.Read_OrganizationData;

public class Create_Organization_Pom {
	public Create_Organization_Pom(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	private @FindBy(xpath = "//a[contains(text(),'Organizations')]")
	WebElement organizations;
	public void getOrganization() {
		organizations.click();
	}
	private @FindBy(xpath = "//*[@id=\"massdelete\"]/table/tbody/tr[1]/td/div/table/tbody/tr[3]/td/div/table/tbody/tr[2]/td/b[1]/a")
	WebElement createAnOrganization;
	public void getCreateOrganization() {
		createAnOrganization.click();
	}
	private @FindBy(css = "input[name='accountname']")
	WebElement organizationName;
	public void getOrganizationName(String data) {
		organizationName.sendKeys(data);
	}
	private @FindBy(css = "input[name='website']")
	WebElement website;
	public void getWebsite(String data) {
		website.sendKeys(data);
	}
	private @FindBy(css = "input[id='tickersymbol']")
	WebElement symbol;
	public void getSymbol(String data) {
		symbol.sendKeys(data);
	}
	private @FindBy(css = "input[id='employees']")
	WebElement employees;
	public void getEmployees(String data) {
		employees.sendKeys(data);
	}
	private @FindBy(css = "input[id='email2']")
	WebElement email2;
	public void getEmail2(String data) {
		email2.sendKeys(data);
	}
	private @FindBy(css = "select[name='industry']")
	WebElement industryDropDown;
	public void getIndustryDropdown() {
		Select sel = new Select(industryDropDown);
		List<WebElement> options = sel.getOptions();
		for (WebElement web : options) {
			web.click();
		}
	}
	private @FindBy(css = "select[name='accounttype']")
	WebElement typeDropDown;
	public void getTypeDropDown() {
		Select sel = new Select(typeDropDown);
		List<WebElement> options = sel.getOptions();
		for (WebElement web : options) {
			web.click();
		}
	}
	private @FindBy(css = "input[name='emailoptout']")
	WebElement eOTP_CheckBox;
	public void getE_Otp_Checkbox(){
		eOTP_CheckBox.click();
	}
	private @FindBy(xpath = "(//input[@name='assigntype'])[2]")
	WebElement assignedBy;
	public void getAssignedBy() {
		assignedBy.click();
	}
	private @FindBy(css = "select[name='assigned_user_id']")
	WebElement assignedDropDown;
	public void getAssignedDropDown() {
		Select sel = new Select(assignedBy);
		sel.selectByVisibleText(" Administrator");
	}
	private @FindBy(css = "input[id='phone']")
	WebElement phoneNo;
	public void getPhoneNo(String data) {
		phoneNo.sendKeys(data);
	}
	private @FindBy(css = "input[id='otherphone']")
	WebElement otherPhoneNo;
	public void getOtherPhoneNo(String data) {
		phoneNo.sendKeys(data);
	}
	private @FindBy(css = "input[accesskey='S']")
	WebElement saveButton;
	public void getSaveButton() {
		saveButton.click();
	}
}
