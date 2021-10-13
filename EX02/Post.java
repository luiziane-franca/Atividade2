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
public class Post {
   private String texto;
   private String link;
   private int numeroCurtidas;
   private int numeroCompartilhamentos;
   
   public Post(String text, String link){
       this.texto = text;
       this.link = link;
       
   }
   public void curtir() {
       this.setNumeroCurtidas(this.getNumeroCurtidas() + 1);
       
   }
   public void compartilhar(){
       this.setNumeroCompartilhamentos(this.getNumeroCompartilhamentos() + 1);
   }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    public void setNumeroCurtidas(int numeroCurtidas) {
        this.numeroCurtidas = numeroCurtidas;
    }

    public int getNumeroCompartilhamentos() {
        return numeroCompartilhamentos;
    }

    public void setNumeroCompartilhamentos(int numeroCompartilhamentos) {
        this.numeroCompartilhamentos = numeroCompartilhamentos;
    }
}
