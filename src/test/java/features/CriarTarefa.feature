#language = en

Feature: Criar tarefa

  @CriarTarefa
  Scenario: CT01 Realizando a criacao de uma nova tarefa com sucesso
    Given acesso a plataforma Mantis
    And realizo login com usuario e senha
    When acesso a aba Criar Tarefa
    And seleciono a opcao "[Todos os Projetos] categoria teste" no campo "categoria"
    And seleciono a opcao "sempre" no campo "frequencia"
    And seleciono a opcao "recurso" no campo "gravidade"
    And seleciono a opcao "alta" no campo "prioridade"
    And preencho o campo "resumo" com a informacao "Resumo"
    And preencho o campo "descricao" com a informacao "Descricao"
    And preencho o campo "passos para reproduzir" com a informacao "Testar Aplicacao"
    And preencho o campo "informacoes adicionais" com a informacao "Informações adicionais "
    Then validarei a tarefa foi criada







