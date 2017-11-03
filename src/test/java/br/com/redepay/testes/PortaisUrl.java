package br.com.redepay.testes;

import utils.Helper;

public class PortaisUrl {
    public static void LogistaComprador() {
        Helper.get("http://10.59.164.13/portal/#/");
    }

    public static void RecuperacaoSenha() {
        Helper.get("http://10.59.164.13/portal/#/forgot-password");
    }

    public static void Backoffice() {
        Helper.get("http://10.59.164.13/backoffice/#/");
    }

    public static void Registro() {Helper.get("http://10.59.164.13/portal/#/registro");}

    public static void Credenciamento() {Helper.get("http://10.59.164.13/credenciamento/#/");}

}