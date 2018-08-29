Feature:
  Scenario: User making call to obtain version
    When the user calls /version
    Then the user receives and status code 200
    And the user receives server version 1.0