@regression
  Feature: blue_rental_features

    Background: navigate_page
      Given user navigates to "https://www.bluerentalcars.com/"

    Scenario Outline: TC_login_blue_rental
      When user clicks on login button
      And enters user name "<user_name>"
      And enters password "<password>"
      And click on login button
      Then verify login is successfull
      Then close the application

      Examples:
        | user_name                      | password  |
        | sam.walker@bluerentalcars.com  | c!fas_art |
        | raj.khan@bluerentalcars.com    | v7Hg_va^  |
        | pam.raymond@bluerentalcars.com | Nga^g6!   |