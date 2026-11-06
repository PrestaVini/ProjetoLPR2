


package mavi.produtos;

public class GerenciarProdutos {

    private Produto[] listaProdutos = new Produto[100];


    public void iniciarProdutos() {


        listaProdutos[0] = new Produto();
        listaProdutos[0].setId(0);
        listaProdutos[0].setNome("Arroz");
        listaProdutos[0].setQuantidadeNoEstoque(100);
        listaProdutos[0].setUnidadeDeMedida("KG");
        listaProdutos[0].setPreco(6.99);


        listaProdutos[1] = new Produto();
        listaProdutos[1].setId(1);
        listaProdutos[1].setNome("Feijão");
        listaProdutos[1].setQuantidadeNoEstoque(80);
        listaProdutos[1].setUnidadeDeMedida("KG");
        listaProdutos[1].setPreco(8.49);


        listaProdutos[2] = new Produto();
        listaProdutos[2].setId(2);
        listaProdutos[2].setNome("Açúcar");
        listaProdutos[2].setQuantidadeNoEstoque(120);
        listaProdutos[2].setUnidadeDeMedida("KG");
        listaProdutos[2].setPreco(4.79);


        listaProdutos[3] = new Produto();
        listaProdutos[3].setId(3);
        listaProdutos[3].setNome("Sal");
        listaProdutos[3].setQuantidadeNoEstoque(90);
        listaProdutos[3].setUnidadeDeMedida("KG");
        listaProdutos[3].setPreco(2.99);


        listaProdutos[4] = new Produto();
        listaProdutos[4].setId(4);
        listaProdutos[4].setNome("Café");
        listaProdutos[4].setQuantidadeNoEstoque(65);
        listaProdutos[4].setUnidadeDeMedida("UN");
        listaProdutos[4].setPreco(24.90);


        listaProdutos[5] = new Produto();
        listaProdutos[5].setId(5);
        listaProdutos[5].setNome("Leite");
        listaProdutos[5].setQuantidadeNoEstoque(150);
        listaProdutos[5].setUnidadeDeMedida("L");
        listaProdutos[5].setPreco(5.49);


        listaProdutos[6] = new Produto();
        listaProdutos[6].setId(6);
        listaProdutos[6].setNome("Óleo de soja");
        listaProdutos[6].setQuantidadeNoEstoque(75);
        listaProdutos[6].setUnidadeDeMedida("UN");
        listaProdutos[6].setPreco(7.99);


        listaProdutos[7] = new Produto();
        listaProdutos[7].setId(7);
        listaProdutos[7].setNome("Macarrão");
        listaProdutos[7].setQuantidadeNoEstoque(110);
        listaProdutos[7].setUnidadeDeMedida("UN");
        listaProdutos[7].setPreco(4.49);


        listaProdutos[8] = new Produto();
        listaProdutos[8].setId(8);
        listaProdutos[8].setNome("Farinha de trigo");
        listaProdutos[8].setQuantidadeNoEstoque(70);
        listaProdutos[8].setUnidadeDeMedida("KG");
        listaProdutos[8].setPreco(5.29);


        listaProdutos[9] = new Produto();
        listaProdutos[9].setId(9);
        listaProdutos[9].setNome("Molho de tomate");
        listaProdutos[9].setQuantidadeNoEstoque(95);
        listaProdutos[9].setUnidadeDeMedida("UN");
        listaProdutos[9].setPreco(3.99);


        listaProdutos[10] = new Produto();
        listaProdutos[10].setId(10);
        listaProdutos[10].setNome("Biscoito");
        listaProdutos[10].setQuantidadeNoEstoque(130);
        listaProdutos[10].setUnidadeDeMedida("UN");
        listaProdutos[10].setPreco(4.99);


        listaProdutos[11] = new Produto();
        listaProdutos[11].setId(11);
        listaProdutos[11].setNome("Pão de forma");
        listaProdutos[11].setQuantidadeNoEstoque(45);
        listaProdutos[11].setUnidadeDeMedida("UN");
        listaProdutos[11].setPreco(9.49);


        listaProdutos[12] = new Produto();
        listaProdutos[12].setId(12);
        listaProdutos[12].setNome("Manteiga");
        listaProdutos[12].setQuantidadeNoEstoque(55);
        listaProdutos[12].setUnidadeDeMedida("UN");
        listaProdutos[12].setPreco(12.90);


        listaProdutos[13] = new Produto();
        listaProdutos[13].setId(13);
        listaProdutos[13].setNome("Queijo mussarela");
        listaProdutos[13].setQuantidadeNoEstoque(35);
        listaProdutos[13].setUnidadeDeMedida("KG");
        listaProdutos[13].setPreco(42.90);


        listaProdutos[14] = new Produto();
        listaProdutos[14].setId(14);
        listaProdutos[14].setNome("Presunto");
        listaProdutos[14].setQuantidadeNoEstoque(30);
        listaProdutos[14].setUnidadeDeMedida("KG");
        listaProdutos[14].setPreco(29.90);


        listaProdutos[15] = new Produto();
        listaProdutos[15].setId(15);
        listaProdutos[15].setNome("Ovos");
        listaProdutos[15].setQuantidadeNoEstoque(200);
        listaProdutos[15].setUnidadeDeMedida("UN");
        listaProdutos[15].setPreco(1.19);


        listaProdutos[16] = new Produto();
        listaProdutos[16].setId(16);
        listaProdutos[16].setNome("Frango");
        listaProdutos[16].setQuantidadeNoEstoque(85);
        listaProdutos[16].setUnidadeDeMedida("KG");
        listaProdutos[16].setPreco(17.90);


        listaProdutos[17] = new Produto();
        listaProdutos[17].setId(17);
        listaProdutos[17].setNome("Carne bovina");
        listaProdutos[17].setQuantidadeNoEstoque(60);
        listaProdutos[17].setUnidadeDeMedida("KG");
        listaProdutos[17].setPreco(39.90);


        listaProdutos[18] = new Produto();
        listaProdutos[18].setId(18);
        listaProdutos[18].setNome("Batata");
        listaProdutos[18].setQuantidadeNoEstoque(140);
        listaProdutos[18].setUnidadeDeMedida("KG");
        listaProdutos[18].setPreco(5.99);


        listaProdutos[19] = new Produto();
        listaProdutos[19].setId(19);
        listaProdutos[19].setNome("Cebola");
        listaProdutos[19].setQuantidadeNoEstoque(100);
        listaProdutos[19].setUnidadeDeMedida("KG");
        listaProdutos[19].setPreco(4.99);


        listaProdutos[20] = new Produto();
        listaProdutos[20].setId(20);
        listaProdutos[20].setNome("Tomate");
        listaProdutos[20].setQuantidadeNoEstoque(95);
        listaProdutos[20].setUnidadeDeMedida("KG");
        listaProdutos[20].setPreco(7.49);


        listaProdutos[21] = new Produto();
        listaProdutos[21].setId(21);
        listaProdutos[21].setNome("Banana");
        listaProdutos[21].setQuantidadeNoEstoque(120);
        listaProdutos[21].setUnidadeDeMedida("KG");
        listaProdutos[21].setPreco(5.99);


        listaProdutos[22] = new Produto();
        listaProdutos[22].setId(22);
        listaProdutos[22].setNome("Maçã");
        listaProdutos[22].setQuantidadeNoEstoque(90);
        listaProdutos[22].setUnidadeDeMedida("KG");
        listaProdutos[22].setPreco(9.99);


        listaProdutos[23] = new Produto();
        listaProdutos[23].setId(23);
        listaProdutos[23].setNome("Refrigerante");
        listaProdutos[23].setQuantidadeNoEstoque(180);
        listaProdutos[23].setUnidadeDeMedida("UN");
        listaProdutos[23].setPreco(8.99);


        listaProdutos[24] = new Produto();
        listaProdutos[24].setId(24);
        listaProdutos[24].setNome("Detergente");
        listaProdutos[24].setQuantidadeNoEstoque(160);
        listaProdutos[24].setUnidadeDeMedida("UN");
        listaProdutos[24].setPreco(2.79);
    }

    public Produto[] getListaProdutos() {
        return listaProdutos;
    }
}
