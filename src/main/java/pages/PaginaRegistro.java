package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Helper.*;

public class PaginaRegistro {

    WebDriver driver;

    By cpf = By.name("cpf");
    By email = By.name("email");
    By nomecompleto = By.name("name");
    By telefonecelular = By.name("phone");
    By continuar = By.xpath("//button[contains(text(),'continuar')]");
    By senha = By.name("password");
    By checkbox = By.id("checkbox-terms");
    By mostrarsenha = By.id("ckb-connected-login");
    By finalizar = By.xpath("//button[contains(text(),'finalizar cadastro'])");
    By termosdeuso = By.xpath("//a[@href='#/termos-de-uso']");
    By politicaprivacidade = By.xpath("//a[@href='politica-de-privacidade']");


    public void cpf() {
        sendKeys(cpf, "23194717820");
    }

    public void email() {
        sendKeys(email,"rewq@rewq.com");
    }

    public void nomecompleto() {
        sendKeys(nomecompleto,"automacaoteste");
    }

    public void telefonecelular() {
        sendKeys(telefonecelular,"11993797873");
    }

    public void continuar() {
        click(continuar);
    }

    public void senha() {
        sendKeys(senha,"Rede2015");
    }

    public void checkbox() {
        click(checkbox);
    }

    public void mostrarsenha() {
        click(mostrarsenha);
    }

    public void finalizar() {
        click(finalizar);
    }

    public void termosdeuso() {
        click(termosdeuso);
    }

    private void politicaprivacidade() {
        click(politicaprivacidade);
    }


}
