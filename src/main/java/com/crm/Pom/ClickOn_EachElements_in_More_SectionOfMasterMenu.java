package com.crm.Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOn_EachElements_in_More_SectionOfMasterMenu {
	public ClickOn_EachElements_in_More_SectionOfMasterMenu(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "//a[contains(text(),'More')]")
	WebElement more;
	
	private @FindBy(xpath = "//a[@id='more']")
	List<WebElement> options;
	
	public void getMore() {
		more.click();
	}
	public void getOptions() {
		for (WebElement web : options) {
			web.click();
			getMore();
		}
	}

}
