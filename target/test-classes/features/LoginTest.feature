Feature: Test Login functionality


    #  using the <> to parameterization the values
    #  change the scenario to scenario outline
    # add the examples
    # pass the parameters from the function step inside the definitions step file.

    Scenario Outline: Check Login is successful with valid credential
    Given Browser is open.
    And user is on login page
    When user enters <username> and <password>.
    And user click on login btn
    Then user is navigate to home page
    Examples:
        | username | password |
        |   Latifa | 12345    |
        |   Lat    | 123      |
