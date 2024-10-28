package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_SingleValue_From_DropDownMenu_SearchTextfield_ {
	public Select_SingleValue_From_DropDownMenu_SearchTextfield_(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	private @FindBy(css = "img[src='themes/images/arrow_down_black.png']")
	WebElement dropDownArrow;
	
	private @FindBy(css = "input[value='Accounts']")
	WebElement checkBox;
	
	private @FindBy(css = "input[value='Apply']")
	WebElement applyButton;
	
	public void getDropDownArrow() {
		dropDownArrow.click();
	}
	public void getCheckBox() {
		checkBox.click();
	}
	public void getApplyButton() {
		applyButton.click();
	}
}
