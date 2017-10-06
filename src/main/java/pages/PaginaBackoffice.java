package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Helper.*;

public class PaginaBackoffice {
    WebDriver driver;

    By matricula = By.xpath("//input[@type='text']");
    By senha = By.xpath("//input[@type='password']");
    By continuar = By.xpath("//button[contains(text(),'continuar')]");
    By menu = By.xpath("//button[@id='çollapse-menu']");
    By menuclientes = By.xpath("//span[contains(text(),'clientes')]");
    By consultaclientes = By.xpath("//a[@ng-href='#/customers'])");
    By cadastrolojista = By.xpath("//a[@ng-href='#/signup'])");
    By tranasacoes = By.xpath("//a[contains(text(),'transações'])");
    By listatransacoes = By.xpath("//a[@ng-href='#/transactions'])");
    By listapedidos = By.xpath("//a[@ng-href='#/orders'])");
    By operadores = By.xpath("//a[@ng-href='#/users'])");
    By risco = By.xpath("//a[contains(text(),'risco'])");
    By tratamentochargeback = By.xpath("//a[@ng-href='#/chargebacks'])");
    By disputa = By.xpath("//a[@ng-href='#/disputes'])");
    By relatoriodisputa = By.xpath("//a[@ng-href='#/reports']))");
    By sairdosistema = By.xpath("//a[contains(text(),'alterar senha'])");

    public void funcional() {
        sendKeys(matricula, "720477");
    }

    public void senha() {
        sendKeys(senha, "Rede2017");
    }

    public void continuar() {
        click(continuar);
    }

    public void menu() {
        click(menu);
    }

    public void menuclientes() {
        click(menuclientes);
    }

    public void consultaclientes() {
        click(consultaclientes);
    }

    public void cadastrolojista() {
        click(cadastrolojista);
    }

    public void transacoes() {
        click(tranasacoes);
    }

    public void listatransacoes() {
        click(listatransacoes);
    }

    public void listapedidos() {
        click(listapedidos);
    }

    public void operadores() {
        click(operadores);
    }

    public void risco() {
        click(risco);
    }

    public void tratamentochargeback() {
        click(tratamentochargeback);
    }

    public void disputa() {
        click(disputa);
    }

    public void realatoriodisputa() {
        click(relatoriodisputa);
    }

    public void sairdosistema() {
        click(sairdosistema);
    }

}
