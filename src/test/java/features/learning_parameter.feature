@parameter
Feature: Login with Bank Guru page
	
# Apply for all scenarios in this feature
#Background: 
#	Given Open Bank Guru page

	@login_no_param
  Scenario: TC01 - Login Bank Guru page with no param
    When Get current url
    And Enter username to Username textbox
    And Enter password to Password textbox
    And Click login button
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
    
	@login_with_param_1
  Scenario: TC01 - Login Bank Guru page with param 1
    When Get current url
    And Enter "mngr508569" to Username textbox
    And Enter "ejeseda" to Password textbox
    And Click login button
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
    
  # This way isn't recommended, cause confused
	@login_with_param_2
  Scenario: TC01 - Login Bank Guru page with param 2
    When Get current url
    And Enter mngr508569 to username textbox
    And Enter ejeseda to password textbox
    And Click login button
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
    
	@login_with_multiple_param
  Scenario: TC01 - Login Bank Guru page with multiple param
    When Get current url
    And Enter "mngr508569" username and "ejeseda" password
    And Click login button
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
