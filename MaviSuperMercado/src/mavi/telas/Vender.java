


package mavi.telas;

import mavi.produtos.GerenciarProdutos;
import mavi.produtos.Produto;
import mavi.financeiro.Saldo;
import javax.swing.JOptionPane;
import mavi.relatorios.SaldoDiario;

public class Vender extends javax.swing.JPanel {

    private GerenciarProdutos gerenciador;
    private Saldo saldo;
    private TelaPrincipal telaPrincipal;
    private Produto[] produtosCarrinho = new Produto[100];
    private float[] quantidadesCarrinho = new float[100];
    private int quantidadeItens = 0;
    private SaldoDiario saldoDiario;

    public Vender(GerenciarProdutos gerenciador, Saldo saldo, SaldoDiario saldoDiario, TelaPrincipal telaPrincipal) {
        initComponents();
        this.gerenciador = gerenciador;
        this.saldo = saldo;
        this.telaPrincipal = telaPrincipal;
        this.saldoDiario = saldoDiario;
        configurarLayoutResponsivo();
        carregarProdutosComboBox();
        EstiloMavi.aplicar(this);
    }

    private void configurarLayoutResponsivo() {
        removeAll();
        jPanelAreaVender.removeAll();

        setLayout(new java.awt.BorderLayout());
        jPanelAreaVender.setLayout(new java.awt.GridLayout(1, 2, 0, 0));

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

        jLabelTituloVender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adicionarTitulo(painelFormulario, 0, jLabelTituloVender);
        adicionarCampo(painelFormulario, 1, jLabelCliente, jTextFieldSetarCliente);
        adicionarCampo(painelFormulario, 2, jLabelCpf, jTextFieldSetarCpf);
        adicionarCampo(painelFormulario, 3, jLabelProduto, jComboBoxSetarProduto);
        adicionarCampo(painelFormulario, 4, jLabelQuantidade, jTextFieldSetarQuantidade);
        adicionarAcao(painelFormulario, 5, jButtonAdicionarItem);
        adicionarAcao(painelFormulario, 6, jButtonRemoverItem);
        adicionarAcao(painelFormulario, 7, jButtonFinalizarCompra);
        adicionarBotaoRodape(painelFormulario, 8, jButtonCancelar);

        jLabelTituloCarrinho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        painelCarrinho.add(jLabelTituloCarrinho, java.awt.BorderLayout.NORTH);
        painelCarrinho.add(
            new javax.swing.JScrollPane(jTextAreaCarrinho),
            java.awt.BorderLayout.CENTER
        );
        javax.swing.JPanel rodapeCarrinho = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        rodapeCarrinho.setOpaque(false);
        rodapeCarrinho.add(jLabelValorTotal);
        painelCarrinho.add(rodapeCarrinho, java.awt.BorderLayout.SOUTH);


        jPanelAreaVender.add(painelFormulario);
        jPanelAreaVender.add(painelCarrinho);
        add(jPanelAreaVender, java.awt.BorderLayout.CENTER);
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

        jPanelAreaVender = new javax.swing.JPanel();
        jLabelTituloVender = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelCpf = new javax.swing.JLabel();
        jTextFieldSetarCliente = new javax.swing.JTextField();
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
        jScrollPaneCarrinho = new javax.swing.JScrollPane();
        jTextAreaCarrinho = new javax.swing.JTextArea();
        jTextFieldSetarCpf = new javax.swing.JTextField();

        jLabelTituloVender.setBackground(new java.awt.Color(102, 51, 255));
        jLabelTituloVender.setFont(new java.awt.Font("Swis721 Blk BT", 0, 12));
        jLabelTituloVender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloVender.setText("VENDER");

        jLabelCliente.setText("Cliente:");

        jLabelCpf.setText("CPF:");

        jTextFieldSetarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSetarClienteActionPerformed(evt);
            }
        });

        jButtonAdicionarItem.setBackground(new java.awt.Color(153, 255, 153));
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

        jComboBoxSetarProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxSetarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSetarProdutoActionPerformed(evt);
            }
        });

        jLabelQuantidade.setText("Quantidade:");

        jSeparatorSeparador.setBackground(new java.awt.Color(102, 102, 255));
        jSeparatorSeparador.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonRemoverItem.setText("Remover último item");

        jLabelTituloCarrinho.setBackground(new java.awt.Color(102, 51, 255));
        jLabelTituloCarrinho.setFont(new java.awt.Font("Swis721 Blk BT", 0, 12));
        jLabelTituloCarrinho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloCarrinho.setText("CARRINHO:");

        jButtonFinalizarCompra.setText("Finalizar venda");
        jButtonFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCompraActionPerformed(evt);
            }
        });

        jLabelValorTotal.setText("Valor total: R$ 00,00");

        jTextAreaCarrinho.setEditable(false);
        jTextAreaCarrinho.setColumns(20);
        jTextAreaCarrinho.setRows(5);
        jScrollPaneCarrinho.setViewportView(jTextAreaCarrinho);

        javax.swing.GroupLayout jPanelAreaVenderLayout = new javax.swing.GroupLayout(jPanelAreaVender);
        jPanelAreaVender.setLayout(jPanelAreaVenderLayout);
        jPanelAreaVenderLayout.setHorizontalGroup(
            jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAreaVenderLayout.createSequentialGroup()
                .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloVender, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelAreaVenderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelAreaVenderLayout.createSequentialGroup()
                                .addComponent(jLabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSetarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAreaVenderLayout.createSequentialGroup()
                                .addComponent(jLabelQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSetarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelAreaVenderLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonRemoverItem, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(jButtonAdicionarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonFinalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanelAreaVenderLayout.createSequentialGroup()
                                .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelProduto)
                                    .addComponent(jLabelCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxSetarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldSetarCpf))))))
                .addGap(0, 88, Short.MAX_VALUE)
                .addComponent(jSeparatorSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAreaVenderLayout.createSequentialGroup()
                        .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTituloCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneCarrinho))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAreaVenderLayout.createSequentialGroup()
                        .addComponent(jLabelValorTotal)
                        .addGap(57, 57, 57))))
        );
        jPanelAreaVenderLayout.setVerticalGroup(
            jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparatorSeparador, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelAreaVenderLayout.createSequentialGroup()
                .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAreaVenderLayout.createSequentialGroup()
                        .addComponent(jLabelTituloVender, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCliente)
                            .addComponent(jTextFieldSetarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCpf)
                            .addComponent(jTextFieldSetarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelProduto)
                            .addComponent(jComboBoxSetarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAreaVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelQuantidade)
                            .addComponent(jTextFieldSetarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAdicionarItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFinalizarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jButtonCancelar))
                    .addGroup(jPanelAreaVenderLayout.createSequentialGroup()
                        .addComponent(jLabelTituloCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneCarrinho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelValorTotal)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelAreaVender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelAreaVender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSetarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSetarClienteActionPerformed

    }//GEN-LAST:event_jTextFieldSetarClienteActionPerformed

    private void jButtonAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarItemActionPerformed

        String nomeProduto = (String) jComboBoxSetarProduto.getSelectedItem();
        float quantidade;

        try {
            quantidade = Float.parseFloat(jTextFieldSetarQuantidade.getText().replace(",", "."));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite uma quantidade válida!");
            return;
        }

        if (!Float.isFinite(quantidade) || quantidade <= 0) {
            JOptionPane.showMessageDialog(this, "A quantidade deve ser maior que zero!");
            return;
        }


        Produto[] produtos = gerenciador.getListaProdutos();
        int i = 0;

        while(i < produtos.length && produtos[i] != null) {
            if(produtos[i].getNome().equals(nomeProduto)) {

                float quantidadeJaNoCarrinho = 0;

                for (int j = 0; j < quantidadeItens; j++) {
                    if (produtosCarrinho[j] == produtos[i]) {
                        quantidadeJaNoCarrinho += quantidadesCarrinho[j];
                    }
                }

                if (quantidadeItens < produtosCarrinho.length) {
                    if(quantidade + quantidadeJaNoCarrinho <= produtos[i].getQuantidadeNoEstoque()) {
                        produtosCarrinho[quantidadeItens] = produtos[i];
                        quantidadesCarrinho[quantidadeItens] = quantidade;
                        quantidadeItens++;
                        atualizarCarrinho();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(this, "A quantidade selecionada é maior do que a disponível em estoque!");
                        break;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Carrinho cheio!");
                    break;
                }
            } else {
                i++;
            }
        }

    }//GEN-LAST:event_jButtonAdicionarItemActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        atualizarPagina();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jComboBoxSetarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSetarProdutoActionPerformed

    }//GEN-LAST:event_jComboBoxSetarProdutoActionPerformed

    private void jButtonFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCompraActionPerformed

        if(quantidadeItens == 0) {
            JOptionPane.showMessageDialog(this, "O carrinho está vazio!");
            return;
        }

        for (int i = 0; i < quantidadeItens; i++) {

            float quantidadeTotal = 0;

            for (int j = 0; j < quantidadeItens; j++) {

                if (produtosCarrinho[i] == produtosCarrinho[j]) {
                    quantidadeTotal += quantidadesCarrinho[j];
                }
            }

            if (quantidadeTotal > produtosCarrinho[i].getQuantidadeNoEstoque()) {

                JOptionPane.showMessageDialog(this,
                    "Estoque insuficiente para o produto: "
                    + produtosCarrinho[i].getNome()
                );

                return;
            }
        }

        for(int i = 0; i < quantidadeItens; i++) {
            Produto produto = produtosCarrinho[i];

            float quantidadeVendida = quantidadesCarrinho[i];

            float estoqueAtual = produto.getQuantidadeNoEstoque();
            produto.setQuantidadeNoEstoque(estoqueAtual - quantidadeVendida);

            double valorVenda = (quantidadeVendida * produto.getPreco());
            saldo.adicionarSaldo(valorVenda);
            saldoDiario.setVendaDiaria(saldoDiario.getVendaDiaria() + valorVenda);
        }


        String nome = jTextFieldSetarCliente.getText();
        String cpf = jTextFieldSetarCpf.getText();
        JOptionPane.showMessageDialog(this,
            "Venda realizada com sucesso!\n\n" +
            "Comprador:" + nome +
            "\nCPF:" + cpf +
            "\n\nItens:\n" +
            jTextAreaCarrinho.getText() +
            "\n\n" +
            jLabelValorTotal.getText()
        );

        telaPrincipal.mostrarSaldo();

        atualizarPagina();
    }//GEN-LAST:event_jButtonFinalizarCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarItem;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonFinalizarCompra;
    private javax.swing.JButton jButtonRemoverItem;
    private javax.swing.JComboBox<String> jComboBoxSetarProduto;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelTituloCarrinho;
    private javax.swing.JLabel jLabelTituloVender;
    private javax.swing.JLabel jLabelValorTotal;
    private javax.swing.JPanel jPanelAreaVender;
    private javax.swing.JScrollPane jScrollPaneCarrinho;
    private javax.swing.JSeparator jSeparatorSeparador;
    private javax.swing.JTextArea jTextAreaCarrinho;
    private javax.swing.JTextField jTextFieldSetarCliente;
    private javax.swing.JTextField jTextFieldSetarCpf;
    private javax.swing.JTextField jTextFieldSetarQuantidade;
    // End of variables declaration//GEN-END:variables

    private void carregarProdutosComboBox() {
        jComboBoxSetarProduto.removeAllItems();

        Produto[] produtos = gerenciador.getListaProdutos();

        for (int i = 0; i<produtos.length; i++) {
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

            double subtotal = produto.getPreco() * quantidade;

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
        jTextFieldSetarCliente.setText("");
        jTextFieldSetarCpf.setText("");

        jComboBoxSetarProduto.setSelectedIndex(0);
        jTextFieldSetarQuantidade.setText("");

        produtosCarrinho = new Produto[100];
        quantidadesCarrinho = new float[100];
        quantidadeItens = 0;

        atualizarCarrinho();
    }

}
