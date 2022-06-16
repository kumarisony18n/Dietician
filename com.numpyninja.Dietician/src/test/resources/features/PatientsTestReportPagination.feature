
Feature: Patient Test Report Pagination

  Scenario: Verify pagination
    Given User clicks on 'View Previous Test Reports' button to view previous test reports
    When User is on 'View Patient Test Reports' page to view test reports
    Then More than 3 records should be displayed on different pages through pagination

  Scenario: Verify next link
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Pagination has 'Next' as next link

  Scenario: Verify previous link
    Given User clicks on button 'View Previous Test Reports'
    When User is on 'View Patient Test Reports' page
    Then Pagination has 'Previous' as previous link

    