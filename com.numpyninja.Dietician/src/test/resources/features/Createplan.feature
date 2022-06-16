#Create Plan
Feature: Heading for Createplanpage

  Scenario: Validating the heading
    Given User is logged on to Dietician website
    When UserlandsonCreatePlanpage
    Then User see the heading "Confirm Health Conditions and Generate a new DietPlan" on the page

  Scenario: Validating the Browse button visibility
    Given User is logged on to Dietician website
    When UserlandsonCreatePlanpage
    Then User should see a button with name "Browse"on the page

  Scenario: Validating the Browse button tool tip option
    Given User is logged on to Dietician website
    When UserlandsonCreatePlanpage
    Then User should see a tool tip "PDF files only" for the Browse button

  Scenario: Validating the Browse button operation
    Given User is on "Create Plan" page
    When User clicks the Browse button and selects a document
    When User should see the selected document in the field next to the Browse button on the page
