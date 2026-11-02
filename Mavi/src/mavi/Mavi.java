/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mavi;

import mavi.produtos.GerenciarProdutos;
import mavi.financeiro.Saldo;
import mavi.usuarios.GerenciarUsuarios;
import mavi.telas.TelaPrincipal;

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
        TelaPrincipal telaPrincipal = new TelaPrincipal(gerenciador, saldo, usuarios);
        
        telaPrincipal.setVisible(true);
    }
    
}
