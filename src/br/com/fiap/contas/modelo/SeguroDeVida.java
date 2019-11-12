package br.com.fiap.contas.modelo;

public class SeguroDeVida implements Tributavel{

    // Atributos da Classe
    private double valor;
    private String titular;
    private int numeroApolice;

    // Getters

    public double getValor() {
        return this.valor;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getNumeroApolice (){
        return this.numeroApolice;
    }

    // Setters
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroApolice(int numeroApolice){
        this.numeroApolice = numeroApolice;
    }

    // Métodos
    public double getValorImposto() {
        return 42 + (this.valor * 0.02);
    }

    public String getTipo(){
        return "Seguro de Vida";
    }


}
