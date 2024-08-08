#language = en

Feature: Efetuar login

  @Login1
  Scenario: CT01 Login com sucesso
    Given acesso a plataforma Orange HRM
    When realizo login com usuario e senha
    Then validarei que os dados foram preenchidos corretamente

