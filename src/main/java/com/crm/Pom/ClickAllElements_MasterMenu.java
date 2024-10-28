package com.crm.Pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickAllElements_MasterMenu {
	public ClickAllElements_MasterMenu(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	private @FindBy(xpath = "//td[@class='tabUnSelected']/a")
	List<WebElement> masterMenu;
	
	public void getMasterMenu() {
		
		for (WebElement web : masterMenu) {
			web.click();
		}
	}
}
