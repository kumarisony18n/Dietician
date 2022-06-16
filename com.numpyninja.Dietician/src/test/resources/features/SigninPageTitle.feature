#SignIn Page
@SignIn
Feature: SignIn Page Title
Scenario: Validating the title of Signin Page
    Given User is on Dietecian Website
    When User click on icon symbol on Sign In Page
    Then User should see the title of the page as SignIn  
#SignIn page mandatory fields
Scenario: Validating the SignIn page mandatory fields
   Given User is on Dietician website Page
   When User is on Sign In Page
   Then User should see all mandatory flields
#Signin form with Username   
Scenario: Validating the SignIn form heading
   Given User is on Dietician website
   When User lands on SignIn page
   Then User should see a form with heading SignIn form to signIn using Username
   
Scenario: Validating SignIn button
   Given User is on the Dietician website Page
   When User lands on the SignIn page
   Then User should see a button with text SIGNIN in the Sign In form
   
Scenario: Validating SignIn Process with all fields empty
   Given User is on SignIn Page
   When User clicks SignIn button in the SignIn form with all fields empty
   Then User should get error message Please fill out the fields
   
   #Using Data Driven for Valid &Invalid data from Excel
   
Scenario Outline: Validating SignInProcess with invalid FirstName
   Given User is on the SignIn Page
   When User clicks SignIn button entering numeric values for Username from<sheetName> and valid values for password from<rownum>
   Then User should get a message Invalid entry for first field
   Examples:
   |sheetName||rownum|
   |SignInData||1|
   
  #Lenghty  invalidpassword 
Scenario Outline: Validating SignIn process with invalid password
  Given User is in SignIn Page
  When User clicks SignIn button entering data from <sheetName>and value from<rownum>
  Then User should get a message Invalid entry for password field
  Examples:
  |sheetName||rownum|
  |SignInData||2|
  
  
  
Scenario Outline: Validating SignIn with both invalid username and password
 Given User is on SignIn Page form
 When User clicks SignIn button entering data from <sheetName>and values from<rownum>
 Then User should get error message Invalid login credentials
 Examples:
 |sheetName||rownum|
 |SignInData||3|
 
Scenario: Validating SignIn with Forgot password button
 Given User is in  SignIn Page
 When User clicks on Forgot Password button
 Then User should be directed to  Reset password link
 
 Scenario: Validating SignIn with Not member Yet button
 Given User is on the SignIn form page
 When User clicks on not member yet button
 Then User will land on Register Page
 
 Scenario Outline: Validating SignIn with all fields valid entry
 Given User is on the SignIn Page form
 When  User clicks Sign In with data from <sheetName> and values from <rownum>
 Then User logged in successfully
 Examples:
 |sheetName||rownum|
 |SignInData||4|
 
 # Log in with email on Sign In Form
 Scenario: Validating the heading on Login with your email form
 Given User is on the Dietician website page
 When User lands on the SignIn page form
 Then User should see a form with heading Log in with your email form to signIn using email
 
 Scenario: Validating Login button on Login with  your email form
 Given User is on  Dietician website page
 When User lands in SignIn page
 Then User should see a button with text Login in the SignIn form
 
 
 #Data Driven values given from Excel sheet
 Scenario Outline: Validating SignIn with Email and password empty
 Given User lands on the SignIn Page
 When User clicks LogIn button with values from <sheetName> and data from<rownum>
 Then User gets  error message Please fill out fields in textbox
 Examples:
 |sheetName||rownum|
 |LoginwithEmail||3|
 
 Scenario Outline: Validating SignIn with invalid email and valid password
 Given User is in SignInPage form
 When User clicks LogIn button with from <sheetName> and values from<rownum>
 Then User should see message Please fill with valid email id
 Examples:
 |sheetName||rownum|
 |LoginwithEmail||1|
 
 Scenario Outline: Validating SignIn with valid email and invalid password
 Given User is in SignIn form Page
 When User clicks LogIn button with data from <sheetName> and <rownum>
 Then User gets a message Invalid Password Please try again
 Examples:
 |sheetName||rownum|
 |LoginwithEmail||2|
 
 Scenario Outline: Validating SignIn with valid email and empty password field
 Given User is on SignIn Page
 When User clicks LogIn button with data from <sheetName> and <rownum>
 Then User gets a message Please fill the password
 Examples:
 |sheetName||rownum|
 |LoginwithEmail||4|
 
 Scenario Outline: Validating SignIn with both invalid email and password
 Given User on SignIn Page
 When User clicks Log In with both invalid email and password from <sheetName> and <rownum>
 Then User gets error message message Invalid Login credentials
 Examples:
 |sheetName||rownum|
 |LoginwithEmail||5|
 
 Scenario Outline: Validating SignIn with both valid email and password
 Given User is on  the SignInPage
 When User clicks LogIn with values from <sheetName> and <rownum>
 Then User gets a message logged in successfully with signout button
 Examples:
 |sheetName||rownum|
 |LoginwithEmail||6|
 
 
 Scenario: Validating SignIn with Forgot your password
 Given User on the SignInPage
 When User clicks on ForgotPassword button
 Then User is redirected to reset password link
 
 Scenario: Validating SignIn with Facebook button 
 Given User on SignInPage
 When User clicks Facebook button to login
 Then User is redirected to Facebook login Page
 
 Scenario: Validating SignIn with Google button
 Given User is on SignInPage form
 When User clicks Googlebutton to login
 Then User is redirected to Google logIn page
 
 Scenario: Validating SignIn with SignUp button
 Given User on the SignInPage form
 When User clicks sign up link
 Then User is redirected to Register Page
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

 
   
   
       