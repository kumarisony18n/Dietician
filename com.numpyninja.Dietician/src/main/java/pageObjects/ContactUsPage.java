package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver;
	WebElement[] UserinputFields;
	public ContactUsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "contactus")
	WebElement countactus;

	@FindBy(id = "FirstName")
	WebElement faname;

	@FindBy(name = "LastName")
	WebElement laname;

	@FindBy(xpath = "//a[@href='email']")
	WebElement email;

	@FindBy(xpath = "//input[@text = 'sub']")
	WebElement subject;

	@FindBy(id = "write your messge here")
	WebElement comments;

	@FindBy(xpath = "//button[@text='submit']")
	WebElement submit;

	@FindBy(css = "div#center_column p")
	WebElement succesmessage;

	@FindBy(css = ".alert-content")
	WebElement errormessage;

	public contactPage clickoncontacuslink() {
		countactus.click();

		return new contactPage(driver);
	}

	
	public String getcontacttitle() {
		return driver.getTitle();
	}

	public void conFName(String Firstname) {
		faname.sendKeys(Firstname);
	}

	public void conLsTName(String LastName) {
		laname.sendKeys(LastName);
	}

	public void contactemail(String Email) {
		email.sendKeys(Email);
	}

	public void contactsubject(String Subject) {
		subject.sendKeys(Subject);
	}

	public void contactmessage(String mesgcomments) {
		comments.sendKeys(mesgcomments);
	}

	public void contactSubmit() {
		submit.click();
	}

	public String getSuccesmsg() {
		return succesmessage.getText();
	}

	public String GetErrormsg() {
		return errormessage.getText();
	}

	
	//This method is will take the filed values from excel  
	public HomepageofDiet callallcontacts(String Firstname, String LastName, String Email, String Subject,
			String mesgcomments) {
		
		
		faname.sendKeys(Firstname);
		laname.sendKeys(LastName);
		email.sendKeys(Email);
		subject.sendKeys(Subject);
		comments.sendKeys(mesgcomments);
		submit.click();

		return new HomepageofDiet(driver);
	}
	
//This method will give invalid values for fields from Excel
	public HomepageofDiet validateallcontacts(String invFirstname, String invLastName, String invEmail,
			String invSubject, String invmesgcomments) {
		faname.sendKeys(invFirstname);
		laname.sendKeys(invLastName);
		email.sendKeys(invEmail);
		subject.sendKeys(invSubject);
		comments.sendKeys(invmesgcomments);
		submit.click();
		
		return new HomepageofDiet(driver);
	}
//This method will takes empty values from excel
	public HomepageofDiet validatewithemtyvaluesofcontact(String Firstname, String LastName, String Email, String Subject,
			String mesgcomments)  {
		faname.sendKeys("");
		laname.sendKeys("");
		email.sendKeys("");
		subject.sendKeys("");
		comments.sendKeys("");
		submit.click();
		
		return new HomepageofDiet(driver);
	}
	
	
	//This is Another Approach for empty fields
		public boolean emptyFieds() {
			
			boolean isEmpty = false;
			
			for(WebElement userfield:UserinputFields)
			{
				if(userfield.getAttribute("value").isEmpty()) {
					isEmpty = true;
					break;
				}
			}
			return isEmpty;
		}
	
}
