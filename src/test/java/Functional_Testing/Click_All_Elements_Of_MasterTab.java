package Functional_Testing;


import org.testng.annotations.Test;

import com.crm.BaseClass.VTigerBase;
import com.crm.Pom.ClickAllElements_MasterMenu;

public class Click_All_Elements_Of_MasterTab extends VTigerBase {
	@Test
public void clickAllTabs() throws InterruptedException {
	ClickAllElements_MasterMenu ref = new ClickAllElements_MasterMenu(driver);
	ref.getMasterMenu();
}
}
