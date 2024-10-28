package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Textfield_Value_Pom {
	public Textfield_Value_Pom(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	private @FindBy(css = "input[class='searchBox']")
	WebElement searchValue;
	
	private @FindBy(css = "input[class='searchBtn']")
	WebElement clickSearchButton;
	
	public void getSearchValue(String data) {
		searchValue.sendKeys(data);
	}
	public void getClickSearchButton() {
		clickSearchButton.click();
	}
}
