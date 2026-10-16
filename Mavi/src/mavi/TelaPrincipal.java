/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mavi;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaPrincipal.class.getName());

public TelaPrincipal() {
    initComponents();

    getContentPane().setLayout(new java.awt.BorderLayout(0, 0));

    getContentPane().add(jPanelMenuLateral, java.awt.BorderLayout.WEST);
    getContentPane().add(jPanelMonitor, java.awt.BorderLayout.CENTER);

    setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuLateral = new javax.swing.JPanel();
        jButtonComprar = new javax.swing.JButton();
        jButtonVender = new javax.swing.JButton();
        jButtonFecharDia = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonEstoque = new javax.swing.JButton();
        jLabelPerfil = new javax.swing.JLabel();
        jLabelNomeDoPerfil = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jButtonRelatorios = new javax.swing.JButton();
        jPanelMonitor = new javax.swing.JPanel();
        jMenuBarNavegacao = new javax.swing.JMenuBar();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuLogin = new javax.swing.JMenu();

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

        jButtonFecharDia.setText("Fechar dia");
        jButtonFecharDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharDiaActionPerformed(evt);
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
        jLabelNomeDoPerfil.setText("\"Nome do perfil\"");

        jLabelData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelData.setText("xx/xx/xxxx");

        jButtonRelatorios.setText("Relatórios");
        jButtonRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatoriosActionPerformed(evt);
            }
        });

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
                            .addComponent(jButtonFecharDia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                        .addComponent(jLabelPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomeDoPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMenuLateralLayout.setVerticalGroup(
            jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVender, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonFecharDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPerfil)
                    .addComponent(jLabelNomeDoPerfil))
                .addContainerGap())
        );

        jPanelMonitor.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanelMonitorLayout = new javax.swing.GroupLayout(jPanelMonitor);
        jPanelMonitor.setLayout(jPanelMonitorLayout);
        jPanelMonitorLayout.setHorizontalGroup(
            jPanelMonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );
        jPanelMonitorLayout.setVerticalGroup(
            jPanelMonitorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        jMenuAjuda.setText("Ajuda");
        jMenuBarNavegacao.add(jMenuAjuda);

        jMenuLogin.setText("Login");
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
        mudarTela(new Comprar());
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonFecharDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFecharDiaActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEstoqueActionPerformed

    private void jButtonRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRelatoriosActionPerformed

    private void jButtonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVenderActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonEstoque;
    private javax.swing.JButton jButtonFecharDia;
    private javax.swing.JButton jButtonRelatorios;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVender;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelNomeDoPerfil;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarNavegacao;
    private javax.swing.JMenu jMenuLogin;
    private javax.swing.JPanel jPanelMenuLateral;
    private javax.swing.JPanel jPanelMonitor;
    // End of variables declaration//GEN-END:variables

private void mudarTela(javax.swing.JPanel novaTela) {
    jPanelMonitor.removeAll();

    jPanelMonitor.setLayout(new java.awt.BorderLayout());
    jPanelMonitor.add(novaTela, java.awt.BorderLayout.CENTER);

    jPanelMonitor.revalidate();
    jPanelMonitor.repaint();
}

}
