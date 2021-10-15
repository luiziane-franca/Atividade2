/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza121021_02_04;

public class Luiza121021_02_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produto carro = new Produto("Gol", 89999, 10);
        System.out.printf("Produto: %s\n Preço: %f\n", carro.getNome(),
        carro.getPreco());
        carro.comprar(1);
        System.out.println("Quantidade em estoque (pós compra): "
                + carro.getQuant());
        carro.comprar(1);
        System.out.println("Quantidade em estoque (pós compra): "
                + carro.getQuant());
        carro.comprar(9);
        System.out.println("Quantidade em estoque (pós compra): "
                + carro.getQuant());
                
    }
    
}
