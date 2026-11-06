# MaVi SuperMercado

Simulador acadêmico de supermercado desenvolvido em **Java Swing** no **Apache NetBeans**, como atividade do curso de Análise e Desenvolvimento de Sistemas.

## Funcionalidades

- Login e saída de usuário.
- Venda de produtos, com validação da disponibilidade do estoque.
- Compra e reposição de mercadorias, com conferência de saldo suficiente.
- Consulta ao estoque e ao valor estimado dos produtos disponíveis.
- Relatório do dia com soma das compras, soma das vendas e diferença entre elas.
- Controle de data simulada e botão para fechar o dia.
- Guia de utilização atualizado, acessível pelo menu **Ajuda > Guia**.

As movimentações e informações são mantidas em memória. O programa não possui persistência em banco de dados.

## Tecnologias

Java 17, Swing, Apache NetBeans e Apache Ant.

## Como executar

Abra a pasta `MaviSuperMercado` como projeto no NetBeans e execute a classe principal `mavi.Mavi`.

Pelo terminal, dentro da pasta do projeto:

```bash
ant clean jar
java -jar dist/MaviSuperMercado.jar
```

## Autoria e utilização de IA

**A lógica de programação, as funcionalidades e o design das interfaces foram desenvolvidos pelo autor do projeto.** Todos os ícones e imagens foram criados com o ChatGPT. A implementação dos ajustes de responsividade das interfaces foi realizada com o ChatGPT.

O acabamento visual desta versão também foi auxiliado pelo ChatGPT, mantendo a estrutura e a lógica existentes.

## Observações

- Os usuários e as senhas cadastrados diretamente no código são dados fictícios, criados somente para demonstração acadêmica, e não correspondem a credenciais reais.
- O layout responsivo é configurado em código após o `initComponents()`, portanto algumas telas podem aparecer diferentes na visualização `Design` do NetBeans.
- Os botões "Remover último item" ainda estão sem implementação funcional.
- A consulta de estoque possui um campo de busca visual sem filtragem implementada.
- Ao confirmar "Fechar dia", a data avança e os totais diários são zerados. Ao recusar ou cancelar, a data e os totais são mantidos.
- As marcações `//GEN-...` do NetBeans foram mantidas no código-fonte para preservar a edição gráfica dos formulários. Os demais comentários Java foram removidos.
