Feature: Generate Menu Button on CreatePlanpage

  Scenario: Validating the Generate Menu button visibility
    Given User is logged on to Dietician website
    When User is on "Confirm conditions and Create Plan" page
    Then User should see a button with text "GENERATE MENU"  at the bottom of the page

  Scenario: Validating the Generate Menu button operation
    Given User is on CreatePlanpage
    When User clicks the GENERATE MENU button
    Then New Diet plan should be generated with the latest confirmed Health conditions

  Scenario: Validating the Generate Menu button operation
    Given User is on CreatePlanpage
    When User clicks the GENERATE MENU button
    Then User should land on "View Recent Diets" page

  #Use case Diet Plans
  #Feature: Heading for DietPlanspage
  Scenario: Validating the heading of theDietplanspage
    Given User is logged on to Dietician website
    When User is on DietPlanpage
    Then User should see the heading "Generated Diet Plans" on the page

  #Feature: MenuBar on DietsPlanspage
  Scenario: Validating the tabs on the menu bar of Diets page
    Given User is logged on to Dietician website
    When User is on "Diet Plans" page
    Then User should see that Diet Plans tab on the menu bar is selected