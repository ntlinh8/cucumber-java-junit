@new_customer_validate
Feature: Validate state and pin fields

  @validate_state @cannot_be_empty
  Scenario: TC11 - State cannot empty
  	Given Send your email
    And Click Submit button
    And Get new username and new password
    And Open Login page
    And Input new username in the Username testbox
    And Input new password in the Password textbox
    And Click Login button
    And Verify the message "Welcome To Manager's Page of Guru99 Bank" is displayed
    And Open "New Customer" page
    
  	When Input to "State" textbox with value ""
  	And Press tab in textbox by label "State"
  	Then The error message displayed at "State" with value "State must not be blank"
  
  @validate_state @cannot_be_numberic
  Scenario: TC12 - State cannot be numberic
  	Given Open "New Customer" page
  	When Input to "State" textbox with value "State123"
  	And Press tab in textbox by label "State"
  	Then The error message displayed at "State" with value "Numbers are not allowed"
  	When Input to "State" textbox with value "123"
  	And Press tab in textbox by label "State"
  	Then The error message displayed at "State" with value "Numbers are not allowed"
  	
  @validate_state @cannot_have_special_character
  Scenario: TC13 - State cannot have character
  	Given Open "New Customer" page
  	When Input to "State" textbox with value "State!@#"
  	And Press tab in textbox by label "State"
  	Then The error message displayed at "State" with value "Special characters are not allowed"
  	When Input to "State" textbox with value "!@#"
  	And Press tab in textbox by label "State"
  	Then The error message displayed at "State" with value "Special characters are not allowed"
  	
  @validate_state @cannot_have_first_blank_space
  Scenario: TC14 - State cannot have character
  	Given Open "New Customer" page
  	When Input to "State" textbox with value "   Space"
  	And Press tab in textbox by label "State"
  	Then The error message displayed at "State" with value "First character can not have space"
  	
  @validate_pin @cannot_be_empty
  Scenario: TC15 - PIN cannot be empty
  	Given Open "New Customer" page
  	When Input to "PIN" textbox with value ""
  	And Press tab in textbox by label "PIN"
  	Then The error message displayed at "PIN" with value "PIN Code must not be blank"
  	
  @validate_pin @cannot_be_numberic
  Scenario: TC16 - PIN cannot be numberic
  	Given Open "New Customer" page
  	When Input to "PIN" textbox with value "123PIN"
  	And Press tab in textbox by label "PIN"
  	Then The error message displayed at "PIN" with value "Characters are not allowed"
  	
  @validate_pin @must_have_6_digits
  Scenario: TC17 - PIN cannot have 6 digits
  	Given Open "New Customer" page
  	When Input to "PIN" textbox with value "1231"
  	And Press tab in textbox by label "PIN"
  	Then The error message displayed at "PIN" with value "PIN Code must have 6 Digits"
  	
  @validate_pin @cannot_have_special_character
  Scenario: TC18 - PIN cannot have special character
  	Given Open "New Customer" page
  	When Input to "PIN" textbox with value "!@#"
  	And Press tab in textbox by label "PIN"
  	Then The error message displayed at "PIN" with value "Special characters are not allowed"
  	When Input to "PIN" textbox with value "123!@#"
  	And Press tab in textbox by label "PIN"
  	Then The error message displayed at "PIN" with value "Special characters are not allowed"
  	
  @validate_pin @cannot_have_first_character_as_blank_space
  Scenario: TC19 - PIN cannot have first charater as blank space
  	Given Open "New Customer" page
  	When Input to "PIN" textbox with value "  12"
  	And Press tab in textbox by label "PIN"
  	Then The error message displayed at "PIN" with value "First character can not have space"
  	
  @validate_pin @cannot_have_first_character_as_blank_space
  Scenario: TC20 - PIN contains space
  	Given Open "New Customer" page
  	When Input to "PIN" textbox with value "11 2"
  	And Press tab in textbox by label "PIN"
  	Then The error message displayed at "PIN" with value "Characters are not allowed"
  	
  	
  	
  	