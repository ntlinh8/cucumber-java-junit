@new_customer_validate
Feature: Validate name, address and city fields

  @validate_name @cannot_be_empty
  Scenario: TC01 - Name cannot be empty
  	Given Send your email
    And Click Submit button
    And Get new username and new password
    And Open Login page
    And Input new username in the Username testbox
    And Input new password in the Password textbox
    And Click Login button
    And Verify the message "Welcome To Manager's Page of Guru99 Bank" is displayed
    And Open "New Customer" page
    
  	When Input to "Customer Name" textbox with value ""
  	And Press tab in textbox by label "Customer Name"
  	Then The error message displayed at "Customer Name" with value "Customer name must not be blank"
  	
  @validate_name @cannot_be_numberic
  Scenario: TC02 - Name cannot be numberic
  	Given Open "New Customer" page
  	When Input to "Customer Name" textbox with value "1234"
  	And Press tab in textbox by label "Customer Name"
  	Then The error message displayed at "Customer Name" with value "Numbers are not allowed"
  	When Input to "Customer Name" textbox with value "name1234"
  	And Press tab in textbox by label "Customer Name"
  	Then The error message displayed at "Customer Name" with value "Numbers are not allowed"
  	
  @validate_name @cannot_have_special_characters
  Scenario: TC03 - Name cannot have special charaters
  	Given Open "New Customer" page
  	When Input to "Customer Name" textbox with value "name!@#"
  	And Press tab in textbox by label "Customer Name"
  	Then The error message displayed at "Customer Name" with value "Special characters are not allowed"
  	When Input to "Customer Name" textbox with value "!@#"
  	And Press tab in textbox by label "Customer Name"
  	Then The error message displayed at "Customer Name" with value "Special characters are not allowed"
  	
  @validate_name @cannot_have_first_character_as_blank_space
  Scenario: TC04 - Name cannot have first charater as blank space
  	Given Open "New Customer" page
  	When Input to "Customer Name" textbox with value "  Sunny"
  	And Press tab in textbox by label "Customer Name"
  	Then The error message displayed at "Customer Name" with value "First character can not have space"
  	
  @validate_address @cannot_be_empty
  Scenario: TC05 - Address cannot be empty
  	Given Open "New Customer" page
  	When Input to "Address" textbox with value ""
  	And Press tab in textbox by label "Address"
  	Then The error message displayed at "Address" with value "Address Field must not be blank"
  	
  @validate_address @cannot_have_first_character_as_blank_space
  Scenario: TC06 - Address cannot have first character as blank space
  	Given Open "New Customer" page
  	When Input to "Address" textbox with value "  No.1 Tran Dai Nghia Street"
  	And Press tab in textbox by label "Address"
  	Then The error message displayed at "Address" with value "First character can not have space"
  	
  @validate_city @cannot_be_empty
  Scenario: TC07 - City cannot be empty
  	Given Open "New Customer" page
  	When Input to "City" textbox with value ""
  	And Press tab in textbox by label "City"
  	Then The error message displayed at "City" with value "City Field must not be blank"
  	
  @validate_city @cannot_be_numberic
  Scenario: TC08 - City cannot be numberic
  	Given Open "New Customer" page
  	When Input to "City" textbox with value "city1234"
  	And Press tab in textbox by label "City"
  	Then The error message displayed at "City" with value "Numbers are not allowed"
  	When Input to "City" textbox with value "1234"
  	And Press tab in textbox by label "City"
  	Then The error message displayed at "City" with value "Numbers are not allowed"
  	
  @validate_city @cannot_have_special_characters
  Scenario: TC09 - City cannot have special character
  	Given Open "New Customer" page
  	When Input to "City" textbox with value "city!@#"
  	And Press tab in textbox by label "City"
  	Then The error message displayed at "City" with value "Special characters are not allowed"
  	When Input to "City" textbox with value "!@#"
  	And Press tab in textbox by label "City"
  	Then The error message displayed at "City" with value "Special characters are not allowed"
  	
  @validate_city @cannot_have_first_character_as_blank_space
  Scenario: TC10 - City cannot have first blank space
  	Given Open "New Customer" page
  	When Input to "City" textbox with value "   New York"
  	And Press tab in textbox by label "City"
  	Then The error message displayed at "City" with value "First character can not have space"
  	
  	