Feature: Login Page Features for eLearning Application

  Background: Navigate to eLearning Portal
    Given We navigate to eLearning Portal via "http://elearningm1.upskills.in/"

  @SignUp
  Scenario Outline: Verify an user can Signup successfully
    And We click on "ELEARNING_LOGINPAGE_SIGNUP_LINK" on "Login Page"
    Then We populate "ELEARNING_REGISTRATIONPAGE_FIRSTNAME_TXTBOX" with "<FIRSTNAME>" on "Registration Page"
    Then We populate "ELEARNING_REGISTRATIONPAGE_LASTNAME_TXTBOX" with "<LASTNAME>" on "Registration Page"
    Then We populate "ELEARNING_REGISTRATIONPAGE_EMAIL_TXTBOX" with "<EMAIL>" on "Registration Page"
    Then We populate "ELEARNING_REGISTRATIONPAGE_USERNAME_TXTBOX" with "<USERNAME>" on "Registration Page"
    Then We populate "ELEARNING_REGISTRATIONPAGE_PWD_TXTBOX" with "<PASSWORD>" on "Registration Page"
    Then We populate "ELEARNING_REGISTRATIONPAGE_CONFIRMPWD_TXTBOX" with "<PASSWORD>" on "Registration Page"
    Then We populate "ELEARNING_REGISTRATIONPAGE_PHONE_TXTBOX" with "<PHONE>" on "Registration Page"
    And We click on "ELEARNING_REGISTRATIONPAGE_REGISTER_BTN" on "Registration Page"
    Then We verify message displayed as "An e-mail has been sent to remind you of your login and password." at "ELEARNING_REGISTRATIONPAGE_MSGBOX_01" on "Registration Page"
    And We verify message displayed as "You can now select, in the list, the course you want access to." at "ELEARNING_REGISTRATIONPAGE_MSGBOX_02" on "Registration Page"
    Then We click on "ELEARNING_AVATAR_DROPDOWN_BTN" on "Avatar Dropdown"
    And We verify message displayed as "<EMAIL>" at "ELEARNING_AVATAR_EMAIL_MSGBOX" on "Avatar Dropdown"
    Then We click on "ELEARNING_AVATAR_INBOX_LINK" on "Avatar Dropdown"
    Then We click on "ELEARNING_SOCIALNETWORK_COMPOSEEMAIL_BTN" on "Social Network Page"
    Then We populate "ELEARNING_SOCIALNETWORK_SENDTO_TXTBOX" with "<USERNAME>" on "Social Network Page"
    Then We click on "ELEARNING_SOCIALNETWORK_SELECTUSERNAME_OPTION" on "Social Network Page"
    Then We populate "ELEARNING_SOCIALNETWORK_SUBJECT_TXTBOX" with "Remember my username and Pwd" on "Social Network Page"
    Then We populate "ELEARNING_SOCIALNETWORK_MESSAGEBODY_TXTBOX" with "Username : <USERNAME> Password : <PASSWORD>" on "Social Network Page"
    And We click on "ELEARNING_SOCIALNETWORK_SENDMESSAGE_BTN" on "Social Network Page"
    Then We verify message displayed as "The message has been sent to <FIRSTNAME> <LASTNAME> (<USERNAME>)" at "ELEARNING_SOCIALNETWORK_MSGBOX" on "Social Network Page"

    Examples: 
      | FIRSTNAME  | LASTNAME | EMAIL                | USERNAME          | PASSWORD | PHONE       |
      | TestName03 | Test03   | test.test03@test.com | random_username03 | test     | 07099786534 |

  