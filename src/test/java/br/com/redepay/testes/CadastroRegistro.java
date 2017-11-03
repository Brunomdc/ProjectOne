package br.com.redepay.testes;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.PaginaRegistro;
import pages.Portais;

public class CadastroRegistro {

    WebDriver driver;

    @Test
    public void CadastroRegistro(){
        PortaisUrl.Registro();
        PaginaRegistro registro = new PaginaRegistro();
        registro.cpf();
        registro.email();
        registro.nomecompleto();
        registro.telefonecelular();
        registro.continuar();
        Portais.loading();
        registro.senha();
        registro.finalizar();
    }
}
