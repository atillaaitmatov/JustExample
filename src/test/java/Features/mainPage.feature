Feature: feature for test main radio buttons
  Scenario Outline: Check radio buttons and select options are working

    Given client is on main page
    When client click Honda on radio button
    And selects Benz on select options
    And selects multiple select options
    Then enter <name> into textBox and click confirm


    Examples:
    |name|
    |izatilla|