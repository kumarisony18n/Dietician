package pageObjects;

import java.io.BufferedInputStream;
import java.io.IOException;
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

public class ViewRecentDiets {
	
	ViewRecentDiets generatedDietPlans;
	ViewRecentDiets viewRecentDiets;
	private static WebDriver driver;
	
	@FindBy(how= How.LINK_TEXT, linkText="viewRecentDiets")
	public  WebElement lblViewRecentDiets;
	
	@FindBy(how= How.ID,using="DieticianName")
	public static WebElement lbDieticianName;
	
	@FindBy(how= How.ID, using="nextPageLink")
	public  WebElement btnnextPageLink;
	
	@FindBy(how= How.ID, using="firstPageLink")
	public  WebElement btnfirstPageLink;
	
	@FindBy(how= How.ID, using="secondPageLink")
	public  WebElement btnsecondPageLink;
	
	@FindBy(how= How.ID, using="viewPDF")
	public  WebElement btnviewpdf;
	
	@FindBy(how= How.ID, using="prevPageLink")
	public  WebElement btnprevPageLink;
	
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
	
	public ViewRecentDiets(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
	
	public boolean isDieticianNameDisplayed() {
		
		return(lbDieticianName.isDisplayed());
	}
	
	public  String getpageTitle()
	{
		return driver.getTitle();
	}
	
	public void btnPDFClick() {
		btnviewpdf.click();
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
	
	public void btnPDFClick(String viewPDF) {
		
		for(int i=0; i<rows_table.size();i++)
	    {
	        for(int j=0; j<Columns_row.size();j++)
	        {
	            if(Columns_row.get(j).getText().contains("View PDF"))
	            {
	            	btnviewpdf.click();
	                break;
	            }
	        } 
	    }  
		
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

}
