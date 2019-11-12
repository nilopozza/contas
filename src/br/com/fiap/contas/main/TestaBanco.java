package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Banco;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaBanco {

    public static void main(String[] args) {

        // Cria novo banco
        Banco banco = new Banco("LontraBank", 1234);

        // Cria Lista de Contas
        for (int i = 0; i < 10; i++) {
            ContaCorrente cc = new ContaCorrente();
            cc.setNumero(i);
            cc.deposita(i * 1000);
            cc.setAgencia(i + "1234");
            banco.adiciona(cc);
        }

        // Exibe dados das contas criadas para o Banco
        banco.mostraConta();
    }
}
