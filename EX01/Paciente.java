/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luiza121021_02_01;

/**
 * String, Int, Bool, Float
 * @author Nid
 */
public class Paciente {
    private int cod;
    private String nome;
    private String dataNasc;
    private String sexo;
    private int planoSaude;
    private String alergia;
    private String tipoSanguineo;
                                    
    public Paciente(int codigo, String
            nome, String dataNascimento,String sexo,int planoSaude, String alergia, String tipoSanquineo){
        this.cod = codigo;
        this.nome = nome;
        this.alergia = alergia;
        this.dataNasc = dataNascimento;
        this.sexo = sexo;
        this.planoSaude = planoSaude;
        this.tipoSanguineo = tipoSanquineo;       
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(int planoSaude) {
        this.planoSaude = planoSaude;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    
}
