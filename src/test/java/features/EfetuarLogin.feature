#language = en

Feature: login Mantis

  @Login1
  Scenario: CT01 Login com sucesso
    Given acesso a plataforma Mantis
    When realizo login com usuario e senha
    Then validarei que os dados foram preenchidos corretamente

  @Login2
  Scenario: CT02 Login sem sucesso
    Given acesso a plataforma Mantis
    When preencho as informacoes de usuario e senha incorretos
    Then validarei a mensagem de erro "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos."