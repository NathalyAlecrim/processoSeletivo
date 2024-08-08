package steps;

import driver.StartBrowser;
import io.cucumber.java.en.*;
import pages.EfetuarLoginPage;

public class LoginSteps {

    EfetuarLoginPage efetuarLoginPage = new EfetuarLoginPage();
    StartBrowser startBrowser = new StartBrowser();

    @Given("acesso a plataforma Orange HRM")
    public void acesso_a_plataforma_Orange_HRM() {
        efetuarLoginPage.acessoAURLDaPlataforma();
    }

    @When("realizo login com usuario e senha")
    public void realizo_login_com_usuario_e_senha(){
        efetuarLoginPage.efetuarLogin();
        startBrowser.tirarScreenShot("Efetuando Login");
    }

    @Then("validarei que os dados foram preenchidos corretamente")
    public void validarei_que_os_dados_foram_preenchidos_corretamente() {
        efetuarLoginPage.dadosPreenchidosCorretamento();
        startBrowser.tirarScreenShot("validarei que os dados foram preenchidos corretamente");
    }


}
