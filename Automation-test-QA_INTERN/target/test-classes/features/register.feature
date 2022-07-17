Feature: Registration
  As a user
  i want to fill form registration
  so that i have registered into this website

  Background:
    Given i access the web

  @register
  Scenario Outline: Registration scenario
    When i input "<username>" and "<email>" and "<password>"
    And i check the checkbox and choose my gender
    And i choose my employment status
    And i choose my birthday "<birthday>"
    Then i click submit button and get my "<result>"


    Examples:
      |username|email|password|birthday|result|
      |sonyaprds|sonya@gmail.com|SonyaPrds1511|11/15/1989|Success! The Form has been submitted successfully!.|









