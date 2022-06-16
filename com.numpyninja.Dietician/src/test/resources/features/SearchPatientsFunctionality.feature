Feature: Search patients

  Scenario Outline: Search patients by name
    Given User is on My Patients
    When User clicks on search with name as "<name phrase>"  into name filter box.
    Then Related records for name are shown.

    Examples: 
      | name     |
      | Avantika |
      | Amar     |

  Scenario Outline: Search patients by email
    Given User is on My Patients
    When User clicks on search with email as "<email phrase>" into email address filter.
    Then Records for email address are shown.

    Examples: 
      | email phrase   |
      | ggg@gmail.com  |
      | sdsf@gmail.com |

  Scenario Outline: Search patients by phone number
    Given User is on My Patients
    When User clicks on search with phone as "<phone number>" into phone number filter.
    Then Records for phone are shown.

    Examples: 
      | phone number |
      |   2324345456 |
      |   5876889780 |

  Scenario Outline: Search patients by name and phone number
    Given User is on My Patients
    When User clicks on search button with name as "<name phrase>" into name filter box, phone as "<phone number>" into phone number filter
    Then Records for name and phone are shown.

    Examples: 
      | name   | phone number |
      | Farida |   7687686868 |
      | Garima |   6576868722 |

  Scenario Outline: Search patients by name and email address
    Given User is on My Patients
    When User clicks on search button with name as "<name phrase>" into name filter box, email as "<email phrase>" into email address filter box
    Then Records for name and email are shown.

    Examples: 
      | name   | email phrase   |
      | Hansha | ggg@gmail.com  |
      | Harsh  | sdsf@gmail.com |

  Scenario Outline: Search patients by email address and phone number
    Given User is on My Patients
    When User clicks on search button with phone as "<phone number>" into phone number filter box, email as "<email phrase>" into email address filter box
    Then Records for phone and email are shown.

    Examples: 
      | phone number | email phrase   |
      |   2324345456 | ggg@gmail.com  |
      |   5876889780 | sdsf@gmail.com |
