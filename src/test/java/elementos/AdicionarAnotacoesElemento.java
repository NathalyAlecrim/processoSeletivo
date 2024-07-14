package elementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdicionarAnotacoesElemento {

    @FindBy(css = "[id='sidebar']>ul>li:nth-child(2) [href='/view_all_bug_page.php']")
    public WebElement menuVerTarefas;

    @FindBy(css = "#buglist tr:nth-of-type(1) .lbl")
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
