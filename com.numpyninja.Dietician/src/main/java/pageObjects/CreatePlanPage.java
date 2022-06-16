/*     */ package pageObjects;
/*     */ 
/*     */ import org.openqa.selenium.SearchContext;
/*     */ import org.openqa.selenium.WebDriver;
/*     */ import org.openqa.selenium.WebElement;
/*     */ import org.openqa.selenium.support.FindBy;
/*     */ import org.openqa.selenium.support.How;
/*     */ import org.openqa.selenium.support.PageFactory;
/*     */ 
/*     */ public class CreatePlanPage {
/*     */   WebDriver driver;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//h2[contains(text(), 'Confirm HealthConditions and Generate a new Diet Plan')]")
/*     */   public static WebElement createPlanPageHeader;

			@FindBy(id="searchbox")WebElement insertText;
			@FindBy(xpath="/html/body/div[1]/div/div/h1") WebElement text;
			@FindBy(xpath="//button[@class='btn']") WebElement browserbutton;
/*     */   
/*     */   @FindBy(how = How.ID, using = "uploadbutton")
/*     */   public static WebElement uploadButton;
/*     */   
/*     */   @FindBy(how = How.XPATH, xpath = "//input[@id='file_up']")
/*     */   public static WebElement uploadFile;
/*     */   
/*     */   @FindBy(css = ".alert-content")
/*     */   public static WebElement AlertMessage;
/*     */   
/*     */   @FindBy(how = How.XPATH, using = "//button[@id='option1']")
/*     */   public static WebElement Option1;
/*     */   
/*     */   @FindBy(how = How.XPATH, using = "//button[@id='confrm']")
/*     */   public static WebElement Confirm;
/*     */   
/*     */   public CreatePlanPage(WebDriver driver) {
/*  36 */     PageFactory.initElements((SearchContext)this.driver, this);
/*     */   }
/*     */   
/*     */   public void landingPage() {
/*  44 */     createPlanPageHeader.isDisplayed();
/*     */   }
/*     */   
/*     */   public boolean viewUploadButton() {
/*  51 */     return uploadButton.isDisplayed();
/*     */   }
/*     */   
/*     */   public void uploadingEmptyFile() {
/*  58 */     uploadFile.sendKeys(new CharSequence[] { "" });
/*  59 */     uploadButton.click();
/*     */   }
/*     */   
/*     */   public String displayMessage() {
/*  65 */     return AlertMessage.getText();
/*     */   }
/*     */   
/*     */   public boolean uploadingNonPdf() {
/*  72 */     uploadFile.sendKeys(new CharSequence[] { "D:/Users/testdata/Desktop/upload.png" });
/*  73 */     uploadButton.click();
/*  74 */     return false;
/*     */   }
/*     */   
/*     */   public boolean uploadingMaxlimitFile() {
/*  79 */     uploadFile.sendKeys(new CharSequence[] { "D:/Users/testdata/Desktop/uploadmaxlimit.pdf" });
/*  80 */     uploadButton.click();
/*  81 */     return false;
/*     */   }
/*     */   
/*     */   public void uploadingNonpdfMaxsize() {
/*  87 */     uploadFile.sendKeys(new CharSequence[] { "D:/Users/testdata/Desktop/upload.png" });
/*  88 */     uploadButton.click();
/*     */   }
/*     */   
/*     */   public void UploadPdf() {
/*  94 */     uploadFile.sendKeys(new CharSequence[] { "D:/Users/testdata/Desktop/validfile.pdf" });
/*  95 */     uploadButton.click();
/*     */   }
/*     */   
/*     */   public boolean viewOption1() {
/* 101 */     return Option1.isDisplayed();
/*     */   }
/*     */   
/*     */   public boolean viewtextonBtn() {
/* 106 */     if (Confirm.getAttribute("name").matches("CONFIRM"))
/* 108 */       return true; 
/* 111 */     return false;
/*     */   }
/*     */   
/*     */   public void confirmbtn() {
/* 118 */     Confirm.click();
/*     */   }
/*     */   
/*     */   public boolean confirmbtndisable() {
/* 126 */     Confirm.getDomProperty("disable");
/* 127 */     return false;
/*     */   }
/*     */
			
	//To check Browser button 
	public boolean  browseBtn() {
		browserbutton.isDisplayed();
		return true;
	}
	
	public boolean textFieldbar() {
		insertText.isDisplayed();
		return true;
	}
	
	public void textenterd() {
		insertText.sendKeys("PDF files only ");
	}
	
	public String  vaidatetheText() {
		
		return text.getText();
		
	}

}
