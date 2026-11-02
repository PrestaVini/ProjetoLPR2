/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavi.produtos;

public class Produto {
    private int id;
    private float quantidadeNoEstoque;
    private String unidadeDeMedida;
    private String nome;
    private double preco;
    
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        if(id >= 0) {
            this.id = id;
        } else {
            System.out.println("Erro! O id deve ser igual ou maior que zero");
        }
    }
    
    public float getQuantidadeNoEstoque() {
        return quantidadeNoEstoque;
    }

    public void setQuantidadeNoEstoque(float quantidadeNoEstoque) {
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }

    public String getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public void setUnidadeDeMedida(String unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
