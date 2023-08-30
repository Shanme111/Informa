Feature: To Publish A Story in NovusApplication

  Scenario: To Create a story
    Given User Have To Login The Novus Application
      | UserName | abin.abraham@informa.com |
      | Password | D3lhi2023!               |
    When User Have To Navigate to The Author Tab
    And User Have To Create a New Story and Publish
    Then To Take The ScreenShot
