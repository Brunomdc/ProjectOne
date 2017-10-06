package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import static utils.Helper.click;

public class PaginaLojista {

    WebDriver driver;

    By minhasvendas = By.xpath("//i[class='icon-sider icon-home']");
    By codigorastreio = By.xpath("//span[class='menu-item menu last-item']");
    By extratos = By.xpath("//i[@class='icon-sidebar icon-cod']");
    By lancamentosfuturos = By.xpath("//span[contains(text(),'lançamentos futuros')]");
    By valorespagos = By.xpath("//span[contains(text(),'valores pagos')]");
    By centraldesoluções = By.xpath("//a[contains(text(),'central de soluções')]");
    By configuracoes = By.id("mn-configurations");
    By administracao = By.xpath("//span[contains(text(),'administração de usuários')]");
    By chavesdeseguranca = By.xpath("//span[contains(text(),'chaves de segurança')]");
    By redirecionamento = By.xpath("//span[contains(text(),'redirecionamento')]");
    By notificacoesautomaticas = By.xpath("notificações automáticas");
    By conversaodevendas = By.xpath("//span[contains(text(),'conversão de vendas')]");
    By logotipodaloja = By.xpath("//span[contains(text(),'logotipo da loja')]");

    public void minhasvendas() {
        click(minhasvendas);
    }

    public void extratos() {
        click(extratos);
    }

    public void codigorastreio() {
        click(codigorastreio);
    }

    public void lancamentosfuturos() {
        click(lancamentosfuturos);
    }

    public void valorespagos() {
        click(valorespagos);
    }

    public void centraldesoluções() {
        click(centraldesoluções);
    }

    public void configuracoes() {
        click(configuracoes);
    }

    public void administracao() {
        click(administracao);
    }

    public void chavesdeseguranca() {
        click(chavesdeseguranca);
    }

    public void redirecionamento() {
        click(redirecionamento);
    }

    public void notificacoesautomaticas() {
        click(notificacoesautomaticas);
    }

    public void conversaodevendas() {
        click(conversaodevendas);
    }

    public void logotipodaloja() {
        click(logotipodaloja);
    }

}



