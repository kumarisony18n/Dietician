/*     */ package stepdefinitions;
/*     */ 
/*     */ import java.util.List;
/*     */ import org.openqa.selenium.SearchContext;
/*     */ import org.openqa.selenium.WebDriver;
/*     */ import org.openqa.selenium.WebElement;
/*     */ import org.openqa.selenium.support.FindBy;
/*     */ import org.openqa.selenium.support.How;
/*     */ import org.openqa.selenium.support.PageFactory;
/*     */ 
/*     */ public class AddNewPatientPage {
/*     */   WebDriver driver;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//h2[contains(text(), 'AddNewPatient')]")
/*     */   public static WebElement AddnewPatient;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//button[@class='btn']")
/*     */   public static WebElement addNewpatientbtn;
/*     */   
/*     */   @FindBy(css = "input[type=\"text\"]")
/*     */   public static List<WebElement> Requiredfields;
/*     */   
/*     */   @FindBy(css = ".alert-content")
/*     */   public static WebElement alertMessage;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "/input[@type='text']")
/*     */   public static WebElement FullName;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "/input[@type='text']")
/*     */   public static WebElement Addressline1;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "/input[@type='text']")
/*     */   public static WebElement Addressline2;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "/input[@type='text']")
/*     */   public static WebElement Country;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "/input[@type='text']")
/*     */   public static WebElement City;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "/input[@type='text']")
/*     */   public static WebElement State;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "/input[@type='text']")
/*     */   public static WebElement PhoneNumber;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "/input[@type='text']")
/*     */   public static WebElement Email;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "/input[@type='text']")
/*     */   public static WebElement Postalcode;
/*     */   
/*     */   public AddNewPatientPage() {
/*  62 */     PageFactory.initElements((SearchContext)this.driver, this);
/*     */   }
/*     */   
/*     */   public String AddNewPatientHeadertext() {
/*  70 */     return AddnewPatient.getText();
/*     */   }
/*     */   
/*     */   public boolean Addnewpatientvisible() {
/*  75 */     return AddnewPatient.isDisplayed();
/*     */   }
/*     */   
/*     */   public boolean checkEmptyfields() {
/*  80 */     boolean isEmpty = false;
/*  81 */     for (WebElement reqfeilds : Requiredfields) {
/*  83 */       if (reqfeilds.getAttribute("value").isEmpty()) {
/*  85 */         isEmpty = true;
/*     */         break;
/*     */       } 
/*     */     } 
/*  89 */     return isEmpty;
/*     */   }
/*     */   
/*     */   public String displayMessage() {
/*  94 */     return alertMessage.getText();
/*     */   }
/*     */   
/*     */   public void invalidFields(String fullName, String addressline1, String addressline2, String country, String city, String state, String postalcode, String email, String phonenumber) {
/* 100 */     FullName.sendKeys(new CharSequence[] { fullName });
/* 101 */     Addressline1.sendKeys(new CharSequence[] { addressline1 });
/* 102 */     Addressline2.sendKeys(new CharSequence[] { addressline2 });
/* 103 */     Country.sendKeys(new CharSequence[] { country });
/* 104 */     City.sendKeys(new CharSequence[] { city });
/* 105 */     State.sendKeys(new CharSequence[] { state });
/* 106 */     Postalcode.sendKeys(new CharSequence[] { postalcode });
/* 107 */     Email.sendKeys(new CharSequence[] { email });
/* 108 */     PhoneNumber.sendKeys(new CharSequence[] { phonenumber });
/*     */   }
/*     */   
/*     */   public void validFields(String fullName, String addressline1, String addressline2, String country, String city, String state, String postalcode, String email, String phonenumber) {
/* 114 */     FullName.sendKeys(new CharSequence[] { fullName });
/* 115 */     Addressline1.sendKeys(new CharSequence[] { addressline1 });
/* 116 */     Addressline2.sendKeys(new CharSequence[] { addressline2 });
/* 117 */     Country.sendKeys(new CharSequence[] { country });
/* 118 */     City.sendKeys(new CharSequence[] { city });
/* 119 */     State.sendKeys(new CharSequence[] { state });
/* 120 */     Postalcode.sendKeys(new CharSequence[] { postalcode });
/* 121 */     Email.sendKeys(new CharSequence[] { email });
/* 122 */     PhoneNumber.sendKeys(new CharSequence[] { phonenumber });
/*     */   }
/*     */   
/*     */   public boolean viewAddnewPatientBtn() {
/* 128 */     return addNewpatientbtn.isDisplayed();
/*     */   }
/*     */ }


/* Location:              D:\DieticianProject_Lakshmi\dietitianPages.jar!\dietitianPages\AddNewPatientPage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */