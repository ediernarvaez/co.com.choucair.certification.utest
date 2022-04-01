# Autor Edier
# language:en

@stories
Feature: Utest
  As a user, I want to learn how to automate in screamplay at Utest page practice
  @scenario1
  Scenario: Login the user
    Given than edier wants to learn automation at the utest
      | strUsername               | strPassword      |
      | ediernarvaezl@gmail.com   | 3152300499eY#30  |
    When he finds the coursed called utest
    Then the user Logout with their credentials
  @scenario2
  Scenario: Register a new user
    Given set data in fields
      | strFirstName  | strLastName | strEmailAddress        | strCity    | strZipCode | strPassword    |
      | david         | lopez       | mojici3039@xasems.com  | Popayán    | 190002     | David123456*   |