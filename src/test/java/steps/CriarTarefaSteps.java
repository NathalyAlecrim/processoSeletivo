package steps;

import io.cucumber.java.en.*;
import pages.CriarTarefaPage;

public class CriarTarefaSteps {

    CriarTarefaPage relatarProblemaPage = new CriarTarefaPage();

    @When("acesso a aba Criar Tarefa")
    public void acesso_a_aba_criar_tarefa() {
        relatarProblemaPage.acessarAba();
    }

    @And("seleciono a opcao {string} no campo {string}")
    public void seleciono_opcao_no_campo_categoria(String opcao, String campo) {
        relatarProblemaPage.selecionoOpcao(opcao, campo);
    }

    @And("preencho o campo {string} com a informacao {string}")
    public void preencho_o_campo_com_a_informacao(String campo, String texto) {
        relatarProblemaPage.preenchoCampo(campo, texto);
    }

    @Then("validarei a tarefa foi criada")
    public void validarei_a_tarefa_foi_criada() {
        relatarProblemaPage.validacaoDaTarefa();
    }

}
