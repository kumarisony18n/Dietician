Feature:  Pagination on View Recent DietPlanspage
Scenario: Validating the default number of records displayed per page
    Given User logged on to Dietician website
    When User on the  View Recent DietsPage
    Then User should see 5 records per page

  Scenario: Validation of traversing next page button
    Given User on the  View Recent DietsPage
    When More than one page of records are displayed and User is on firstpage
    Then Next Page button (>) is enabled

  Scenario: Validation of traversing nextpage
    Given User is on View Recent DietsPage and more than one page of records are displayed and User is on first page
    When User selects the next page button (>)
    Then User should see the second page

  Scenario: Validation of traversing next page button
    Given User on the  View Recent DietsPage
    When More than one page of records are displayed and User is on last page
    Then Next Page button (>) disabled

  Scenario: Validation of traversing next page when one page is displayed
    Given User on the  View Recent DietsPage
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
    Given User on the  View Recent DietsPage
    When More than one page of records are displayed and User is on first page
    Then Previous Page button (>) is disabled

  Scenario: Validation of traversing previous page when one page is displayed
    Given User on the  View Recent DietsPage
    When One page of records are displayed
    Then Previous Page button (>) is disabled
