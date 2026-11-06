


package mavi.telas;

import mavi.produtos.GerenciarProdutos;
import mavi.produtos.Produto;
import mavi.financeiro.Saldo;
import javax.swing.JOptionPane;
import mavi.relatorios.SaldoDiario;

public class Comprar extends javax.swing.JPanel {

    private GerenciarProdutos gerenciador;
    private Saldo saldo;
    private TelaPrincipal telaPrincipal;
    private Produto[] produtosCarrinho = new Produto[100];
    private float[] quantidadesCarrinho = new float[100];
    private double[] precosCarrinho = new double[100];
    private int quantidadeItens = 0;
    private SaldoDiario saldoDiario;

    public Comprar(GerenciarProdutos gerenciador, Saldo saldo, SaldoDiario saldoDiario, TelaPrincipal telaPrincipal) {
        initComponents();
        this.gerenciador = gerenciador;
        this.saldo = saldo;
        this.telaPrincipal = telaPrincipal;
        this.saldoDiario = saldoDiario;
        configurarLayoutResponsivo();
        carregarProdutosComboBox();
        atualizarUnidadeMedida();
        EstiloMavi.aplicar(this);
    }

    private void configurarLayoutResponsivo() {

        removeAll();
        jPanel1.removeAll();
        jPanelAreaComprar.removeAll();

        setLayout(new java.awt.BorderLayout());
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanelAreaComprar.setLayout(new java.awt.GridLayout(1, 2, 0, 0));

        java.awt.Color fundo = new java.awt.Color(238, 238, 238);
        java.awt.Color corDivisoria = new java.awt.Color(102, 102, 255);

        javax.swing.JPanel painelFormulario = new javax.swing.JPanel(new java.awt.GridBagLayout());
        painelFormulario.setBackground(fundo);
        painelFormulario.setBorder(javax.swing.BorderFactory.createCompoundBorder(
            javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 2, corDivisoria),
            javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 12)
        ));

        javax.swing.JPanel painelCarrinho = new javax.swing.JPanel(new java.awt.BorderLayout(8, 8));
        painelCarrinho.setBackground(fundo);
        painelCarrinho.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 12, 12, 12));

        jLabelTituloComprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adicionarTitulo(painelFormulario, 0, jLabelTituloComprar);
        javax.swing.JPanel painelProduto = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 0));
        painelProduto.setOpaque(false);
        painelProduto.add(jComboBoxSetarProduto);
        painelProduto.add(jLabelUnidadeDeMedida);
        adicionarCampo(painelFormulario, 1, jLabelProduto, painelProduto);
        adicionarCampo(painelFormulario, 2, jLabelQuantidade, jTextFieldSetarQuantidade);
        adicionarCampo(painelFormulario, 3, jLabelValorDeCompra, jTextFieldValorDeCompra);
        adicionarAcao(painelFormulario, 5, jButtonAdicionarItem);
        adicionarAcao(painelFormulario, 6, jButtonRemoverItem);
        adicionarAcao(painelFormulario, 7, jButtonFinalizarCompra);
        adicionarBotaoRodape(painelFormulario, 8, jButtonCancelar);

        jLabelTituloCarrinho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painelCarrinho.add(jLabelTituloCarrinho, java.awt.BorderLayout.NORTH);
        painelCarrinho.add(jScrollPane1, java.awt.BorderLayout.CENTER);
        javax.swing.JPanel rodapeCarrinho = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        rodapeCarrinho.setOpaque(false);
        rodapeCarrinho.add(jLabelValorTotal);
        painelCarrinho.add(rodapeCarrinho, java.awt.BorderLayout.SOUTH);


        jPanelAreaComprar.add(painelFormulario);
        jPanelAreaComprar.add(painelCarrinho);
        jPanel1.add(jPanelAreaComprar, java.awt.BorderLayout.CENTER);
        add(jPanel1, java.awt.BorderLayout.CENTER);
    }

    private void adicionarTitulo(javax.swing.JPanel painel, int linha, javax.swing.JLabel titulo) {
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.gridx = 0;
        c.gridy = linha;
        c.gridwidth = 2;
        c.weightx = 1.0;
        c.fill = java.awt.GridBagConstraints.HORIZONTAL;
        c.anchor = java.awt.GridBagConstraints.CENTER;
        c.insets = new java.awt.Insets(8, 8, 16, 8);
        painel.add(titulo, c);
    }

    private void adicionarCampo(javax.swing.JPanel painel, int linha, javax.swing.JLabel rotulo, java.awt.Component campo) {
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.gridy = linha;
        c.insets = new java.awt.Insets(6, 8, 6, 8);
        c.anchor = java.awt.GridBagConstraints.WEST;
        c.gridx = 0;
        c.weightx = 0;
        c.fill = java.awt.GridBagConstraints.NONE;
        painel.add(rotulo, c);

        c.gridx = 1;
        c.weightx = 1.0;
        c.fill = java.awt.GridBagConstraints.HORIZONTAL;
        painel.add(campo, c);
    }

    private void adicionarTexto(javax.swing.JPanel painel, int linha, javax.swing.JLabel texto) {
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.gridx = 0;
        c.gridy = linha;
        c.gridwidth = 2;
        c.anchor = java.awt.GridBagConstraints.WEST;
        c.insets = new java.awt.Insets(6, 8, 8, 8);
        painel.add(texto, c);
    }

    private void adicionarAcao(javax.swing.JPanel painel, int linha, javax.swing.JButton botao) {
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.gridx = 0;
        c.gridy = linha;
        c.gridwidth = 2;
        c.anchor = java.awt.GridBagConstraints.WEST;
        c.insets = new java.awt.Insets(5, 8, 5, 8);
        painel.add(botao, c);
    }

    private void adicionarBotaoRodape(javax.swing.JPanel painel, int linha, javax.swing.JButton botao) {
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.gridx = 0;
        c.gridy = linha;
        c.gridwidth = 2;
        c.weighty = 1.0;
        c.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        c.insets = new java.awt.Insets(8, 8, 8, 8);
        painel.add(botao, c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelAreaComprar = new javax.swing.JPanel();
        jLabelTituloComprar = new javax.swing.JLabel();
        jLabelValorDeCompra = new javax.swing.JLabel();
        jButtonAdicionarItem = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelProduto = new javax.swing.JLabel();
        jComboBoxSetarProduto = new javax.swing.JComboBox<>();
        jLabelQuantidade = new javax.swing.JLabel();
        jTextFieldSetarQuantidade = new javax.swing.JTextField();
        jSeparatorSeparador = new javax.swing.JSeparator();
        jButtonRemoverItem = new javax.swing.JButton();
        jLabelTituloCarrinho = new javax.swing.JLabel();
        jButtonFinalizarCompra = new javax.swing.JButton();
        jLabelValorTotal = new javax.swing.JLabel();
        jTextFieldValorDeCompra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaCarrinho = new javax.swing.JTextArea();
        jLabelUnidadeDeMedida = new javax.swing.JLabel();

        jLabelTituloComprar.setBackground(new java.awt.Color(102, 51, 255));
        jLabelTituloComprar.setFont(new java.awt.Font("Swis721 Blk BT", 0, 12));
        jLabelTituloComprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloComprar.setText("COMPRAR");

        jLabelValorDeCompra.setText("Valor unitário:");

        jButtonAdicionarItem.setBackground(new java.awt.Color(255, 152, 0));
        jButtonAdicionarItem.setText("Adicionar item");
        jButtonAdicionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarItemActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelProduto.setText("Produto:");

        jComboBoxSetarProduto.setBackground(new java.awt.Color(103, 58, 183));
        jComboBoxSetarProduto.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxSetarProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSetarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSetarProdutoActionPerformed(evt);
            }
        });

        jLabelQuantidade.setText("Quantidade:");

        jTextFieldSetarQuantidade.setBackground(new java.awt.Color(103, 58, 183));
        jTextFieldSetarQuantidade.setForeground(new java.awt.Color(255, 255, 255));

        jSeparatorSeparador.setBackground(new java.awt.Color(102, 102, 255));
        jSeparatorSeparador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonRemoverItem.setBackground(new java.awt.Color(255, 183, 77));
        jButtonRemoverItem.setText("Remover último item");

        jLabelTituloCarrinho.setBackground(new java.awt.Color(102, 51, 255));
        jLabelTituloCarrinho.setFont(new java.awt.Font("Swis721 Blk BT", 0, 12));
        jLabelTituloCarrinho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloCarrinho.setText("CARRINHO:");

        jButtonFinalizarCompra.setBackground(new java.awt.Color(69, 39, 160));
        jButtonFinalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinalizarCompra.setText("Finalizar compra");
        jButtonFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCompraActionPerformed(evt);
            }
        });

        jLabelValorTotal.setText("Valor total: R$");

        jTextFieldValorDeCompra.setBackground(new java.awt.Color(103, 58, 183));
        jTextFieldValorDeCompra.setForeground(new java.awt.Color(255, 255, 255));

        jTextAreaCarrinho.setEditable(false);
        jTextAreaCarrinho.setColumns(20);
        jTextAreaCarrinho.setRows(5);
        jScrollPane1.setViewportView(jTextAreaCarrinho);

        jLabelUnidadeDeMedida.setText("Unidade de medida");

        javax.swing.GroupLayout jPanelAreaComprarLayout = new javax.swing.GroupLayout(jPanelAreaComprar);
        jPanelAreaComprar.setLayout(jPanelAreaComprarLayout);
        jPanelAreaComprarLayout.setHorizontalGroup(
            jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAreaComprarLayout.createSequentialGroup()
                .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAreaComprarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAreaComprarLayout.createSequentialGroup()
                                .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelValorDeCompra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldValorDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelAreaComprarLayout.createSequentialGroup()
                                        .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBoxSetarProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jTextFieldSetarQuantidade))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelUnidadeDeMedida)))
                                .addGap(88, 88, 88))))
                    .addGroup(jPanelAreaComprarLayout.createSequentialGroup()
                        .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAreaComprarLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelAreaComprarLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabelTituloComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparatorSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAreaComprarLayout.createSequentialGroup()
                        .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTituloCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAreaComprarLayout.createSequentialGroup()
                        .addComponent(jLabelValorTotal)
                        .addGap(52, 52, 52))))
        );
        jPanelAreaComprarLayout.setVerticalGroup(
            jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparatorSeparador, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelAreaComprarLayout.createSequentialGroup()
                .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAreaComprarLayout.createSequentialGroup()
                        .addComponent(jLabelTituloComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProduto)
                            .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxSetarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelUnidadeDeMedida)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQuantidade)
                            .addComponent(jTextFieldSetarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAreaComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelValorDeCompra)
                            .addComponent(jTextFieldValorDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jButtonAdicionarItem)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFinalizarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar))
                    .addGroup(jPanelAreaComprarLayout.createSequentialGroup()
                        .addComponent(jLabelTituloCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelValorTotal)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAreaComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAreaComprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCompraActionPerformed

        if (quantidadeItens > 0) {

           double valorTotal = 0;

           for (int i = 0; i < quantidadeItens; i++) {
               valorTotal += quantidadesCarrinho[i] * precosCarrinho[i];
           }

           if (valorTotal > saldo.getSaldo()) {
               JOptionPane.showMessageDialog(this, "Saldo insuficiente para realizar a compra!");
               return;
           }

           for (int i = 0; i < quantidadeItens; i++) {
               Produto produto = produtosCarrinho[i];

               float quantidadeComprada = quantidadesCarrinho[i];

               float estoqueAtual = produto.getQuantidadeNoEstoque();
               produto.setQuantidadeNoEstoque(estoqueAtual + quantidadeComprada);
           }

           saldo.retirarSaldo(valorTotal);
           saldoDiario.setCompraDiaria(saldoDiario.getCompraDiaria() + valorTotal);

           JOptionPane.showMessageDialog(this,
               "Compra realizada com sucesso!" +
               "\n\nItens:\n" +
               jTextAreaCarrinho.getText() +
               "\n\n" +
               jLabelValorTotal.getText()
           );

           telaPrincipal.mostrarSaldo();

           atualizarPagina();
           return;

       } else {
           JOptionPane.showMessageDialog(this, "O carrinho está vazio!");
           return;
       }
    }//GEN-LAST:event_jButtonFinalizarCompraActionPerformed

    private void jComboBoxSetarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSetarProdutoActionPerformed
        atualizarUnidadeMedida();
    }//GEN-LAST:event_jComboBoxSetarProdutoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        atualizarPagina();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarItemActionPerformed

        String nomeProduto = (String) jComboBoxSetarProduto.getSelectedItem();
        float quantidade;
        double preco;

        try {
            quantidade = Float.parseFloat(jTextFieldSetarQuantidade.getText().replace(",", "."));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite uma quantidade válida!");
            return;
        }

        try {
            preco = Double.parseDouble(jTextFieldValorDeCompra.getText().replace(",", "."));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite um valor válido!");
            return;
        }

        if (!Float.isFinite(quantidade) || quantidade <= 0 || !Double.isFinite(preco) || preco <= 0) {
            JOptionPane.showMessageDialog(this, "A quantidade e o valor devem ser maiores que zero!");
            return;
        }

        Produto[] produtos = gerenciador.getListaProdutos();
        int i = 0;

        while(i < produtos.length && produtos[i] != null) {
            if(produtos[i].getNome().equals(nomeProduto)) {

                if (quantidadeItens < produtosCarrinho.length) {
                        produtosCarrinho[quantidadeItens] = produtos[i];
                        quantidadesCarrinho[quantidadeItens] = quantidade;
                        precosCarrinho[quantidadeItens] = preco;
                        quantidadeItens++;
                        atualizarCarrinho();
                        break;
                } else {
                    JOptionPane.showMessageDialog(this, "Carrinho cheio!");
                    break;
                }
            } else {
                i++;
            }
        }

    }//GEN-LAST:event_jButtonAdicionarItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarItem;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonFinalizarCompra;
    private javax.swing.JButton jButtonRemoverItem;
    private javax.swing.JComboBox<String> jComboBoxSetarProduto;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelTituloCarrinho;
    private javax.swing.JLabel jLabelTituloComprar;
    private javax.swing.JLabel jLabelUnidadeDeMedida;
    private javax.swing.JLabel jLabelValorDeCompra;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAreaComprar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorSeparador;
    private javax.swing.JTextArea jTextAreaCarrinho;
    private javax.swing.JTextField jTextFieldSetarQuantidade;
    private javax.swing.JTextField jTextFieldValorDeCompra;
    // End of variables declaration//GEN-END:variables

    private void carregarProdutosComboBox() {
        jComboBoxSetarProduto.removeAllItems();

        Produto[] produtos = gerenciador.getListaProdutos();

        for (int i = 0; i < produtos.length; i++) {
            if(produtos[i] != null) {
                jComboBoxSetarProduto.addItem(produtos[i].getNome());
            }
        }
    }

    private void atualizarCarrinho() {

        jTextAreaCarrinho.setText("");

        double valorTotal = 0;

        for (int i = 0; i < quantidadeItens; i++) {

            Produto produto = produtosCarrinho[i];
            float quantidade = quantidadesCarrinho[i];

            double subtotal = precosCarrinho[i] * quantidade;

            jTextAreaCarrinho.append(
                produto.getNome() + " - " +
                quantidade + " " +
                produto.getUnidadeDeMedida() +
                " - R$ " + String.format("%.2f", subtotal) +
                "\n"
            );

            valorTotal += subtotal;
        }

        jLabelValorTotal.setText(
            String.format("Valor total: R$ %.2f", valorTotal)
        );
    }

    private void atualizarPagina() {

        jComboBoxSetarProduto.setSelectedIndex(0);
        jTextFieldSetarQuantidade.setText("");
        jTextFieldValorDeCompra.setText("");

        produtosCarrinho = new Produto[100];
        quantidadesCarrinho = new float[100];
        precosCarrinho = new double[100];
        quantidadeItens = 0;

        atualizarCarrinho();
    }

    private void atualizarUnidadeMedida() {

    String nomeProduto = (String) jComboBoxSetarProduto.getSelectedItem();

    Produto[] produtos = gerenciador.getListaProdutos();

    jLabelUnidadeDeMedida.setText("");

    for (int i = 0; i < produtos.length; i++) {
        if (produtos[i] != null && produtos[i].getNome().equals(nomeProduto)) {
            jLabelUnidadeDeMedida.setText(produtos[i].getUnidadeDeMedida());
            break;
        }
    }
}
}
