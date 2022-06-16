
#DietPlan
Feature:  Pagination on View Recent DietPlanspage
Scenario: Validating the default number of records displayed per page
    Given User logged on to Dietician website
    When User on View Recent Diets Page
    Then User should see 5 records per page

  Scenario: Validation of traversing next page button
    Given User is on View Recent DietsPage
    When More than one page of records are displayed and User is on firstpage
    Then Next Page button (>) is enabled

  Scenario: Validation of traversing nextpage
    Given User is on View Recent DietsPage and more than one page of records are displayed and User is on first page
    When User selects the next page button (>)
    Then User should see the second page

  Scenario: Validation of traversing next page button
    Given User is on Page View Recent Diets
    When More than one page of records are displayed and User is on last page
    Then Next Page button (>) disabled

  Scenario: Validation of traversing next page when one page is displayed
    Given User on View Page of RecentDiets
    When One page of records are displayed
    Then Next Page button (>) is disabled

  Scenario: Validation of traversing previous page button
    Given User on the  View Recent DietsPage
    When More than one page of records are displayed and User is on the last page
    Then Previous Page button (<) is enabled

  Scenario: Validation of traversing previouspage
    Given User is on View Recent DietsPage and more than one page of records are displayed and User is on second page
    When User selects the previous page button (<)
    Then User should see the first page

  Scenario: Validation of traversing previouspage button
    Given User logged in the page  ViewRecentDiets 
    When More than one page of records are displayed and User is on first page
    Then Previous Page button (>) is disabled

  Scenario: Validation of traversing previous page when one page is displayed
    Given User logged in View Recent Diets Page
    When One page of records are displayed
    Then Previous Page button (>) is disabled

  #Feature: View PDF
  Scenario: Validation of View PDF option
    Given User logged on to the Dietician website
    When User is on View Recent DietsPage
    Then View PDF option is available for the generated diet plans

  Scenario: Validation of generated PDF for a diet plan
    Given User visitis View Recent DietsPage
    When User selects the View PDF button for a generated diet plan
    Then User should see the below information in the pdf:1. Patient details, 2. Doctor details,3. Patient health details,4. 7-day menu, 8. warnings,9. Comments

  Scenario: Validation of download PDF option for a diet plan
    Given User is on the page View Recent Diets
    When User selects View PDF button for a generated diet plan
    Then User should be able to see download option for the PDF

  
