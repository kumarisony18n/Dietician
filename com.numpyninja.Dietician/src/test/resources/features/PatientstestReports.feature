
Feature: Patients test reports
  
  Scenario: Verify my patient tab on test report page
    Given User has searched patients after login
    When User lands on 'View Patient Test Reports' page
    Then My Patients tab is selected/highlighted
    
  Scenario: Verify breadcrumbs on test report page
    Given User has searched patients after login
    When User is on 'View Patient Test Reports' page
    Then It shows breadcrubs as Dietician Software/View Recent Test Reports
    
  Scenario: Verify title
    Given User has searched patients after login
    When User is on 'View Patient Test Reports' page
    Then Title is displayed as 'View Patient Test Reports'
    
  Scenario: Verify user's primary info
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then It displays primary information like patient Id  number, name, email address, Phone number, Address  
 
 Scenario: Display patient's test reports
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then It displays patient's old and latest test reports

 Scenario: Verify table heading
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then It shows column heading as Record number, Doc-ID, File Uploaded time, File/Report name, Identified health conditions
 


  
