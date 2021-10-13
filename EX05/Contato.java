
package luiza121021_02_05;
import java.util.LinkedList;


public class Contato {
    private String nome;
    private String number;
    private LinkedList<String> newMsgms = new LinkedList<>();
    
    public Contato(String nome, String number){
        this.nome = nome;
        this.number = number;
    }
    public void enviar(String men){
        System.out.println("Enviando a mensagem: "+men+"");
        System.out.println("Enviada!");
    }
    public void receber(){
        System.out.println("Você tem novas Mensagens. Verifique a caixa de Entr"
                + "ada");
        this.newMsgms.add("Mensagem importante.");
    }

    public String getNome() {
        return nome;
    }

    public String getNumber() {
        return number;
    }

    public LinkedList<String> getNewMsgms() {
        LinkedList<String> ret;
        ret = (LinkedList) newMsgms.clone();
        newMsgms.removeAll(newMsgms);
        return ret;
    }
    
}
