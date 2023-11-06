@smoke
Feature: search_feature
  Background: navigate_homepage
    Given user navigates to "https://www.google.com"

  Scenario Outline: TC_search_items
    And user search for "<search_item>" on google
    Then verify the result contains "<search_item>"
    Then close the application

    Examples: test_data
      | search_item  |
      | iPhone       |
      | apple        |
      | tesla        |
      | toyota       |
      | teapot       |
      | harry potter |
      | witcher      |
      | hogwarts     |
      | dune         |

    #Scenario:    ------------->>> Scenario Outline:
    #Examples: must be added to pass the test data
    #"test data" -------------->>> "<column name>"
    #in this example there is 1 scenario outline, but 9 scenarios since this repeats 9 times
