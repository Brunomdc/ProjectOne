package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Helper.click;
import static utils.Helper.getWebDriver;

public class Portais {

    WebDriver driver;

    private static By loading = By.className("ng-scope");


    By meusdados = By.xpath("//span[contains(text(),'meus dados')]");
    By minhaconta = By.xpath("//i[@class='icon-sidebar icon-user']");
    By listatransacoes = By.xpath("//span[contains(text(),'lista de transações')]");
    By listapedidos = By.xpath("//span[contains(text(),'lista de pedidos')]");
    By alterarsenha = By.xpath("//a[@class='çhange-password']");
    By linknome = By.xpath("//a[contains(text(),Link nome do usuário)]");
    By menu = By.xpath("//button[@id='çollapse-menu']");

    public void minhaconta() {
        click(minhaconta);
    }

    public void meusdados() {
        click(meusdados);
    }

    public void listatransacoes() {
        click(listatransacoes);
    }

    public void listapedidos() {
        click(listapedidos);
    }

    public void alterarsenha() {
        click(alterarsenha);
    }

    public void linknome() {
        click(linknome);
    }

    public void menuCollpase() {
        click(menu);
    }

    public static String loading() {
        return getWebDriver().findElement(By.className("ng-scope")).getAttribute("class");
    }
}
