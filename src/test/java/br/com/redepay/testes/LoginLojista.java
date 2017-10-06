package br.com.redepay.testes;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PaginaLogin;
import pages.PaginaLojista;
import pages.Portais;
import utils.Helper;

import static utils.Helper.*;


public class LoginLojista {

    @Test
    public void LoginLojista() {
        PortaisUrl.LogistaComprador();
        PaginaLojista lojista = new PaginaLojista();
        PaginaLogin login = new PaginaLogin();
        Portais portais = new Portais();
        login.nomeLogin();
        login.senhaLogin();
        login.continuar();
        Helper.loadingPortal();
        portais.menuCollpase();
        lojista.centraldesoluções();
        String teste = getText(By.xpath("//a[contains(text(),'central de soluções')]"));
        Assert.assertEquals(teste, "central de soluções");
        getWebDriver().quit();
    }


}