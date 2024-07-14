package pages;

import elementos.CriarTarefaElemento;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import properties.TestRule;

public class CriarTarefaPage extends CriarTarefaElemento {
    public CriarTarefaPage() {
        PageFactory.initElements(TestRule.getDriver(), this);
    }

    public void acessarAba() {
        menu.click();
    }

    public void selecionoOcampoCategoria() {
        Select select = new Select(campoCategoria);
        select.selectByVisibleText("[Todos os Projetos] categoria teste");
    }

    public void selecionoOcampoFrequencia() {
        Select select = new Select(campoFrequencia);
        select.selectByVisibleText("sempre");
    }

    public void selecionoOcampoGravidade() {
        Select select = new Select(campoGravidade);
        select.selectByVisibleText("recurso");
    }

    public void selecionoOcampoPrioridade() {
        Select select = new Select(campoPrioridade);
        select.selectByVisibleText("alta");
    }

    public void preencherOcampoResumo(String resumo) {
        campoResumo.sendKeys(resumo);
    }

    public void preencherOcampoDescricao(String descricao) {
        campoDescricao.sendKeys(descricao);
    }

    public void preencherOcampoInformacoes(String info){
        campoInformacoesAdicionais.sendKeys(info);
    }

    public void preencherOcampoPassosParaReproduzir(String passos){
        campoPassosParaReproducao.sendKeys(passos);
    }

   public void validacaoDaTarefa(){
        btnEnviar.click();
       Assert.assertTrue(verDetalhesDaTarefa.isDisplayed());
   }

}
