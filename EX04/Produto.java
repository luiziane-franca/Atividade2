/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza121021_02_04;

/**
 *
 * @author Nid
 */
public class Produto {
    private String nome;
    private double preco;
    private int quant;
    
    public Produto(String nome, double preco, int quant){
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
        
    }
    public void comprar(int q){
        if (q <= quant){
            this.quant -= q;
        }
        else{
            System.out.printf("Compra não realizada.\n"
                    + "Quantidade indisponível. Quantidade"
                    + " em estoque: %d.\n", this.quant);
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }

}
