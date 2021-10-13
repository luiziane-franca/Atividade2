/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza121021_02_01;

/**
 *
 * @author Nid
 */
public class Luiza121021_02_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Questão 1
        System.out.println("Questão 1\n-----------");
        Paciente p1 = new Paciente(1, "Luiza", "11/27/2000", "M",
        12345678, "polem", "O-");
        show(p1);
        p1.setNome("Mãe");
        p1.setDataNasc("21/53/2002");
        p1.setSexo("M");
        p1.setPlanoSaude(31415926); // :P
        p1.setAlergia("abelhas");
        p1.setTipoSanguineo("AB+");
        System.out.println("--------------");
        show(p1);
        
    }public static void show(Paciente p){
        System.out.println("Paciente: " + p.getCod());
        System.out.println("Nome: "+p.getNome());
        System.out.println("Data aniversario: "+p.getDataNasc());
        System.out.println("Sexo (M = Masculino, F=Feminino): "+p.getSexo());
        System.out.println("Plano de Saude: "+p.getPlanoSaude());
        System.out.println("Alergia à: "+p.getAlergia());
        System.out.println("Tipo Sanguíneo: "+p.getTipoSanguineo());
    }
    
}
