@smoke
  Feature: data_tables_features

    Background:navigate_page
      Given user navigates to "https://editor.datatables.net/"

      Scenario Outline: user creation test
        And user clicks on new button
        And user enters first name as "<first_name>"
        And user enters last name as "<last_name>"
        And user enters position as "<position>"
        And user enters office as "<office>"
        And user enters extension as "<extension>"
        And user enters start date as "<start_date>"
        And user enters salary as "<salary>"
        When user clicks on create button
        And user searches for the "<first_name>"
        Then verify the name field contains the "<first_name>"
        And close the application

        Examples: test_data
          | first_name | last_name | position         | office | extension | start_date | salary |
          | john       | lennon    | musician         | LA     | 12345     | 2024-12-12 | 50000  |
          | joey       | tribbiani | actor            | NYC    | 14652     | 1997-03-13 | 40000  |
          | rose       | geller    | anthropologist   | NYC    | 62513     | 1995-05-15 | 50000  |
          | monica     | geller    | cook             | NYC    | 91341     | 1994-06-16 | 40000  |
          | rachel     | green     | fashion designer | NYC    | 24521     | 1993-07-17 | 30000  |
          | phoebe     | buffay    | musician         | NYC    | 43561     | 1992-08-18 | 50000  |


