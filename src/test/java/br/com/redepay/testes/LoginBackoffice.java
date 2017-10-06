package br.com.redepay.testes;

import org.testng.annotations.Test;
import pages.PaginaBackoffice;

import static utils.Helper.*;

public class LoginBackoffice {


    @Test
    public void LoginBackoffice() {
        PortaisUrl.Backoffice();
        PaginaBackoffice backoffice = new PaginaBackoffice();
        backoffice.funcional();
        backoffice.senha();
        backoffice.continuar();
        backoffice.menu();
        getWebDriver().quit();

    }
}
