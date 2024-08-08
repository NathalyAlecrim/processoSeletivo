#language = en

Feature: Criar e Editar novo usuario

  @CriarNovoUsuario
  Scenario: CT01 Realizando a criacao de uma nova tarefa com sucesso
    Given acesso a plataforma Orange HRM
    And realizo login com usuario e senha
    When clico no menu Admin
    And clico no botao Add
    And seleciono a opcao no campo User role
    And preencho o campo Employee Name
    And seleciono a opcao no campo Status
    And preencho o campo Username
    And preencho o campo Password
    And preencho o campo Confirm Password
    And clico em salvar
    And valido a mensagem de sucesso
    Then validarei a criacao do usuario

  @EditarNovoUsuario
  Scenario: CT01 Realizando a criacao de uma nova tarefa com sucesso
    Given acesso a plataforma Orange HRM
    And realizo login com usuario e senha
    When clico no menu Admin
    And clico em editar
    And altero o Username
    And clico em salvar
    And valido a mensagem de sucesso
    Then validarei a alteracao do nome






