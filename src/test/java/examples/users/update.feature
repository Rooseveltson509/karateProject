@update
Feature: Update user profile
  Background:
    * url baseUrl
    * header Accept = 'application/json'
    #* def expectedOutput = read("output.json")
    * def myFeature = call read('createUser.feature')
    * def res = myFeature.response

    * def expectedOutput = read("update.json")

  Scenario: Update user from PUT method
    Given path '/users'
    And match res.name != null
    And print res
    And set res.job = expectedOutput.job
    And set res.name = expectedOutput.name
    And request res
    When method PUT
    Then status 200
    And assert response.name == 'GregZenity'
    And print response