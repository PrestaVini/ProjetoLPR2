/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mavi.telas;

import javax.swing.JOptionPane;
import mavi.produtos.GerenciarProdutos;
import mavi.financeiro.Saldo;
import mavi.usuarios.GerenciarUsuarios;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipal.class.getName());

    private GerenciarProdutos gerenciador;
    private Saldo saldo;
    private GerenciarUsuarios usuario;
    private boolean verificadorLogin = false;

    public TelaPrincipal(GerenciarProdutos gerenciador, Saldo saldo, GerenciarUsuarios usuario) {
        initComponents();
        this.gerenciador = gerenciador;
        this.saldo = saldo;
        this.usuario = usuario;

        setIconImage(
            new javax.swing.ImageIcon(
                getClass().getResource("/imagens/icone_mavi.png")
            ).getImage()
        );

        getContentPane().setLayout(new java.awt.BorderLayout(0, 0));

        getContentPane().add(jPanelMenuLateral, java.awt.BorderLayout.WEST);
        getContentPane().add(jPanelMonitor, java.awt.BorderLayout.CENTER);

        mostrarLogoInicial();

        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);

        setTitle("Mavi - Sistema de Supermercado");

        mostrarSaldo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuLateral = new javax.swing.JPanel();
        jButtonComprar = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jButtonRelatorioDoDia = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonEstoque = new javax.swing.JButton();
        jLabelPerfil = new javax.swing.JLabel();
        jLabelNomeDoPerfil = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jButtonFecharDia = new javax.swing.JButton();
        jLabelSaldoAtual = new javax.swing.JLabel();
        jPanelMonitor = new javax.swing.JPanel();
        jMenuBarNavegacao = new javax.swing.JMenuBar();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemGuia = new javax.swing.JMenuItem();
        jMenuLogin = new javax.swing.JMenu();
        jMenuItemLogarConta = new javax.swing.JMenuItem();
        jMenuItemSairDoUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMenuLateral.setBackground(new java.awt.Color(255, 255, 255));

        jButtonComprar.setText("Comprar");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });

        jButtonVender.setText("Vender");
        jButtonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVenderActionPerformed(evt);
            }
        });

        jButtonRelatorioDoDia.setText("Relatório do dia");
        jButtonRelatorioDoDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioDoDiaActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonEstoque.setText("Estoque");
        jButtonEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstoqueActionPerformed(evt);
            }
        });

        jLabelPerfil.setText("Perfil:");

        jLabelNomeDoPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeDoPerfil.setText("Convidado");

        jLabelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelData.setText("xx/xx/xxxx");

        jButtonFecharDia.setText("Fechar dia");
        jButtonFecharDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharDiaActionPerformed(evt);
            }
        });

        jLabelSaldoAtual.setText("Saldo: R$");

        javax.swing.GroupLayout jPanelMenuLateralLayout = new javax.swing.GroupLayout(jPanelMenuLateral);
        jPanelMenuLateral.setLayout(jPanelMenuLateralLayout);
        jPanelMenuLateralLayout.setHorizontalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRelatorioDoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFecharDia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                        .addComponent(jLabelPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomeDoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSaldoAtual)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMenuLateralLayout.setVerticalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSaldoAtual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRelatorioDoDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonFecharDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPerfil)
                    .addComponent(jLabelNomeDoPerfil))
                .addContainerGap())
        );

        jPanelMonitor.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMonitor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelMonitor.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelMonitorLayout = new javax.swing.GroupLayout(jPanelMonitor);
        jPanelMonitor.setLayout(jPanelMonitorLayout);
        jPanelMonitorLayout.setHorizontalGroup(
            jPanelMonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanelMonitorLayout.setVerticalGroup(
            jPanelMonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jMenuAjuda.setText("Ajuda");
        jMenuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAjudaActionPerformed(evt);
            }
        });

        jMenuItemGuia.setText("Guia");
        jMenuItemGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuiaActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemGuia);

        jMenuBarNavegacao.add(jMenuAjuda);

        jMenuLogin.setText("Login");

        jMenuItemLogarConta.setText("Logar conta");
        jMenuItemLogarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogarContaActionPerformed(evt);
            }
        });
        jMenuLogin.add(jMenuItemLogarConta);

        jMenuItemSairDoUsuario.setText("Sair do usuário");
        jMenuItemSairDoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairDoUsuarioActionPerformed(evt);
            }
        });
        jMenuLogin.add(jMenuItemSairDoUsuario);

        jMenuBarNavegacao.add(jMenuLogin);

        setJMenuBar(jMenuBarNavegacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMonitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelMonitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        if (!verificarLogin()) {
            return;
        }
        
        mudarTela(new Comprar());
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonRelatorioDoDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioDoDiaActionPerformed
        if (!verificarLogin()) {
            return;
        }
    }//GEN-LAST:event_jButtonRelatorioDoDiaActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstoqueActionPerformed
        if (!verificarLogin()) {
            return;
        }
        
        mudarTela(new Estoque(gerenciador));
    }//GEN-LAST:event_jButtonEstoqueActionPerformed

    private void jButtonFecharDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharDiaActionPerformed
        if (!verificarLogin()) {
            return;
        }
        
    }//GEN-LAST:event_jButtonFecharDiaActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        if (!verificarLogin()) {
            return;
        }
        
        mudarTela(new Vender(gerenciador, saldo, this));
    }//GEN-LAST:event_jButtonVenderActionPerformed

    private void jMenuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAjudaActionPerformed

    }//GEN-LAST:event_jMenuAjudaActionPerformed

    private void jMenuItemGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuiaActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this, "Mavi - Sistema de Supermercado\nDesenvolvido em Java");
        TelaAjuda ajuda = new TelaAjuda();
        ajuda.setLocationRelativeTo(this);
        ajuda.setVisible(true);
    }//GEN-LAST:event_jMenuItemGuiaActionPerformed

    private void jMenuItemLogarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogarContaActionPerformed
        Login login = new Login(usuario, this);
        login.setLocationRelativeTo(this);
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItemLogarContaActionPerformed

    private void jMenuItemSairDoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairDoUsuarioActionPerformed
        if (!verificadorLogin) {
            JOptionPane.showMessageDialog(this, "Nenhum usuário está logado!");
            return;
        }
        
        sairLogin();
        mostrarLogoInicial();
        JOptionPane.showMessageDialog(this, "Logout realizado com sucesso!");
    }//GEN-LAST:event_jMenuItemSairDoUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonFecharDia;
    private javax.swing.JButton jButtonRelatorioDoDia;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelNomeDoPerfil;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelSaldoAtual;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarNavegacao;
    private javax.swing.JMenuItem jMenuItemGuia;
    private javax.swing.JMenuItem jMenuItemLogarConta;
    private javax.swing.JMenuItem jMenuItemSairDoUsuario;
    private javax.swing.JMenu jMenuLogin;
    private javax.swing.JPanel jPanelMenuLateral;
    private javax.swing.JPanel jPanelMonitor;
    // End of variables declaration//GEN-END:variables

    private void mostrarLogoInicial() {

        java.net.URL arquivoLogo = getClass().getResource(
            "/imagens/Logo Mavi com Carrinho Roxo e Laranja.png");

        if (arquivoLogo == null) {
            System.err.println("Logo do Mavi nao encontrada em src/imagens.");
            return;
        }

        final java.awt.Image logo = new javax.swing.ImageIcon(arquivoLogo).getImage();

        javax.swing.JPanel painelLogo = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                int largura = getWidth();
                int altura = getHeight();
                int larguraImagem = logo.getWidth(this);
                int alturaImagem = logo.getHeight(this);

                if (largura <= 0 || altura <= 0 || larguraImagem <= 0 || alturaImagem <= 0) {
                    return;
                }

                // Escala proporcional do tipo "cover": preenche toda a area.
                double escala = Math.max((double) largura * 0.55 / larguraImagem,
                                         (double) altura * 0.65 / alturaImagem);
                int larguraFinal = (int) Math.ceil(larguraImagem * escala);
                int alturaFinal = (int) Math.ceil(alturaImagem * escala);
                int x = (largura - larguraFinal) / 2;
                int y = (altura - alturaFinal) / 2;

                java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();
                try {
                    g2.setRenderingHint(java.awt.RenderingHints.KEY_INTERPOLATION,
                            java.awt.RenderingHints.VALUE_INTERPOLATION_BICUBIC);
                    g2.drawImage(logo, x, y, larguraFinal, alturaFinal, this);
                } finally {
                    g2.dispose();
                }
            }
        };

        painelLogo.setBackground(java.awt.Color.WHITE);
        mudarTela(painelLogo);
    }

    private void mudarTela(javax.swing.JPanel novaTela) {
        jPanelMonitor.removeAll();

        jPanelMonitor.setLayout(new java.awt.BorderLayout());
        jPanelMonitor.add(novaTela, java.awt.BorderLayout.CENTER);

        jPanelMonitor.revalidate();
        jPanelMonitor.repaint();
    }

    public void mostrarSaldo() {
        jLabelSaldoAtual.setText(String.format("Saldo atual: R$ %.2f", saldo.getSaldo()));
    }
    
    public void confirmarLogin(String nomeUsuario) {
        verificadorLogin = true;
        jLabelNomeDoPerfil.setText(nomeUsuario);
    }
    
    private void sairLogin() {
        verificadorLogin = false;
        jLabelNomeDoPerfil.setText("Convidado");
    }
    
    private boolean verificarLogin() {
        if (!verificadorLogin) {
            JOptionPane.showMessageDialog(this, "Faça login para acessar esta funcionalidade!");
            return false;
        }
        return true;
    }
}
