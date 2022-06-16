Feature: Contact Us link on Home Page

  Scenario: Validating the Contactus link on Home page
    Given User is on Homepage
    When User clicks on  ContactUs link
    Then User is directed to ContactUsPage

  # Feature: 	Contact Us Page	Data fields on Contact us Page
  Scenario Outline: Validating all valid entries for all fields
    Given User is on ContactUsPage  
    When User enters all valid values in fields and click submit button <SheetName> and <RowNumber> 
    Then User should get a message "Your Request is Submitted"

    Examples: 
      | SheetName     | RowNumber |
      | contactusdata |         1 |

  Scenario Outline: Validating the FirstName field on Contact Us Page
    Given User is on ContactUsPage
    When User enters first name with some numeric values<SheetName>and<RowNumber> and other fields with valid values and clicks submit button
    Then User should get a message "Please fill firstname with characters of max10 characters"

    Examples: 
      | SheetName     | RowNumber |
      | contactusdata |         2 |

  Scenario Outline: Validating the LastName field on ContactUsPage
    Given User is on ContactUsPage
    When User enters LastName field with some numeric values<SheetName>and<RowNumber> and other fields with valid values and click submit button
    Then User should get a message "Please fill LastName with characters of maxi10 characters long"

    Examples: 
      | SheetName     | RowNumber |
      | contactusdata |         3 |

  Scenario Outline: Validating the Email field on ContactUsPage
    Given User is on ContactUsPage
    When User enters Email with some image values and other fields with valid values and click submit button<SheetName>and<RowNumber>
    Then User should get a message "Please fill Email field with character,numeric and special character combinations"

    Examples: 
      | SheetName     | RowNumber |
      | contactusdata |         4 |

  Scenario Outline: Validating Subject field on ContactUsPage
    Given User is on ContactUsPage
    When User enters Subject with some numeric values and other fields with valid values and  click submit button<SheetName>and<RowNumber>
    Then User should get a message "Please fill Subject field with some chacters of maximum 20 letters length"

    Examples: 
      | SheetName     | RowNumber |
      | contactusdata |         5 |

  Scenario Outline: Validating Write your Message Here field on ContactUsPage
    Given User is on ContactUsPage
    When User enters Write your Message Here with some numeric values and other fields with valid values and clicks submit button<SheetName>and<RowNumber>
    Then User should get a message "Please fill Write your Message here field with  alphabet characters  of maximum 200 length"

    Examples: 
      | SheetName     | RowNumber |
      | contactusdata |         6 |

  Scenario Outline: Validating all fields on ContactUsPage
    Given User is on ContactUsPage
    When User enters submit button with all fields empty<SheetName>and<RowNumber>
    Then User should get a message Please fill all fields above

    Examples: 
      | SheetName     | RowNumber |
      | contactusdata |         7 |
