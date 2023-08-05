Feature: Test the OrangeHRM Application

  Scenario: Test the LoginPage
    Given User on LoginPage
    When User enter valida Username and Password
    Then User Click on Login button

  #HomePage code written by pooja
  Scenario: Test HomePage Functionality
    When user valiadate HomePage Logo
    Then user validate HomePage url
    And user validate HomePage title
