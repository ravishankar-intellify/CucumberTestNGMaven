Feature: Login to Essentials Workbench


  Scenario: Login to Essentials Workbench using Valid Login
    Given Login using a valid username and password
    When Successfully logged in
    Then Home page should get displayed

  Scenario: Login to Essentials Workbench using InValid Login
    Given Login using a InValid username and password
    When Should not allow to login
    Then Home page should not get displayed