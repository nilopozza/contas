package br.com.fiap.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformance {

    public static void main(String[] args) {

        System.out.println("Iniciando...");
        HashSet<Integer> teste = new HashSet<>();

        long inicio = System.currentTimeMillis();
        int total = 30000;
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto na criação: " + tempo);

        inicio = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Tempo gasto na leitura: " + tempo);

/*        @@@ ArrayList
        Tempo gasto na criação: 16
        Tempo gasto na leitura: 2266

        @@@ HashSet
        Tempo gasto na criação: 15
        Tempo gasto na leitura: 15*/
    }
}
