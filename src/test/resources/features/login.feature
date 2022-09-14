@smokeFeature
Feature: feature to test Login

  @SmokeTest
  Scenario: Successful login with valid credentials

    Given User Launch Chrome browser in login page
    When User opens URL 'https://admin-demo.nopcommerce.com/login'
    And User enters email as 'admin@yourstore.com' and Password as 'admin'
    And Click on login
    Then first page title should be 'dashboard / nopCommerce administration'
    When User click on Log out link
    Then Page Title should be 'your store. Login'
    And close browser

#  Scenario Outline: Check login is successful with valid credentials
#
#    Given User enters <username> and <password>
#    And click on login button
#    Then user is navigated to home page
#
#    Examples:
#      | username | password |
#      | user1    | pass1    |
#      | user2    | pass2    |
