package mavi.telas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public final class EstiloMavi {
    private static final Color ROXO = new Color(103, 58, 183);
    private static final Color ROXO_ESCURO = new Color(69, 39, 160);
    private static final Color LARANJA = new Color(255, 152, 0);
    private static final Color LARANJA_CLARO = new Color(255, 225, 180);
    private static final Color FUNDO = new Color(247, 245, 250);
    private static final Color TEXTO = new Color(47, 43, 56);
    private static final Color BORDA = new Color(218, 211, 227);

    private EstiloMavi() {
    }

    public static void aplicar(Container raiz) {
        decorar(raiz);
    }

    private static void decorar(Component componente) {
        if (componente instanceof JPanel painel && painel.isOpaque()) {
            painel.setBackground(FUNDO);
        }

        if (componente instanceof JLabel rotulo) {
            rotulo.setForeground(TEXTO);
            String texto = rotulo.getText() == null ? "" : rotulo.getText().trim();
            if (texto.equals("COMPRAR") || texto.equals("VENDER")
                    || texto.equals("ESTOQUE") || texto.equals("CARRINHO:")
                    || texto.startsWith("Guia de Utilização") || texto.equals("LOGIN")) {
                rotulo.setFont(new Font("Segoe UI", Font.BOLD, 16));
                rotulo.setForeground(ROXO_ESCURO);
            } else if (texto.startsWith("Valor total:") || texto.startsWith("Saldo atual:")
                    || texto.startsWith("Total em estoque:")) {
                rotulo.setFont(new Font("Segoe UI", Font.BOLD, 13));
                rotulo.setForeground(ROXO_ESCURO);
            } else {
                rotulo.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            }
        }

        if (componente instanceof AbstractButton botao) {
            botao.setFocusPainted(false);
            botao.setFont(new Font("Segoe UI", Font.BOLD, 12));
            botao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            if (!(botao instanceof JMenu)) {
                String nome = botao.getText() == null ? "" : botao.getText().toLowerCase();
                if (nome.equals("esqueci minha senha")) {
                    botao.setBackground(FUNDO);
                    botao.setForeground(ROXO_ESCURO);
                } else if (nome.contains("adicionar")) {
                    botao.setBackground(LARANJA);
                    botao.setForeground(TEXTO);
                } else if (nome.contains("remover")) {
                    botao.setBackground(LARANJA_CLARO);
                    botao.setForeground(TEXTO);
                } else if (nome.contains("cancelar") || nome.equals("sair")
                        || nome.startsWith("voltar")) {
                    botao.setBackground(new Color(198, 65, 75));
                    botao.setForeground(Color.WHITE);
                } else {
                    botao.setBackground(ROXO);
                    botao.setForeground(Color.WHITE);
                }
                botao.setBorderPainted(false);
            }
        }

        if (componente instanceof JTextComponent campo) {
            campo.setBackground(Color.WHITE);
            campo.setForeground(TEXTO);
            campo.setCaretColor(ROXO_ESCURO);
            if (campo instanceof JTextField) {
                campo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
                campo.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(BORDA),
                    BorderFactory.createEmptyBorder(3, 7, 3, 7)
                ));
            }
        }

        if (componente instanceof JComboBox<?> selecao) {
            selecao.setBackground(Color.WHITE);
            selecao.setForeground(TEXTO);
            selecao.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        }

        if (componente instanceof JScrollPane rolagem) {
            rolagem.setBorder(BorderFactory.createLineBorder(BORDA));
            rolagem.getViewport().setBackground(Color.WHITE);
        }

        if (componente instanceof JTable tabela) {
            tabela.setBackground(Color.WHITE);
            tabela.setForeground(TEXTO);
            tabela.setGridColor(BORDA);
            tabela.setSelectionBackground(new Color(231, 220, 248));
            tabela.setSelectionForeground(TEXTO);
            tabela.setRowHeight(26);
            tabela.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            tabela.getTableHeader().setBackground(ROXO_ESCURO);
            tabela.getTableHeader().setForeground(Color.WHITE);
            tabela.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        }

        if (componente instanceof JTabbedPane abas) {
            abas.setBackground(FUNDO);
            abas.setForeground(ROXO_ESCURO);
            abas.setFont(new Font("Segoe UI", Font.BOLD, 12));
        }

        if (componente instanceof JMenuBar menu) {
            menu.setBackground(ROXO_ESCURO);
            menu.setForeground(Color.WHITE);
        }

        if (componente instanceof JMenu menu) {
            menu.setForeground(Color.WHITE);
        }

        if (componente instanceof Container recipiente) {
            for (Component filho : recipiente.getComponents()) {
                decorar(filho);
            }
        }
    }
}
