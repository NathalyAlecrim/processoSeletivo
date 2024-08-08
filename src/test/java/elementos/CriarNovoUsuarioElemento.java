package elementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CriarNovoUsuarioElemento {

    @FindBy(xpath = "//span[.='Admin']")
    public WebElement menu;

    @FindBy(css = ".oxd-button--secondary[type='button']")
    public WebElement btnAdd;

    @FindBy(css = ".oxd-form .oxd-grid-2 > div:nth-of-type(1) .oxd-select-text-input")
    public WebElement campoUserRole;

    @FindBy(xpath = "//div[@class='oxd-form-row']//div[.='Admin']")
    public WebElement selecionarAdmin;

    @FindBy(css = "[placeholder='Type for hints...']")
    public WebElement campoEmployeeName;

    @FindBy(xpath = "//span[contains(text(), 'Ranga')]")
    public WebElement selectEmployeeName;

    @FindBy(css = ".oxd-form div:nth-of-type(3) .oxd-select-text")
    public WebElement campoStatus;

    @FindBy(xpath = "//div[@class='oxd-form-row']//div[.='Enabled']")
    public WebElement selectStatus;

    @FindBy(css = "div:nth-of-type(4) .oxd-input")
    public WebElement campoUserName;

    @FindBy(css = ".user-password-cell .oxd-input")
    public WebElement campoPassword;

    @FindBy(css = ".oxd-grid-2[data-v-a64d9b08] > div:nth-of-type(2) .oxd-input")
    public WebElement campoConfirmPassword;

    @FindBy(css = "[type='submit']")
    public WebElement btnSalvar;

    @FindBy(xpath = "//div[@class='oxd-table-body']//div[2]/div")
    public List<WebElement> campoValidacaoUsername;

    @FindBy(css = "div:nth-of-type(7) .bi-pencil-fill")
    public WebElement btnEditar;

    @FindBy(css = "[class*='success'][aria-live='assertive']")
    public WebElement msgSucesso;

            ;

}
