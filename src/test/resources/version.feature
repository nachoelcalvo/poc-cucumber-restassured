Feature: Obtener polizas

  Scenario: Obtener una poliza del ramo Auto
    When El usuario invoca al servicio de polizas con id 2
    Then El usuario obtine la poliza correctamente
    And El ramo de la poliza recibida es auto