@register
Feature: Register and login Bank guru page

  @register_successful
  Scenario: [Register] Create a new account
    Given Send your email
    And Click Submit button
    And Get new username and new password
    When Open Login page
    And Input new username in the Username testbox
    And Input new password in the Password textbox
    And Click Login button
    Then Verify the message "Welcome To Manager's Page of Guru99 Bank" is displayed
