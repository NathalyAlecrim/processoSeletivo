package elementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EfetuarLoginElemento {

    @FindBy(xpath = "//input[@id='username']")
    public WebElement campoNomeDoUsuario;

    @FindBy(css = ".width-40")
    protected WebElement btnEntrar;

    @FindBy(id = "password")
    protected WebElement campoSenha;

    @FindBy(css = ".user-info")
    protected WebElement campoUserInfo;

    @FindBy(css = ".alert-danger > p")
    protected WebElement msg_erro;

}
