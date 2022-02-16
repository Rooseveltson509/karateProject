@userFail
Feature: PUT PAI Request test fail
  Background:
    * url baseUrl
    * header Accept = 'application/json'

  Scenario: PUT user with fail status
    Given path '/users/2'
    And def projectPath = karate.properties['user.dir']
    And print projectPath
    And def filePath = projectPath+'/src/test/java/users/createUpdate/post.json'
    And print filePath
    And def requestBody1 = filePath
    And  request requestBody1
    When method PUT
    # Status attendu 200 mais on veut un test fail pour les rapports
    Then status 200