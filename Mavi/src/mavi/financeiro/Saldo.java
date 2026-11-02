/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
