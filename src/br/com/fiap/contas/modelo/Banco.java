package br.com.fiap.contas.modelo;

public class Banco {

    // Atributos da Classe
       private String nome;
       private int numero;
       private int totalContasCadastradas;
       private Conta[] conta;

    // Construtor
    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.conta = new Conta[10];
    }

    //Getters
    public String getNome() {
        return this.nome;
    }

    public int getNumero(){
        return this.numero;
    }

    public int getTotalContasCadastradas() {
        return this.totalContasCadastradas;
    }

    //Métodos

    public void adiciona(Conta conta) {
        if (totalContasCadastradas < this.conta.length) {
            this.conta[totalContasCadastradas] = conta;
            totalContasCadastradas++;
        }
        else {
            System.out.println("Limite de contas para o Banco: " + this.nome + " foi atingida");
        }
    }

    public void mostraConta() {
        if (this.totalContasCadastradas > 0) {
            for (int i = 0; i < this.totalContasCadastradas; i++) {
                System.out.println("Posição da Conta no Array: " + i );
                System.out.println("Número da Agencia........: " + this.conta[i].getAgencia());
                System.out.println("Número da Conta..........: " + this.conta[i].getNumero());
                System.out.println("Saldo  da Conta..........: " + this.conta[i].getSaldo() + "\n");
            }
        }
        else {
            System.out.println("Não existem contas na lista para exibição");
        }
    }
}
