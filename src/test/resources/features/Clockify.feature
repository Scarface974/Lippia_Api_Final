
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

  Scenario Outline: Get Client for Workspace
    Given An account created in Clockify and x-api-key 'Y2U4YzdiMDgtMDE1Yi00NDQyLWIwMzAtNDA4MGI0NDI1M2I3' generated
    And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getAllWorkspaces' and ''
    And status code 200 is obtained
    And obtengo un workspaceId
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained

    Examples:
      | operation | entity | jsonName               | statusCode |
      | GET       | USER   | getUsers               | 200        |

