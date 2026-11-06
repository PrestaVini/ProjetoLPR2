


package mavi.telas;


public class TelaAjuda extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaAjuda.class.getName());


    public TelaAjuda() {
        initComponents();
            setIconImage(
            new javax.swing.ImageIcon(
                getClass().getResource("/imagens/icone_ajuda.png")
            ).getImage()
        );

        setTitle("Mavi - Guia de Utilização");
        setSize(850, 600);
        setLocationRelativeTo(null);


        getContentPane().removeAll();
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));


        jLabelGuia.setText("Guia de Utilização - Mavi");
        jLabelGuia.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 20));


        javax.swing.JPanel painelSuperior = new javax.swing.JPanel(
            new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 10)
        );
        painelSuperior.add(jLabelGuia);


        javax.swing.JPanel painelInferior = new javax.swing.JPanel(
            new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 20, 10)
        );
        painelInferior.add(jButtonVoltarAoMenu);


        java.awt.Font fonte = new java.awt.Font(
            "Segoe UI", java.awt.Font.PLAIN, 15
        );


        java.awt.Insets margens = new java.awt.Insets(15, 20, 15, 20);

        javax.swing.JTextArea[] textos = {
            jTextAreaVender,
            jTextAreaComprar,
            jTextAreaEstoque,
            jTextAreaRelatorio,
            jTextAreaFecharDia,
            jTextAreaSair
        };

        for (javax.swing.JTextArea texto : textos) {
            texto.setFont(fonte);
            texto.setMargin(margens);
            texto.setEditable(false);
            texto.setLineWrap(true);
            texto.setWrapStyleWord(true);
            texto.setCaretPosition(0);
        }


        getContentPane().add(painelSuperior, java.awt.BorderLayout.NORTH);
        getContentPane().add(jTabbedPaneRelatorio, java.awt.BorderLayout.CENTER);
        getContentPane().add(painelInferior, java.awt.BorderLayout.SOUTH);

        EstiloMavi.aplicar(getRootPane());
        getContentPane().revalidate();
        getContentPane().repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneRelatorio = new javax.swing.JTabbedPane();
        jPanelVender = new javax.swing.JPanel();
        jScrollPaneVender = new javax.swing.JScrollPane();
        jTextAreaVender = new javax.swing.JTextArea();
        jPanelComprar = new javax.swing.JPanel();
        jScrollPaneComprar = new javax.swing.JScrollPane();
        jTextAreaComprar = new javax.swing.JTextArea();
        jPanelEstoque = new javax.swing.JPanel();
        jScrollPaneEstoque = new javax.swing.JScrollPane();
        jTextAreaEstoque = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPaneRelatorio = new javax.swing.JScrollPane();
        jTextAreaRelatorio = new javax.swing.JTextArea();
        jPanelFecharDia = new javax.swing.JPanel();
        jScrollPaneFecharDia = new javax.swing.JScrollPane();
        jTextAreaFecharDia = new javax.swing.JTextArea();
        jPanelSair = new javax.swing.JPanel();
        jScrollPaneSair = new javax.swing.JScrollPane();
        jTextAreaSair = new javax.swing.JTextArea();
        jLabelGuia = new javax.swing.JLabel();
        jButtonVoltarAoMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextAreaVender.setEditable(false);
        jTextAreaVender.setColumns(20);
        jTextAreaVender.setLineWrap(true);
        jTextAreaVender.setRows(5);
        jTextAreaVender.setText("VENDER\n\nRegistre a venda de produtos aos clientes.\n\n1. Preencha o nome do cliente e o CPF, se desejar registrar esses dados.\n2. Selecione um produto e informe a quantidade.\n3. Clique em \"Adicionar item\". O carrinho mostra os produtos, as quantidades e os valores calculados pelo preço de venda cadastrado.\n4. Repita o processo para adicionar mais produtos.\n5. Clique em \"Finalizar venda\" para atualizar o estoque, somar o recebimento ao saldo geral e registrar o valor no total de vendas do dia.\n\nO sistema impede a adição de quantidades inválidas e verifica o estoque disponível. O botão \"Cancelar\" limpa os dados da venda sem confirmar a operação.\n\nO botão \"Remover último item\" aparece na interface, mas ainda não tem uma ação implementada nesta versão.");
        jTextAreaVender.setWrapStyleWord(true);
        jScrollPaneVender.setViewportView(jTextAreaVender);

        javax.swing.GroupLayout jPanelVenderLayout = new javax.swing.GroupLayout(jPanelVender);
        jPanelVender.setLayout(jPanelVenderLayout);
        jPanelVenderLayout.setHorizontalGroup(
            jPanelVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneVender, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        jPanelVenderLayout.setVerticalGroup(
            jPanelVenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVenderLayout.createSequentialGroup()
                .addComponent(jScrollPaneVender, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneRelatorio.addTab("Vender", jPanelVender);

        jTextAreaComprar.setEditable(false);
        jTextAreaComprar.setColumns(20);
        jTextAreaComprar.setLineWrap(true);
        jTextAreaComprar.setRows(5);
        jTextAreaComprar.setText("COMPRAR\n\nRegistre a entrada de mercadorias no estoque do supermercado.\n\n1. Selecione um produto cadastrado. A unidade de medida aparece ao lado.\n2. Informe a quantidade que será comprada e o valor unitário de compra.\n3. Clique em \"Adicionar item\" para incluir o produto no carrinho.\n4. Confira a lista e o valor total da compra.\n5. Clique em \"Finalizar compra\". O sistema verifica o saldo disponível antes de aumentar o estoque, descontar o valor total do saldo e registrar a despesa no total de compras do dia.\n\nSe o saldo for insuficiente, a compra não é concluída. O botão \"Cancelar\" limpa o carrinho sem finalizar a operação.\n\nO botão \"Remover último item\" está visível, mas ainda não foi implementado.");
        jTextAreaComprar.setWrapStyleWord(true);
        jScrollPaneComprar.setViewportView(jTextAreaComprar);

        javax.swing.GroupLayout jPanelComprarLayout = new javax.swing.GroupLayout(jPanelComprar);
        jPanelComprar.setLayout(jPanelComprarLayout);
        jPanelComprarLayout.setHorizontalGroup(
            jPanelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        jPanelComprarLayout.setVerticalGroup(
            jPanelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        jTabbedPaneRelatorio.addTab("Comprar", jPanelComprar);

        jTextAreaEstoque.setEditable(false);
        jTextAreaEstoque.setColumns(20);
        jTextAreaEstoque.setLineWrap(true);
        jTextAreaEstoque.setRows(5);
        jTextAreaEstoque.setText("ESTOQUE\n\nConsulte os produtos e as quantidades disponíveis no supermercado.\n\nA tabela apresenta o identificador, o nome, a quantidade em estoque, a unidade de medida e o preço unitário de venda de cada produto.\n\nO campo \"Total em estoque\" mostra o valor estimado dos produtos disponíveis, calculado a partir das quantidades e dos preços de venda.\n\nA tabela é somente para consulta: os dados não podem ser editados diretamente. As quantidades mudam quando compras e vendas são finalizadas.\n\nO campo de busca faz parte da interface, mas a filtragem por nome ainda não está implementada nesta versão.");
        jTextAreaEstoque.setWrapStyleWord(true);
        jScrollPaneEstoque.setViewportView(jTextAreaEstoque);

        javax.swing.GroupLayout jPanelEstoqueLayout = new javax.swing.GroupLayout(jPanelEstoque);
        jPanelEstoque.setLayout(jPanelEstoqueLayout);
        jPanelEstoqueLayout.setHorizontalGroup(
            jPanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        jPanelEstoqueLayout.setVerticalGroup(
            jPanelEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        jTabbedPaneRelatorio.addTab("Estoque", jPanelEstoque);

        jTextAreaRelatorio.setEditable(false);
        jTextAreaRelatorio.setColumns(20);
        jTextAreaRelatorio.setLineWrap(true);
        jTextAreaRelatorio.setRows(5);
        jTextAreaRelatorio.setText("RELATÓRIO DO DIA\n\nClique em \"Relatório do dia\" no menu lateral para visualizar um resumo financeiro do dia atual.\n\nO relatório mostra:\n\n• Vendas: soma dos valores das vendas finalizadas.\n• Compras: soma dos valores gastos nas compras finalizadas.\n• Saldo diário final: diferença entre vendas e compras.\n\nEsse resultado diário é diferente do saldo geral do supermercado, exibido no menu lateral.\n\nOs totais são mantidos em memória durante a execução. Ainda não existe um histórico consultável de dias anteriores nem uma listagem individual das operações.");
        jTextAreaRelatorio.setWrapStyleWord(true);
        jScrollPaneRelatorio.setViewportView(jTextAreaRelatorio);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        jTabbedPaneRelatorio.addTab("Relatório", jPanel4);

        jTextAreaFecharDia.setEditable(false);
        jTextAreaFecharDia.setColumns(20);
        jTextAreaFecharDia.setLineWrap(true);
        jTextAreaFecharDia.setRows(5);
        jTextAreaFecharDia.setText("FECHAR DIA\n\nO botão \"Fechar dia\", no menu lateral, permite avançar a data simulada do supermercado.\n\nAo clicar, o programa pede confirmação. Se você escolher \"Sim\", a data avança um dia e os totais de vendas e compras diárias são zerados para iniciar o novo período.\n\nSe escolher \"Não\", \"Cancelar\" ou fechar a confirmação, a data e os totais diários permanecem inalterados.\n\nO saldo geral e as quantidades de produtos permanecem armazenados em memória.\n\nNão há histórico persistente de relatórios anteriores; consulte o relatório do dia antes de confirmar o fechamento.");
        jTextAreaFecharDia.setWrapStyleWord(true);
        jScrollPaneFecharDia.setViewportView(jTextAreaFecharDia);

        javax.swing.GroupLayout jPanelFecharDiaLayout = new javax.swing.GroupLayout(jPanelFecharDia);
        jPanelFecharDia.setLayout(jPanelFecharDiaLayout);
        jPanelFecharDiaLayout.setHorizontalGroup(
            jPanelFecharDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneFecharDia, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        jPanelFecharDiaLayout.setVerticalGroup(
            jPanelFecharDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneFecharDia, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );

        jTabbedPaneRelatorio.addTab("Fechar dia", jPanelFecharDia);

        jTextAreaSair.setEditable(false);
        jTextAreaSair.setColumns(20);
        jTextAreaSair.setLineWrap(true);
        jTextAreaSair.setRows(5);
        jTextAreaSair.setText("SAIR E LOGIN\n\nO botão \"Sair\", no menu lateral, encerra o programa.\n\nNo menu superior \"Login\", a opção \"Logar conta\" abre a janela de autenticação. A opção \"Sair do usuário\" encerra a sessão e retorna à tela inicial.\n\nÉ necessário estar autenticado para acessar as funções principais do supermercado.\n\nImportante: os dados são mantidos na memória da aplicação e podem ser perdidos ao encerrar o programa. Esta versão não salva automaticamente compras, vendas, estoque ou relatórios em um banco de dados.");
        jTextAreaSair.setWrapStyleWord(true);
        jScrollPaneSair.setViewportView(jTextAreaSair);

        javax.swing.GroupLayout jPanelSairLayout = new javax.swing.GroupLayout(jPanelSair);
        jPanelSair.setLayout(jPanelSairLayout);
        jPanelSairLayout.setHorizontalGroup(
            jPanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneSair, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        jPanelSairLayout.setVerticalGroup(
            jPanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSairLayout.createSequentialGroup()
                .addComponent(jScrollPaneSair, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneRelatorio.addTab("Sair", jPanelSair);

        jLabelGuia.setText("Guia");

        jButtonVoltarAoMenu.setBackground(new java.awt.Color(255, 102, 102));
        jButtonVoltarAoMenu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoltarAoMenu.setText("Fechar guia");
        jButtonVoltarAoMenu.addActionListener(this::jButtonVoltarAoMenuActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTabbedPaneRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelGuia))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltarAoMenu)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGuia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPaneRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButtonVoltarAoMenu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarAoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarAoMenuActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarAoMenuActionPerformed


    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(() -> new TelaAjuda().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltarAoMenu;
    private javax.swing.JLabel jLabelGuia;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelComprar;
    private javax.swing.JPanel jPanelEstoque;
    private javax.swing.JPanel jPanelFecharDia;
    private javax.swing.JPanel jPanelSair;
    private javax.swing.JPanel jPanelVender;
    private javax.swing.JScrollPane jScrollPaneComprar;
    private javax.swing.JScrollPane jScrollPaneEstoque;
    private javax.swing.JScrollPane jScrollPaneFecharDia;
    private javax.swing.JScrollPane jScrollPaneRelatorio;
    private javax.swing.JScrollPane jScrollPaneSair;
    private javax.swing.JScrollPane jScrollPaneVender;
    private javax.swing.JTabbedPane jTabbedPaneRelatorio;
    private javax.swing.JTextArea jTextAreaComprar;
    private javax.swing.JTextArea jTextAreaEstoque;
    private javax.swing.JTextArea jTextAreaFecharDia;
    private javax.swing.JTextArea jTextAreaRelatorio;
    private javax.swing.JTextArea jTextAreaSair;
    private javax.swing.JTextArea jTextAreaVender;
    // End of variables declaration//GEN-END:variables
}
