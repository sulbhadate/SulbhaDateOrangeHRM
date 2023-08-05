Feature: Test the OrangeHRM Application

  # LogIn Page Code Written By Sulbha
  Scenario: Test the LoginPage
    Given User on LoginPage
    When User enter valida Username and Password
    Then User Click on Login button

  #HomePage code written by pooja
  Scenario: Test HomePage Functionality
    When user valiadate HomePage Logo
    Then user validate HomePage url
    And user validate HomePage title

  # PimPage Page Functionality
  Scenario: Test Pim Page Functionality
    When User Click on Pim Page
    Then User Click On AddEmpLink
    Then User enter firstName and LastName
    And Click on Save button
