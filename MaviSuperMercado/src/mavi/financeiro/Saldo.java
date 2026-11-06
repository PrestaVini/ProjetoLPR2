


package mavi.financeiro;

public class Saldo {
    private double saldo;

    public void inicializarSaldo() {
        saldo = 20000;
    }

    public double getSaldo() {
        return saldo;
    }

    public void adicionarSaldo(double valor) {
        saldo += valor;
    }

    public void retirarSaldo(double valor) {
        saldo -= valor;
    }

}
