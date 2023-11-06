@smoke
Feature: search_feature
  Background: navigation_page
    Given user navigates to "https://www.google.com"

  Scenario: TC01_iphone_search
    And user search for "iPhone" on google
    Then verify the result contains "iPhone"
    Then close the application

  Scenario: TC02_apple_search
    And user search for "apple" on google
    Then verify the result contains "apple"
    Then close the application

  Scenario: TC03_witcher_search
    And user search for "witcher" on google
    Then verify the result contains "witcher"
    Then close the application

  Scenario: TC04_coffeepot_search
    And user search for "coffeepot" on google
    Then verify the result contains "coffeepot"
    Then close the application

  Scenario: TC05_harrypotter_search
    And user search for "harrypotter" on google
    Then verify the result contains "harrypotter"
    Then close the application