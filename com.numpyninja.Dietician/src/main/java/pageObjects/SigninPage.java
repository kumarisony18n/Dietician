/*     */ package pageObjects;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.openqa.selenium.SearchContext;
/*     */ import org.openqa.selenium.WebDriver;
/*     */ import org.openqa.selenium.WebElement;
/*     */ import org.openqa.selenium.support.FindBy;
/*     */ import org.openqa.selenium.support.How;
/*     */ import org.openqa.selenium.support.PageFactory;
/*     */ 
/*     */ public class SigninPage {
	
			WebDriver driver;
/*  13 */   RegisterPage regPage = new RegisterPage(driver);
/*     */   
/*     */   
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//*[@id='signin-icon']")
/*     */   public static WebElement signInIcon;
/*     */   
/*     */   @FindBy(how = How.ID, using = "pah")
/*     */   public static WebElement HeaderElement;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//button[@class='btn']")
/*     */   public static WebElement signInbutton;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//input[@type='text']")
/*     */   public static WebElement userName;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//input[@id='id_username']")
/*     */   public static WebElement UserNameTextArea;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//input[@id='id_password']")
/*     */   public static WebElement PwdTextArea;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//input[@type='password'and @name='password1']")
/*     */   public static WebElement Password;
/*     */   
/*     */   @FindBy(css = ".alert-content")
/*     */   public static WebElement errorMessage;
/*     */   
/*     */   @FindBy(how = How.ID, using = "forgotPassword")
/*     */   public static WebElement forgotPasswordButton;
/*     */   
/*     */   @FindBy(how = How.ID, using = "notmemberyet")
/*     */   public static WebElement notMemberYet;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//input[@type='email']")
/*     */   public static WebElement Email;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//input[@type='password'and @name='emailpassword']")
/*     */   public static WebElement emailPassword;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//*[@class=btn-login]")
/*     */   public static WebElement logInButton;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//*[@class=btn-facebook]")
/*     */   public static WebElement faceBookButton;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//*[@class=btn-google]")
/*     */   public static WebElement googleButton;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//*[@class=btn-signup]")
/*     */   public static WebElement signUpButton;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//a[contains(@signuphere')]")
/*     */   public static WebElement signUpHere;
/*     */   
/*     */   @FindBy(linkText = "forgotpassword")
/*     */   public static WebElement forgotPassworkLink;
/*     */   
/*     */   @FindBy(linkText = "reset_your_password")
/*     */   public static WebElement resetPassword;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//h2[contains(text(), 'Log into Facebook')]")
/*     */   public static WebElement fbPageHeading;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//h2[contains(text(),'Log into Googel')")
/*     */   public static WebElement gglHeading;
/*     */   
/*     */   @FindBy(linkText = "signup link")
/*     */   public static WebElement signuplnk;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//h2[contains(text(),'Sign Up Form')")
/*     */   public static WebElement RegPage;
/*     */   
/*     */   @FindBy(css = "BODY")
/*     */   public static List<WebElement> RequiredFields;
/*     */   
/*     */   @FindBy(css = "input[type=\"text\"]")
/*     */   public static List<WebElement> UserinputFields;
/*     */   
/*     */   public SigninPage() {
/* 104 */     PageFactory.initElements((SearchContext)this.driver, this);
/*     */   }
/*     */   
/*     */   public void SignInPageTitle() {
/* 114 */     signInIcon.click();
/*     */   }
/*     */   
/*     */   public String headingText() {
/* 121 */     return HeaderElement.getText();
/*     */   }
/*     */   
/*     */   public boolean MandatoryFieldsvisible() {
/* 128 */     return (PwdTextArea.isDisplayed() && UserNameTextArea.isDisplayed() && signInbutton.isDisplayed());
/*     */   }
/*     */   
/*     */   public boolean ButtonVisible() {
/* 134 */     return signInbutton.isDisplayed();
/*     */   }
/*     */   
/*     */   public void clickSigninbutton() {
/* 139 */     signInbutton.click();
/*     */   }
/*     */   
/*     */   public boolean EmptyFields() {
/* 144 */     boolean isEmpty = false;
/* 146 */     for (WebElement userfield : UserinputFields) {
/* 148 */       if (userfield.getAttribute("value").isEmpty()) {
/* 149 */         isEmpty = true;
/*     */         break;
/*     */       } 
/*     */     } 
/* 153 */     return isEmpty;
/*     */   }
/*     */   
/*     */   public Boolean MandatoryFieldsEnable() {
/* 160 */     return (UserNameTextArea.isEnabled() && PwdTextArea.isEnabled() && signInbutton.isEnabled()) ? Boolean.valueOf(true) : Boolean.valueOf(false);
/*     */   }
/*     */   
/*     */   public void BlankValues(String username, String password) {
/* 164 */     userName.sendKeys(new CharSequence[] { "" });
/* 165 */     Password.sendKeys(new CharSequence[] { "" });
/*     */   }
/*     */   
/*     */   public String alertMessage() {
/* 170 */     return errorMessage.getText();
/*     */   }
/*     */   
/*     */   public void clickforgotPassword() {
/* 176 */     forgotPasswordButton.click();
/*     */   }
/*     */   
/*     */   public boolean resetPwdlink() {
/* 182 */     return resetPassword.isDisplayed();
/*     */   }
/*     */   
/*     */   public void clickNotMembr() {
/* 187 */     notMemberYet.click();
/*     */   }
/*     */   
/*     */   public String CheckRegisterPage() {
/* 194 */     String signintitile = this.driver.getTitle();
/* 195 */     return signintitile;
/*     */   }
/*     */   
/*     */   public void clickLogin() {
/* 201 */     logInButton.click();
/*     */   }
/*     */   
/*     */   public String LoginHeading() {
/* 207 */     return HeaderElement.getText();
/*     */   }
/*     */   
/*     */   public boolean CheckLoginButton() {
/* 213 */     return logInButton.isDisplayed();
/*     */   }
/*     */   
/*     */   public boolean checkFbPage() {
/* 219 */     return fbPageHeading.isDisplayed();
/*     */   }
/*     */   
/*     */   public void clickgglLogin() {
/* 224 */     googleButton.click();
/*     */   }
/*     */   
/*     */   public boolean checkGgleButton() {
/* 229 */     return gglHeading.isDisplayed();
/*     */   }
/*     */   
/*     */   public void clickSignup() {
/* 234 */     signuplnk.click();
/*     */   }
/*     */   
/*     */   public Boolean checkRegPage() {
/* 239 */     return Boolean.valueOf(RegPage.isDisplayed());
/*     */   }
/*     */   
/*     */   public void invalidsignIn(String username, String password2) {
/* 244 */     userName.sendKeys(new CharSequence[] { username, password2 });
/*     */   }
/*     */   
/*     */   public boolean verifyingMandatoryFeilds() {
/* 250 */     return (userName.getAttribute("value").isEmpty() && Password.getAttribute("value").isEmpty());
/*     */   }
/*     */ }


/* Location:              D:\DieticianProject_Lakshmi\dietitianPages.jar!\dietitianPages\SigninPage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */