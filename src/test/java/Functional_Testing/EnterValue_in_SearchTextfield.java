package Functional_Testing;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import com.crm.BaseClass.VTigerBase;
import com.crm.Pom.Textfield_Value_Pom;

public class EnterValue_in_SearchTextfield extends VTigerBase {
	@Test
public void searchTextField() throws EncryptedDocumentException, IOException, InterruptedException {
		Textfield_Value_Pom ref = new Textfield_Value_Pom(driver);	
		FileInputStream fis = new FileInputStream("E:\\Practice Prog\\Automation\\Vitiger_SearchTextfield.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i=0;i<row;i++) {
			for(int j=0;j<cell;j++) {
				String data = sheet.getRow(i).getCell(j).toString();
				System.out.println(data);
				ref.getSearchValue(data);
				ref.getClickSearchButton();
				Thread.sleep(10000);
			}
		}
}
}
