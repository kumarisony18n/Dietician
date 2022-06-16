package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.junit.asserts.SoftAssert;

public class RegisterPage {

	WebDriver driver;
	
	WebElement[] UserinputFields;
	//Locaters
	@FindBy(name = "REGISTER")
	WebElement reg;

	@FindBy(xpath = "//a[@href='tagName('a')'")
	WebElement lilinks;

	@FindBy(id = "first_name")
	WebElement snFname;

	@FindBy(id = "lastname")
	WebElement snlname;

	@FindBy(id = "moblienaum")
	WebElement snmoblienum;

	@FindBy(xpath = "//input[@type='any_other_feild']")
	WebElement snanyother;

	@FindBy(id = "//input[@class ='email']")
	WebElement snemail;

	@FindBy(id = "passwd")
	WebElement snpword;

	@FindBy(xpath = "//input[@href = 'Sign_up']")
	WebElement snsignup;

	@FindBy(name = "name")
	WebElement regfirstname;

	@FindBy(id = "lastname")
	WebElement regltname;

	@FindBy(id = "username")
	WebElement reguname;

	@FindBy(xpath = "//input[@type='email']")
	WebElement regemailadd;

	@FindBy(id = "pword")
	WebElement regpassword;

	@FindBy(id = "confirm_pword")
	WebElement regconpword;

	@FindBy(xpath = "//a[@href='login']")
	WebElement reglogin;

	@FindBy(xpath = "//a[@href='signup']")
	WebElement sigupusingtext;

	@FindBy(xpath = "//a[@href='facebook']")
	WebElement fab;

	@FindBy(xpath = "//a[@href='goggle']")
	WebElement goggle;

	@FindBy(linkText = "Already have account")
	WebElement alredyhavetext;

	@FindBy(xpath = "//a[@href='login']")
	WebElement liginlink;

	@FindBy(id = "error_messge")
	WebElement messge;

	@FindBy(id = "Sign_up")
	WebElement siguptext;
	
	@FindBy(css= "text") WebElement signwithyouremail;
	
	@FindBy (id = "flowersymblo") WebElement requiredsymbol;
	
	
	

	public RegisterPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	public boolean textonTopOfRegister() {
		return signwithyouremail.isDisplayed();
	}
	
	public boolean mandatoryfields() {
		requiredsymbol.isEnabled();
		return true;
    	
    }
	
	public SigninPage clickonRegistersignup() {
		reglogin.click();
		return new SigninPage();
	}

	public SigninPage clickonsignupforRegistration() {
		snsignup.click();
		return new SigninPage();
	}

	public RegisterPage registrationlink() {
		reg.click();
		return new RegisterPage(driver);
	}

	public String clikonRegisterlink() {
		reg.click();

		return driver.getTitle();

	}
//To get all links in hompage menu bar
	public List<WebElement> forLinksonmenubar() {
		List<WebElement> allItems = driver.findElements(By.tagName("a"));
		System.out.println("Toatal tags are: " + allItems.size());

		for (int i = 0; i < allItems.size(); i++) {
			System.out.println("All links " + allItems.get(i).getAttribute("href"));
			System.out.println("links on page are " + allItems.get(i).getText());

		}
		return allItems;
	}

	//This method take values form excell for Signup with moblie
	public SigninPage signupfromMoblie(String fname, String laname, String Mnumber, String Email, String anyfield,
			String pw) {
		snFname.sendKeys(fname);
		snlname.sendKeys(laname);

		snmoblienum.sendKeys(Mnumber);

		snanyother.sendKeys(anyfield);

		snemail.sendKeys(Email);

		snpword.sendKeys(pw);

		snsignup.click();

		return new SigninPage();

	}

	//This method takes values form excel for Signup with moblie with invalid data 
	public RegisterPage invalidsignupfromMoblie(String invfname, String invlaname, String invMnumber, String invEmail,
			String invanyfield, String invpw) {
		snFname.sendKeys(invfname);
		snlname.sendKeys(invlaname);

		snmoblienum.sendKeys(invMnumber);

		snanyother.sendKeys(invanyfield);

		snemail.sendKeys(invEmail);

		snpword.sendKeys(invpw);

		snsignup.click();

		return new RegisterPage(driver);

	}
	//This method takes values form excel for Signup with moblie 
	public SigninPage emptysignupfromMoblie(String fname, String laname, String Mnumber, String Email, String anyfield,
			String pw) {
		snFname.sendKeys("");
		snlname.sendKeys("");

		snmoblienum.sendKeys("");

		snanyother.sendKeys("");

		snemail.sendKeys("");

		snpword.sendKeys("");

		snsignup.click();

		return new SigninPage();

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

	//This method takes values form excel for Signup with Email 
	public SigninPage signupwithEmail(String name, String lastname, String username, String email, String passwd,
			String confirmpd) {

		regfirstname.sendKeys(name);
		regltname.sendKeys(lastname);
		reguname.sendKeys(username);
		regemailadd.sendKeys(email);
		regpassword.sendKeys(passwd);
		regconpword.sendKeys(confirmpd);
		reglogin.click();
		return new SigninPage();
	}

	//This method takes values form excel for Signup with Email with Invalid values
	public RegisterPage invalidsignupwithEmail(String invname, String invlastname, String invusername, String invemail,
			String invpasswd, String invconfirmpd) {

		regfirstname.sendKeys(invname);
		regltname.sendKeys(invlastname);
		reguname.sendKeys(invusername);
		regemailadd.sendKeys(invemail);
		regpassword.sendKeys(invpasswd);
		regconpword.sendKeys(invconfirmpd);
		reglogin.click();
		return new RegisterPage(driver);
	}

	//This method takes values form excel for Signup with Email for empty feilds
	public RegisterPage emptysignupwithEmail(String name, String lastname, String username, String email, String passwd,
			String confirmpd) {

		regfirstname.sendKeys("");
		regltname.sendKeys("");
		reguname.sendKeys("");
		regemailadd.sendKeys("");
		regpassword.sendKeys("");
		regconpword.sendKeys("");
		reglogin.click();
		return new RegisterPage(driver);
	}

	public String signuptextudersigninbuttonregpage() {
		return sigupusingtext.getText();

	}

	public SigninPage getfacebooklink() {
		fab.click();
		return new SigninPage();
	}

	public SigninPage getgogglelink() {
		goggle.click();
		return new SigninPage();
	}

	public boolean gettextofAlredy() {
		return alredyhavetext.isDisplayed();
	}
	public String getloginlinkte() {
		return liginlink.getAttribute("value");
	}

	public SigninPage getloginlink() {
		 liginlink.getAttribute("Login Here");
		 return new SigninPage();
	}

	//This method will give error message
	public String getfieldserrormessge() {
		return messge.getText();
	}

	public boolean getsiguptext() {
		return siguptext.isEnabled();

	}

	public boolean getsigupmoblicnum() {
		return snmoblienum.isDisplayed();
	}

    

}
