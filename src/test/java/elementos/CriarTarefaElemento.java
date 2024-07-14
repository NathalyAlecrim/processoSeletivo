package elementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CriarTarefaElemento {

    @FindBy(css = "[href='/bug_report_page.php']")
    public WebElement menu;

    @FindBy(css = "#category_id")
    public WebElement campoCategoria;

    @FindBy(css = "#reproducibility")
    public WebElement campoFrequencia;

    @FindBy(css = "#severity")
    public WebElement campoGravidade;

    @FindBy(css = "#priority")
    public WebElement campoPrioridade;

    @FindBy(id = "summary")
    public WebElement campoResumo;

    @FindBy(id = "description")
    public WebElement campoDescricao;

    @FindBy(id = "steps_to_reproduce")
    public WebElement campoPassosParaReproducao;

    @FindBy(id = "additional_info")
    public WebElement campoInformacoesAdicionais;

    @FindBy(xpath = "//*[@id=\"report_bug_form\"]/div/div[2]/div[2]/input")
    public WebElement btnEnviar;

    @FindBy(xpath = "//*[@id=\"main-container\"]/div[2]/div[2]/div/div[1]/div/div[1]/h4")
    public WebElement verDetalhesDaTarefa;

}
