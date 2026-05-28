@UI @Run
Feature: Login functionality


    Scenario: Valid login functionality
    Given user insert username "Admin"
    And user insert password "admin123"
    When user clicks on Login button
    Then user is redirect to homepage
    And user clicks LogOut button
  And insert username
  And insert password

  Scenario: Invalid login functionality
     Given user insert username "Admin"
     And user insert password "admin123"
    When user clicks on Login button
    And Invalid credentials

    Scenario: Click on admin link
      Given user insert username "Admin"
      And user insert password "admin123"
      When user clicks on Login button
      Then user is redirect to homepage
    And user is redirect to admin link
    And user try to find an user
    And user click on edit button
    And user change the employee name

    Scenario: Click on job titles
      Given user insert username "Admin"
      And user insert password "admin123"
      When user clicks on Login button
      Then user is redirect to homepage
      And user is redirect to admin link
    And user add a new job