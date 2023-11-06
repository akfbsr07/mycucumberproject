@failed

Feature: data_tables
#this scenario will be fail on purpose
  Background: navigate_page
    Given user navigates to "https://www.bluerentalcars.com/login/"

  Scenario: TC01_admin_login
    When user enters the admin email and password
      | admin_email     | admin_password |
      | wrong@gmail.com | 12345          |
    And click on login button
    Then verify login is successfull
    And close the application