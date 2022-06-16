#Home Page
Feature: Home Title,Logo and Menu bar options on  Home Page

  Scenario: Validating the title of the Home page
    Given user is on the browser
    When User opens the Dietician Website
    Then User should see the title of the page as "Home"

  Scenario: Validating the logo on the Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a logo image with the company name on the Home Page

  Scenario: Validate PRODUCT,CLIENTS,TEAM, REGISTER,About,Featured,Blog,Contactus,searchoption,Signinimage are visible on the menu bar of the Home page
    Given User is on the browser
    When User opens the Dietician Website
    Then User should see a tab with text PRODUCT CLIENTS,TEAM, REGISTER,About,Featured,Blog,Contactus,searchoption,Signinimage on the top menu bar of the Home page
