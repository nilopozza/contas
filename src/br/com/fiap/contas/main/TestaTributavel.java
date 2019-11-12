package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.ContaCorrente;
import br.com.fiap.contas.modelo.Tributavel;

public class TestaTributavel {

    public static void main(String[] args) {

        // Criação de Objeto do tipo Conta Corrente
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        System.out.println(cc.getValorImposto());
        System.out.println(cc.getTipo());

        // Testando polimorfismo:
        Tributavel tr = cc;
        System.out.println(tr.getValorImposto());

    }
}
