Feature: Is it Friday yet?  # it is an idea to make the feature name similar to file name
  Everybody wants to know when it's Friday # it is a brief description of the features (not executed --> for documentation)

  Scenario: Sunday Isn't Friday # it is the test behaviour
    # These 3 lines what the cucumber will execute
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told 'Nope'