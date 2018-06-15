Feature: EBay search manual feature

  Scenario: Searching rihanna items under music category
    Given the user is on the ebay home page
    When the user select 'Music' category
    And the user search for 'rihanna' term
    Then the user should see items

  Scenario: Searching ps3 consoles items under Entertainment Memorabilia category
    Given the user is on the ebay home page
    When the user select 'Entertainment Memorabilia' category
    And the user search for 'ps3 consoles' term
    Then the user should see items

  Scenario: Searching ps3 consoles items as all category
    Given the user is on the ebay home page
    And the user search for 'ps3 consoles' term
    Then the user should see items

  Scenario: Searching rihanna items as all category
    Given the user is on the ebay home page
    And the user search for 'rihanna' term
    Then the user should see items
