package pages;

import driver.StartBrowser;
import elementos.EfetuarLoginElemento;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import properties.Properties;


public class EfetuarLoginPage extends EfetuarLoginElemento {

    StartBrowser startBrowser = new StartBrowser();

    public EfetuarLoginPage() {
        PageFactory.initElements(StartBrowser.getDriver(), this);
    }

    public void acessoAURLDaPlataforma() {
        StartBrowser.getDriver().get(Properties.getProp().get("prop.URL").toString());
    }

    public void efetuarLogin() {
        campoNomeDoUsuario.click();
        campoNomeDoUsuario.sendKeys(Properties.getProp().get("prop.user").toString());
        btnEntrar.click();
        campoSenha.click();
        campoSenha.sendKeys(Properties.getProp().get("prop.password").toString());
        btnEntrar.click();
    }
    public void dadosPreenchidosCorretamento() {
        Assert.assertTrue(campoUserInfo.isDisplayed());
    }
}

