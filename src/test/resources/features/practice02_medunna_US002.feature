@Registration

Feature:  US002: Registration should be successful using email and username

  Scenario: US002AC01: Choose a username that can contain any chars, but it cannot be blank
    Given US002AC01TC01: User leaves the username blank, there should be Your username is required. error message
    When US002AC01TC02: User enters username special chars £#$€, there should be Your username is invalid. error message
    And US002AC01TC03: User enters username  that can contain any chars, there should not be any error message

  Scenario: US002AC02: Choose a valid e-mail
    Given US002AC02TC01: User enters blank e-mail and then only space e-mail, there should be Your email is required.
    When US002AC02TC02: User enters an e-mail less than 5 chars, there should be Your email is required to be at least 5 characters.
    And US002AC02TC03: User enters an e-mail with a wrong format, there should be This field is invalid message
    And US002AC02TC04: User enters a valid e-mail, there should be not any error messages

  Scenario: US002AC03: Create a valid password
    When US002AC03TC01: User enters a valid password
    And US002AC03TC02: And make password confirmation
    Then US002AC03TC03: verify that registration is successful