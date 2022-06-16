package pageObjects;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyPatients {
	
	private static WebDriver driver;
	//GeneratedDietPlans generatedDietPlans;

	//  By Locators: id
	@FindBy(how= How.ID,using="mypatients")
	 public  WebElement MyPatients;
	
	@FindBy(how= How.ID,using="mypatientsbreadcrumb")
	public  WebElement txtMyPatientsBreadcrumb;
	
	@FindBy(how= How.ID,using="DieticianName")
	public static WebElement lbDieticianName;
	
	@FindBy(how= How.ID,using="name")
	public  WebElement txtName;
	
	@FindBy(how= How.ID,using="email")
	public  WebElement txtEmail;
	
	@FindBy(how= How.ID,using="phone")
	public  WebElement txtPhone;
	
	@FindBy(how= How.ID,using="Search")
	public  WebElement btnSearch;
	
	//To locate table
	@FindBy(how= How.XPATH, xpath="/html/body/table/tbody")
	public  WebElement patientstable;
	
	//To locate rows of table.
	@FindBy(how= How.TAG_NAME, tagName ="tr")
	public  List<WebElement> rows_table ;
	
	 //To locate columns(cells) of that specific row.
	@FindBy(how= How.TAG_NAME, tagName ="td")
	public  List<WebElement> Columns_row ;
	
	//All table data
	@FindBy(how= How.XPATH, xpath="//table[contains(@id,'id')]//td")
	public  List<WebElement> allData;
	
	@FindBy(how= How.XPATH, xpath = "//table[contains(@id,'id')]//td")
	public WebElement btnViewPreviousDietPlans;
	
	@FindBy(how= How.XPATH, xpath = "//table[contains(@id,'id')]//td//td")
	public WebElement btnCreateNewReport;
	
	@FindBy(how= How.XPATH, xpath = "//table[contains(@id,'id')]//td//td")
	public WebElement btnviewPreviousTestReports;
	
	@FindBy(how= How.LINK_TEXT, linkText="prevPageLink")
	public  WebElement prevPageLink;
	
	@FindBy(how= How.LINK_TEXT, linkText="nextPageLink")
	public  WebElement nextPageLink;
	
	@FindBy(how=How.XPATH, xpath= "//page-navigation/div/div/span/a")
	public List<WebElement> pagination;
	
	//Constructor of the page class:
	public MyPatients(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchBtnClick() {
		btnSearch.click();
	}
	
	public Boolean isValidDateFormat() {
		
		String regex = "\\w+\\s\\d{2},\\s\\d{4}";
		 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the string is empty
        // return false
        if (allData.isEmpty()) {
            return false;
        }
 
        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(allData.toString());
 
        // Return if the string
        // matched the ReGex
        return (m.matches());
	}
	
	public void pagination_check(){
	  
	    if (pagination.size() > 0) { 
	        System.out.println("pagination exists and size=>"+pagination.size()); 
	        
	        for (int i = 0; i <= pagination.size(); i++) {      
	           pagination.get(i).click();
	        } 
	    } else { 
	        System.out.println("no pagination");
	    } 
	}
	
	public boolean isMyPatientsSelected() {
		
		return(MyPatients.isSelected());
	}
	
	public boolean myPatientsBreadcrumb() {
		
		return(txtMyPatientsBreadcrumb.isDisplayed());
	}
	
	public boolean isDieticianNameDisplayed() {
		
		return(lbDieticianName.isDisplayed());
	}
	
	public void clickMyPatientsTab() {
		
		MyPatients.click();
	}
	
	public  String getpageTitle()
	{
		return driver.getTitle();
	}
	
	public Boolean isTextBoxesDisplayed() {
		return (txtName.isDisplayed() && txtEmail.isDisplayed() && txtPhone.isDisplayed() && btnSearch.isDisplayed());
	}
	
	public String getSearchTxt() {
		
		return btnSearch.getText();
	}
	
	public void getAllValuesofPatientTable() {
		
		//To calculate no of rows In table.
    	int rows_count = rows_table.size();
    	
    	//Loop will execute till the last row of table.
    	for (int row = 0; row < rows_count; row++) {
    	   
    	    //To calculate no of columns (cells). In that specific row.
    	    int columns_count = Columns_row.size();
    	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
    	    //Loop will execute till the last cell of that specific row.
    	    for (int column = 0; column < columns_count; column++) {
    	        // To retrieve text from that specific cell.
    	        String celtext = Columns_row.get(column).getText();
    	        System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
    	    }
    	    System.out.println("-------------------------------------------------- ");
	}
    		
    	}
	
	public Boolean isValidPhone() {
		String regex = "[0-9]+";
		 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the string is empty
        // return false
        if (txtPhone.getText() == null) {
            return false;
        }
 
        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(txtPhone.getText());
 
        // Return if the string
        // matched the ReGex
        return (m.matches());
	}
	
	public Boolean isValidEmail() {
		String regex = "^(.+)@(.+)$";
		 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the string is empty
        // return false
        if (txtEmail.getText() == null) {
            return false;
        }
 
        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(txtEmail.getText());
 
        // Return if the string
        // matched the ReGex
        return (m.matches());
	}
	
	public Boolean isValidName() {
		String regex = "/(^[a-zA-Z][a-zA-Z\\s]{0,20}[a-zA-Z]$)/";
		 
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
 
        // If the string is empty
        // return false
        if (txtName.getText() == null) {
            return false;
        }
 
        // Find match between given string
        // and regular expression
        // using Pattern.matcher()
        Matcher m = p.matcher(txtName.getText());
 
        // Return if the string
        // matched the ReGex
        return (m.matches());
	}
	
	public void btnViewPreviousDietPlansClick(String viewPreviousDietPlans) {
		
		for(int i=0; i<rows_table.size();i++)
	    {
	        for(int j=0; j<Columns_row.size();j++)
	        {
	            if(Columns_row.get(j).getText().contains("Actions"))
	            {
	            	btnViewPreviousDietPlans.click();
	                break;
	            }
	        } 
	    }  
		
	}
	
	public void btnCreateNewReportClick(String createNewReport) {
		
		for(int i=0; i<rows_table.size();i++)
	    {
	        for(int j=0; j<Columns_row.size();j++)
	        {
	            if(Columns_row.get(j).getText().contains("Actions"))
	            {
	            	btnCreateNewReport.click();
	                break;
	            }
	        } 
	    }  
		
	}
	
	public GeneratedDietPlans redirectToGeneratedDietPlans() {
		
		return new GeneratedDietPlans(driver);
	}
	
	public ConfirmHealtConditionsandGenerateNewDietPlan redirectToConfirmHealtConditionsandGenerateNewDietPlan() {
		
		return new ConfirmHealtConditionsandGenerateNewDietPlan(driver);
	}
	
	public void btnViewPreviousTestReportsClick(String viewPreviousTestReports) {
		
		for(int i=0; i<rows_table.size();i++)
	    {
	        for(int j=0; j<Columns_row.size();j++)
	        {
	            if(Columns_row.get(j).getText().contains("Actions"))
	            {
	            	btnviewPreviousTestReports.click();
	                break;
	            }
	        } 
	    }  
		
	}
	
}
