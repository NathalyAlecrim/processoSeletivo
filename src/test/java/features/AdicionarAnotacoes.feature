#language = en

Feature: Adicionar Anotacoes

  @AdicionarAnotacoes
  Scenario: CT01 Adicionar anotacoes em tarefas ja criadas
    Given acesso a plataforma Mantis
    And realizo login com usuario e senha
    When clico em ver tarefas
    And seleciono uma tarefa
    And seleciono adicionar anotacao
    And preencho o campo com "anotacao teste"
    Then validarei que a anotacao foi incluida