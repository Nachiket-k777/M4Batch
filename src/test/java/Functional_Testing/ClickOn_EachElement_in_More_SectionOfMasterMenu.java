package Functional_Testing;

import org.testng.annotations.Test;
import com.crm.BaseClass.VTigerBase;
import com.crm.Pom.ClickOn_EachElements_in_More_SectionOfMasterMenu;

public class ClickOn_EachElement_in_More_SectionOfMasterMenu extends VTigerBase{
	@Test
	public void moreElements() {
	ClickOn_EachElements_in_More_SectionOfMasterMenu ref = new ClickOn_EachElements_in_More_SectionOfMasterMenu(driver);
	ref.getMore();
	ref.getOptions();
	
}
}
