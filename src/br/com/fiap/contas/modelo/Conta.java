package br.com.fiap.contas.modelo;

public abstract class Conta implements Comparable<Conta> {

       // Atributos da Classe
       protected double saldo;
       private String titular;
       private int    numero;
       private String agencia;

       // Getters
       public double getSaldo() {
           return this.saldo;
       }

       public String getTitular() {
           return this.titular;
       }

       public int getNumero() {
           return this.numero;
       }

       public String getAgencia() {
           return this.agencia;
       }

    // Setters
       public void setTitular(String titular){
           this.titular = titular;
       }

       public void setNumero(int numero) {
           this.numero = numero;
       }

       public void setAgencia(String agencia) {
           this.agencia = agencia;
       }

       // Métodos

       public String buscaConta(String nome) {
           return "";
       }

       public void deposita(double valor) {
           if (valor < 0) {
                throw new IllegalArgumentException("Você tentou depositar um valor negativo");
           }
           else {
               this.saldo += valor;
           }
       }

       public void saca(double valor) {
           this.saldo -= valor;
       }

       public abstract String getTipo();

       public void transfere(double valor, Conta conta) {
           this.saca(valor);
           conta.deposita(valor);
       }

       @Override
       public String toString() {
           return "[Titular: " + this.titular + ", numero: " + this.numero + ", agencia: " + this.agencia + "]";
       }

       public boolean equals(Object obj) {
           if (obj == null) {
               return false;
           }
           Conta outraConta = (Conta) obj;
           return this.numero == outraConta.numero && this.agencia == outraConta.agencia;
       }

      public int compareTo(Conta outraConta) {
           return this.titular.compareTo(outraConta.titular);
       }
}
