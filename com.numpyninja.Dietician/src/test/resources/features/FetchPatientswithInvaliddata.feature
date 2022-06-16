Feature: Fetch patients with invalid data

  Scenario Outline: Search Filters
    Given User is on my patients page
    When User types in invalid input as "<gjsgdjs>" in phone number field
    Then It must throw error message for invalid phone and discontinue search action.

    Examples: 
      | phone   |
      | tytfyfy |

  Scenario Outline: Search Filters
    Given User is on my patients page
    When User types in anything other valid character as "<ygud>" in email address field
    Then It must throw error message for invalid email and discontinue search action.

    Examples: 
      | email |
      | ssss  |

  Scenario Outline: Search Filters
    Given User is on my patients page
    When User types in anything other alphabets "<87686>" in name field
    Then It must throw error message for invalid name and discontinue search action.

    Examples: 
      | name    |
      | 5758768 |
