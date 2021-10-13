/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza121021_02_02;

/**
 *
 * @author Nid
 */
public class Luiza121021_02_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Questão 04
        Post p12 = new Post("Eu sou um bobão", "https://facebook.com/post/123/");
        for (int i =0; i<3; i++){
            p12.curtir();
        }
    
        System.out.println("Numero de curtidas: "+p12.getNumeroCurtidas());
        for (int i=0; i<2; i++){
            p12.compartilhar();
        }
        System.out.println("Numero de compartilhamentos: "+p12.getNumeroCompartilhamentos());
        
        
    }
    
}
