/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza121021_02_05;

import java.util.LinkedList;

public class Luiza121021_02_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Contato c101 = new Contato("Alexadra Botez", "(75)99999-9999");
        c101.enviar("oi");
        
        int nMensagens = c101.getNewMsgms().size();
        System.out.println("Mensagens não lidas: "+ nMensagens);
        System.out.println();
        
        for (int i = 0; i<5; i++){
            c101.receber();
        }
        
        
        System.out.println();
        LinkedList<String> mensagens = c101.getNewMsgms();
        nMensagens = mensagens.size();
        System.out.println("Mensagens não lidas: "+ nMensagens);
        System.out.println("Mostrando mensagens:");
        for (int i=0; i<nMensagens; i++){
            System.out.println("\t"+i+") "+mensagens.get(i));
        }
        
        System.out.println();
        mensagens = c101.getNewMsgms();
        nMensagens = mensagens.size();
        System.out.println("Mensagens não lidas: "+ nMensagens);
        
    }
    
}
