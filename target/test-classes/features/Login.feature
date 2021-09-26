@Login
Feature: Dev env sanity

  Scenario: Setup Chrome Browser
    Given I setup with "CHROME" browser
    And I set timeout seconds to "20"
    And I set appian URL to "https://gfeu-l01.appiancloud.com/suite"
    #    And I set appian URL to "https://civr.appian.community/suite/sites/example-vehicle-fleet-managemet"
    And I set appian version to "21.3"
    And I set appian locale to "en_GB"
#    And I set screenshot path to "C:\SWDTOOLS\other\screenshots\healthcheck\l01\vfm\"
#    And I set take error screenshots to "C:\SWDTOOLS\other\screenshots\healthcheck\l01\vfm\errors\"
    And I wait for "5" seconds

#  Scenario: Click on button
#    Given I click on custom button "I Agree"
#    And I wait for "2" seconds

  Scenario Outline: Login as test user
    Given I login with username "<username>"
    And I wait for progress bar
    And I wait for "5" seconds
    Examples:
      | Scenario | username   |
#      | Success  | test.user1 |
      | Success  | hc.user1 |


  Scenario: Sign out and Tear down
    Given I logout
    And I wait for progress bar
    And I wait for "5" seconds
    And I tear down
