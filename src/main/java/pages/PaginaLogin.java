package pages;

import static utils.Helper.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginaLogin {

    WebDriver driver;

    By username = By.name("email");
    By password = By.name("password");
    By continuar = By.xpath("//button[contains(text(),'çontinuar')]");
    By integre = By.xpath("//div[@class='navHeader menuMob']/a[contains(text(),'integre')]");
    By venda = By.xpath("//div[@class='navHeader menuMob']/a[contains(text(),'venda')]");
    By compra = By.xpath("//div[@class='navHeader menuMob']/a[contains(text(),'compra')]");
    By cadastrese = By.xpath("//a[contains(text(),'cadastre-se')]");
    By acesseConta = By.xpath("//a[contains(text(),'acesse sua conta')]");
    By acesseRedepay = By.xpath("//a[contains(text(),'Rede Pay')]");
    By esqueciSenha = By.xpath("//a[@href='forgot-password']");
    By cadastreseagora = By.xpath("//a[contains(text(),'Cadastre-se agora!')]");

    public void nomeLogin() {
        sendKeys(username, "servicoyaman719507@userede.com.br");
    }

    public void senhaLogin() {
        sendKeys(password, "Rede2017");
    }

    public void continuar() {
        click(continuar);
    }

    public void integre() {
        click(integre);
    }

    public void venda() {
        click(venda);
    }

    public void compra() {
        click(compra);
    }

    public void cadastre() {
        click(cadastreseagora);
    }

    public void acesseConta() {
        click(acesseConta);
    }

    public void acesseRedepay() {
        click(acesseRedepay);
    }

    public void esqueciSenha() {
        click(esqueciSenha);
    }

    public void cadastrese() {
        click(cadastrese);
    }


    public static String getText(By by) {
        WebDriver driver = new ChromeDriver();
        return driver.findElement(by).getText();

    }
}
