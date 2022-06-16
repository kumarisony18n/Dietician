/*     */ package pageObjects;
/*     */ 
/*     */ import org.openqa.selenium.SearchContext;
/*     */ import org.openqa.selenium.WebDriver;
/*     */ import org.openqa.selenium.WebElement;
/*     */ import org.openqa.selenium.support.FindBy;
/*     */ import org.openqa.selenium.support.How;
/*     */ import org.openqa.selenium.support.PageFactory;
/*     */ 
/*     */ public class DieticianHomePage {
/*     */   WebDriver driver;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//h2[contains(text(), 'Logged in as Dietician')]")
/*     */   public static WebElement dieticianLoginText;
/*     */   
/*     */   @FindBy(how = How.ID, using = "homebutton")
/*     */   public static WebElement HomeButton;
/*     */   
/*     */   @FindBy(how = How.ID, using = "Newpatient")
/*     */   public static WebElement newPatient;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//h2[contains(text(), 'Patient Data')]")
/*     */   public static WebElement patientData;
/*     */   
/*     */   @FindBy(how = How.ID, using = "dietPlan")
/*     */   public static WebElement dietPlanbtn;
/*     */   
/*     */   @FindBy(how = How.ID, using = "Mypateint")
/*     */   public static WebElement MyPatientBtn;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//h2[contains(text(), 'Diet Plan')]")
/*     */   public static WebElement dietPlans;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//h2[contains(text(), 'My Pateints')]")
/*     */   public static WebElement myPatientsPage;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//*[@id='homePage-icon']")
/*     */   public static WebElement homePageIcon;
/*     */   
/*     */   public DieticianHomePage() {
/*  46 */     PageFactory.initElements((SearchContext)this.driver, this);
/*     */   }
/*     */   
/*     */   public void ChkforDieticianHomePage() {
/*  53 */     dieticianLoginText.isDisplayed();
/*     */   }
/*     */   
/*     */   public boolean checkforHomebutton() {
/*  59 */     return HomeButton.isDisplayed();
/*     */   }
/*     */   
/*     */   public boolean checkforNewPatient() {
/*  65 */     return newPatient.isDisplayed();
/*     */   }
/*     */   
/*     */   public void selectNewPatient() {
/*  71 */     newPatient.click();
/*     */   }
/*     */   
/*     */   public boolean NewPatientPagevisible() {
/*  77 */     return newPatient.isDisplayed();
/*     */   }
/*     */   
/*     */   public void selectMyPatientbtn() {
/*  83 */     MyPatientBtn.click();
/*     */   }
/*     */   
/*     */   public boolean dietPlanVisible() {
/*  89 */     return dietPlans.isDisplayed();
/*     */   }
/*     */   
/*     */   public boolean chkMypatientheader() {
/*  95 */     return myPatientsPage.isDisplayed();
/*     */   }
/*     */   
/*     */   public void selectDietPlan() {
/* 101 */     dietPlanbtn.click();
/*     */   }
/*     */   
/*     */   public boolean checkHomePagecontent() {
/* 106 */     return homePageIcon.isDisplayed();
/*     */   }
/*     */   
/*     */   public boolean checkLoggedinUser() {
/* 111 */     return dieticianLoginText.isDisplayed();
/*     */   }
/*     */ }


/* Location:              D:\DieticianProject_Lakshmi\dietitianPages.jar!\dietitianPages\DieticianHomePage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */