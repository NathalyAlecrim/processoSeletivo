package steps;

import io.cucumber.java.en.*;
import pages.AdicionarAnotacoesPage;

public class AdicionarAnotacoesSteps {

    AdicionarAnotacoesPage adicionarAnotacoesPage = new AdicionarAnotacoesPage();

    @When("clico em ver tarefas")
    public void clico_em_ver_tarefas() {
        adicionarAnotacoesPage.clicoEmVerTarefa();
    }
    @And("seleciono uma tarefa")
    public void seleciono_uma_tarefa() {
        adicionarAnotacoesPage.selecionoUmaTarefa();
    }
    @And("seleciono adicionar anotacao")
    public void seleciono_adicionar_anotacao() {
        adicionarAnotacoesPage.selecionoAdicionoAnotcao();
    }
    @And("preencho o campo com {string}")
    public void preencho_o_campo_com(String anotacao) {
        adicionarAnotacoesPage.preenchoOcampo(anotacao);
    }
    @Then("validarei que a anotacao foi incluida")
    public void validarei_que_a_anotacao_foi_incluida() {
        adicionarAnotacoesPage.validarRetornodaPagina();
    }
}
