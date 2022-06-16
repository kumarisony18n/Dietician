#AddNewPatient
Feature: AddNewPatient
Scenario: Add New Patient Details
Given User is on the Add New Patient Page
When User wants to enter New Patient details
Then Patient Data From is visible

Scenario: Empty Form submission For Add New Patient Details
Given User is on the Add New Patient page
When User attempts to submit the form without filling up mandatory fields
Then Unable to update and show "Please fillup all the mandatory fields" error message

Scenario: Mandatory field Validation
Given User is on the Add New Patient page
When User attempts to submit the form without filling up mandatory fields
Then Unable to update and show Please fillup all the mandatory fields error message


#DataDriven
Scenario Outline: Full Name Field Space Validation
Given User is on Add NewPatient page
When User does not put space in between  First Name and Last Name  for Full Name field values from excel <sheetname> and <rownumber>
Then Unable to enter and show First and Last Name should have space in between error message is displayed
Examples:
|sheetName||rownum|
|AddNewPatient||1|


#DataDriven
Scenario Outline: Full Name Field Empty Value Validation
Given User on  AddNewPatient page
When User attempts to submit the form without filling up Full Name field from<sheetname> and <rownumber>
Then Unable to enter and show Please enter Full Name error message
Examples:
|sheetName||rownum|
|AddNewPatient||2|


#DataDriven
Scenario Outline: Addess line 1 Field Empty Value Validation
Given User is on the Add New Patientpage
When User does not enter any value in Addess line 1 field from <sheetname> and <rownumber>
Then Unable to enter and show Please enter Addess line 1 error message
Examples:
|sheetName||rownum|
|AddNewPatient||3|


#DataDriven
Scenario Outline: Country Field Empty Value Validation
Given User on the Add NewPatient page
When User attempts to submit the form without selecting any value for Country field from<sheetname>and <rownumber>
Then Unable to enter and show Please select Country from dropdown error message
Examples:
|sheetName||rownum|
|AddNewPatient||4|

#DataDriven
Scenario Outline: City Field Numeric Value Validation
Given User is on Add New Patientpage
When User attempts to put numeric value in City field from <sheetname> and <rownumber>
Then Unable to enter and show Only characters are allowed error message
Examples:
|sheetName||rownum|
|AddNewPatient||5|


#DataDriven
Scenario Outline: City Field Empty Value Validation
Given User on AddNew Patientpage
When User attempts to submit the form without filling up City field from <sheetname> and <rownumber>
Then Unable to enter and show Please enter City error message
Examples:
|sheetName||rownum|
|AddNewPatient||6|

#DataDriven
Scenario Outline: State province or region Field Numeric Value Validation
Given User is in the Add New Patient page
When User attempts to put numeric value in State province or region field from<sheetname> and<rownumber>
Then Unable to enter and show Only characters are allowed error message
Examples:
|sheetName||rownum|
|AddNewPatient||7|

#DataDriven
Scenario Outline: State province or region Field Empty Value Validation
Given User is in AddnewPatientPage
When User attempts to submit form without filling State province or region field from<sheetname> and<rownum>
Then Unable to enter show error message Please enter Stateprovince or region
Examples:
|sheetName||rownum|
|AddNewPatient||8|

#DataDriven
Scenario Outline: Postal code Field Empty Value Validation
Given User is on the Add New Patient page
When User attempts to submit the form without filling up Postal code field from <sheetname> and <rownum>
Then Unable to enter and show Please enter Postal code error message
Examples:
|sheetName||rownum|
|AddNewPatient||9|


#DataDriven
Scenario Outline: Postal code Field Wrong Data Fomat Validation
Given User is in Add NewPatientpage
When User entered not supported data format in Postal code field from<sheetname> and <rownum>
Then Unable to enter and show Invalid Postal code format error message
Examples:
|sheetName||rownum|
|AddNewPatient||10|

#DataDriven
Scenario Outline: Email Field Empty Value Validation
Given User on the Page Add New Patient
When User does not enter any value in Email field from<sheetname> and <rownumber>
Then Unable to enter and show Please enter Email error message
Examples:
|sheetName||rownum|
|AddNewPatient||11|


#DataDriven using Excel
Scenario Outline: Email Field Wrong Data Fomat Validation
Given User is on thePage Add New Patient
When User entered not supported data format in Email field from <sheetname> and <rownumber>
Then Unable to enter and show Invalid email format error message
Examples:
|sheetName||rownum|
|AddNewPatient||12|


#DataDriven using Excel
Scenario Outline: Phone number Field Character Value Validation
Given User on Page Add NewPatient
When User attempts to put characters in Phone number field from<sheetname>and <rownumber>
Then Unable to enter and show Only Numeric values are allowed error message
Examples:
|sheetName||rownum|
|AddNewPatient||13|

#Datadriven using Excel
Scenario Outline: Phone number Field Empty Value Validation
Given User on the AddNewPatient page
When User attempts to submit the form without filling up Phone number field from <sheetname> and <rownumber>
Then Unable to enter and show Please enter Phone number error message
Examples:
|sheetName||rownum|
|AddNewPatient||14|


#Datadriven using Excel
Scenario Outline: Inserting Valid New Patient data submission
Given User is on the Add New Patientpage
When User fills up the form with Valid Data Inputs from <sheetname> and from <rownum>
Then User can see Add New Patient button
Examples:
|sheetName||rownum|
|AddNewPatient||15|

#data driven using Excel
Scenario Outline: Valid New Patient data submission
Given Useron thepage  of Add New Patient
When User clicks on the  Add New Patient button after entering valid Patient data from <sheetname> and <rownumber>
Then User lands on My Patients page with the New Patient details displayed
Examples:
|sheetName||rownum|
|AddNewPatient||16|