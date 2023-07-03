@new_customer_validate
Feature: Validate phone and email fields

  @validate_phone_number @cannot_be_empty
  Scenario: TC21 - Phone number cannot empty
  	Given Send your email
    And Click Submit button
    And Get new username and new password
    And Open Login page
    And Input new username in the Username testbox
    And Input new password in the Password textbox
    And Click Login button
    And Verify the message "Welcome To Manager's Page of Guru99 Bank" is displayed
    And Open "New Customer" page
    
  	When Input to "Mobile Number" textbox with value ""
  	And Press tab in textbox by label "Mobile Number"
  	Then The error message displayed at "Mobile Number" with value "Mobile no must not be blank"
  
	@validate_phone_number @cannot_have_first_character_as_blank_space
  Scenario: TC22 - Phone number cannot empty
  	Given Open "New Customer" page
    When Input to "Mobile Number" textbox with value " 01231213123"
    And Press tab in textbox by label "Mobile Number"
    Then The error message displayed at "Mobile Number" with value "First character can not have space"
    
	@validate_phone_number @cannot_have_space
  Scenario: TC23 - Phone number cannot have space
  	Given Open "New Customer" page
    When Input to "Mobile Number" textbox with value "0123 123123"
    And Press tab in textbox by label "Mobile Number"
    Then The error message displayed at "Mobile Number" with value "Characters are not allowed"
    
	@validate_phone_number @cannot_have_special_character
  Scenario: TC24 - Phone number cannot have special character
  	Given Open "New Customer" page
    When Input to "Mobile Number" textbox with value "0123123!@#"
    And Press tab in textbox by label "Mobile Number"
    Then The error message displayed at "Mobile Number" with value "Special characters are not allowed"
    
	@validate_email @cannot_be_empty
  Scenario: TC25 - Email cannot be empty
  	Given Open "New Customer" page
    When Input to "E-mail" textbox with value ""
    And Press tab in textbox by label "E-mail"
    Then The error message displayed at "E-mail" with value "Email-ID must not be blank"
    
    
	@validate_email @cannot_be_incorrect_format
  Scenario: TC26 - Email cannot be incorrect format
  	Given Open "New Customer" page
    When Input to "E-mail" textbox with value "guru@gmail"
    And Press tab in textbox by label "E-mail"
    Then The error message displayed at "E-mail" with value "Email-ID is not valid"
    
    
	@validate_email @cannot_have_space
  Scenario: TC27 - Email cannot have space
  	Given Open "New Customer" page
    When Input to "E-mail" textbox with value "gurug @gmail.com"
    And Press tab in textbox by label "E-mail"
    Then The error message displayed at "E-mail" with value "Email-ID is not valid"
    
	@validate_all_fields 
  Scenario: TC28 - All fields exist
  	When Open "New Customer" page
    Then The textbox exist with label "Customer Name"
    And The textbox exist with label "Gender"
    And The textbox exist with label "Date of Birth"
    And The textbox exist with label "Address"
    And The textbox exist with label "City"
    And The textbox exist with label "State"
    And The textbox exist with label "PIN"
    And The textbox exist with label "Mobile Number"
    And The textbox exist with label "E-mail"
    And The textbox exist with label "Password"
    
    
