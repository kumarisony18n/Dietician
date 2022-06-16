#Register Page
Feature: Register Page Title and mandatory fields

  Scenario: Validating the REGISTER link on Upper Menu Bar on Home page 
    Given User is on  Home Page
    When User clicks on REGISTER Link on Home Page
    Then User Sholud see " allmandatoryflieldswithstarsymbolontopofthosefieldsand,titleofthepageisregister"

  Scenario: Validating the Sign Up form heading
    Given User is on Dietician website
    When User lands on Register page 
    Then User should see a form with heading Sign Up form, to sign up using mobile number 

  Scenario: Validating the Sign Up button for the option Sign up using mobile number on Register page.
    Given User is on Dietician website
    When User lands on Register page
    Then User should see a button with text SIGN UP in the Sign Up form

  Scenario Outline: Validating the Sign up process with all fields being empty
    Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up form with all fields empty<SheetName> and<RowNumber>
    Then User should see a message" Mandatory fields cannot be empty"

    Examples: 
      | SheetName         | RowNumber |
      | RegisterValiddata |         8 |

  #Useing datadriven for Register page data taken from Excelsheet for Valid and Invalid data.
  Scenario Outline: Validate the Sign up process with invalid First Name
    Given User is on Register page
    When User gives invalid firstname <SheetName> and<RowNumber>
    Then User click on signup button and should see a message "Invalid data entered for First Name"

    Examples: 
      | SheetName         | RowNumber |
      | RegisterValiddata |         2 |

  Scenario Outline: Validating the Sign up process with invalid Last Name
    Given User is on Register page
    When User enter numeric text for Last Name <SheetName> and<RowNumber>
    Then User click on signup button and should see a message "Invalid data entered forLast Name"

    Examples: 
      | SheetName         | RowNumber |
      | RegisterValiddata |         3 |

  Scenario Outline: Validating the Sign up process with invalid Mobile Number
    Given User is on Register page
    When User entering Aphanumeric text for Mobile Number, <SheetName> and<RowNumber>valid values for the remaining fields
    Then User click on signup button and should see a message "Invalid data entered for Mobile Number"

    Examples: 
      | SheetName         | RowNumber |
      | RegisterValiddata |         4 |

  Scenario Outline: Validating the Sign up process with invalid Any other field
    Given User is on Register page
    When User entering numeric text for Any other field,<SheetName> and<RowNumber> valid values for the remaining fields.
    Then User Clicks on signup and should see a message Invalid data entered for Any other field

    Examples: 
      | SheetName         | RowNumber |
      | RegisterValiddata |         5 |

  Scenario Outline: Validating the Sign up process with invalid Email
    Given User is on Register page
    When User  entering invalid email Id for Email,<SheetName> and<RowNumber>valid values for the remaining fields.
    Then User Clicks on signup and should see a message Invalid data entered for Email.

    Examples: 
      | SheetName         | RowNumber |
      | RegisterValiddata |         6 |
  
  Scenario Outline: Validating the Sign up process with invalid Password
    Given User is on Register page
    When User entering invalid Password <SheetName> and<RowNumber>,valid values for the remaining fields.
    Then User click onSignup and should see a message Invalid data entered for Password

    Examples: 
      | SheetName         | RowNumber |
      | RegisterValiddata |         7 |

  Scenario Outline: Validating the Sign up process with all valid  input field .
    Given User is on Register page
    When User  entering valid values for the all fields <SheetName> and<RowNumber>
    Then User Click on sigup and is re-directed to Sign In page.

    Examples:  
      | SheetName         | RowNumber |
      | RegisterValiddata |         1 |

  Scenario: Validating the Sign Up form heading
    Given User is on Dietician website
    When User lands on Register page  
    Then User should see a form with heading Sign Up with your email to sign up using Email Id

  Scenario: Validating the Sign Up button forthe option Sign up using Email Id on  Register page.
    Given User is on Dietician website
    When User lands on Register page
    Then User should see a button with text Sign Up in the Sign Up with your Email form

  Scenario Outline: Validating the Sign up process with all fields being empty
    Given User is on Register page
    When User clicks SIGN UP Button in the Sign Up with your Email form with all fields empty<SheetName> and<RowNumber>
    Then User should see a message "Mandatory fields cannot be empty"

    Examples: 
      | SheetName         | RowNumber |
      | RegisterbyEmail |         8 |

  Scenario Outline: Validating the Sign up process with invalid Name
    Given User is on Register page
    When User enter numeric text for First Name <SheetName> and<RowNumber>, valid values for the remaining fields
    Then Userclick on login button should see a message Invalid data entered for First Name

    Examples: 
      | SheetName         | RowNumber |
      | RegisterbyEmail |         2 |

  Scenario Outline: Validating the Sign up process with invalid Last Name
    Given User is on Register page
    When User enter numeric text for Last Name <SheetName> and<RowNumber>, valid values for the remaining fields
    Then User click onlogin and should see a message Invalid data entered for Last Name.

    Examples: 
      | SheetName         | RowNumber |
      | RegisterbyEmail |         3 |

  Scenario Outline: Validating the Sign up process with invalid UserName
    Given User is on Register page
    When User enter numeric text for Username,<SheetName> and<RowNumber> valid values for the remaining fields
    Then User click onlogin and should see a message Invalid data entered for Username

    Examples: 
      | SheetName         | RowNumber |
      | RegisterbyEmail |         4 |

  Scenario Outline: Validating the Sign up process with invalid Email Address
    Given User is on Register page
    When User enter invalid Email Address <SheetName> and<RowNumber> and valid values for the remaining fields.
    Then User click onlogin andshould see a message Invalid data entered for Email Address.

    Examples: 
      | SheetName         | RowNumber |
      | RegisterbyEmail |         5 |

  Scenario Outline: Validating the Sign up process withinvalid Password
    Given User is on Register page
    When User enter invalid Password<SheetName> and<RowNumber> and valid values for the remaining fields
    Then User click onlogin and should see a message Invaild Password

    Examples: 
      | SheetName         | RowNumber |
      | RegisterbyEmail |         6 |

  Scenario Outline: Validating the Sign up process with invalid Confirm Password
    Given User is on Register page
    When User entering a value that is different than the Password field value <SheetName> and<RowNumber>,valid values for the remaining fields
    Then User click onlogin and should see a message Confirm Password should same as Password

    Examples: 
      | SheetName         | RowNumber |
      | RegisterbyEmail |         7 |
  
  Scenario Outline: Validating the Sign up process with all valid  input field
    Given User is on Register page
    When User entering valid values for the all fields<SheetName> and<RowNumber>
    Then User clik on login and is re-directed to Sign In page. 

    Examples: 
      | SheetName         | RowNumber |
      | RegisterbyEmail |         1 |

  Scenario: Validating the Sign up process with Facebook
    Given User is on Register page
    When User clicks Facebook Button in the Sign Up with your Email form
    Then User successfully login with Facebook account.

  Scenario: Validating the Sign up process with Google
    Given User is on Register page
    When User clicks Google Button in the Sign Up with your Email form
    Then User successfully login with Google account.

  Scenario: Validating Log In Here link
    Given User is on Register page
    When User clicks Log in here link.
    Then User is re-directed to Sign In Page
