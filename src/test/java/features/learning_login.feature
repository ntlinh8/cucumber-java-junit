@login
Feature: Login with Bank Guru page
	
	@login_no_param
  Scenario: TC01 - Login Bank Guru page with no param
    #Given Open Bank Guru page
    When Get current url
    And Enter username to Username textbox
    And Enter password to Password textbox
    And Click login button
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
    #And Close Browser
    
	@login_with_param_1
  Scenario: TC01 - Login Bank Guru page with param 1
    #Given Open Bank Guru page
    When Get current url
    And Enter "mngr508569" to Username textbox
    And Enter "ejeseda" to Password textbox
    And Click login button
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
    #And Close Browser
    
  # This way isn't recommended, cause confused
	@login_with_param_2
  Scenario: TC01 - Login Bank Guru page with param 2
    #Given Open Bank Guru page
    When Get current url
    And Enter mngr508569 to username textbox
    And Enter ejeseda to password textbox
    And Click login button
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
    #And Close Browser
    
	@login_with_multiple_param
  Scenario: TC01 - Login Bank Guru page with multiple param
    #Given Open Bank Guru page
    When Get current url
    And Enter "mngr508569" username and "ejeseda" password
    And Click login button
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
    #And Close Browser
  
  # This way will create the test case number = the record number in example table
	@login_with_example_variable_for_all_scenario
  Scenario Outline: TC01 - Login Bank Guru page with example variable
    #Given Open Bank Guru page
    When Get current url
    And Enter "<UserName>" username and "<Password>" password
    And Click login button
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
    #And Close Browser

    Examples:
    	|  UserName  | Password |
    	| mngr508569 | ejeseda  |
    	| mngr508561 | ejese1a  |
    	
  # This way will create the test case number = the record number in example table
	@login_with_example_variable_for_step
  Scenario Outline: TC01 - Login Bank Guru page with example variable
    #Given Open Bank Guru page
    When Get current url
    And Enter username and password with data
    	|    user    |    pass     |
    	| <UserName> | <Password>  |
    And Click login button
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
    #And Close Browser

    Examples:
    	|  UserName  | Password |
    	| mngr508569 | ejeseda  |
    	| mngr508561 | ejese1a  |
    	
  # Duplicate single step with the other data
	@login_with_data_table_for_step
  Scenario Outline: TC01 - Login Bank Guru page with example variable
    #Given Open Bank Guru page
    When Get current url
    And Enter username and password with data
    	|    user    |    pass   |
    	| mngr508501 | ejesed01  |
    	| mngr508502 | ejesed02  |
    	| mngr508569 | ejeseda   |
    And Click login button
    Then Verify Home page displayed with message "Welcome To Manager's Page of Guru99 Bank"
    #And Close Browser

    
    