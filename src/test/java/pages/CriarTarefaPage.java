package pages;

import driver.StartBrowser;
import elementos.CriarTarefaElemento;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CriarTarefaPage extends CriarTarefaElemento {
    public CriarTarefaPage() {
        PageFactory.initElements(StartBrowser.getDriver(), this);
    }

    public void acessarAba() {
        menu.click();
    }


    public void selecionoOpcao(String opcao, String campo) {
        switch (campo.toLowerCase()) {
            case "categoria":
                new Select(campoCategoria).selectByVisibleText(opcao);
                break;
            case "frequencia":
                new Select(campoFrequencia).selectByVisibleText(opcao);
                break;
            case "gravidade":
                new Select(campoGravidade).selectByVisibleText(opcao);
                break;
            case "prioridade":
                new Select(campoPrioridade).selectByVisibleText(opcao);
                break;
            default:
                throw new Error("Campo não encontrado para: " + campo);
        }
    }


    public void preenchoCampo(String campo, String texto) {
        switch (campo.toLowerCase()) {
            case "resumo":
                campoResumo.sendKeys(texto);
                break;
            case "descricao":
                campoDescricao.sendKeys(texto);
                break;
            case "informacoes adicionais":
                campoInformacoesAdicionais.sendKeys(texto);
                break;
            case "passos para reproduzir":
                campoPassosParaReproducao.sendKeys(texto);
                break;
            default:
                throw new Error("Campo não encontrado para: " + campo);
        }
    }

    public void validacaoDaTarefa() {
        btnEnviar.click();
        Assert.assertTrue(verDetalhesDaTarefa.isDisplayed());
    }

}
