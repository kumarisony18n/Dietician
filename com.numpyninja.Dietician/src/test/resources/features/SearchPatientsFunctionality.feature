Feature: Search patients
  Scenario: Search patients by name
    Given User is on my patients
    When User clicks on search with <name phrase> into name filter box.
    Then Records for <name phrase> are shown.

  Scenario: Search patients by email
    Given User is on my patients
    When User clicks on search with <email phrase> into email address filter.
    Then Records for <email phrase> are shown.
  
  Scenario: Search patients by phone number
    Given User is on my patients
    When User clicks on search with <phone number> into phone number filter.
    Then Records for <phone number> are shown.
  
  Scenario: Search patients by name and phone number
    Given User is on my patients
    When User clicks on search button with <name phrase> into name filter box, <phone number> into phone number filter
    Then Records for <name phrase> and <phone number> are shown.
    
  Scenario: Search patients by name and email address
    Given User is on my patients
    When User clicks on search button with <name phrase> into name filter box, <email phrase> into email address filter box
    Then Records for <name phrase> and <email phrase> are shown.
    
  Scenario: Search patients by email address and phone number
    Given User is on my patients
    When User clicks on search button with <phone number> into phone number filter box, <email phrase> into email address filter box
    Then Records for <phone number> and <email phrase> are shown.

      
  					    
  
    
  