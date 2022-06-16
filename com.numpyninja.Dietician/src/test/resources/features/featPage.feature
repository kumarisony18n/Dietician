Feature: link on Home Page

  Scenario: Validating the Feature Link on Home Page
    Given User is on  Home Page
    When User clicks on Featured link
    Then User is directed to Featured content page
