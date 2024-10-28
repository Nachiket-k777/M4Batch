package FunctionalTesting_imp;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import com.crm.BaseClass.VTigerBase;
import com.crm.JavaUtility.Read_OrganizationData;
import com.crm.Pom.Create_Organization_Pom;

public class Create_Organization extends VTigerBase {
	@Test
	public void createNewOrganization() throws EncryptedDocumentException, IOException {
	Create_Organization_Pom ref = new Create_Organization_Pom(driver);
	ref.getOrganization();
	ref.getCreateOrganization();
	Read_OrganizationData.readData();
	ref.getOrganizationName(Read_OrganizationData.organizationName);
	ref.getWebsite(Read_OrganizationData.websiteName);
	ref.getSymbol(Read_OrganizationData.symbol);
	ref.getEmployees(Read_OrganizationData.employees);
	ref.getEmail2(Read_OrganizationData.email2);
	ref.getIndustryDropdown();
	ref.getTypeDropDown();
	ref.getE_Otp_Checkbox();
	ref.getPhoneNo(Read_OrganizationData.phoneNo);
	ref.getOtherPhoneNo(Read_OrganizationData.otherPhoneNo);
	ref.getSaveButton();
	}
}
