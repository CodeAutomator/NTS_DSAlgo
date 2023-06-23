@RegisterPage
Feature: Title of your feature
  User want to do resistration
 
 Scenario: The user is presented with error message for empty fields below Username textbox
 Given The user opens Register Page
 When The user clicks "Register" button with all fields empty
 Then It should display an error "Please fill out username field." below Username textbox
 
 Scenario: The user is presented with error message for empty fields below Password textbox
 When User click Register with username as "NumpySDET108Ninja" only
 Then  User verify the message at password on Register Page as "Please fill out password field."
 
 Scenario: The user is presented with error message for empty fields belo Password Confirmation textbox
 When User click Register with password as "PasswordSDET108Ninja" only
 Then User verify the message at confirmation password on Register Page as "Please fill out password confirmation field."

Scenario Outline: to register with all the data
    Given The user opens Register Page
    When user enter the sheetname "<sheetname>" and row number <rownum>
    Then user click on Register button

    Examples: 
      | sheetname| rownum |
      | Register  |      0 |
      | Register  |      1 |
      | Register  |      2 |
      | Register  |      3 |
 
 Scenario: Verifying signin link
 Given The user clicks on signin  link on register page
 Then The user redirected to signinpage from registerpage
 

 
 


  