/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mavi.telas;

import mavi.produtos.GerenciarProdutos;
import mavi.produtos.Produto;

/**
 *
 * @author Vinicius
 */
public class Estoque extends javax.swing.JPanel {
    
    GerenciarProdutos gerenciador;

    public Estoque(GerenciarProdutos gerenciador) {
        initComponents();
        this.gerenciador = gerenciador;
        configurarLayoutResponsivo();
        carregarTabelaEstoque();
        jTableEstoque.getTableHeader().setReorderingAllowed(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneEstoque = new javax.swing.JScrollPane();
        jTableEstoque = new javax.swing.JTable();
        jLabelEstoque = new javax.swing.JLabel();
        jLabelTituloSituacaoDeEstoque = new javax.swing.JLabel();
        jLabelTotalEmEstoque = new javax.swing.JLabel();
        jLabelInstrucaoBusca = new javax.swing.JLabel();
        jTextFieldAreaDeBusca = new javax.swing.JTextField();
        jLabelTituloBusca = new javax.swing.JLabel();

        jTableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneEstoque.setViewportView(jTableEstoque);

        jLabelEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstoque.setText("ESTOQUE");

        jLabelTituloSituacaoDeEstoque.setText("Situação de estoque:");

        jLabelTotalEmEstoque.setText("Total em estoque: R$");

        jLabelInstrucaoBusca.setText("Digite o nome do item desejado:");

        jLabelTituloBusca.setText("Busca:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabelTituloBusca)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAreaDeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelInstrucaoBusca)
                                    .addComponent(jLabelTotalEmEstoque))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabelTituloSituacaoDeEstoque)
                                .addGap(50, 50, 50))
                            .addComponent(jScrollPaneEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabelEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloSituacaoDeEstoque)
                    .addComponent(jLabelTituloBusca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelInstrucaoBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAreaDeBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTotalEmEstoque))
                    .addComponent(jScrollPaneEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void configurarLayoutResponsivo() {
        // Os componentes criados pelo NetBeans sao reutilizados, sem recria-los.
        removeAll();
        setLayout(new java.awt.BorderLayout(16, 12));
        setBackground(java.awt.Color.WHITE);
        setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 24, 20, 24));

        jLabelEstoque.setFont(jLabelEstoque.getFont().deriveFont(java.awt.Font.BOLD, 20f));
        add(jLabelEstoque, java.awt.BorderLayout.NORTH);

        javax.swing.JPanel areaBusca = new javax.swing.JPanel(new java.awt.GridBagLayout());
        areaBusca.setOpaque(false);
        java.awt.GridBagConstraints b = new java.awt.GridBagConstraints();
        b.gridx = 0;
        b.gridy = 0;
        b.weightx = 1;
        b.fill = java.awt.GridBagConstraints.HORIZONTAL;
        b.anchor = java.awt.GridBagConstraints.NORTHWEST;
        b.insets = new java.awt.Insets(0, 0, 18, 0);
        areaBusca.add(jLabelTituloBusca, b);

        b.gridy = 1;
        b.insets = new java.awt.Insets(0, 0, 6, 0);
        areaBusca.add(jLabelInstrucaoBusca, b);

        b.gridy = 2;
        b.insets = new java.awt.Insets(0, 0, 0, 0);
        areaBusca.add(jTextFieldAreaDeBusca, b);

        // Preenche o espaco restante sem empurrar a busca para o centro.
        b.gridy = 3;
        b.weighty = 1;
        b.fill = java.awt.GridBagConstraints.BOTH;
        javax.swing.JPanel espacador = new javax.swing.JPanel();
        espacador.setOpaque(false);
        areaBusca.add(espacador, b);

        b.gridy = 4;
        b.weighty = 0;
        b.fill = java.awt.GridBagConstraints.HORIZONTAL;
        areaBusca.add(jLabelTotalEmEstoque, b);

        javax.swing.JPanel areaSituacao = new javax.swing.JPanel(new java.awt.BorderLayout(0, 12));
        areaSituacao.setOpaque(false);
        areaSituacao.add(jLabelTituloSituacaoDeEstoque, java.awt.BorderLayout.NORTH);
        areaSituacao.add(jScrollPaneEstoque, java.awt.BorderLayout.CENTER);

        // Cada coluna recebe metade da largura disponivel.
        javax.swing.JPanel colunas = new javax.swing.JPanel(new java.awt.GridBagLayout());
        colunas.setOpaque(false);
        java.awt.GridBagConstraints c = new java.awt.GridBagConstraints();
        c.gridy = 0;
        c.weightx = 0.5;
        c.weighty = 1;
        c.fill = java.awt.GridBagConstraints.BOTH;
        c.gridx = 0;
        c.insets = new java.awt.Insets(0, 0, 0, 12);
        colunas.add(areaBusca, c);
        c.gridx = 1;
        c.insets = new java.awt.Insets(0, 12, 0, 0);
        colunas.add(areaSituacao, c);
        add(colunas, java.awt.BorderLayout.CENTER);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelInstrucaoBusca;
    private javax.swing.JLabel jLabelTituloBusca;
    private javax.swing.JLabel jLabelTituloSituacaoDeEstoque;
    private javax.swing.JLabel jLabelTotalEmEstoque;
    private javax.swing.JScrollPane jScrollPaneEstoque;
    private javax.swing.JTable jTableEstoque;
    private javax.swing.JTextField jTextFieldAreaDeBusca;
    // End of variables declaration//GEN-END:variables
    
    private void carregarTabelaEstoque() {
        String[] colunas = {"ID", "Nome", "Quantidade", "Medida", "Preco de venda unitária"};
        
        Produto[] produtosNoEstoque = gerenciador.getListaProdutos();
        
        double somaEstoque = 0;
        
        javax.swing.table.DefaultTableModel modeloEstoque = new javax.swing.table.DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int linha, int coluna) {
                return false;
            }
        };
        
        for(int i = 0; i < produtosNoEstoque.length; i++) {
            if(produtosNoEstoque[i] != null) {
                Object[] linha = {
                    produtosNoEstoque[i].getId(),
                    produtosNoEstoque[i].getNome(),
                    produtosNoEstoque[i].getQuantidadeNoEstoque(),
                    produtosNoEstoque[i].getUnidadeDeMedida(),
                    String.format("R$ %.2f", produtosNoEstoque[i].getPreco())
                };
                
                modeloEstoque.addRow(linha);
                
                somaEstoque = somaEstoque + (produtosNoEstoque[i].getQuantidadeNoEstoque() * produtosNoEstoque[i].getPreco());
            } else {
                break;
            }
        }
        
        jTableEstoque.setModel(modeloEstoque);
        jLabelTotalEmEstoque.setText(String.format("Total em estoque: R$ %.2f", somaEstoque));
    }

}
