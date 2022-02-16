@userList
Feature: Single User
  Background:
    * url baseUrl
    * header Accept = 'application/json'


  Scenario: Get users list
    Given path '/users'
    And param page = 2
    When method GET
    Then status 200
    And print response
    And match response.data[0].last_name != null
    And assert response.data.length == 6
    And match $.data[3].id == 10
    And match response.data[4].last_name == 'Edwards'