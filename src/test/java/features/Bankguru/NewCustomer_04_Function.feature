@new_customer_function
Feature: New customer function

  @new_customer_create_success
  Scenario Outline: TC29 - Create a new customer
  	Given Send your email
    And Click Submit button
    And Get new username and new password
    And Open Login page
    And Input new username in the Username testbox
    And Input new password in the Password textbox
    And Click Login button
    And Verify the message "Welcome To Manager's Page of Guru99 Bank" is displayed
    And Open "New Customer" page
    
    When Input to "Customer Name" textbox with value "<Customer Name>"
    And Click to "f" radio button
    And Input to "Date of Birth" textbox with value "<Dob In>"
    And Input to "Address" textarea with value "<Address>"
    And Input to "City" textbox with value "<City>"
    And Input to "State" textbox with value "<State>"
    And Input to "PIN" textbox with value "<Pin>"
    And Input to "Mobile Number" textbox with value "<Mobile Number>"
    And Input to "E-mail" textbox with value "<Email>"
    And Input to "Password" textbox with value "<Password>"
    And Click to "Submit" button
    
    Then Success message displayed with "Customer Registered Successfully!!!"
    And The valid text displayed at "Customer Name" with value "<Customer Name>"
    And The valid text displayed at "Gender" with value "<Gender>"
    And The valid text displayed at "Birthdate" with value "<Dob Out>"
    And The valid text displayed at "Address" with value "<Address>"
    And The valid text displayed at "City" with value "<City>"
    And The valid text displayed at "State" with value "<State>"
    And The valid text displayed at "Pin" with value "<Pin>"
    And The valid text displayed at "Mobile No." with value "<Mobile Number>"
    And The valid text displayed at "Email" with value "<Email>"
    
    Examples:
    |Customer Name|Gender|  Dob In  |  Dob Out  |  Address	   		| City   |  State  |  Pin   | Mobile Number  | Email |  Password  |
    |Nguyen Van An|female|09/13/1995|1995-09-13|123 Tran Thai tong| Ha Noi | Thu Duc | 123123 | 0123123123     | tony  | 123123     |

