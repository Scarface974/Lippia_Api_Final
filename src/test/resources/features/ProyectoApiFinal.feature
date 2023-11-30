
Feature: Clockify
  As an api user I want to execute request in order to get proper responses


  Scenario Outline: Get All My Workspaces
    Given An account created in Clockify and x-api-key '<token>' generated
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    Then Obtengo los datos de mi Workspace

    Examples:
      | operation | entity    | jsonName         | statusCode | token                                            |
      | GET       | WORKSPACE | getAllWorkspaces | 200        | Y2U4YzdiMDgtMDE1Yi00NDQyLWIwMzAtNDA4MGI0NDI1M2I3 |

  Scenario Outline: Get All My Recorded hours
    Given An account created in Clockify and x-api-key '<token>' generated
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    Then Obtengo los datos de mi Workspace

    Examples:
      | operation | entity    | jsonName         | statusCode | token                                            |
      | GET       | TIME      | getAllHours      | 200        | Y2U4YzdiMDgtMDE1Yi00NDQyLWIwMzAtNDA4MGI0NDI1M2I3 |

  @Demo
  Scenario Outline: Get Hours for Workspace
    Given An account created in Clockify and x-api-key 'Y2U4YzdiMDgtMDE1Yi00NDQyLWIwMzAtNDA4MGI0NDI1M2I3' generated
    And tengo un id de workspace <id_workspace>
    And tengo un id de usuario <id_usuario>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained

    Examples:
      | operation | entity | jsonName               | statusCode | id_workspace              |  id_usuario                   |
      | GET       | TIME   | getAllHours            | 200        | 6525c84c1b87f66587f0a8b2  |  6525c84c1b87f66587f0a8b1     |


  Scenario Outline: Add Hours for Workspace
    Given An account created in Clockify and x-api-key 'Y2U4YzdiMDgtMDE1Yi00NDQyLWIwMzAtNDA4MGI0NDI1M2I3' generated
    And tengo un id de workspace <id_workspace>
    And tengo el id del proyecto <id_project>
    And tengo la descripcion de la hora <descripcion>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained

    Examples:
      | operation | entity    | jsonName   | statusCode | descripcion                |   id_workspace              |          id_project        |
      | POST      | ADDTIME   | addHour    |    201     |   CrowdarAcademyTesst_2023  |   6525c84c1b87f66587f0a8b2  |   6525cfad09b7a21060569e4b |


  Scenario Outline: Update Hours for Workspace
    Given An account created in Clockify and x-api-key 'Y2U4YzdiMDgtMDE1Yi00NDQyLWIwMzAtNDA4MGI0NDI1M2I3' generated
    And tengo un id de workspace <id_workspace>
    And tengo un id de usuario <id_usuario>
    And tengo la descripcion de la hora <descripcion>
    When I perform a 'GET' to 'TIME' endpoint with the 'getAllHour' and ''
    And  obtengo la id de una hora
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained

    Examples:
      | operation | entity | jsonName   | statusCode |            descripcion              |      id_workspace              |  id_usuario                   |
      | PUT       | TIME   | editHour   |    200     |   UNNE_Corrientes_SISTEMAS_TESTING  |  6525c84c1b87f66587f0a8b2      |  6525c84c1b87f66587f0a8b1     |

