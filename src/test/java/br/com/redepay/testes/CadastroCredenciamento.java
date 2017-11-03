package br.com.redepay.testes;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.PaginaCredenciamento;

public class CadastroCredenciamento {

    WebDriver driver;

    @Test
    public void CadastroCredenciamento(){
        PortaisUrl.Credenciamento();
        PaginaCredenciamento credenciamento = new PaginaCredenciamento();
        credenciamento.pessoaJuridica();
        credenciamento.nome();
        credenciamento.celular();
        credenciamento.comercial();
        credenciamento.email();
        credenciamento.confirmaemail();
        credenciamento.senha();
        credenciamento.continuar();
        credenciamento.cnpj();
        credenciamento.sociocnpjcpf();
        credenciamento.adicionar();




    }
}
