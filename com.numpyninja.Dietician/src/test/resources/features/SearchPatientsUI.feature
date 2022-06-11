
Feature: Search patients
  Scenario: Search feature
    Given User is on any page after login
    When User clicks on "My Patients" tab
    Then Name, email and phone number filter options and search button are displayed.

	Scenario: Verify search button text
    Given User is logged in
    When User is on my patients
    Then button used for search has text as 'Search'
	
	Scenario: Verify default text in name filter input box goes away
    Given User is on my patients 
    When User starts typing inside name filter box
    Then Text inside name filter box should disappear
	
	Scenario: Verify default text in email input box goes away
    Given User is on my patients
    When User starts typing inside email address filter box
    Then Text inside email address filter box should disappear
	
		Scenario: Verify default text in phone number input box goes away
    Given User is on my patients
    When User starts typing inside phone number filter box
    Then Text inside phone number filter box should disappear
	
	
	