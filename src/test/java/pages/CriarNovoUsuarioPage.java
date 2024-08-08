package pages;

import driver.StartBrowser;
import elementos.CriarNovoUsuarioElemento;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class CriarNovoUsuarioPage extends CriarNovoUsuarioElemento {
    public CriarNovoUsuarioPage() {
        PageFactory.initElements(StartBrowser.getDriver(), this);
    }

    public void acessarAba() {
        menu.click();
    }

    public void clicarEmAdd() {
        btnAdd.click();
    }

    public void selecionoOpcaoEmUserRole() {
        campoUserRole.click();
        selecionarAdmin.click();
    }

    public void preenchoOcampoEmployeeName() {
        campoEmployeeName.sendKeys("A");
        selectEmployeeName.click();

    }

    public void selecionoOpcaoNoCampoStatus() {
        campoStatus.click();
        selectStatus.click();
    }

    public void preenchoOcampoUsername() {
        campoUserName.sendKeys("teste");
    }

    public void password() {
        campoPassword.sendKeys("teste123");
    }

    public void confirmPassword() {
        campoConfirmPassword.sendKeys("teste123");
    }

    public void clicoEmSalvar() {
        try {
            btnSalvar.click();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void validvalidacaoDaCriacaoDoUsuarioacao() {
        try {
            String textoEsperado = "teste";

            Assert.assertFalse("A lista de elementos está vazia.", campoValidacaoUsername.isEmpty());

            // Verificar se algum dos elementos contém o texto esperado
            boolean textoEncontrado = false;
            for (WebElement elemento : campoValidacaoUsername) {
                if (elemento.isDisplayed() && elemento.getText().trim().equals(textoEsperado)) {
                    textoEncontrado = true;
                    break;
                }
            }

            Assert.assertTrue("O texto esperado não foi encontrado em nenhum dos elementos.", textoEncontrado);

            System.out.println("Texto encontrado com sucesso na lista de elementos!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void validacaoDaAlteracaoDoNome() {
        try {

            String textoEsperado = "testeAlterado";

            Assert.assertFalse("A lista de elementos está vazia.", campoValidacaoUsername.isEmpty());

            // Verificar se algum dos elementos contém o texto esperado
            boolean textoEncontrado = false;
            for (WebElement elemento : campoValidacaoUsername) {
                if (elemento.isDisplayed() && elemento.getText().trim().equals(textoEsperado)) {
                    textoEncontrado = true;
                    break;
                }
            }

            Assert.assertTrue("O texto esperado não foi encontrado em nenhum dos elementos.", textoEncontrado);

            System.out.println("Texto encontrado com sucesso na lista de elementos!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void clicoEmEditar() {
        btnEditar.click();
    }

    public void validacaoDaMensagemDeSucesso() {
        Assert.assertTrue(msgSucesso.isDisplayed());
    }

    public void alteracaoDoUsername() {
        try {
            campoUserName.click();
            campoUserName.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        campoUserName.sendKeys("testeAlterado");
    }

}