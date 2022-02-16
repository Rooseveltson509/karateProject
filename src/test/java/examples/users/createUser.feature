@created
Feature: Create user
  Background:
    * url baseUrl
    * header Accept = 'application/json'
    * def expectedOutput = read("post.json")


  Scenario: Create a user with POST method
    Given path '/users'
    * def JavaDemo = Java.type('examples.users.JsonBody')
    And def reqBody = expectedOutput
    And request reqBody
    When method POST
    Then status 201
    And print response

    * def SaveResponse = JavaDemo.writeNotepad(expectedOutput.createdAt, expectedOutput.name, expectedOutput.id, expectedOutput.job)