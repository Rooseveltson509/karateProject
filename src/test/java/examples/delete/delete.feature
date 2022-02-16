@delete
Feature: Single User
  Background:
    * url baseUrl
    * header Accept = 'application/json'


  Scenario: DELETE user
    Given path '/users/2'
    When method DELETE
    Then status 204