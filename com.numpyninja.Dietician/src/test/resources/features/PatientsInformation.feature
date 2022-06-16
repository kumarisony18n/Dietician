
Feature: Patient's information

  Scenario Outline: Verify that each patient has Cust ID
    Given User has clicked "Search"
    When Patients records are being displayed
    Then Customer Id is shown in column "<Cust ID>" column
    
    Examples:
    | Cust ID |
    | C113 |

	Scenario Outline: Verify that each patient has name
    Given User has clicked "Search"
    When Patients records are displayed
    Then Patient name is displayed in "<Name>" column
    
    Examples:
    | Name |
    | Ananya |
	
	Scenario Outline: Verify detail column
    Given User has clicked "Search"
    When Patients records are displayed
    Then Details column shows patient "<email>" or "<phone number>" or "<address>"
    
      Examples:
    | Email | phone number | address |
    | Ananya | 243432545 | Orissa |
	
	Scenario Outline: Verify last visit column
    Given User has clicked "Search"
    When Patients records are displayed
    Then Last visit date is shown in valid date format
    
  Scenario Outline: Verify format of email address
    Given User has clicked "Search"
    When Patients records are displayed
    Then Verify that email address is in valid format in details cloumn.
    
  Scenario Outline: View pateints previous diet plans
    Given Patients records are displayed
    When User clicks on button 'View Previous Diet Plans' to view previous diet plans
    Then It redirects user to 'Generated Diet Plans' page
    
  Scenario Outline: Create new diet plan
    Given Patients records are displayed
    When User clicks on button 'Create New Report/Plan' to create new report
    Then It redirects user to 'Confirm Health Conditions and Generate a New Diet plan' page to confirm
    
  Scenario Outline: View patients previous test reports

    Given Patients records are displayed
    When User clicks on button 'View Previous Test Reports' to view previous test reports
    Then It redirects user to 'View Patient Test Reports' page to view Patient Test Reports
       
  
  
	

