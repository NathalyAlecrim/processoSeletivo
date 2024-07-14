package steps;

import io.cucumber.java.en.*;
import pages.EfetuarLoginPage;

public class LoginSteps {

    EfetuarLoginPage efetuarLoginPage = new EfetuarLoginPage();

    @Given("acesso a plataforma Mantis")
    public void acesso_a_plataforma_mantis() {
        efetuarLoginPage.acessoAURLDaPlataforma();
    }

    @When("realizo login com usuario e senha")
    public void realizo_login_com_usuario_e_senha() {
        efetuarLoginPage.efetuarLogin();
    }

    @When("preencho as informacoes de usuario e senha incorretos")
    public void preenchoComAsInformacoesDeUsuarioESenhaIncorretos() {
        efetuarLoginPage.preenchoComAsInformacoesDeUsuarioESenhaIncorretos();
    }

    @Then("validarei que os dados foram preenchidos corretamente")
    public void validarei_que_os_dados_foram_preenchidos_corretamente() {
        efetuarLoginPage.dadosPreenchidosCorretamento();
    }

    @Then("validarei a mensagem de erro {string}")
    public void validareiAMensagemDeErro(String mensagem) {
        efetuarLoginPage.validarMsgDeErro(mensagem);
    }

}
