package pageObjects;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewPatientsTestReports {
	
	private static WebDriver driver;
	
	//Locators
	
	@FindBy(how= How.ID,using="mypatients")
	 public  WebElement myPatients;
	
	@FindBy(how= How.ID,using="dieticianSoftwareViewRecentTestReports")
	 public  WebElement lblDieticianSoftwareViewRecentTestReports;
	
	@FindBy(how=How.ID, using="viewPatientTestReports")
	public WebElement lblviewPatientTestReports;
	
	@FindBy(how=How.ID, using="viewPreviousTestReports")
	public WebElement btnviewPreviousTestReports;
	
	@FindBy(how=How.ID, using="viewPdffiles")
	public WebElement btnviewPdffile;
	
	@FindBy(how= How.LINK_TEXT, linkText="prevPageLink")
	public  WebElement prevPageLink;
	
	@FindBy(how= How.LINK_TEXT, linkText="nextPageLink")
	public  WebElement nextPageLink;
	
	@FindBy(how=How.XPATH, xpath= "//page-navigation/div/div/span/a")
	public List<WebElement> pagination;
	
	@FindBy(how=How.ID, using="patientId")
	public WebElement lblpatientId;
	
	@FindBy(how=How.ID, using="name")
	public WebElement lblname;
	
	@FindBy(how=How.ID, using="email")
	public WebElement lblemail;
	
	@FindBy(how=How.ID, using="phone")
	public WebElement lblphone;
	
	@FindBy(how=How.ID, using="address")
	public WebElement lbladdress;
	
	@FindBy(how= How.XPATH, xpath = "//table[contains(@id,'id')]//td//td")
	public WebElement btnViewPDF;
	
	//To locate rows of table.
	@FindBy(how= How.TAG_NAME, tagName ="tr")
	public  List<WebElement> rows_table ;
	
	//To locate table headers
	
	@FindBy(how= How.XPATH, xpath ="//table/th")
	public  List<WebElement> allHeaders ;
		
	//To locate columns(cells) of that specific row.
	@FindBy(how= How.TAG_NAME, tagName ="td")
	public  List<WebElement> Columns_row ;
		
	//All table data
	@FindBy(how= How.XPATH, xpath="//table[contains(@id,'id')]//td")
	public  List<WebElement> allData;
	
	//Constructor of the page class:
	public ViewPatientsTestReports(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//get page title
	public String  getPageTitle() {
		return this.driver.getTitle();
	}
	
	//Click View Patient Test Reports
	public void clickbtnviewPreviousTestReports() {
		
		btnviewPreviousTestReports.click();
	}
	
	//Verify my patient tab on test report page
	public boolean verifyMyPatientsIsDisplayed() {
		
		return(myPatients.isSelected());
	} 
	
	//Verify breadcrumbs on test report page
	public boolean verifyDieticianSoftwareViewRecentTestReportsIsDisplayed() {
		
		return(lblDieticianSoftwareViewRecentTestReports.isDisplayed());
	} 
	
	//Verify Patients Test Report title
	public Boolean verifyPatientsTestReportTitle() {
		return(lblviewPatientTestReports.isDisplayed());
	}
	
	//Verify Patients Primary Info
	public Boolean verifyPatientsPrimaryInfo() {
		return(lblpatientId.isDisplayed() && lblname.isDisplayed() && lblemail.isDisplayed() && lblphone.isDisplayed() && lbladdress.isDisplayed());
	}
	
	public void getAllValuesofTestReportTable() {
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
	
	public void getTableHeaders() {

		Boolean dataStatus = false;
		for(WebElement ele: allHeaders) {
			String value = ele.getText();
			if((value.contains("Record Number")) || (value.contains("Doc-ID")) ||(value.contains("File Uploaded time")) || 
					(value.contains("File Uploaded time"))|| (value.contains("FileReport name")) || (value.contains("Identified health conditions")))
			{
				dataStatus = true;
				break;
			}
		}
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
		
	public void btnViewPdfClick() {
		
		for(int i=0; i<rows_table.size();i++)
	    {
	        for(int j=0; j<Columns_row.size();j++)
	        {
	            if(Columns_row.get(j).getText().contains("ViewPDF"))
	            {
	            	btnViewPDF.click();
	                break;
	            }
	        } 
	    }  
	}
	
	public void getAllValuesofPatientTestReportTable() {
		
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
	
	public String ReadPdf() throws IOException {
		URL TestURL = new URL("http://www.dietician.com/pdfurl-guide.pdf");
		 
		BufferedInputStream TestFile = new BufferedInputStream(TestURL.openStream());
		PDFParser TestPDF = new PDFParser((RandomAccessRead) TestFile);
		TestPDF.parse();
		String TestText = new PDFTextStripper().getText(TestPDF.getPDDocument());
		 return TestText;
		//assertTrue(TestText.contains(match));
		 
	}
}
