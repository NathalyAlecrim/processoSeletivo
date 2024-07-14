package steps;

import io.cucumber.java.en.*;
import pages.CriarTarefaPage;

public class CriarTarefaSteps {

    CriarTarefaPage relatarProblemaPage = new CriarTarefaPage();

    @When("acesso a aba Criar Tarefa")
    public void acesso_a_aba_criar_tarefa() {
        relatarProblemaPage.acessarAba();
    }

    @And("seleciono opcao no campo categoria")
    public void seleciono_opcao_no_campo_categoria() {
        relatarProblemaPage.selecionoOcampoCategoria();
    }

    @When("seleciono opcao no campo frequencia")
    public void seleciono_opcao_no_campo_frequencia() {
        relatarProblemaPage.selecionoOcampoFrequencia();
    }

    @When("seleciono opcao no campo gravidade")
    public void seleciono_opcao_no_campo_gravidade() {
        relatarProblemaPage.selecionoOcampoGravidade();
    }

    @When("seleciono opcao no campo prioridade")
    public void seleciono_opcao_no_campo_prioridade() {
        relatarProblemaPage.selecionoOcampoPrioridade();
    }

    @When("preencho o campo resumo {string}")
    public void preencho_o_campo_resumo(String resumo) {
        relatarProblemaPage.preencherOcampoResumo(resumo);
    }

    @When("preencho o campo descricao {string}")
    public void preencho_o_campo_descricao(String descricao) {
        relatarProblemaPage.preencherOcampoDescricao(descricao);
    }

    @When("preencho o campo passos para reproduzir {string}")
    public void preencho_o_campo_passos_para_reproduzir(String passos) {
        relatarProblemaPage.preencherOcampoPassosParaReproduzir(passos);
    }

    @When("preencho o campo informações adicionais	com {string}")
    public void preencho_o_campo_informações_adicionais_com(String info) {
        relatarProblemaPage.preencherOcampoInformacoes(info);
    }

    @Then("validarei a tarefa foi criada")
    public void validarei_a_tarefa_foi_criada() {
        relatarProblemaPage.validacaoDaTarefa();
    }

}
