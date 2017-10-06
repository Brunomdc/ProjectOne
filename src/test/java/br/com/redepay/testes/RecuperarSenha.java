package br.com.redepay.testes;

import org.testng.annotations.Test;
import pages.PaginaLogin;

public class RecuperarSenha {

    @Test
    public void RecuperacaoSenha() {
        PortaisUrl.RecuperacaoSenha();
        PaginaLogin recuperasenha = new PaginaLogin();
        recuperasenha.nomeLogin();
        //recuperasenha.continuar();


    }
}