
# BDD Test suite created for POC purposes.
# An instance of POC-Poliza service must be runnig locally before the execution of following scenario

Feature: Obtener polizas

  Scenario: Obtener una poliza del ramo Auto
    When El usuario invoca al servicio de polizas con id 2
    Then El usuario obtine la poliza correctamente
    And El ramo de la poliza recibida es auto