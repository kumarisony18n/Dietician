package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DietPlans {
	
	private static WebDriver driver;
	
	//Locators
	
	@FindBy(how= How.ID,using="PageTitle")
	 public  WebElement PageTitle;
	
	@FindBy(how= How.ID,using="DieticianName")
	 public  WebElement lblDieticianName;
	
	@FindBy(how= How.ID,using="generateMenu")
	 public  WebElement btngenerateMenu;
	
	@FindBy(how= How.ID,using="createplan")
	 public  WebElement lblCreatePlan;
	
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
	
	@FindBy(how= How.ID,using="GeneratedDietPlans")
	 public  WebElement lblGeneratedDietPlans;
	
	@FindBy(how= How.LINK_TEXT,linkText="DietPlans")
	 public  WebElement DietPlans;
	
	
	//Constructor of the page class:
	public DietPlans(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
	}
	
	public String getGeneratedDietPlansText() {
		return lblGeneratedDietPlans.getText();
	}
		
	public Boolean isDieticianNameDisplayed() {
		return lblDieticianName.isDisplayed();
	}
	
	public String getPageTitle() {
		return this.driver.getTitle();
	}
	
	public String btngenerateMenugetText() {
		return btngenerateMenu.getText();
	}
	
	public String getCreatePlantext() {
		return lblCreatePlan.getText();
	}
	
	public void getAllValuesofDietPlanTable() {
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
	
	public ViewRecentDiets redirecttoViewRecentDietsPage() {
		
		return new ViewRecentDiets(driver);
	}
	
	public Boolean isDietPlanSelected() {
		return DietPlans.isSelected();
	}

}
