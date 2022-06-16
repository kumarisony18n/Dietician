
Feature: Pagination

  Scenario: Verify that page needs pagiation
    Given Patients records are displayed
    When Records are more than 10
    Then It must show pagination links
    
  Scenario: Verify next pagination link functionality
    Given Patients records are displayed
    When User clicks on next pagination link
    Then It goes to next page and shows different pat
    
  Scenario: Verify previous link functionality
    Given Patients records are displayed
    When User clicks on previous pagination link
    Then It goes to previous page
   

  
