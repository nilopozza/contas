package br.com.fiap.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{

    // Métodos

    @Override
    public void saca(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Você tentou sacar um valor negativo");
        }
        if (this.saldo < valor){
            throw new SaldoInsuficienteException(valor);
        }
        else {
            this.saldo -= (valor + 0.10);
        }
    }

    public String getTipo() {
        return "Conta Corrente";
    }

    public double getValorImposto() {
        return this.getSaldo() * 0.01;
    }
}
