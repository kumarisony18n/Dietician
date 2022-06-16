
Feature: Test report data
  
  Scenario: Verify presence of pdf file for each report
    Given User clicks on 'View Previous Test Reports' button
    When User is on 'View Patient Test Reports' button page
    Then Every record shows 'view PDF' option
    
  Scenario: Verify presence of doc id
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Every report has Doc Id
    
  Scenario: Verify presence of uploaded time 
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Every report shows file upload time
    
  Scenario: Verify uploaded datetime format
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then File uploaded time is shown in correct date and time format
    
  Scenario: Verify age of uploaded time
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Uploaded time field shows age of file upload in seconds/minutes/hour/days/months/years

	Scenario: Verify file name
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Every report has its name
    
  Scenario: Verify identified conditions
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Every report shows identified conditions from its test report file
  

	  

	  

	  

    
