# Mavi — Simulador de Supermercado

Projeto acadêmico desenvolvido em Java para a disciplina Linguagem de Programação II, do curso de Análise e Desenvolvimento de Sistemas do IFSP Campus Hortolândia.

## Autoria e participação do ChatGPT

**Toda a lógica do sistema e todo o design das páginas foram desenvolvidos por Vinicius, autor do projeto.**

**Todos os ícones e imagens utilizados no projeto foram feitos com o ChatGPT. A implementação da responsividade do layout também foi feita pelo ChatGPT**, a partir do design definido pelo autor.

## Objetivo da atividade

Desenvolver um projeto em Java com orientação a objetos, duas a três telas gráficas e comunicação de dados entre as telas, aplicando os conhecimentos trabalhados na disciplina.

O tema escolhido foi um sistema de faturamento, caixa e inventário de um supermercado. Este repositório acompanha seu desenvolvimento.

## O que faz

O Mavi possui interface gráfica Swing com menu lateral, área de navegação entre telas e exibição do saldo. A versão atual contém:

- Login e logout com usuários definidos no código;
- Catálogo inicial de produtos com nome, preço, quantidade e unidade de medida;
- Consulta do estoque;
- Tela de venda com seleção de produtos, carrinho, cálculo de valores e finalização;
- Atualização das quantidades em estoque e do saldo durante a venda;
- Tela de compras em desenvolvimento;
- Tela de ajuda;
- Logo e ícones personalizados;
- Ajustes de layout para acompanhar o redimensionamento da janela.

## Estado atual

O projeto está em desenvolvimento. Os dados de produtos, usuários e saldo são mantidos em memória durante a execução; não há integração com banco de dados ou Google Sheets nesta versão.

A tela de compras existe, mas seus principais eventos ainda não possuem implementação. Os botões de relatório do dia e fechamento do dia também ainda não executam suas operações completas.

## Tecnologias usadas

- Java, com projeto configurado para JDK 17;
- Java Swing e AWT;
- Programação orientada a objetos;
- Apache NetBeans e seu editor visual de formulários;
- Apache Ant para compilação.

## Organização dos arquivos

O projeto do NetBeans fica na pasta **Mavi**.

| Caminho | Conteúdo |
|---|---|
| `Mavi/src/mavi/Mavi.java` | Classe principal da aplicação. |
| `Mavi/src/mavi/telas/` | Telas Java e formulários `.form` do NetBeans. |
| `Mavi/src/mavi/produtos/` | Representação dos produtos e catálogo inicial. |
| `Mavi/src/mavi/financeiro/` | Controle do saldo. |
| `Mavi/src/mavi/usuarios/` | Representação e gerenciamento dos usuários. |
| `Mavi/src/imagens/` | Logo e ícones feitos com o ChatGPT. |
| `Mavi/nbproject/` | Configuração compartilhada do projeto NetBeans. |
| `Mavi/build.xml` | Arquivo de compilação do Ant. |

## Como executar

### Pelo Apache NetBeans

1. Instale um JDK compatível com Java 17 e configure-o no NetBeans.
2. Baixe ou clone este repositório.
3. Abra **File > Open Project** e selecione a pasta **Mavi**.
4. Confira se a plataforma Java do projeto está configurada corretamente.
5. Execute **Clean and Build** para gerar os arquivos compilados.
6. Execute o projeto pela classe principal `mavi.Mavi`.
7. Utilize o menu de conta para entrar com um dos usuários de demonstração definidos em `GerenciarUsuarios.java`.

Os arquivos `.form` foram mantidos para permitir a edição visual das telas no NetBeans. Alguns ajustes de responsividade são aplicados pelo código durante a execução e podem não aparecer exatamente da mesma forma no editor visual.

### Pelo terminal com Apache Ant

Com JDK 17 e Apache Ant instalados, execute a partir da raiz do repositório:

```bash
cd Mavi
ant clean jar
java -jar dist/Mavi.jar
```

As pastas `build/`, `dist/` e as configurações locais `nbproject/private/` não são versionadas. Os arquivos de compilação são gerados ao construir o projeto.

## Sobre esta atualização

Os fontes, formulários e recursos foram atualizados a partir da versão fornecida pelo autor. A versão anterior permanece acessível no histórico de commits.
