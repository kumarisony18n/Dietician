package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DieticianScreensPage {
private WebDriver driver;

public DieticianScreensPage(WebDriver driver) {
	this.driver = driver;
}

private By viewRecentDietsLink = By.linkText("View Recent Diets Link");
private By viewRecentTestReportLink = By.linkText("View Recent Test Reports");
private By addNewPatientLink = By.linkText("Add New Patient");
private By dieticianHomeLink = By.linkText("Dietician Home");
private By myPatientsLink = By.linkText("My Patients");
private By confirmConditionsAndCreatePlanLink = By.linkText("Confirm Conditions and Create Plan");

public boolean isViewRecentDietsLinkExist() {
	return	driver.findElement(viewRecentDietsLink).isSelected();
	}
	public boolean isViewRecentTestReportLinkExist() {
	return	driver.findElement(viewRecentTestReportLink).isSelected();
	}
	public boolean isDieticianHomeLinkExist() {
	return	driver.findElement(dieticianHomeLink).isSelected();
	}
	public boolean isMyPatientsLinkExist() {
	return	driver.findElement(myPatientsLink).isSelected();
	}
	public boolean isAddNewPatientLinkExist() {
	return	driver.findElement(addNewPatientLink).isSelected();
	}
	public boolean isConfirmConditionsAndCreatePlanLinkExist() {
	return	driver.findElement(confirmConditionsAndCreatePlanLink).isSelected();
	}
	public void ClickOnViewRecentDietsLink() {	
		driver.findElement(viewRecentDietsLink).click();
	}
	public void ClickOnViewRecentTestReportLink() {	
		driver.findElement(viewRecentTestReportLink).click();
	}
	public void ClickOnAddNewPatientLink() {	
		driver.findElement(addNewPatientLink).click();
	}
	public void ClickOnDieticianHomeLink() {	
		driver.findElement(dieticianHomeLink).click();
	}
	public void ClickOnMyPatientsLink() {	
		driver.findElement(myPatientsLink).click();
	}
	public void ClickOnConfirmConditionsAndCreatePlanLink() {	
		driver.findElement(confirmConditionsAndCreatePlanLink).click();
	}
}
