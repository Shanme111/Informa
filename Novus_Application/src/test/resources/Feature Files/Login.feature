Feature: To Validate the Login Functionality Of Novus Application

  Scenario Outline: Validate Login Function With Valid and Invalid Credentials
    Given User Has To Launch IGM Application
    When User Has To Click Client Login button
    And User Has To Enter Valid "<Username>" and "<Password>"
    And User Has To Click The Signin button
    Then User Has To Verify Credential Page

    Examples: 
      | UserName                 | PassWord   |
      | abin.abraham@informa.com | D3lhi2023! |
      | abin.abraham@informa.com | D3lhi2222! |
