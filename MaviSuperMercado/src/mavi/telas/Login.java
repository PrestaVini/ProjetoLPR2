


package mavi.telas;

import mavi.usuarios.GerenciarUsuarios;
import mavi.usuarios.Usuarios;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {


    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    private GerenciarUsuarios usuarios;
    private TelaPrincipal telaPrincipal;

    public Login(GerenciarUsuarios usuarios, TelaPrincipal telaPrincipal) {
        initComponents();
        setIconImage(
        new javax.swing.ImageIcon(
                getClass().getResource("/imagens/icone_login.png")
            ).getImage()
        );
        setTitle("Mavi - Login");

        setSize(450, 350);
        setResizable(false);

        setLocationRelativeTo(telaPrincipal);
        this.usuarios = usuarios;
        this.telaPrincipal = telaPrincipal;
        EstiloMavi.aplicar(getRootPane());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloLogin = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonVoltar = new javax.swing.JButton();
        jButtonEntrar = new javax.swing.JButton();
        jButtonEsqueciSenha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloLogin.setText("LOGIN");

        jLabelUsuario.setText("Usuário:");

        jLabelSenha.setText("Senha:");

        jTextFieldUsuario.setToolTipText("Digite seu usuário");
        jTextFieldUsuario.addActionListener(this::jTextFieldUsuarioActionPerformed);

        jPasswordFieldSenha.setToolTipText("Digite sua senha");

        jButtonVoltar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoltar.setText("Voltar ao menu");
        jButtonVoltar.addActionListener(this::jButtonVoltarActionPerformed);

        jButtonEntrar.setBackground(new java.awt.Color(0, 153, 51));
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addActionListener(this::jButtonEntrarActionPerformed);

        jButtonEsqueciSenha.setFont(new java.awt.Font("Segoe UI", 0, 9));
        jButtonEsqueciSenha.setText("Esqueci minha senha");
        jButtonEsqueciSenha.setForeground(new java.awt.Color(69, 39, 160));
        jButtonEsqueciSenha.setBorder(null);
        jButtonEsqueciSenha.setBorderPainted(false);
        jButtonEsqueciSenha.setContentAreaFilled(false);
        jButtonEsqueciSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEsqueciSenha.addActionListener(this::jButtonEsqueciSenhaActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTituloLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jButtonEsqueciSenha)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonEntrar))
                                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButtonVoltar))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEntrar)
                    .addComponent(jButtonEsqueciSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButtonVoltar)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed

    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonEsqueciSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEsqueciSenhaActionPerformed
        String nome = JOptionPane.showInputDialog("Digite o nome do usuário:");
        String emailRecuperacao = JOptionPane.showInputDialog("Digite um e-mail de recuperação:");
        JOptionPane.showMessageDialog(this, "A recuperação de senha por e-mail ainda não está disponível nesta versão.");
    }//GEN-LAST:event_jButtonEsqueciSenhaActionPerformed

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        Usuarios[] bancoUsuarios = usuarios.getBancoUsuarios();
        int i = 0;
        String senhaDigitada = new String(jPasswordFieldSenha.getPassword());
        while(i < bancoUsuarios.length && bancoUsuarios[i] != null) {
            if(jTextFieldUsuario.getText().equals(bancoUsuarios[i].getNomeUsuario()) &&
            senhaDigitada.equals(bancoUsuarios[i].getSenhaUsuario())) {
                telaPrincipal.confirmarLogin(bancoUsuarios[i].getNomeUsuario());
                JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
                this.dispose();
                return;
            } else {
                i++;
            }
        }
        JOptionPane.showMessageDialog(this, "Usuário ou senha não encontrados!");
    }//GEN-LAST:event_jButtonEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonEsqueciSenha;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTituloLogin;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
