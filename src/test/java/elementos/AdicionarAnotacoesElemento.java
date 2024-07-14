package elementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdicionarAnotacoesElemento {

    @FindBy(xpath = "//*[@id=\"sidebar\"]/ul/li[2]/a/i")
    public WebElement menuVerTarefas;

    @FindBy(css = "#buglist tr:nth-of-type(8) .lbl")
    public WebElement btnSelectTarefa;

    @FindBy(css = "[name='action']")
    public WebElement campoSelecionarAdicionarNota;

    @FindBy(css = "[value='OK']")
    public WebElement btnOk;

    @FindBy(css = "#bugnote_text")
    public WebElement campoAdicionarNota;

    @FindBy(css = ".btn-white")
    public WebElement btnAdcNota;

    @FindBy(css = "#bug_action .widget-title")
    public WebElement retornoParaPage;

}
