package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Helper.click;

public class PaginaComprador {

    WebDriver driver;


    By meuscartoes = By.xpath("//span[contains(text(),'meus cartões')]");
    By autorizacoes = By.xpath("//span[contains(text(),'minhas autorizações')]");
    By minhascompras = By.xpath("//i[@class='icon-sidebar icon-home]");


    public void meuscartoes() {
        click(meuscartoes);
    }

    public void autorizacoes() {
        click(autorizacoes);
    }

    public void minhascompras() {
        click(minhascompras);
    }


}


