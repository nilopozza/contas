package br.com.fiap.contas.main;

import br.com.fiap.contas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaLista {

    public static void main(String[] args) {

        // Cria ArrayList de Objetos do tipo Conta
        List<ContaCorrente> contas = new LinkedList<>();

        // Laço para popular Array de Contas
        for (int i = 0; i < 10; i++) {
            ContaCorrente cc = new ContaCorrente();
            Random random = new Random();
            cc.setAgencia(i + "1234");
            cc.setNumero(i);
            cc.setTitular("Cliente " + i);
            cc.deposita(random.nextInt(5000));
            contas.add(cc);
        }

        // Exibe atributos de cada conta corrente criada - Método toString sem alteração
        System.out.println(contas);

    }
}
