package pages;

import elementos.EfetuarLoginElemento;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import properties.Properties;
import properties.TestRule;

import static properties.TestRule.driver;

public class EfetuarLoginPage extends EfetuarLoginElemento {
    public EfetuarLoginPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessoAURLDaPlataforma() {
        driver.get(Properties.getProp().get("prop.URL").toString());
    }

    public void preenchoAsInformacoesDeUsuarioESenha()  {
        campoNomeDoUsuario.click();
        campoNomeDoUsuario.sendKeys(Properties.getProp().get("prop.user").toString());
        btnEntrar.click();
        campoSenha.click();
        campoSenha.sendKeys(Properties.getProp().get("prop.password").toString());
        btnEntrar.click();
    }

    public void preenchoComAsInformacoesDeUsuarioESenhaIncorretos() {
        campoNomeDoUsuario.click();
        campoNomeDoUsuario.sendKeys(Properties.getProp().get("prop.user").toString());
        btnEntrar.click();
        campoSenha.click();
        campoSenha.sendKeys(Properties.getProp().get("prop.password.incorreta").toString());
        btnEntrar.click();
    }

    public void dadosPreenchidosCorretamento() {
        Assert.assertTrue(campoUserInfo.isDisplayed());
    }

    public void validarMsgDeErro(String msg) {
        assert msg.equals(msg_erro.getText());
    }
}
