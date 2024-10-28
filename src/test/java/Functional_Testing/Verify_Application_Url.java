package Functional_Testing;

import java.time.Duration;

import org.testng.annotations.Test;

import com.crm.BaseClass.VTigerBase;

public class Verify_Application_Url extends VTigerBase{
	@Test
public void verifyHomePage() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	String expected_Url = "http://localhost:8888/index.php?action=index&module=Home";
	String actual_Url = driver.getCurrentUrl();
	if(expected_Url.equals(actual_Url)) {
		System.out.println("I am in Vtiger Home Page");
	} else {
		System.out.println("I am not in Vtiger Homepage");
	}
}
}
