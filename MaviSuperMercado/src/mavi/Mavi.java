


package mavi;

import mavi.produtos.GerenciarProdutos;
import mavi.financeiro.Saldo;
import mavi.usuarios.GerenciarUsuarios;
import mavi.telas.TelaPrincipal;
import mavi.relatorios.Data;
import mavi.relatorios.SaldoDiario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mavi {

    public static void main(String[] args) {
        GerenciarProdutos gerenciador = new GerenciarProdutos();
        gerenciador.iniciarProdutos();
        Saldo saldo = new Saldo();
        saldo.inicializarSaldo();
        GerenciarUsuarios usuarios = new GerenciarUsuarios();
        usuarios.IniciarBancoUsuarios();
        Data dataAtual = new Data();
        SaldoDiario saldoDiario = new SaldoDiario();
        saldoDiario.Resetar();

        TelaPrincipal telaPrincipal = new TelaPrincipal(gerenciador, saldo, usuarios, dataAtual, saldoDiario);

        telaPrincipal.setVisible(true);
    }

}
