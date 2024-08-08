package steps;

import driver.StartBrowser;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.Select;
import pages.CriarNovoUsuarioPage;

public class CriarNovoUsuarioSteps {

    CriarNovoUsuarioPage criarNovoUsuarioPage = new CriarNovoUsuarioPage();

    StartBrowser startBrowser = new StartBrowser();

    @When("clico no menu Admin")
    public void clico_no_menu_Admin() {
        criarNovoUsuarioPage.acessarAba();
        startBrowser.tirarScreenShot("Clico no menu Admin");
    }

    @And("clico no botao Add")
    public void clico_no_botao_Add() {
        criarNovoUsuarioPage.clicarEmAdd();
        startBrowser.tirarScreenShot("Clico no botao Add");
    }

    @And("seleciono a opcao no campo User role")
    public void seleciono_opcao_no_campo_user_role() {
        criarNovoUsuarioPage.selecionoOpcaoEmUserRole();
    }

    @And("preencho o campo Employee Name")
    public void preencho_o_campo_Employee_Name() {
        criarNovoUsuarioPage.preenchoOcampoEmployeeName();
    }

    @And("seleciono a opcao no campo Status")
    public void seleciono_a_opcao_no_campo_Status() {
        criarNovoUsuarioPage.selecionoOpcaoNoCampoStatus();
    }

    @And("preencho o campo Username")
    public void preencho_o_campo_Username() {
        criarNovoUsuarioPage.preenchoOcampoUsername();
    }

    @And("preencho o campo Password")
    public void preencho_o_campo_Password() {
        criarNovoUsuarioPage.password();

    }

    @And("preencho o campo Confirm Password")
    public void preencho_o_campo_Confirm_Password() {
        criarNovoUsuarioPage.confirmPassword();
        startBrowser.tirarScreenShot("Campos preenchidos");

    }

    @And("clico em salvar")
    public void clico_em_salvar() {
        criarNovoUsuarioPage.clicoEmSalvar();
    }

    @Then("validarei a criacao do usuario")
    public void validarei_a_criacao_do_usuario(){
        criarNovoUsuarioPage.validvalidacaoDaCriacaoDoUsuarioacao();
        startBrowser.tirarScreenShot("Validacao da criacao do usuario");
    }

    @And("clico em editar")
    public void clico_em_editar(){
        criarNovoUsuarioPage.clicoEmEditar();
        startBrowser.tirarScreenShot("Clico em editar");
    }

    @When("altero o Username")
    public void altero_o_username() {
        criarNovoUsuarioPage.alteracaoDoUsername();
        startBrowser.tirarScreenShot("Altero o Username");
    }
    @Then("validarei a alteracao do nome")
    public void validarei_a_alteracao_do_nome() {
        criarNovoUsuarioPage.validacaoDaAlteracaoDoNome();
        startBrowser.tirarScreenShot("Validacao da alteracao do nome");
    }
    @Then("valido a mensagem de sucesso")
    public void valido_a_mensagem_de_sucesso () {
        criarNovoUsuarioPage.validacaoDaMensagemDeSucesso();
        startBrowser.tirarScreenShot("Validacao da mensagem de sucesso");
    }
 }




