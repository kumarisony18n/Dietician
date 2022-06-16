Feature: View PDF
  Scenario: Validation of View PDF option
    Given User logged on to the Dietician website
    When User is on page View Recent Diets
    Then View PDF option is available for the generated diet plans

  Scenario: Validation of generated PDF for a diet plan
    Given User is on page View Recent Diets
    When User selects the View PDF button for a generated diet plan
    Then User should see the information in the pdf
  