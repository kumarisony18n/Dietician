#Author: upload button in create plan

Feature: Upload button on Create Plan page
  
  Scenario: Validating the Upload button
    Given User is logged on to Dietician website
    When User lands on Create Planpage
    Then User should see a button with name"Upload" on the page

   Scenario: Validating the Upload button with no file selected
    Given User is on Create Plan page
    When User clicks the Upload button without selecting a document
    Then User should see an error message "Only files with extension.pdf are allowed"

Scenario: Validating the Upload functionality with incorrect file format
    Given User on CreatePlan page
    When User clicks Upload button by selecting a non-PDF file 
    Then User can see an error message Only with extension .pdf files allowed
    
   Scenario: Validating the Upload functionality with incorrect file size
    Given User on CreatePlan page
    When User clicks the Upload button by selecting a PDF file of size greater than 2MB
    Then User should view error message Only extension .pdf files allowed
    
  Scenario: Validating the Upload functionality with incorrect file format and size
    Given User is in Create Planpage
    When User clicks the Upload button selecting non-pdf filesize greater than 2MB
    Then User should see an errormessage Only files extension .pdf  will be allowed
   
   Scenario: Validating the Upload functionality with correct file format and size
   Given User on Create Planpage
   When User clicks the Upload button by selecting a pdf file of size less than 2MB
   Then User should see message Fileuploaded succesfully
   #Option 1 to confirm Health Conditionson Create Plan page
   
   Scenario: Validating option 1 menu visibility
   Given User is logged on to Dietician website
   When User lands on the ConfirmHealthconditions and CreatedietPlanpage
   Then User should see option 1 menu to update the health conditions
   
   Scenario: Validating visibility of Confirm button on option 1 menu 
   Given User is logged into Dietician website
   When User on the ConfirmHealthconditions and Create Plan page
   Then User should see a button with text " CONFIRM" in option 1 menu
   
   Scenario: Validating the option 1 menu interaction
   Given User is logged on to Dietician website
   When User lands on the Page ConfirmHealthconditions and CreatePlan
   Then User can update the health conditions in option 1 menu
   
   Scenario: Validating that the option 1 menu cannot be modified after confirming
   Given User in CreatePlanpage
   When User clicks the CONFIRM button in option 1 menu
   Then User cannot update healthconditions in option 1 menu
    
   Scenario: Validating option 2 menu visibility
   Given User is logged on to Dietician website
   When User can view CreatePlanpage and ConfirmHealthconditions
   Then User should see option 2 menu to update the health conditions
   
   Scenario: Validating visibility of Confirm button on option 2 menu 
   Given User is logged to Dieticianwebsite
   When User on the page ConfirmHealthconditions and CreatePlan
   Then User should see a button with text " CONFIRM" in option 2 menu
   
   Scenario: Validating the option 2 menu interaction
   Given User is logged on to Dietician website
   When User lands on thePage Confirm Healthconditions and CreatePlan
   Then User can update health conditions in option 2 menu
   
   Scenario: Validating that the option 2 menu cannot be modified after confirming
   Given User  on the CreatePlanpage
   When User clicks the CONFIRM button in option 2
   Then User cannot update the healthconditions in option 2 menu 
   
  
   
   
   
   
   
   
   
   
   
   
    

   
