package br.com.redepay.testes;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PaginaLogin;
import pages.Portais;
import utils.Helper;


import static utils.Helper.*;
import static org.openqa.selenium.By.xpath;

public class LoginComprador {


    @Test
    public void LoginComprador() {
        PortaisUrl.LogistaComprador();
        PaginaLogin login = new PaginaLogin();
        Portais portais = new Portais();
        login.nomeLogin();
        login.senhaLogin();
        login.continuar();
        Helper.loadingPortal();
        portais.menuCollpase();
        portais.minhaconta();
        //String teste = getText(xpath("//span[contains(text(),'meus cartões')]"));
        // ssert.assertEquals(teste, "meus cartões");
        //getWebDriver().quit();

    }

}