package Functional_Testing;

import org.testng.annotations.Test;

import com.crm.BaseClass.VTigerBase;
import com.crm.Pom.Select_SingleValue_From_DropDownMenu_SearchTextfield_;

public class Select_SingleValue_From_DropDownMenu_SearchTextfield extends VTigerBase{
	@Test
	public void selectDropDown() {
	Select_SingleValue_From_DropDownMenu_SearchTextfield_ ref = new Select_SingleValue_From_DropDownMenu_SearchTextfield_(driver);
	ref.getDropDownArrow();
	ref.getCheckBox();
	ref.getApplyButton();

}
}
