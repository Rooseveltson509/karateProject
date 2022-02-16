@singleUser
Feature: Single User
  Background:
    * url baseUrl
    * header Accept = 'application/json'


  Scenario: GET Single user
    Given path '/users/2'
    When method GET
    Then status 200
    And print response
    And match response.data.last_name == 'Weaver'
    And assert response.data.email == 'janet.weaver@reqres.in'