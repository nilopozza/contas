package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteDaConta {

    public static void main(String[] args) throws SaldoInsuficienteException {

        // Criação de Objeto do tipo Conta Poupança
            ContaPoupanca cp = new ContaPoupanca();
            System.out.println(cp.getTipo());

        // Criação de Objeto do tipo Seguro de Vida
            SeguroDeVida sv = new SeguroDeVida();
            sv.setNumeroApolice(123400);
            sv.setTitular("Paulo Marques");
            sv.setValor(1000);
            System.out.println(sv.getTipo());
            System.out.println(sv.getTitular());
            System.out.println(sv.getNumeroApolice());
            System.out.println(sv.getValor());
            System.out.println(sv.getValorImposto());

        // Criação de Objetos do tipo Conta Corrente
            ContaCorrente cc1 = new ContaCorrente();
            cc1.setTitular("Cliente C");
            cc1.setAgencia("12345");
            cc1.deposita(1000);
            cc1.saca(100);
            System.out.println(cc1.getTipo());

            ContaCorrente cc2 = new ContaCorrente();
            cc2.setTitular("Cliente B");
            cc2.setAgencia("56789");
            cc2.deposita(2000);
            cc2.saca(200);
            System.out.println(cc2.getTipo());

            ContaCorrente cc3 = new ContaCorrente();
            cc3.setTitular("Cliente A");
            cc3.setAgencia("90123");
            cc3.deposita(3000);
            cc3.saca(300);
            System.out.println(cc3.getTipo());

        // Define Lista de Contas Corrente
            List<ContaCorrente> contas = new ArrayList<>();

        // Adiciona as Contas Corrente na Lista
            contas.add(cc1);
            contas.add(cc2);
            contas.add(cc3);

        // Ordena lista de contas a partir do titular
            Collections.sort(contas);

    }
}
