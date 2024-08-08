package elementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EfetuarLoginElemento {

    @FindBy(css = "[name='username']")
    public WebElement campoNomeDoUsuario;

    @FindBy(css = ".oxd-button")
    protected WebElement btnEntrar;

    @FindBy(css = "[name='password']")
    protected WebElement campoSenha;

    @FindBy(css = "[alt='client brand banner']")
    protected WebElement campoUserInfo;



}
