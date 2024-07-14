#language = en

Feature: Criar tarefa

  @CriarTarefa
  Scenario: CT01 Realizando a criacao de uma nova tarefa com sucesso
    Given acesso a plataforma Mantis
    And preencho as informacoes de usuario e senha
    When acesso a aba Criar Tarefa
    And seleciono opcao no campo categoria
    And seleciono opcao no campo frequencia
    And seleciono opcao no campo gravidade
    And seleciono opcao no campo prioridade
    And preencho o campo resumo "Teste resumo"
    And preencho o campo descricao "Teste Descricao"
    And preencho o campo passos para reproduzir "Teste 123"
    And preencho o campo informações adicionais	com "Teste 123"
    Then validarei a tarefa foi criada







