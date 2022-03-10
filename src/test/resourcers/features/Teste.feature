Feature: Validar solicitacao de seguro de veiculo

  @ValidCredentials
  Scenario: Preencher formulario tricents automobile

    Given que preencho o formulario da aba Enter Vehicle Data
    And preencho o formulario da aba Enter Insurant Data
    And preencho o formulario da aba Enter Product Data
    And preencho o formulario da aba Select Price Option
    And preencho o formulario da aba Send Quote
    Then verifico a mensagem de sucesso


