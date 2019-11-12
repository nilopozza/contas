package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.Conta;
import br.com.fiap.contas.modelo.ContaCorrente;

public class TestaArrays {

    public static void main(String[] args) {

        // Cria Array de Objetos do tipo Conta
           Conta[] contas = new Conta[10];

        // Laço para popular Array de Contas
           for (int i = 0; i < contas.length; i++) {

                Conta cc = new ContaCorrente();
                cc.deposita(i * 1000);
                contas[i] = cc;
           }

        // Laço para sumarizar o saldo das contas
        double saldoTotal = 0;

        for (int i = 0; i < contas.length ; i++) {
            saldoTotal += contas[i].getSaldo();
        }

        // Imprime as informações para o usuário
        System.out.println("Saldo Acumulado das Contas é: " + saldoTotal);
        System.out.println("Total de Contas existentes é: " + contas.length);
        System.out.println("Média do Saldo das Contas  é: " + (saldoTotal / contas.length));

    }

}
